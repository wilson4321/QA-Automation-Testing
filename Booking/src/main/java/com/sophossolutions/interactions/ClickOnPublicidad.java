package com.sophossolutions.interactions;

import com.sophossolutions.ui.BookingReservationInfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOnPublicidad implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
                Click.on(BookingReservationInfo.btnpublicidad)
        );
		 
	}
	
	public static ClickOnPublicidad button() {
        return Tasks.instrumented(ClickOnPublicidad.class);
    }

}
