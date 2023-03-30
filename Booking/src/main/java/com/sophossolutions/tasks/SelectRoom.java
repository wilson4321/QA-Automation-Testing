package com.sophossolutions.tasks;

import com.sophossolutions.questions.TextOf;
import com.sophossolutions.ui.BookingReservationInfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectRoom implements Task{
	
	
	private String strHabitaciones;


	public SelectRoom(String strHabitaciones) {
		super();
		this.strHabitaciones = strHabitaciones;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		while(!TextOf.field(BookingReservationInfo.txtHabitacion).answeredBy(actor).equals(strHabitaciones)) {
		
			if(TextOf.field(BookingReservationInfo.txtHabitacion).answeredBy(actor).compareTo(strHabitaciones) < 0) {
//				System.out.println("Cantidad inicial Habitaciones: "+ TextOf.field(BookingReservationInfo.txtHabitacion).answeredBy(actor));
//				System.out.println("Cantidad asignada: "+strHabitaciones);
				actor.attemptsTo(Click.on(BookingReservationInfo.btnHabitacionMas));
			}else {
				actor.attemptsTo(Click.on(BookingReservationInfo.btnHabitacionMenos));
			}
		}
	} 

	
	public static SelectRoom value(String strHabitaciones) {
        return Tasks.instrumented(SelectRoom.class, strHabitaciones);
    }
}
