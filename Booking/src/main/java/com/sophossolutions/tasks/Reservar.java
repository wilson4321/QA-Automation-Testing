package com.sophossolutions.tasks;

import com.sophossolutions.ui.BookingRoom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Reservar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				WaitUntil.the(BookingRoom.btnhabi, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
				Click.on(BookingRoom.btnhabi),
				SelectFromOptions.byValue("1").from(BookingRoom.btnhabi),
				Click.on(BookingRoom.btnReservare)
				
				
				);
		
	}

	public static Reservar value() {
        return Tasks.instrumented(Reservar.class);
    }
}
