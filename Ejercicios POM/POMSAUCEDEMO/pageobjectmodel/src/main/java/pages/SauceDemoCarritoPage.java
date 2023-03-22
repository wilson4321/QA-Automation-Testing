package pages;

import org.openqa.selenium.By;

import actions.Action;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Constants;

@DefaultUrl("https://www.saucedemo.com/inventory.html")

	public class SauceDemoCarritoPage extends PageObject{
		
		By btnAddCartProduct1 = By.name("add-to-cart-sauce-labs-backpack");
		By btnAddCartProduct2 = By.name("add-to-cart-sauce-labs-bike-light");
		By btnCart = By.xpath("//*[@class='shopping_cart_link']");
		By btnCheckout = By.name("checkout");
		
		public void navegateToUrl(String url){
	        Action.navegateToUrl(getDriver(),  Constants.getData(url));
	    }
		
		public void addProductos() {
			
			Action.clickElement(getDriver(), btnAddCartProduct1);
			Action.clickElement(getDriver(), btnAddCartProduct2);
			Action.clickElement(getDriver(), btnCart);
		}
		
		public void comprobarCart() {
			Action.clickElement(getDriver(), btnCheckout);
		}

	}

