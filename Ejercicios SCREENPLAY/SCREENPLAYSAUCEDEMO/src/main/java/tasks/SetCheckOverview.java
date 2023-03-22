package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import ui.SauceDemoCheckOverviewPage;

public class SetCheckOverview implements Task{

    Target txtSauceCard;
	Target txtItemTotal;
    Target txtTax;
	Target txtTotal; 
    Target btnFinish; 
	

    public SetCheckOverview(Target txtSauceCard,Target txtItemTotal, Target txtTax,Target txtTotal) {
		this.txtSauceCard = txtSauceCard;
        this.txtItemTotal = txtItemTotal;
        this.txtTax = txtTax;
        this.txtTotal = txtTotal;
        this.btnFinish = SauceDemoCheckOverviewPage.btnFinish;
        		
	}
    
    public static SetCheckOverview from(Target txtSauceCard,Target txtItemTotal, Target txtTax,Target txtTotal){
        return Tasks.instrumented(SetCheckOverview.class, SauceDemoCheckOverviewPage.txtSauceCard,SauceDemoCheckOverviewPage.txtItemTotal,SauceDemoCheckOverviewPage.txtTax,SauceDemoCheckOverviewPage.txtTotal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       String txtsaucecard = txtSauceCard.resolveFor(actor).getText();
       String txtitemtotal = txtItemTotal.resolveFor(actor).getText();
       String txttax = txtTax.resolveFor(actor).getText();
       String txttotal = txtTotal.resolveFor(actor).getText();
        
       System.out.println("---- Payment Details ----");
       System.out.println(txtsaucecard);
       System.out.println(txtitemtotal);
       System.out.println(txttax);
       System.out.println(txttotal);

       actor.attemptsTo(Click.on(btnFinish));


    }

    public static Target txtComplete = Target.the("Thank you for your order!").locatedBy("//h2[@class='complete-header' and contains(text(),'Thank you for your order!')]");

}
