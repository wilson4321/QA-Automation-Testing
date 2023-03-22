package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AddCartProducts;
import ui.SauceDemoCartPage;
import utils.Constants;

public class SauceDemoCartStepDefinitions {
    @Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}

    @Given("Get into the page sauce demo inventory {string}")
    public void getIntoThePageSauceDemoInventory(String strUrl){
        OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
    }
  

    @When("Add to the cart two products")
    public void addToTheCartTwoProducts(){
        OnStage.theActorCalled("QAUser").attemptsTo(AddCartProducts.with(SauceDemoCartPage.btnProduct1, SauceDemoCartPage.btnProduct2, SauceDemoCartPage.btnCart, SauceDemoCartPage.btnCheckout));
    }

    @Then("Go to {string}")
    public void goTo(String string){
        System.out.println("Pasar a la pagina checkout");
    }
}
