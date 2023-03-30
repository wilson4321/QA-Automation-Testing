package com.sophossolutions.tasks;

import com.sophossolutions.questions.TextOf;
import com.sophossolutions.ui.BookingReservationInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Task;

public class SelectPeople implements Task{

	private String strAdultos;


	

	public SelectPeople(String strAdultos) {
		super();
		this.strAdultos = strAdultos;

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		while(!TextOf.field(BookingReservationInfo.txtAdultos).answeredBy(actor).equals(strAdultos)) {
		
			if(TextOf.field(BookingReservationInfo.txtAdultos).answeredBy(actor).compareTo(strAdultos) < 0) {
//				System.out.println("Cantidad inicial Adultos: "+ TextOf.field(BookingReservationInfo.txtAdultos).answeredBy(actor));
//				System.out.println("Cantidad asignada: "+strAdultos);
				actor.attemptsTo(Click.on(BookingReservationInfo.btnAdultosMas));
			}else {
				actor.attemptsTo(Click.on(BookingReservationInfo.btnAdultosMenos));
			}
		}
	}
 
	
	public static SelectPeople value(String strAdultos) {
        return Tasks.instrumented(SelectPeople.class, strAdultos);
    }

}
