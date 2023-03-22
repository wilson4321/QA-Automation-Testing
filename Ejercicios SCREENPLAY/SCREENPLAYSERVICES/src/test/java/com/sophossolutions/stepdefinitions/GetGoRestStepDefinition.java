package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetGoRestStepDefinition {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Dado que {string} estblece la base url {string}")
	public void dadoQueEstbleceLaBaseUrl(String strActorName, String strBaseUrl) {
		GoRestApi.setBaseUrl(Constants.getData(strBaseUrl));
	}
	@When("Consulta el endpoint {string}")
	public void consultaElEndpoint(String strEndPoint) {
		GoRestApi.executeGetRest(Constants.getData(strEndPoint));
	}
	@Then("Validar que el status sea {int} y el schema {string}")
	public void validarQueElStatusSeaYQueLaRespuestaContengaLosDatos(Integer intStatusCode,String strSchema, DataTable dataTable) {
		GoRestApi.validateStatusCode(intStatusCode);
		
		Map<String, String> map = dataTable.asMap();
		map.forEach((key,value)-> GoRestApi.validateField(key, value));
//		GoRestApi.validateField("id", map.get("id"));
//		GoRestApi.validateField("name", map.get("name"));
//		GoRestApi.validateField("email", map.get("email"));
//		GoRestApi.validateField("gender", map.get("gender"));
//		GoRestApi.validateField("status", map.get("status"));
		
		GoRestApi.validateData(strSchema);
		
	}

}
