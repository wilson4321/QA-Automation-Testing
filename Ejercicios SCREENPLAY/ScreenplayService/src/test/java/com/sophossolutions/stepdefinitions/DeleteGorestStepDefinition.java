package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import com.sophossolutions.tasks.ExecuteDelete;
import com.sophossolutions.tasks.ExecuteGet;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class DeleteGorestStepDefinition {

	@When("Consulta el endpoint delete {string} y el id {string}")
	public void consultaElEndpointDeleteYElId(String strEndPoint, String strID, io.cucumber.datatable.DataTable dataTable) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecuteDelete.withTokens(Constants.getData(strEndPoint), strID));
	}
	@Then("Validar que el status sea {int}")
	public void validarQueElStatusSea(Integer intStatusCode) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)));
	}
	
}
