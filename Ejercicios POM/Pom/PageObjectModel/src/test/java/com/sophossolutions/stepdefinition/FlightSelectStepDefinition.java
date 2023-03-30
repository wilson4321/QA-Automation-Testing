package com.sophossolutions.stepdefinition;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.Pages.FlightHome;
import com.sophossolutions.Pages.TourFlight;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class FlightSelectStepDefinition {
	TourFlight tourFlight;
	FlightHome flightHome;

	@Managed /**Redirecciona configuracion del navegador desde archivo "Serenity.propierties" **/
	WebDriver myBrowser;
	
	@Given("El usuario esta en la seccion de Flights {string}")
	public void elUsuarioEstaEnLaSeccionDeFlights(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Estoy en el Given ");
	    tourFlight.navegar(Constants.getData(url));
	}
	
	@When("Ingresa los datos solicitados")
	public void ingresaLosDatosSolicitados(DataTable dataTable) {
		System.out.println("Estoy en el when ");
		Map<String,String> mapTable = dataTable.asMap(String.class, String.class);
		tourFlight.reserva(dataTable);
	}
	
	
	@Then("Valida que esta en la seccion Reserva finalizada {string}")
	public void validaQueEstaEnLaSeccionReservaFinalizada(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Estoy en el then");
	}
	
}
