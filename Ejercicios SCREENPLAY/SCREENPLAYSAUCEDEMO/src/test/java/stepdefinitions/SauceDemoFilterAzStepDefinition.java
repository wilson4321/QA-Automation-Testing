package stepdefinitions;

import interactions.GetWebElements;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.SelectFilter;
import utils.Constants;

public class SauceDemoFilterAzStepDefinition {
    //Añadir etiqueta Before
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User gets into the page products {string}")
    public void userGetIntoThePageProducts(String strUrl) {
        OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
	}

    @When("Select the filter option A to Z {string}")
    public void userSelectFilterOptionHighToLow(String strValue) {
    OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilter.by(strValue));
}
    @Then("Print the list of products ordered A to Z in the console")
    public void printListOfProductsOrderedZToAInTheConsole() {
    // Write code here that turns the phrase above into concrete actions
    OnStage.theActorInTheSpotlight().wasAbleTo(GetWebElements.relativeTo(1));
}
}
