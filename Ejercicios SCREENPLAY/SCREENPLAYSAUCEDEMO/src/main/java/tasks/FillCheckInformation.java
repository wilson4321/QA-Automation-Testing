package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import ui.SauceDemoCheckInformationPage;


public class FillCheckInformation implements Task{

    String strFirstName;
	String strLastName;
    String strPostalCode;
    Target txtFirstName;
	Target txtLastName;
    Target txtPostalCode;
    Target btnContinue;
   

	public FillCheckInformation(String strFirstName, String strLastName, String strPostalCode, Target txtFirstName,
            Target txtLastName, Target txtPostalCode) {

        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strPostalCode = strPostalCode;
        this.txtFirstName = txtFirstName;
        this.txtLastName = txtLastName;
        this.txtPostalCode = txtPostalCode;
        this.btnContinue = SauceDemoCheckInformationPage.btnContinue;
        
    }

    

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
        Enter.theValue(strFirstName).into(txtFirstName),
        Enter.theValue(strLastName).into(txtLastName),
        Click.on(btnContinue)
        );
       
    }

    public static FillCheckInformation with(String firstName, String lastName, String postalCode){
        return Tasks.instrumented(FillCheckInformation.class, firstName, lastName, postalCode,
        SauceDemoCheckInformationPage.txtFirstName, SauceDemoCheckInformationPage.txtLastName,
        SauceDemoCheckInformationPage.txtPostalCode);
    }
    
}
