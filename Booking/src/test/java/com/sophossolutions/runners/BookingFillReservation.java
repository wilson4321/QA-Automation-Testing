package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = "com.sophossolutions.stepdifinitions",
		features = "src/test/resources/com/sophossolutions/features/booking_reservation_info.feature",
		snippets = SnippetType.CAMELCASE)

public class BookingFillReservation {

}
 