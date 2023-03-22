package com.sophossolutions.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {
	public static Target txtBienvenida = Target.the("Titulo de bienvenida").locatedBy("//h3[contains(text(),'Login')]");
	public static Target txtGuruHome = Target.the("Welcome to manager's Page").locatedBy("//td[contains(text(),'Manger Id')]");

}
