package com.sophossolutions.Pages;

import static com.sophossolutions.Actions.Actions.getText;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sophossolutions.Actions.Actions;

import net.serenitybdd.core.pages.PageObject;

public class TourHome extends PageObject {
By text = By.xpath("//h3[contains(text(),'Login Successfully')]");

By buttonf = By.xpath("//a[contains(text(),'Flights')]");

	public void validateText(String text) {
		//Actions.clickElement(getDriver(),this.buttonf);
		assertEquals("Fallo validacion",text,getText(getDriver(),this.text));
		
	}
	
	 public void irFlight (String flight) {
		 Actions.clickElement(getDriver(),this.buttonf);
	 }

}
