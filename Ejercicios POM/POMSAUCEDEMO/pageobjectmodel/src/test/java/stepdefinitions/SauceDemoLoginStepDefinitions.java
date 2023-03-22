package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.SauceDemoLoginPage;

public class SauceDemoLoginStepDefinitions {

    private SauceDemoLoginPage sauceLoginPage;

    @Given("Deseo ir a la pagina {string}")
    public void deseoIrALaPagina(String string) {
        sauceLoginPage.navegateToUrl(string);
        System.out.println("Estoy en el given");
        
    }
    @When("Ingresar las credenciales")
    public void ingresarLasCredenciales(DataTable dataTable) {
        
        sauceLoginPage.login(dataTable);
        System.out.println("Estoy en el when");
    }
    @Then("Validar que se pueda visualizar la pagina PRODUCTS")
    public void validarQueSePuedaVisualizarLaPaginaPRODUCTS() {
        
        sauceLoginPage.check();
        System.out.println("Estoy en el then");
}
    
}
