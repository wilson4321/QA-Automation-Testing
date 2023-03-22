package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightFilter extends PageObject{
	
	public static Target btnRecomendados = Target.the("Vuelo Recomendado").locatedBy("//*[@class='title -eva-3-bold']/p[contains(text(),'Recomendados')]");
	public static Target btnBaratos = Target.the("Vuelo mas Barato").locatedBy("//*[text()=' baratos']");
	public static Target btnRapidos = Target.the("Vuelo mas rapido").locatedBy("//*[text()=' rápidos']");

	

}
