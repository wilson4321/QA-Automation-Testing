package com.sophossolutions.stepdefinitions;

import com.sophossolutions.interactions.SelectImage;
import com.sophossolutions.tasks.CicloFull;
import com.sophossolutions.tasks.EvalartLogin;
import com.sophossolutions.tasks.TestCompleto;
import com.sophossolutions.ui.EvalartTest;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class EvalartLoginStepDefinition {

	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Ingreso a la pagina Evalart {string} e ingreso mis credenciales")
	public void getIntoThePageEvalart(String strUrl) {
		OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
		OnStage.theActorInTheSpotlight().wasAbleTo(EvalartLogin.login());
		
	}

	@When("Realizo los cuestionarios")
	public void enterLoginCredentials() {
		OnStage.theActorInTheSpotlight().wasAbleTo(TestCompleto.value());
	}

	@Then("copio el hash")
	public void iValidateTheOutcomes() {
		

	}

}
