package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.FillFlightInfo;
import utils.Constants;

public class DespegarFlightInfoStepDefinition {

	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("El usuario debe estar en la pagina {string}")
	public void elUsuarioDebeEstarEnLaPagina(String strUrl) {
		OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
	}
	@When("Llena la informacion respectiva al vuelo {string} and {string}")
	public void llenaLaInformacionRespectivaAlVueloAnd(String strOrigen, String strDestino) {
		OnStage.theActorInTheSpotlight().wasAbleTo(FillFlightInfo.form(strOrigen, strDestino));
		
		
	}	
	
	@Then("Verifico que estoy en la pagina de resultados")
	public void verificoQueEstoyEnLaPaginaDeResultados() {
	}

}
