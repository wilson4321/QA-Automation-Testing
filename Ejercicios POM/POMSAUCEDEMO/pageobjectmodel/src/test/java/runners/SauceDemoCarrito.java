package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
//import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    glue="stepdefinitions",
    features = "src/test/resources/features/sauce_demo_carrito.feature",
    snippets = SnippetType.CAMELCASE)
public class SauceDemoCarrito {
    
}

