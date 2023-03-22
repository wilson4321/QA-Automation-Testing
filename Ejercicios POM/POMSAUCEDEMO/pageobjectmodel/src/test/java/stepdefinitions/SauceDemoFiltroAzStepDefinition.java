package stepdefinitions;

import pages.SauceDemoProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoFiltroAzStepDefinition {
	
	SauceDemoProductsPage inventory;
	
	@Given("El usuario deberia de estar en la pagina Inventory {string}")
	public void elUsuarioDeberiaDeEstarEnLaPaginaInventory(String string) {
		System.out.println("Estoy en el Given del Filtro A-Z");
		inventory.navegar(string);
	}
	@When("El usuario selecciona la opcion de filtro A-Z")
	public void elUsuarioSeleccionaLaOpcionDeFiltroAZ(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("Estoy en el When del Filtro A-Z");
		inventory.filtroAtoZ(dataTable);
	}
	@Then("Ver el resultado en consola")
	public void verElResultadoEnConsola() {
		System.out.println("Estoy en el Then del Filtro A-Z");
		inventory.printProducts(1);
	}



}
