package stepdefinitions;

import org.hamcrest.Matchers;

import exceptions.UnexpectedResult;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TextOf;
import tasks.SetCredentials;
import ui.SauceDemoProductsPage;
import utils.Constants;

public class SauceDemoLoginStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("Get into the page sauce demo {string}")
	public void getIntoThePageSauceDemo(String strUrl) {
		
		OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
		
	}
	@When("Enter login credentials")
	public void enterLoginCredentials() {
		OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.doTask());
	}
	@Then("Validate message into the products page {string}")
	public void validateMessageIntoTheProductsPage(String strPageTitle)  {
		
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(SauceDemoProductsPage.pageTitle),
				Matchers.equalTo(strPageTitle)).orComplainWith(UnexpectedResult.class,
						"The title finded is different"));
	}
	
}
