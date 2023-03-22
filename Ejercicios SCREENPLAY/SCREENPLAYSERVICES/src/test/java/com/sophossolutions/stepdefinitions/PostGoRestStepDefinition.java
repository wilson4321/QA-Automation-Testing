package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.apis.ReqresApi;
import com.sophossolutions.utils.Constants;
import static com.sophossolutions.utils.Constants.getData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class PostGoRestStepDefinition {

	
	
	@When("Consulta el endpoint {string} por medio de una peticion post.")
	public void consultaElEndpointPorMedioDeUnaPeticionPost(String strEndPoint,DataTable dataTable) {
		Map<String, String> body = dataTable.asMap();
		SerenityRest.given().auth().oauth2(GoRestApi.STR_TOKEN).contentType(ContentType.JSON).when().body(body).post(Constants.getData("Go Rest").concat(getData(strEndPoint)));
		SerenityRest.lastResponse().prettyPeek();
	}
	
	@Then("Validar que el status sea {int} y que el esquema {string} sea el correcto.")
	public void validarQueElStatusSeaYQueElEsquemaSeaElCorrecto(Integer intStatusCode, String strSchema) {
		GoRestApi.validateStatusCode(intStatusCode);
		GoRestApi.validateData(strSchema);
	}
}
