package com.sophossolutions.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import java.util.regex.Matcher; import java.util.regex.Pattern;

import com.sophossolutions.tasks.Ciclo8;
import com.sophossolutions.ui.Ciclos;
public class CiclosTexto implements Interaction{
	
public static String xpathText(String xpathText) {
		
	String result = "";
    if (xpathText != null) {
        int startIndex = xpathText.indexOf("'");
        if (startIndex >= 0) {
            int endIndex = xpathText.indexOf("'", startIndex + 1);
            if (endIndex >= 0) {
                result = xpathText.substring(startIndex + 1, endIndex);
                if (result.length() > 0) {
                    result = Character.toString(result.charAt(0));
                }
            }
        }
    }
    return result;
		
	}


public static String xpathNumber(String xpathNumber) {
	
	xpathNumber = xpathNumber.replaceAll("([ a-zA-Z\\\\\\\\''])", "");
		
		return xpathNumber;
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Target texto = Ciclos.textoLeer;
		WebElementFacade textos = texto.resolveFor(actor);
		String textoBuscar = xpathText(textos.getText());
		String numeroBuscar =xpathNumber(textos.getText());
		System.out.println(textoBuscar);
		System.out.println(numeroBuscar);
		
		int numero = Integer.parseInt(numeroBuscar);
		
		String input = "";
		for(int i =0;i<numero;i++) {
			input +=textoBuscar;
		}
		String prueba = input;
		System.out.println(prueba);
		actor.attemptsTo(Enter.theValue(prueba).into(Ciclos.texto));

	}
	
	
	public static CiclosTexto value() {
        return Tasks.instrumented(CiclosTexto.class);
    }
	}
	





