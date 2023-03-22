package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.GuruSetCredentials;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GuruLoginStepDefinition {

	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("The user would be in Guru99 login page {string}")
	public void theUserWouldBeInGuru99LoginPage(String string) {
	    // Write code here that turns the phrase above into concrete actions
		OnStage.theActorCalled("Cliente").wasAbleTo(Open.url(Constants.getData(string)));
	}
	@When("User enters the credentials {string} and password {string}")
	public void userEntersTheCredentialsAndPassword(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		OnStage.theActorInTheSpotlight().wasAbleTo(GuruSetCredentials.form(string,string2));
	}
	@Then("Validates Home message {string}")
	public void validatesHomeMessage(String string) {
		 OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(HomePage.txtGuruHome),
		    		Matchers.equalTo(string)).orComplainWith(UnexpectedResult.class,"El titulo del elemento no coincide con el esperado"));
	}
}
