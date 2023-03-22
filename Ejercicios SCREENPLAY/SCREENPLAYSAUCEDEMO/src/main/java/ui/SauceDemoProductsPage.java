package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoProductsPage extends PageObject {
	

	public static Target pageTitle = Target.the("Page title").locatedBy("//*[text() = 'Products']");
	public static Target selectProdFilter = Target.the("Products filter").locatedBy("//*[@data-test='product_sort_container']");

	public static Target listProductsNames = Target.the("Nombre Productos").locatedBy("//*[@class='inventory_item_name']");
	public static Target listProductsPrices= Target.the("Precio Productos").locatedBy("//*[@class='inventory_item_price']");
    
}
