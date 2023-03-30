package com.sophossolutions.tasks;


import com.sophossolutions.interactions.FiltroConfort;
import com.sophossolutions.interactions.FiltroPuntuacionAlta;
import com.sophossolutions.ui.BookingFilters;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectFilter implements Task{
	
	private int filtro;
	

	public SelectFilter(int filtro) {
		super();
		this.filtro = filtro;
	}



	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				 
				Click.on(BookingFilters.BtnFiltro),
				Click.on(BookingFilters.BtnFiltroMejoryBarato),
				WaitUntil.the(BookingFilters.btnPop, WebElementStateMatchers.isNotVisible()).forNoMoreThan(10).seconds()
				//FiltroConfort.form(),
						
        );
		
		if(filtro ==1) {
			actor.attemptsTo(
			FiltroPuntuacionAlta.form(),
			Switch.toNewWindow()
				);
		}else {
			actor.attemptsTo(
					FiltroConfort.form(),
					Switch.toNewWindow()
						);
		}
		
	}
    
	public static SelectFilter form(String filtro) {
        return Tasks.instrumented(SelectFilter.class, Integer.parseInt(filtro));
    }

}