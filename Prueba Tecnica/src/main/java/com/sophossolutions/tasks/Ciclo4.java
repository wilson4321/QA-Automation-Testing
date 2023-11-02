package com.sophossolutions.tasks;

import com.sophossolutions.interactions.CiclosTexto;
import com.sophossolutions.ui.Ciclos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ciclo4 implements Task{
	
	
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		String input = "";
		for(int i =0;i<401;i++) {
			input +="G";
		}
		String prueba = input;
		System.out.println(prueba);
		actor.attemptsTo(
				
				Click.on(Ciclos.math1.of("-8055")),
				Click.on(Ciclos.texto),
				Enter.theValue(prueba).into(Ciclos.texto),
				Enter.theValue("0").into(Ciclos.emoji),
				Click.on(Ciclos.math1.of("75")),
				Click.on(Ciclos.math1.of("195")),
				Click.on(Ciclos.math1.of("54")),
				Click.on(Ciclos.math1.of("21")),
				Click.on(Ciclos.math1.of("117")),
				Click.on(Ciclos.math1.of("60")),
				Click.on(Ciclos.math1.of("96")),
				Click.on(Ciclos.math1.of("72")),
				Click.on(Ciclos.math1.of("36"))
				
				
				);
		
	}
	
	
	
	public static Ciclo4 value() {
        return Tasks.instrumented(Ciclo4.class);
    }

}
