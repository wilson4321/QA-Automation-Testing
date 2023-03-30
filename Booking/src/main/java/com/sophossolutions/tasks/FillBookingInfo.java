package com.sophossolutions.tasks;

import com.sophossolutions.interactions.ClickOnPublicidad;
import com.sophossolutions.ui.BookingReservationInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class FillBookingInfo implements Task{

	private String strDestino;
	private String strFechaIngreso;
	private String strFechaSalida;
	private String strAdultos;
	private String strNiños;
	private String strHabitaciones;
	

	


	public FillBookingInfo(String strDestino, String strFechaIngreso, String strFechaSalida, String strAdultos,
			String strNiños, String strHabitaciones) {
		super();
		this.strDestino = strDestino;
		this.strFechaIngreso = strFechaIngreso;
		this.strFechaSalida = strFechaSalida;
		this.strAdultos = strAdultos;
		this.strNiños = strNiños;
		this.strHabitaciones = strHabitaciones;
	}


 
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
	
		// Llamo clases en el orden de ejecucion
		ClickOnPublicidad.button(),
		EnterDestino.value(strDestino),
		SelectDate.value(strFechaIngreso, strFechaSalida),
		Click.on(BookingReservationInfo.btnPersonas),
		SelectPeople.value(strAdultos),
		SelectNiños.value(strNiños),
		SelectRoom.value(strHabitaciones),
		Click.on(BookingReservationInfo.BtnBuscar)

		
				 );
		
	}
	
	
	
	public static FillBookingInfo form(String destino,String fechaIngreso,String fechaSalida,String adultos,String niños,String habitaciones) {
		return Tasks.instrumented(FillBookingInfo.class,destino,fechaIngreso,fechaSalida,adultos,niños,habitaciones);
		
	}

}
