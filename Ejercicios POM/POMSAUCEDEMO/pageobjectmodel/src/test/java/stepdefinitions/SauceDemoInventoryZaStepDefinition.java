package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoProductsPage;

public class SauceDemoInventoryZaStepDefinition {
     
	SauceDemoProductsPage inventory;
	
	@Given("El usuario debe estar en la pagina inventory {string}")
	public void elUsuarioDebeEstarEnLaPaginaInventory(String string) {
	    // Write code here that turns the phrase above into concrete actions
		inventory.navegar(string);
	    System.out.println("Estoy en el Given");
	}
	
	@When("Seleccionar filtro Z a la A")
	public void seleccionarFiltroZALaA(DataTable dataTable) {
		inventory.filtroZtoA(dataTable);
		System.out.println("Estoy en el When");
	}

	
	@Then("I validate the outcomes")
	public void iValidateTheOutcomes() {
		System.out.println("Estoy en el Then");
		inventory.printProducts(2);
	}
}
