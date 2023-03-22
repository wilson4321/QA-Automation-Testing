package com.sophossolutions.stepdefinitions;

import java.util.Map;

import com.sophossolutions.apis.GoRestApi;
import com.sophossolutions.task.ExecuteGet;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class NuevoGorestStepDefinition {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Dado que {string} establece la base url {string} del servicio")
	public void dadoQueEstableceLaBaseUrlDelServicio(String strActorName, String strBaseUrl) {
		OnStage.theActorCalled(strActorName).whoCan(CallAnApi.at(Constants.getData(strBaseUrl)));
	}

	@When("Consulta el endpoint {string} y el id {string}")
	public void consultaElEndpoint(String strEndPoint, String strID) {
		OnStage.theActorInTheSpotlight().attemptsTo(ExecuteGet.withtokens(Constants.getData(strEndPoint), strID));
	}

	@Then("Valida que el status sea {int} y que la respuesta contenga toda la información del usuario")
	public void validaQueElStatusSeaYQueLaRespuestaContengaTodaLaInformaciónDelUsuario(Integer int1, io.cucumber.datatable.DataTable dataTable) {
    
	}

}
