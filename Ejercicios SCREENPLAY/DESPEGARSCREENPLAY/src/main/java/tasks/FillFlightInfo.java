package tasks;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Select;
import ui.DespegarFlightInfo;
import ui.FlightFilter;

public class FillFlightInfo implements Task{
	
    String strOrigen;
	String strDestino;

	
    

	public FillFlightInfo(String strOrigen, String strDestino) {
		super();
		this.strOrigen = strOrigen;
		this.strDestino = strDestino;
				
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				//Ingreso las ciudades de origen y destino
				Click.on(DespegarFlightInfo.txtOrigen),
		        Enter.theValue(strOrigen).into(DespegarFlightInfo.txtOrigen),
		        Click.on(DespegarFlightInfo.selectCiudad),
		        Click.on(DespegarFlightInfo.txtDestino),
		        Enter.theValue(strDestino).into(DespegarFlightInfo.txtDestino),
		        Click.on(DespegarFlightInfo.selectCiudad),
		        
		        //Selecciono fechas
		         Click.on(DespegarFlightInfo.btnCookies),
		         Click.on(DespegarFlightInfo.txtIda),
		         Click.on(DespegarFlightInfo.btnIda),
		         Click.on(DespegarFlightInfo.btnRight),
		         Click.on(DespegarFlightInfo.btnRight),
		         Click.on(DespegarFlightInfo.btnVuelta),
		         Click.on(DespegarFlightInfo.BtnPasajeros),
		         Click.on(DespegarFlightInfo.BtnAdultos),
		         Click.on(DespegarFlightInfo.BtnMenores),
		         Click.on(DespegarFlightInfo.selectEdad),
		      	         
		         Click.on(DespegarFlightInfo.btnBuscar),
		         WaitUntil.the(DespegarFlightInfo.resultadosVuelos, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds()
		         
		        );
		
	}
	
	public static FillFlightInfo form(String origen, String destino) {
		return Tasks.instrumented(FillFlightInfo.class, origen,destino);
		
	}
	


}
