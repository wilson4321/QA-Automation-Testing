package com.sophossolutions.Pages;

import org.openqa.selenium.By;
import groovyjarjarantlr4.v4.codegen.model.Action;
import net.serenitybdd.core.pages.PageObject;
import com.sophossolutions.Actions.Actions;
import static com.sophossolutions.Actions.Actions.getText;
import static org.junit.Assert.assertEquals;

public class GuruHome extends PageObject{
	
	By text = By.xpath("//td[contains(text(),'Manger Id')]");
	
	public void validateText(String text) {
		assertEquals("Fallo validacion",text,getText(getDriver(),this.text));
		
	}
}
