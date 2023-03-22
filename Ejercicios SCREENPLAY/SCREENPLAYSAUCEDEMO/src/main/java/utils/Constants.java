package utils;

import java.util.HashMap;

import java.util.Map;

public class Constants {

	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {

			constantDir.put("Sauce Demo Login", "https://www.saucedemo.com/");
			constantDir.put("Sauce Demo Inventory", "https://www.saucedemo.com/inventory.html");
			constantDir.put("Sauce Demo Products", "https://www.saucedemo.com/cart.html");
			
			constantDir.put("Checkout", "https://www.saucedemo.com/checkout-step-one.html");
			constantDir.put("Sauce Demo Checkout Information", "https://www.saucedemo.com/checkout-step-one.html");
			constantDir.put("Sauce Demo Checkout Overview", "https://www.saucedemo.com/checkout-step-two.html");


	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
