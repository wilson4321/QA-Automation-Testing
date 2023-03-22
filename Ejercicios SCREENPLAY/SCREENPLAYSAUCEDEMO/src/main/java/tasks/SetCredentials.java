package tasks;


import models.UserCredentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import ui.SauceDemoLoginPage;

public class SetCredentials implements Task {
	
	UserCredentials user;
	Target txtUserName;
	Target txtPassword;
	Target btnLogin;

	public SetCredentials(Target txtUser, Target txtPassword, Target btnLogin) {

		this.user = new UserCredentials("standard_user", "secret_sauce");
		this.txtUserName = txtUser;
		this.txtPassword = txtPassword;
		this.btnLogin =  btnLogin;
		
	}



	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.theValue(user.getUserName()).into(txtUserName),
				Enter.theValue(user.getPassword()).into(txtPassword), 
				Click.on(btnLogin)
		);
	
	}

	
	
	public static SetCredentials doTask() {

		return Tasks.instrumented(SetCredentials.class,SauceDemoLoginPage.txtUserName, SauceDemoLoginPage.txtPassword, SauceDemoLoginPage.btnLogin);
	}

}
