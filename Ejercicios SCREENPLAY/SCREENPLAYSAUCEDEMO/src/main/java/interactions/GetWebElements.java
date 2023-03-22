package interactions;

import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import ui.SauceDemoProductsPage;


public class GetWebElements implements Interaction{

    
	List<String> listProductNamesElements;
    List<String> listProductPricesElements;
	int intOpFilter;
    
    public GetWebElements(int intOpFilter) {
        this.intOpFilter = intOpFilter;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
		

		listProductNamesElements = SauceDemoProductsPage.listProductsNames.resolveAllFor(actor).texts();
        listProductPricesElements = SauceDemoProductsPage.listProductsPrices.resolveAllFor(actor).texts();
		printProducts(intOpFilter, listProductNamesElements, listProductPricesElements);
		
    }

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
    
    private void printProducts(int opcFiltro, List<String> names, List<String> prices) {
		//    1    2       3         4
		//{ AtoZ, ZtoA, LowtoHigh, HighToLow}
		List<String> list;
		printGeneralTitle(opcFiltro);
		if(opcFiltro == 1 || opcFiltro ==2 )
		{
			list=names;

		}else
		{
          
			list= prices;
            
		}
		
	
		for (String product : list) {
			System.out.println(product);
		}
		
	}
    
    public static GetWebElements relativeTo(int opc)
    {
        return Tasks.instrumented(GetWebElements.class,opc);
    }
    
    
}
