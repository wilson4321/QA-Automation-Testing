package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EvalartLoginPage extends PageObject{

	public static Target txtUserName = Target.the("User Name TextField").locatedBy("//*[@name = 'username']");
	public static Target txtPassword = Target.the("Password TextField").locatedBy("//*[@name = 'password']");
	public static Target btnLogin = Target.the("Login Button").locatedBy("//*[@type = 'submit']");
}
