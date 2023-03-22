package stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DadosPage;

public class DadosPageStepDefinition {

	private DadosPage dadospage;
	@Given("Dado que me encuentro en la pagina de jugar dados {string}")
	public void dadoQueMeEncuentroEnLaPaginaDeJugarDados(String string) {
		dadospage.navegateToUrl(string);

	}
	
	@When("Realizo roll con la cantidad deseada")
	public void realizoRollConLaCantidadDeseada(DataTable dataTable) {
		Map<String,String> mapTable = dataTable.asMap();
		dadospage.build(mapTable.get("type"));
		dadospage.playDice(mapTable.get("number"));

	}
	
	@Then("Valido el mensaje de correct {string}")
	public void validoElMensajeDeCorrect(String string) {
         dadospage.validateText();
	}
}
