package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EvalartTest extends PageObject{
	public static Target txtMath = Target.the("Operacion matematica").locatedBy("//p[contains(@class,'text-center text-xl font-bold') and contains(text(),'{0}')]");
	public static Target btnCorrecto = Target.the("Boton correcto").locatedBy("//*[@value='{0}']");
	public static Target btnemoji = Target.the("Respuesta emoji").locatedBy("//input[@placeholder = ' Numero ']");
	
	public static Target btnselect = Target.the("Caja respuesta matematica").locatedBy("//select[@name='select']");
	
	

	
}
