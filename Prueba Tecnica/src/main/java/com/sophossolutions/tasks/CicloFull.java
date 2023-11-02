package com.sophossolutions.tasks;

import com.sophossolutions.ui.Ciclos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CicloFull implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
				
		        //ciclos
		         //ciclo1
		        Click.on(Ciclos.math1.of("63788")),
				SelectFromOptions.byValue("5482708").from(Ciclos.math2),
				Enter.theValue("10").into(Ciclos.emoji),
				Enter.theValue("27052023").into(Ciclos.date),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo2
				SelectFromOptions.byValue("14063").from(Ciclos.math2),
				Click.on(Ciclos.math1.of("295805")),
				Click.on(Ciclos.math1.of("126")),
				Click.on(Ciclos.math1.of("49")),
				Enter.theValue("0").into(Ciclos.emoji),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo3
				Enter.theValue("08012023").into(Ciclos.date),
				Click.on(Ciclos.math1.of("56688")),
				SelectFromOptions.byValue("-176619").from(Ciclos.math2),
				Enter.theValue("8").into(Ciclos.emoji),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo4
				
				Ciclo4.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo5
				Enter.theValue("11").into(Ciclos.emoji),
				Click.on(Ciclos.math1.of("-4909024")),
				Enter.theValue("20042023").into(Ciclos.date),
				Click.on(Ciclos.math1.of("165")),
				Click.on(Ciclos.math1.of("180")),
				Click.on(Ciclos.btnsubmit),
				
				//Ciclo 6
				Enter.theValue("16072023").into(Ciclos.date),
				SelectFromOptions.byValue("-93127253").from(Ciclos.math2),
				Click.on(Ciclos.math1.of("18402")),
				Enter.theValue("1").into(Ciclos.emoji),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo7
				Click.on(Ciclos.math1.of("60")),
				Click.on(Ciclos.math1.of("70")),
				Click.on(Ciclos.math1.of("155")),
				Enter.theValue("13").into(Ciclos.emoji),
				Click.on(Ciclos.math1.of("9074")),
				Enter.theValue("02072023").into(Ciclos.date),
				Click.on(Ciclos.btnsubmit),
				
				
				//Ciclo8
				Ciclo8.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo9
				Enter.theValue("13").into(Ciclos.emoji),
				Enter.theValue("21042023").into(Ciclos.date),
				SelectFromOptions.byValue("-50057").from(Ciclos.math2),
				Click.on(Ciclos.math1.of("35")),
				Click.on(Ciclos.math1.of("161")),
				Click.on(Ciclos.math1.of("189")),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo10
				
				Ciclo10.value()
				
				);


		
	}
	
	public static CicloFull value() {
        return Tasks.instrumented(CicloFull.class);
    }

}
