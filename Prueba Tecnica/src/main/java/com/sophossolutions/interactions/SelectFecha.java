package com.sophossolutions.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sophossolutions.ui.Ciclos;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFecha implements Task {
	Calendar fecha = Calendar.getInstance();

	public String xpathNumber(String xpathNumber) {
		String expresionRegular = "(?<=\\bcorresponde a\\s)\\d+(?=\\s+dias\\b)";
		Pattern pattern = Pattern.compile(expresionRegular);
		Matcher matcher = pattern.matcher(xpathNumber);
		if (matcher.find()) {
			return matcher.group(0);
		}
		return "";
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Target texto = Ciclos.txtFecha;
		WebElementFacade textos = texto.resolveFor(actor);
		String numeroBuscar = new SelectFecha().xpathNumber(textos.getText());
		System.out.println(numeroBuscar);
		int numero = Integer.parseInt(numeroBuscar);
		
		boolean esAntes = textos.getText().contains("antes");
		
		if (esAntes) {
			
			fecha.add((Calendar.DATE), -numero);
			
		}else {
			fecha.add((Calendar.DATE), numero);
		}
		
		//fecha.add((Calendar.DATE), numero);
		SimpleDateFormat formato = new SimpleDateFormat("ddMMyyyy");
		Date fechaCalculada = fecha.getTime();
		String fechaFormateada = formato.format(fechaCalculada);
		System.out.println("La fecha es: "+fechaFormateada);
		
		actor.attemptsTo(
		Enter.theValue(fechaFormateada).into(Ciclos.date));
	}

	public static SelectFecha value() {
		return Tasks.instrumented(SelectFecha.class);
	}
}