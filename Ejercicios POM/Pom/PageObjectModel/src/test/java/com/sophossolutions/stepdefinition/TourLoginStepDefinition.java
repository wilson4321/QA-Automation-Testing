package com.sophossolutions.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.sophossolutions.Pages.GuruHome;
import com.sophossolutions.Pages.GuruLogin;
import com.sophossolutions.Pages.TourHome;
import com.sophossolutions.Pages.TourLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

public class TourLoginStepDefinition {
	TourLogin tourLogin;
	TourHome tourHome;
	
	@Managed /**Redirecciona configuracion del navegador desde archivo "Serenity.propierties" **/
	WebDriver myBrowser;
	
	@Given("El usuario debe estar en la pagina Mecury Tour {string}")
	public void elUsuarioDebeEstarEnLaPaginaMecuryTour(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Estoy en el Given ");
		tourLogin.navegar(string);
	}
	
	@When("Ingresa credenciales y se autentica el user {string} y password {string}")
	public void ingresaCredencialesYSeAutenticaElUserYPassword(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Estoy en el when ");
		tourLogin.login(string, string2);
	}
	
	@Then("valida el mensaje de la pagina Home {string}")
	public void validaElMensajeDeLaPaginaHome(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Estoy en el then");
		tourHome.validateText(string);
		tourHome.irFlight(string);
	}


}
