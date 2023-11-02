package com.sophossolutions.tasks;

import com.sophossolutions.ui.Ciclos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Ciclo8 implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		String input = "";
		for(int i =0;i<355;i++) {
			input +="M";
		}
		String prueba = input;
		System.out.println(prueba);
		
		
		actor.attemptsTo(
				Click.on(Ciclos.texto),
				Enter.theValue(prueba).into(Ciclos.texto),
				Enter.theValue("02072023").into(Ciclos.date),
				Enter.theValue("18").into(Ciclos.emoji),
				SelectFromOptions.byValue("-30994").from(Ciclos.math2)
				
				
				
				);
	}
	
	
	public static Ciclo8 value() {
        return Tasks.instrumented(Ciclo8.class);
    }

}
