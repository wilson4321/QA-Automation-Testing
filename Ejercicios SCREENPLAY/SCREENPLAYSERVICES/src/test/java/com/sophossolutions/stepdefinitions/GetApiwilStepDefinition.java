package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.ApiwilApi;
import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.apis.ReqresApi;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetApiwilStepDefinition {

	@When("Consulta el endpoint deseado {string} por medio de peticion get.")
	public void consultaElEndpointDeseadoPorMedioDePeticionGet(String strEndPoint) {
		ApiwilApi.executeGetRest(Constants.getData(strEndPoint));
	}
	@Then("Valida que el status sea {int} y que el schema {string} sea el correcto.")
	public void validaQueElStatusSeaYQueElSchemaSeaElCorrecto(Integer intStatusCode, String strSchema, DataTable dataTable) {
		ApiwilApi.validateStatusCode(intStatusCode);
		ApiwilApi.validateData(strSchema);
	}
}
