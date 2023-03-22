package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.io.File;

import com.sophossolutions.tasks.ExecuteGet;
import com.sophossolutions.tasks.ExecuteGetWihtoutToken;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetApiwilStepDefinition {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Dado que {string} establece base url {string}")
	public void dadoQueEstableceBaseUrl(String strActorName, String strBaseUrl) {
		OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}
	
	@When("Consulta el endpoint deseado {string} por medio de peticion get y el id {string}")
	public void consultaElEndpointDeseadoPorMedioDePeticionGetYElId(String strEndPoint, String strID) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecuteGetWihtoutToken.withtokens(Constants.getData(strEndPoint), strID));
	}
	@Then("Valida que el status sea {int} y que el schema {string} sea el correcto.")
	public void validaQueElStatusSeaYQueElSchemaSeaElCorrecto(Integer intStatusCode, String strSchema, DataTable dataTable) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)
				.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData("Apiwil Schema"))))));
	}
}
