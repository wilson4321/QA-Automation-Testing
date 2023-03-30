package com.sophossolutions.interactions;

import java.util.List;
import org.openqa.selenium.By;
import com.sophossolutions.ui.BookingFilters;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class FiltroPuntuacionAlta implements Interaction {
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> elements = BookingFilters.listElementos.resolveAllFor(actor);
		int contador = 0;
		for (WebElementFacade element : elements) {
			String puntuacion = "";
			String comentarios = "";
			try {
			 puntuacion = element.findElement(By.xpath("./descendant::div[@data-testid='review-score']//div[@class='b5cd09854e d10a6220b4']")).getText();
			 comentarios = element.findElement(By.xpath("./descendant::div[@data-testid='review-score']//div[@class='d8eab2cf7f c90c0a70d3 db63693c62']")).getText();
			 
			} catch (Exception e) {
				puntuacion = "0";
				comentarios = "0 comentarios";
			}
			
			
			//String puntuacion = element.findElement(By.xpath("./descendant::div[@data-testid='review-score']//div[@class='b5cd09854e d10a6220b4']")).getText();
			//String comentarios = element.findElement(By.xpath("./descendant::div[@data-testid='review-score']//div[@class='d8eab2cf7f c90c0a70d3 db63693c62']")).getText();
			
			int comentario= Integer.parseInt(comentarios.split(" ")[0].replace(".", ""));
			 
			System.out.println(puntuacion+ "  : "+ comentario);
			
		 	if (Double.parseDouble(puntuacion.replace(",", ".")) > 9.0 && comentario > 10) {
				System.out.println("Seleccion habitacion");
				//actor.remember("iterador", contador+"");
				actor.attemptsTo(Click.on(BookingFilters.btnDisponibilidad.of((contador+1)+"")));
		
				break;
			}
			contador++;
			
			
		}
	}
	

	public static FiltroPuntuacionAlta form() {
		return Tasks.instrumented(FiltroPuntuacionAlta.class);
	}
}
