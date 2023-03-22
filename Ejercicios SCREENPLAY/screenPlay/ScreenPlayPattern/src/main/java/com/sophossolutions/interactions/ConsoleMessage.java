package com.sophossolutions.interactions;

import com.sophossolutions.models.UserCredentials;
import com.sophossolutions.task.SetCredentials;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ConsoleMessage implements Interaction{
	
	String strMessage;
	

	public ConsoleMessage(String strMessage) {
		super();
		this.strMessage = strMessage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		System.out.println(strMessage);
		strMessage = strMessage + "hola";
		//Actor recuerde el resultado
		actor.remember("mensaje", new UserCredentials("Usuario","Contraseña"));
	}
	
	public static ConsoleMessage withMessage(String strMessage) {
		return Tasks.instrumented(ConsoleMessage.class, strMessage);
	}

}
