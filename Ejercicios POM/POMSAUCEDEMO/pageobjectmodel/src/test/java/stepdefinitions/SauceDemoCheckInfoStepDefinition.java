package stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import pages.SauceDemoCheckoutInformationPage;

public class SauceDemoCheckInfoStepDefinition {

    SauceDemoCheckoutInformationPage checkoutInfoPage;

    @Given("El usuario ingresa a la pagina  {string}")
    public void elUsuarioIngresaALaPagina(String string) {

        checkoutInfoPage.navegateToUrl(string);
    }

    @When("Diligencia el formulario con los datos personales requeridos")
    public void diligenciaElFormularioConLosDatosPersonalesRequeridos(DataTable dataTable) {
        checkoutInfoPage.saveClientPersonalData(dataTable);
    }
    @Then("Visualiza que su informacion sea enviada correctamente al oprimir el boton")
    public void visualizaQueSuInformacionSeaEnviadaCorrectamenteAlOprimirElBoton() {
    
    }
    
}
