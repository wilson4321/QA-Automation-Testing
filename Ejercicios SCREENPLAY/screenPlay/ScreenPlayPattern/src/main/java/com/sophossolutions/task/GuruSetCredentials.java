package com.sophossolutions.task;

import com.sophossolutions.ui.GuruLoginPage;
import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class GuruSetCredentials implements Task{
	Target targ;
	String user;
	String password;

	public GuruSetCredentials(String user, String password) {
		this.user = user;
		this.password = password;

	}

	public GuruSetCredentials(Target target) {
		this.targ = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(GuruLoginPage.txtUser), Enter.theValue(password).into(GuruLoginPage.txtpassword),
				Click.on(GuruLoginPage.btnSubmit));

	}

	public static GuruSetCredentials with() {
		return Tasks.instrumented(GuruSetCredentials.class, "hola");
	}

	public static GuruSetCredentials form(String user, String password) {
		return Tasks.instrumented(GuruSetCredentials.class, user,password);
	}

}
