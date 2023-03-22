package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoCheckInformationPage extends PageObject{

    public static Target txtFirstName = Target.the("First Name TextField").locatedBy("//*[@id='first-name']");
	public static Target txtLastName = Target.the("Last Name TextField").locatedBy("//*[@id='last-name']");
    public static Target txtPostalCode = Target.the("Postal Code TextField").locatedBy("//*[@id='postal-code']");
	public static Target btnContinue = Target.the("Continue Button").locatedBy("//*[@id='continue']");

    
}
