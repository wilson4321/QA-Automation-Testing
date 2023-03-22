package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class SetCheckInformation implements Task{

    Target txtSauceCard;
	Target txtItemTotal;
    Target txtTax;
	Target txtTotal; 
    Target btnFinish; 
	Target txtThanks;
    public SetCheckInformation(Target txtSauceCard,Target txtItemTotal, Target txtTax,Target txtTotal,Target btnFinish,Target txtThanks) {
		this.txtSauceCard = txtSauceCard;
        this.txtItemTotal = txtItemTotal;
        this.txtTax = txtTax;
        this.txtTotal = txtTotal;
        this.btnFinish = btnFinish;
        this.txtThanks = txtThanks;
        		
	}
    
    @Override
    public <T extends Actor> void performAs(T actor) {
        // TODO Auto-generated method stub
        
        throw new UnsupportedOperationException("Unimplemented method 'performAs'");
    }

}
