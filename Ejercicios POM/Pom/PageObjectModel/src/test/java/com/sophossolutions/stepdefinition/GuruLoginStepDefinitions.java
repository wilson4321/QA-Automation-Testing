package com.sophossolutions.stepdefinition;

import com.sophossolutions.Pages.GuruHome;
import com.sophossolutions.Pages.GuruLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.Managed;

public class GuruLoginStepDefinitions {
	GuruLogin guruLogin;
	GuruHome guruHome;
	
	@Managed /**Redirecciona configuracion del navegador desde archivo "Serenity.propierties" **/
	WebDriver myBrowser;
	
	@Given("El usuario debe estar en la pagina guru99 {string}")
	public void elUsuarioDebeEstarEnLaPaginaGuru99(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Estoy en el Given ");
	    guruLogin.navegar(string);
	}
	
	@When("Ingresa credenciales {string} y se autentica {string}")
	public void ingresaCredencialesYSeAutentica(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Estoy en el When ");
		guruLogin.login(string, string2);
	}
	
	@Then("Y valida el mensaje de la pagina Home {string}")
	public void yValidaElMensajeDeLaPaginaHome(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Estoy en el then ");
		guruHome.validateText(string);
	}


}
