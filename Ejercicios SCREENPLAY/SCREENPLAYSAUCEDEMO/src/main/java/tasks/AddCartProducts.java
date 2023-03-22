package tasks;

import net.serenitybdd.screenplay.targets.Target;
import ui.SauceDemoCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddCartProducts implements Task {

    //Colocar targets

    Target btnProduct1;
    Target btnProduct2;
    Target btnCart;
    Target btnCheckout;

    //Crear constructor
    public AddCartProducts(Target btnProduct1, Target btnProduct2, Target btnCart, Target btnCheckout){
        this.btnProduct1 = SauceDemoCartPage.btnProduct1;
        this.btnProduct2 = SauceDemoCartPage.btnProduct2;
        this.btnCart = SauceDemoCartPage.btnCart;
        this.btnCheckout = SauceDemoCartPage.btnCheckout;
    }  

    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO Auto-generated method stub
        actor.attemptsTo(
            Click.on(btnProduct1),
            Click.on(btnProduct2),
            Click.on(btnCart),
            Click.on(btnCheckout)
        );

    }
    
       //Instrumented
       public static AddCartProducts with(Target btnProduct1, Target btnProduct2, Target btnCart, Target btnCheckout){
        return Tasks.instrumented(AddCartProducts.class, SauceDemoCartPage.btnProduct1, SauceDemoCartPage.btnProduct2, SauceDemoCartPage.btnCart, SauceDemoCartPage.btnCheckout);
    }

}
