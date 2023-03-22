package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoCartPage extends PageObject{
    //Aqui se hará todo lo relacionado a Carrito Page
    public static Target btnProduct1 = Target.the("Boton de producto 1").locatedBy("//*[@id= 'add-to-cart-sauce-labs-backpack']");
    public static Target btnProduct2 = Target.the("Boton de producto2").locatedBy("//*[@id= 'add-to-cart-sauce-labs-bike-light']");
    public static Target btnCart = Target.the("Boton carrito").locatedBy("//*[@class='shopping_cart_link']");
    public static Target btnCheckout = Target.the("Boton de Checkout").locatedBy("//*[@id='checkout']");
    
}
