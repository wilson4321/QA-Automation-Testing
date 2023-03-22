package pages;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import actions.Action;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Constants;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class SauceDemoProductsPage extends PageObject {

	By selectFilter = By.xpath("//*[@class='product_sort_container']");
	By listProductsNames = By.xpath("//*[@class='inventory_list']/descendant::div[@class='inventory_item_name']");
	By listProductsPrices = By.xpath("//*[@class='inventory_list']//descendant::div[@class='inventory_item_price']");
	

	public void navegar(String url) {

		Action.navegateToUrl(getDriver(), Constants.getData(url));
	}

	//----------------Filtros----------------------
	//Metodo para filtro de A la Z
	public void filtroAtoZ(DataTable dataTable) {
		//Mapeo
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		Action.selectFromOption(getDriver(), data.get("filtrado"), selectFilter);
	}

	public void filtroZtoA(DataTable dataTable) {

		Map<String, String> data = dataTable.asMap(String.class, String.class);
		Action.selectFromOption(getDriver(), data.get("filtro"), selectFilter);

	}
	
	public void filtroBajo(DataTable dataTable) {

		Map<String, String> data = dataTable.asMap(String.class, String.class);
		Action.selectFromOption(getDriver(), data.get("filtroBajo"), selectFilter);

	}

	public void filtroAlto(DataTable dataTable) {
		
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		Action.selectFromOption(getDriver(), data.get("filtro"), selectFilter); 
	}
	//------------------------------------------------------------------
	//----------------Impresion de informacion por consola----------------------
	private void printGeneralTitle(int opcFiltro){
		//    1    2       3         4
		//{ AtoZ, ZtoA, LowtoHigh, HighToLow}
		String title = "----- Filtro: ";
		switch(opcFiltro){
			case 1:
				title+="AtoZ";
				title+=" ---- \n----- Nombres Productos -----\n";
			break;
			case 2:
				title+="ZtoA";
				title+=" ---- \n----- Nombres Productos -----\n";
			break;
			case 3:
				title +="LowtoHigh";
				title+=" ---- \n----- Precios Productos -----\n";
			break;
			case 4:
				title +="HighToLow";
				title+=" ---- \n----- Precios Productos -----\n";
			break;
			default:
				System.out.println("Opcion invalida");
			break;
		} 
		System.out.print(title);

	}

	public void printProducts(int opcFiltro) {
		//    1    2       3         4
		//{ AtoZ, ZtoA, LowtoHigh, HighToLow}
		List<WebElement> list;
		printGeneralTitle(opcFiltro);
		if(opcFiltro == 1 || opcFiltro ==2 )
		{
			list=Action.obtainElementsList(getDriver(),listProductsNames);

		}else
		{
			list=Action.obtainElementsList(getDriver(),listProductsPrices);
		}
		
		for (WebElement product : list) {
			System.out.println(product.getText());
		}
		
	}
	//---------------------------------------------------------------
	
	

}
