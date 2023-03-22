package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.io.File;

import com.sophossolutions.tasks.ExecutePost;
import com.sophossolutions.tasks.ExecutePostWihtoutToken;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PostApiwilStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("Consulta el endpoint {string} por medio de peticion post.")
	public void consultaElEndpointPorMedioDePeticionPost(String strEndPoint,DataTable dataTable) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecutePostWihtoutToken.withtokens(Constants.getData(strEndPoint), dataTable));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	@Then("Valida que status sea {int} y que el schema {string} sea el correcto.")
	public void validaQueStatusSeaYQueElSchemaSeaElCorrecto(Integer intStatusCode, String string) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)
				.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData("Apiwil Schema"))))));
	}

}
