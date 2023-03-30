package com.sophossolutions.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions {

	public static void sendData(WebDriver myBrowser, By target, String data ) {
		myBrowser.findElement(target).sendKeys(data);;
	}
	
	public static void clickElement(WebDriver myBrowser, By target) {
		myBrowser.findElement(target).click();
	}
	
	public static String getText(WebDriver myBrowser, By target) {
		return myBrowser.findElement(target).getText();
	}
	
	public static void selectFromOption(WebDriver myBrowser, String opcion, By target) {
		WebElement listaSelect = myBrowser.findElement(target);
		Select select = new Select(listaSelect);
		select.selectByVisibleText(opcion);
	}
	
	
}
