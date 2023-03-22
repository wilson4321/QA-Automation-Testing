package stepdefinitions;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoProductsPage;

public class SauceDemoAltoStepDefinition {
     
	SauceDemoProductsPage inventory;
	
	@Given("The user have been sign up in the page inventory {string}")
public void theUserHaveBeenSignUpInThePageInventory(String string) {
    inventory.navegar(string);
	System.out.println("Estoy en el Given");
}

@When("Seleccionar el filtro precio mas alto a mas bajo")
public void seleccionarElFiltroPrecioMasAltoAMasBajo(DataTable dataTable) {
    inventory.filtroAlto(dataTable);
	System.out.println("Estoy en el When");
}
	@Then("Validar que se ordenen los productos disponibles del precio mas bajo al mas alto")
	public void validarQueSeOrdenenLosProductosDisponiblesDelPrecioMasBajoAlMasAlto() {
    	// Write code here that turns the phrase above into concrete actions
		inventory.printProducts(4);
		System.out.println("Estoy en el Then");

}
	
	
}
