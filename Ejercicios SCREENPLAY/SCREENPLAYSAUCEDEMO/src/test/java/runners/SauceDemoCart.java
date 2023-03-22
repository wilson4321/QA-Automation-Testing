package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//Importar etiquetas RunWith y CucumberOptions
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    glue = "stepdefinitions",
    features = "src/test/resources/features/sauce_demo_cart.feature",
    snippets = SnippetType.CAMELCASE
    )


public class SauceDemoCart {

}
