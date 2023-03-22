package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.io.File;

import org.hamcrest.CoreMatchers;

import com.sophossolutions.tasks.ExecuteGet;
import com.sophossolutions.utils.Constants;

import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetGorestStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Dado que {string} establece la base url {string} del servicio")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}
	
	
	@When("Consulta el endpoint {string} y el id {string}")
	public void consultaElEndpointYElId(String strEndPoint, String strID) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecuteGet.withtokens(Constants.getData(strEndPoint), strID));
	}
	
	
	@Then("Validar que el status sea {int} y valida el schema {string}")
	public void validarQueElStatusSeaYQueLaRespuestaContengaTodaLaInformaciónDelUsuario(Integer intStatusCode,String strSchema, DataTable dataTable) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)
				.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData("Json schema Gorest"))))));
	}
}
