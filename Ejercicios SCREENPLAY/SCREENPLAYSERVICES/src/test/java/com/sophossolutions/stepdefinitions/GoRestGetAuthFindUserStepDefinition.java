package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GoRestApi;

import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import static com.sophossolutions.utils.Constants.getData;
public class GoRestGetAuthFindUserStepDefinition {
	
	
	@When("Consulta el endpoint {string} con una peticion get usando token")
	public void consultaElEndpointConUnaPeticionGetUsandoToken(String strEndPoint) {
	  SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN).get(getData("Go Rest").concat(getData(strEndPoint)));
	  SerenityRest.lastResponse().prettyPeek();
	  
	  
	  //Con headers
//	  Map<String, String> headers = new HashMap<String, String>();
//		headers.put("Authorization", "Bearer ".concat(GoRestApi.STR_TOKEN));
//		headers.put("Content-Type", "application/json");
//		SerenityRest.given().headers(headers).get(getData("Go Rest").concat(getData(strEndPoint).concat(strId)));
//		SerenityRest.lastResponse().prettyPeek();
	  
	}

}
