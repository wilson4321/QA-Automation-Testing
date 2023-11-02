package com.sophossolutions.tasks;

import com.sophossolutions.ui.Ciclos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Ciclo10 implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		String input = "";
		for(int i =0;i<326;i++) {
			input +="M";
		}
		String prueba = input;
		System.out.println(prueba);
		
		
		actor.attemptsTo(
				Click.on(Ciclos.texto),
				Enter.theValue(prueba).into(Ciclos.texto),
				Click.on(Ciclos.math1.of("140")),
				SelectFromOptions.byValue("47191").from(Ciclos.math2),
				Click.on(Ciclos.math1.of("-322"))
				
				
				);
	}
	
	public static Ciclo10 value() {
        return Tasks.instrumented(Ciclo10.class);
    }

}
