package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) //Clase que contiene las instrucciones para la ejecucion
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinition",
		features = "src/test/resources/com/sophossolutions/features/tour_login.feature",
		snippets = SnippetType.CAMELCASE
		)
public class TourLogin {

}
