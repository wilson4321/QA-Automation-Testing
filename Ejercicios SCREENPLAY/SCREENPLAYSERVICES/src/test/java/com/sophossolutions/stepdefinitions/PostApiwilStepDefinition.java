package com.sophossolutions.stepdefinitions;

import static com.sophossolutions.utils.Constants.getData;

import java.util.Map;

import com.sophossolutions.apis.ApiwilApi;
import com.sophossolutions.apis.ReqresApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PostApiwilStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece base url {string}")
	public void dadoQueEstableceBaseUrl(String strActorName, String strBaseUrl) {
		ApiwilApi.setBaseUrl(Constants.getData(strBaseUrl));
	}
	@When("Consulta el endpoint {string} por medio de peticion post.")
	public void consultaElEndpointPorMedioDePeticionPost(String strEndPoint, DataTable dataTable) {
		Map<String, String> body = dataTable.asMap();
		SerenityRest.given().contentType(ContentType.JSON).when().body(body).post(Constants.getData("Apiwil").concat(getData(strEndPoint)));
		SerenityRest.lastResponse().prettyPeek();
	}
	@Then("Valida que status sea {int} y que el schema {string} sea el correcto.")
	public void validaQueStatusSeaYQueElSchemaSeaElCorrecto(Integer intStatusCode, String strSchema) {
		ApiwilApi.validateStatusCode(intStatusCode);
		ApiwilApi.validateData(strSchema);
	}
}
