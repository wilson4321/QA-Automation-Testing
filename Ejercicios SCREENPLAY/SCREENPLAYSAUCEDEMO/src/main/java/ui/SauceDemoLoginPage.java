package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoLoginPage  extends PageObject{

	public static Target txtUserName = Target.the("User Name TextField").locatedBy("//*[@id = 'user-name']");
	public static Target txtPassword = Target.the("Password TextField").locatedBy("//*[@id = 'password']");
	public static Target btnLogin = Target.the("Login Button").locatedBy("//*[@id = 'login-button']");
	

}
