package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoCheckoutOverview;

public class SauceDemoChkoutOverStepDefinition {
	SauceDemoCheckoutOverview overview;
	
	@Given("El usuario se encuentra en la pagina {string}")
	public void elUsuarioSeEncuentraEnLaPagina(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Estoy en la pagina del CheckOverview");
	}
	@When("Verifica sus productos seleccionados")
	public void verificaSusProductosSeleccionados() {
	    overview.readOverview();
	    
	}
	
	@Then("Observa su informacion de pago y finaliza compra {string}")
	public void observaSuInformacionDePagoYFinalizaCompra(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Finalizo mi compra");
	    overview.validarCompra(string);
	}
	

}
