package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.FillCheckInformation;
import utils.Constants;

public class SauceDemoCheckInformationStepDefinitions {

    @Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

    @Given("Get into the page checkout:Information {string}")
    public void getIntoThePageCheckoutInformation(String strUrl){
        OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
    } 

    @When("Enter personal information into de form {string} and {string} and {string}")
    public void enterPersonalInformationIntoDeFormAndAnd(String strLastName, String strFirstName, String strPostalCode) {
        OnStage.theActorInTheSpotlight().wasAbleTo(FillCheckInformation.with(strLastName, strFirstName, strPostalCode));
   
    }
    
    @Then("Validate title of the CheckOverview page")
    public void validateTitleOfTheCheckOverviewPage()  {
   // Write code here that turns the phrase above into concrete actions
        
    
    }
}
