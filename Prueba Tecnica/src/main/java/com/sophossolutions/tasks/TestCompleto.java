package com.sophossolutions.tasks;


import com.sophossolutions.interactions.CiclosTexto;
import com.sophossolutions.interactions.OperacionMatematicaButton;
import com.sophossolutions.interactions.OperacionMatematicaSelect;
import com.sophossolutions.interactions.SelectFecha;
import com.sophossolutions.interactions.SelectImage;
import com.sophossolutions.interactions.SelectMultiplo;
import com.sophossolutions.ui.Ciclos;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;

public class TestCompleto implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				//ciclo 1
				SelectImage.value(),
				OperacionMatematicaSelect.value(),
				OperacionMatematicaButton.value(),
				CiclosTexto.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo2
				OperacionMatematicaSelect.value(),
				CiclosTexto.value(),
				OperacionMatematicaButton.value(),
				SelectMultiplo.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo3
				OperacionMatematicaButton.value(),
				OperacionMatematicaSelect.value(),
				SelectImage.value(),
				SelectMultiplo.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo4
				SelectMultiplo.value(),
				SelectFecha.value(),
				CiclosTexto.value(),
				OperacionMatematicaSelect.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo5
				CiclosTexto.value(),
				OperacionMatematicaSelect.value(),
				SelectImage.value(),
				SelectFecha.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo6
				SelectMultiplo.value(),
				SelectFecha.value(),
				CiclosTexto.value(),
				SelectImage.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo7
				OperacionMatematicaSelect.value(),
				CiclosTexto.value(),
				OperacionMatematicaButton.value(),
				SelectMultiplo.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo 8
				SelectMultiplo.value(),
				CiclosTexto.value(),
				OperacionMatematicaSelect.value(),
				SelectFecha.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo 9
				SelectMultiplo.value(),
				SelectFecha.value(),
				CiclosTexto.value(),
				SelectImage.value(),
				Click.on(Ciclos.btnsubmit),
				
				//ciclo 10
				SelectImage.value(),
				CiclosTexto.value(),
				OperacionMatematicaSelect.value(),
				SelectMultiplo.value(),
				Click.on(Ciclos.btnsubmit)
				
				
				
				
						 );
		
		Target texto = Ciclos.txtComplete;
		WebElementFacade textos = texto.resolveFor(actor);
		String hash = textos.getText();
		System.out.println("Aqui esta tu hash: ");
		System.out.println(hash);
		
	}
	
	public static TestCompleto value() {
        return Tasks.instrumented(TestCompleto.class);
    }

}
