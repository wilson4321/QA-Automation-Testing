package stepdefinitions;

import interactions.GetWebElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.SelectFilter;
import utils.Constants;

public class SauceDemoFilterLowStepDefinition {

    

    @Given("User get into the page products {string}")
    public void userGetIntoThePageProducts(String strUrl) {
        OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
}
    @When("User select filter option high to low {string}")
    public void userSelectFilterOptionHighToLow(String strValue) {
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilter.by(strValue));
}
    @Then("Print list of products prices ordered low to High in the console")
    public void printListOfProductsPricesOrderedLowToHighInTheConsole() {
        OnStage.theActorInTheSpotlight().wasAbleTo(GetWebElements.relativeTo(3));
}
    
}
