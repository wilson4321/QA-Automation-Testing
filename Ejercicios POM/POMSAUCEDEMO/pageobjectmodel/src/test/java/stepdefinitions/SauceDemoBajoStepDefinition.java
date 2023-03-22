package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoProductsPage;

public class SauceDemoBajoStepDefinition {

	SauceDemoProductsPage inventory;
	
	@Given("usuario debe estar en la pagina inventory {string}")
	public void usuarioDebeEstarEnLaPaginaInventory(String string) {
		inventory.navegar(string);
	    System.out.println("Estoy en el Given");
	}
	@When("Seleccionar filtro low to High")
	public void seleccionarFiltroLowToHigh(io.cucumber.datatable.DataTable dataTable) {
	    inventory.filtroBajo(dataTable);
	    System.out.println("Estoy en el When");
	    
	}
	
	@Then("Valido los elementos")
	public void validoLosElementos() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Estoy en el Then");
		inventory.printProducts(3);
	}
}
