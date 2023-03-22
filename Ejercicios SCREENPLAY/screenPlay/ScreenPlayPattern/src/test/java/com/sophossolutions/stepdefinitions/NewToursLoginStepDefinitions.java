package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.ui.LoginPage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class NewToursLoginStepDefinitions {

	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Debe estar en la pagina de newTours {string}")
	public void debeEstarEnLaPaginaDeNewTours(String string) {
		//Open.url(Constants.getData(string));
		OnStage.theActorCalled("Cliente").wasAbleTo(Open.url(Constants.getData(string)));
		//OnStage.theActorInTheSpotlight().wasAbleTo(null);
	   
	}
	@When("Ingresar credenciales {string} y password {string}")
	public void ingresarCredencialesYPassword(String string, String string2) {
		OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.form(string,string2));


	}
	@Then("Validar que estoy en el home {string}")
	public void validarQueEstoyEnElHome(String string) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(HomePage.txtBienvenida),
	    		Matchers.equalTo(string)).orComplainWith(UnexpectedResult.class,"El titulo del elemento no coincide con el esperado"));

	}

	
}
