package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.utils.Constants.getData;

import java.util.Map;

import com.sophossolutions.apis.ReqresApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class PostReqresStepDefinition {
	
	@Given("Dado que {string} establece la base url {string}")
	public void dadoQueEstableceLaBaseUrl(String strActorName, String strBaseUrl) {
		ReqresApi.setBaseUrl(Constants.getData(strBaseUrl));

	}
	@When("Consulta el endpoint {string} por medio de la peticion post.")
	public void consultaElEndpointPorMedioDeLaPeticionPost(String strEndPoint, DataTable dataTable) {
		Map<String, String> body = dataTable.asMap();
		SerenityRest.given().contentType(ContentType.JSON).when().body(body).post(Constants.getData("reqres").concat(getData(strEndPoint)));
		SerenityRest.lastResponse().prettyPeek();

	}
	
	@Then("Validar que el status sea {int} y que el schema {string} sea el correcto.")
	public void validarQueElStatusSeaYQueElSchemaSeaElCorrecto(Integer intStatusCode, String strSchema) {
		ReqresApi.validateStatusCode(intStatusCode);
		ReqresApi.validateData(strSchema);
	   
	}

}
