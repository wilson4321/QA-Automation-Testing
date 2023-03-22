package utils;

import java.util.*;

public class Constants {

    private static Constants instance;
    private Map<String, String> constantDir = new HashMap<String, String>();

    private Constants() {
    	// Constant de URL para Login
        constantDir.put("Sauce Demo", "https://www.saucedemo.com/");
	    // Constant de URL para Productos 
	    constantDir.put("Sauce Inventory", "https://www.saucedemo.com/inventory.html"); 
	    
        // Constant de URL para el Checkout Information
        constantDir.put("Sauce Checkout Information", "https://www.saucedemo.com/checkout-step-one.html"); 
        
        //Constatn de URL para el checkout Overview
        constantDir.put("Sauce Checkout Overview", "https://www.saucedemo.com/checkout-step-two.html");
	    
        //Constant de URL para Comprobar Productos del Carrito
        constantDir.put("Sauce Cart", "https://www.saucedemo.com/cart.html");
	    }
	
	    public static String getData(String key) {
        if (instance == null){
            instance = new Constants();
        }
        return instance.constantDir.get(key);
    }
    
}