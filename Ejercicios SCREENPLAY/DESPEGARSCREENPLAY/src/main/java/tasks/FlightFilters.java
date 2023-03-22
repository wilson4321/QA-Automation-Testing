package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import ui.FlightFilter;


public class FlightFilters implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Click.on(FlightFilter.btnRecomendados),
		Click.on(FlightFilter.btnBaratos)
		);
	}
	
	
	public static FlightFilters recomendedfilter() {
		return Tasks.instrumented(FlightFilters.class);
	}

}
