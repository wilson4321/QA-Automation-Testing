package com.sophossolutions.tasks;

import com.sophossolutions.ui.BookingReservationInfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class EnterDestino implements Task {
    private String strDestino;

    public EnterDestino(String strDestino) {
        this.strDestino = strDestino;
    }


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(BookingReservationInfo.txtDestino),
				Enter.theValue(strDestino).into(BookingReservationInfo.txtDestino),
				Enter.theValue("").into(BookingReservationInfo.txtDestino),
				Enter.theValue("").into(BookingReservationInfo.txtDestino),
				Enter.theValue("").into(BookingReservationInfo.txtDestino),
				WaitUntil.the(BookingReservationInfo.selectCiudad, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
				Click.on(BookingReservationInfo.selectCiudad)
        );
		
	}
	 

    public static EnterDestino value(String destino) {
        return Tasks.instrumented(EnterDestino.class, destino);
    }
}