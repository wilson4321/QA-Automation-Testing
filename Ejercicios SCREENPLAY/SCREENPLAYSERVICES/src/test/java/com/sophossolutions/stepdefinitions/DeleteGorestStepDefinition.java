package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.utils.Constants.getData;

import com.sophossolutions.apis.ApiwilApi;
import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.restinteractions.RestInteraction;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class DeleteGorestStepDefinition {

	@When("Consulta el endpoint delete {string}")
	public void consultaElEndpointDelete(String strEndPoint, DataTable dataTable) {
		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN).contentType(ContentType.JSON).when().delete(RestInteraction.strBaseUrl.concat(Constants.getData(strEndPoint)));
		SerenityRest.lastResponse().prettyPeek();
	}
	@Then("Validar que el status sea {int}")
	public void validarQueElStatusSea(Integer intStatusCode) {
		GoRestApi.validateStatusCode(intStatusCode);
	}
	
}
