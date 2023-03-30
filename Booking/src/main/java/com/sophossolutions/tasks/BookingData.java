package com.sophossolutions.tasks;

import com.sophossolutions.ui.BookingDataInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BookingData implements Task{
	
	Target txtFechaEntrada;
	Target txtHoraEntrada;
	Target txtFechaSalida;
	Target txtHoraSalida;
    Target txtDuracion;
	Target txtPrecio; 
	
	
	

	public BookingData(Target txtFechaEntrada, Target txtHoraEntrada, Target txtFechaSalida, Target txtHoraSalida,
			Target txtDuracion, Target txtPrecio) {
		super();
		this.txtFechaEntrada = txtFechaEntrada;
		this.txtHoraEntrada = txtHoraEntrada;
		this.txtFechaSalida = txtFechaSalida;
		this.txtHoraSalida = txtHoraSalida;
		this.txtDuracion = txtDuracion;
		this.txtPrecio = txtPrecio;
	}



	@Override
	public <T extends Actor> void performAs(T actor) {
		Switch.toNewWindow();
		WaitUntil.the(BookingDataInfo.txtDatos, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds();
		String txtfechaentrada = txtFechaEntrada.resolveFor(actor).getText();
		String txthoraentrada = txtHoraEntrada.resolveFor(actor).getText();
		String txtfechasalida = txtFechaSalida.resolveFor(actor).getText();
		String txthorasalida = txtHoraSalida.resolveFor(actor).getText();
		String txtduracion = txtDuracion.resolveFor(actor).getText();
		String txtprecio = txtPrecio.resolveFor(actor).getText();
		
		
		System.out.println("---- Payment Details ----");
		
	       System.out.println("fecha entrada: "+ txtfechaentrada);
	       System.out.println("Hora de entrada: "+ txthoraentrada);
	       System.out.println("Fecha de salida: "+ txtfechasalida);
	       System.out.println("Hora de salida: "+ txthorasalida);
	       System.out.println("Duracion total: "+ txtduracion);
	       System.out.println("Precio total: "+ txtprecio);
		
	}
	
	public static BookingData from(Target txtFechaEntrada,Target txtHoraEntrada, Target txtFechaSalida,Target txtHoraSalida,Target txtDuracion,Target txtPrecio){
        return Tasks.instrumented(BookingData.class, BookingDataInfo.txtFechaEntrada,BookingDataInfo.txtHoraEntrada,
        		BookingDataInfo.txtFechaSalida,BookingDataInfo.txtHoraSalida,BookingDataInfo.txtDuracion,BookingDataInfo.txtPrecio);
    }

}
