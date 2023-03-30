package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookingRoom extends PageObject{

	
	public static Target btnhabi = Target.the("selecthabi").locatedBy("(//select[@class='hprt-nos-select js-hprt-nos-select'])[1]");
	public static Target btnReservare = Target.the("Reservare").locatedBy("//div[@class='hprt-reservation-cta']//button");
	
	
}
