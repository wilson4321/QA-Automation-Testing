package com.sophossolutions.tasks;

import com.sophossolutions.questions.TextOf;
import com.sophossolutions.ui.BookingReservationInfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectNiños implements Task{
	
	private String strNiños;
	

	public SelectNiños(String strNiños) {
		super();
		this.strNiños = strNiños;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
     String[] datosNiño = strNiños.split("/");
		
		
		while(!TextOf.field(BookingReservationInfo.txtNiños).answeredBy(actor).equals(datosNiño[0])) {
			if(TextOf.field(BookingReservationInfo.txtNiños).answeredBy(actor).compareTo(datosNiño[0]) < 0) {
				actor.attemptsTo(Click.on(BookingReservationInfo.btnNiñosMas));
			}else {
				actor.attemptsTo(Click.on(BookingReservationInfo.btnNiñosMenos));
			}
		} 
		
		int j = Integer.parseInt(datosNiño[0]);
		
		for (int i = 0; i < j; i++) {
			actor.attemptsTo(
					Click.on(BookingReservationInfo.txtCantNiños.of((i)+1+"")),
					SelectFromOptions.byValue(datosNiño[(i)+1]).from(BookingReservationInfo.txtCantNiños.of((i)+1+""))
					);
		}
	}

	public static SelectNiños value(String strNiños) {
        return Tasks.instrumented(SelectNiños.class, strNiños);
    }
		
	}


