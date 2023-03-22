package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophossolutions.apis.FrankfurterApi;
import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.restinteractions.RestInteraction;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GetFrankfurterStepDefinition {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("the {string} establish the base {string}")
	public void theEstablishTheBase(String string, String strBaseUrl) {
		FrankfurterApi.setBaseUrl(Constants.getData(strBaseUrl));
		System.out.println("Estoy en el given");

	}
	@When("I check for the endpoint {string}")
	public void iCheckForTheEndpoint(String strEndPoint) {
		GoRestApi.executeGetRest(Constants.getData(strEndPoint));

	}
	@Then("I verify the status code {int} and the info {string}")
	public void iVerifyTheStatusCodeAndTheAuctionsInfo(Integer intStatusCode,String strSchema,DataTable dataTable) {
		FrankfurterApi.validateStatusCode(intStatusCode);
		Map<String, String> map = dataTable.asMap();
		map.forEach((key,value)-> FrankfurterApi.validateField(key, value));
		
		FrankfurterApi.validateData(strSchema);
	}
	@Then("prueba")
	public void prueba() {
		RestInteraction.prueba();
	}
	
}
