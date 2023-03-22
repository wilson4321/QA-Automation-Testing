package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.FlightFilters;

public class DespegarFlightFiltersStepDefinition {
	

	@Given("El usuario quiere ver cada uno de los filtros")
	public void elUsuarioQuiereVerCadaUnoDeLosFiltros() {
		
	}
	@When("Observa la informacion de cada uno de los filtros")
	public void observaLaInformacionDeCadaUnoDeLosFiltros() {
		OnStage.theActorInTheSpotlight().wasAbleTo(FlightFilters.recomendedfilter());
	}
	@Then("Verifica los precios")
	public void verificaLosPrecios() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Estoy en el then");
	}

}
