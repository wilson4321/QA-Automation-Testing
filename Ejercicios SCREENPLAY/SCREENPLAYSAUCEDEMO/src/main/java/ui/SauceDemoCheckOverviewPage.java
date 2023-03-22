package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoCheckOverviewPage extends PageObject{

    public static Target txtSauceCard = Target.the("Sauce Card number ").locatedBy("//div[@class='summary_value_label' and contains(text(), 'SauceCard')]");
	public static Target txtItemTotal = Target.the("Item Total").locatedBy("//div[@class='summary_subtotal_label']");
    public static Target txtTax = Target.the("Tax").locatedBy("//div[@class='summary_tax_label']");
	public static Target txtTotal = Target.the("Total").locatedBy("//div[@class='summary_info_label summary_total_label']");
    public static Target btnFinish = Target.the("Finish Button").locatedBy("//*[@id = 'finish']");
	

	
    
}
