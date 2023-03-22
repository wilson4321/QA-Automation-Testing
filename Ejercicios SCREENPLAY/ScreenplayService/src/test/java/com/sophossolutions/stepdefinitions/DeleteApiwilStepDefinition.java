package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import com.sophossolutions.tasks.ExecuteDelete;
import com.sophossolutions.tasks.ExecuteDeleteWihtoutToken;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class DeleteApiwilStepDefinition {
	
	@When("Consulta el endpoint {string} por medio de peticion get y id {string}")
	public void consultaElEndpointPorMedioDePeticionGetYId(String strEndPoint, String strID, DataTable dataTable) {
		OnStage.theActorInTheSpotlight().attemptsTo(
				ExecuteDeleteWihtoutToken.withTokens(Constants.getData(strEndPoint), strID));
	}
	@Then("Valida que el status sea correcto {int}")
	public void validaQueElStatusSeaCorrecto(Integer intStatusCode) {
		OnStage.theActorInTheSpotlight().should(seeThatResponse(
				validatResponse -> validatResponse.statusCode(intStatusCode)));
	}

}
