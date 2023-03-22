package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import interactions.GetWebElements;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.SelectFilter;

import utils.Constants;

public class SauceDemoFilterHighStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("Get into the page products {string}")
	public void getIntoThePageProducts(String strUrl)
	{
		OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
	}

	@When("Select filter option high to low {string}")
	public void selectFilterOptionHighToLow(String strValue){
		OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilter.by(strValue));

	}

	@Then("Print list of products prices ordered high to low in the console")
	public void printListOfProductsPricesOrderedHighToLowInTheConsole() {
		OnStage.theActorInTheSpotlight().wasAbleTo(GetWebElements.relativeTo(4));
    
	}



	
}
