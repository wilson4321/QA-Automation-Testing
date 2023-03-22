package tasks;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Select;
import ui.SauceDemoProductsPage;

public class SelectFilter implements Task {

    Target selectProdFilter;
    String strFilterValue;
    

    public SelectFilter(Target selectProdFilter, String strFilterValue) {
        this.selectProdFilter = selectProdFilter;
        this.strFilterValue = strFilterValue;
        
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        
        actor.attemptsTo(
            Select.option(strFilterValue).from(selectProdFilter)
           //Select.value(strFilterValue).from(selectProdFilter),
            
         );
    }


    public static SelectFilter by(String strValue) {

		return Tasks.instrumented(SelectFilter.class,SauceDemoProductsPage.selectProdFilter,strValue);
	} 
   
    

}
