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
import tasks.SetCheckOverview;
import ui.SauceDemoCheckOverviewPage;
import utils.Constants;

public class SauceDemoCheckOverviewSetpDefinition {
    
    @Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}


    @Given("Be on the page checkout:Overview {string}")
    public void beOnThePageCheckoutOverview(String strUrl) {
   // Write code here that turns the phrase above into concrete actions
    OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
   
}
    @When("Check the selected products")
   public void checkTheSelectedProducts() {
    OnStage.theActorCalled("QAUser").attemptsTo(SetCheckOverview.from(SauceDemoCheckOverviewPage.txtSauceCard,SauceDemoCheckOverviewPage.txtItemTotal,SauceDemoCheckOverviewPage.txtTax,SauceDemoCheckOverviewPage.txtTotal));
   
}
    @Then("check payment information and finalize the purchase {string}")
    public void checkPaymentInformationAndFinalizeThePurchase(String strCompleteOrder) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(SetCheckOverview.txtComplete),
        Matchers.equalTo(strCompleteOrder)).orComplainWith(UnexpectedResult.class,
                "The title finded is different"));
   
}
    
}
