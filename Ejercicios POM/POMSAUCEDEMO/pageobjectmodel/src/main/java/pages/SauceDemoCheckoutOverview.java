package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import actions.Action;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Constants;
import static actions.Action.getElementText;
@DefaultUrl("https://www.saucedemo.com/checkout-step-two.html")
public class SauceDemoCheckoutOverview extends PageObject {

	By txtSauceCard = By.xpath("//div[@class='summary_value_label' and contains(text(), 'SauceCard')]");
	By txtItemTotal = By.xpath("//div[@class='summary_subtotal_label']");
	By txtTax = By.xpath("//div[@class='summary_tax_label']");
	By txtTotal = By.xpath("//div[@class='summary_info_label summary_total_label']");
	By btnFinish=By.name("finish");
	By txtThanks = By.xpath("//h2[@class='complete-header' and contains(text(),'Thank you for your order!')]");
	
	
	
public void navegateToUrl(String url){
        
        Action.navegateToUrl(getDriver(),  Constants.getData(url));
    }

public void readOverview() {
	
	System.out.println("Informacion de compra: ");
	System.out.println("------------------------------------");
	WebElement[] elementos = { getDriver().findElement(txtSauceCard),
			getDriver().findElement(txtItemTotal), getDriver().findElement(txtTax),
			getDriver().findElement(txtTotal)};
	for (WebElement elemento : elementos) {
		System.out.println(elemento.getAttribute("innerText"));
	}
	
	Action.clickElement(getDriver(), btnFinish);
	
}


public void validarCompra(String txtThanks) {
	assertEquals("Fallo Compra ", txtThanks, getElementText(getDriver(),this.txtThanks));
}

}
