package com.sophossolutions.tasks;


import com.sophossolutions.models.UserCredentials;
import com.sophossolutions.ui.EvalartLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EvalartLogin implements Task{
	
	UserCredentials user;
	Target txtUserName;
	Target txtPassword;
	Target btnLogin;



	public EvalartLogin(Target txtUser, Target txtPassword, Target btnLogin) {

		this.user = new UserCredentials("578256", "10df2f32286b7120Mi00LTY1Mjg3NQ==30e0c83e6c29f1c3");
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
   public static EvalartLogin login() {
	   
	   return Tasks.instrumented(EvalartLogin.class,EvalartLoginPage.txtUserName, EvalartLoginPage.txtPassword, EvalartLoginPage.btnLogin);
   }
	

	
}
