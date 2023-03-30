package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) //Clase que contiene las instrucciones para la ejecucion
@CucumberOptions(
		glue = "com.sophossolutions.stepdefinition",//Donde va el paquete de los stepDefinition
		features = "src/test/resources/com/sophossolutions/features/flightselect.feature", //Ruta del fiture que ejecutare
		snippets = SnippetType.CAMELCASE //Tipo camelcase
		)

public class FlightSelect {

}
