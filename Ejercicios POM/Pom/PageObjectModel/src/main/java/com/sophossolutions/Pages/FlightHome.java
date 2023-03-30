package com.sophossolutions.Pages;

import static com.sophossolutions.Actions.Actions.getText;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class FlightHome extends PageObject {
	
By text = By.xpath("//td/p[@align='left']/font/b/font[@size='4']");
	
	public void validateText(String text) {
		assertEquals("Fallo Registro",text,getText(getDriver(),this.text));
		
	}

}
