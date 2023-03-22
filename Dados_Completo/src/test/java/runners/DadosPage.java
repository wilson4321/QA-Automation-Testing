package runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    glue="stepdefinitions",
    features = "src/test/resources/features/Dados_page.feature",
    snippets = SnippetType.CAMELCASE)
public class DadosPage {

}
