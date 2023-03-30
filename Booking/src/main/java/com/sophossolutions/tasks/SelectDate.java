package com.sophossolutions.tasks;

import com.sophossolutions.ui.BookingReservationInfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectDate implements Task{
	private String strFechaIngreso;
	private String strFechaSalida;
	
	
	
	public SelectDate(String strFechaIngreso, String strFechaSalida) {
		super();
		this.strFechaIngreso = strFechaIngreso;
		this.strFechaSalida = strFechaSalida;
	}




	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				WaitUntil.the(BookingReservationInfo.btnRight, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
				Click.on(BookingReservationInfo.btnRight),
				Click.on(BookingReservationInfo.txtFecha.of(strFechaIngreso)),
				Click.on(BookingReservationInfo.btnRight),
				Click.on(BookingReservationInfo.txtFecha.of(strFechaSalida))
        ); 
		
	}
	
	
	 public static SelectDate value(String fechaIngreso,String fechaSalida) {
	        return Tasks.instrumented(SelectDate.class, fechaIngreso,fechaSalida);
	    }
}
