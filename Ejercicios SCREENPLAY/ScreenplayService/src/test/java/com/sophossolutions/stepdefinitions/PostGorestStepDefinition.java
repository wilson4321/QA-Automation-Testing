package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.io.File;

import com.sophossolutions.tasks.ExecutePost;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class PostGorestStepDefinition {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("Consulta el endpoint {string} por medio de una peticion post")
	public void consultaElEndpointPorMedioDeUnaPeticionPost
	(String strEndPoint, DataTable dataTable) {
		
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecutePost.withtokens(Constants.getData(strEndPoint), dataTable));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	
	@Then("Validar que el status sea {int} y que el esquema sea el correcto {string}")
	public void validarQueElStatusSeaYQueElEsquemaSeaElCorrecto(Integer intStatusCode, String strSchema) {
	    
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)
				.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData("Json schema Gorest"))))));
		
	} 
}
