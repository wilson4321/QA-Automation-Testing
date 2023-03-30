package com.sophossolutions.interactions;

import java.util.List;

import org.openqa.selenium.By;

import com.sophossolutions.ui.BookingFilters;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FiltroConfort implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> elements = BookingFilters.listElementos.resolveAllFor(actor);
		int contador = 0;
		for (WebElementFacade element : elements) {
			
			String conforts = "";

			try {
				conforts = element.findElement(By.xpath(
						".//*[contains(text(),'Confort')]"))
						.getText();
			 
			} catch (Exception e) {
				conforts = "0";
				
			}
			
			

//			//String conforts = element.findElement(By.xpath(
//					".//*[contains(text(),'Confort')]"))
//					.getText();

			double confort = Double.parseDouble(conforts.split(" ")[1].replace(".", ""));

			System.out.println(confort);

			if (confort> 9.0) {
				System.out.println("Seleccion habitacion");
				actor.remember("iterador", contador + "");
				actor.attemptsTo(Click.on(BookingFilters.btnDisponibilidad.of((contador + 1) + "")));

				break;
			}
			contador++;

		}
	}
	
	public static FiltroConfort form() {
		return Tasks.instrumented(FiltroConfort.class);
	}

}
