package com.sophossolutions.interactions;

import java.util.Arrays;

import com.sophossolutions.ui.Ciclos;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectMultiplo implements Interaction {
	
	public static String xpathNumber(String xpathNumber) {
        xpathNumber = xpathNumber.replaceAll("([ á-ú a-z A-Z\\\\¿?\\\\])", "");
        return xpathNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target texto = Ciclos.txtMultiplo;
        Target numerogrid = Ciclos.gridmultiplo;
        WebElementFacade textos = texto.resolveFor(actor);
        WebElementFacade numeros = numerogrid.resolveFor(actor);
        String numeroBuscar = xpathNumber(textos.getText());
        String numerosgrid = xpathNumber(numeros.getText());
        System.out.println(numeroBuscar);
        System.out.println(numerosgrid);

        int numero = Integer.parseInt(numeroBuscar);
        int[] numerosArray = Arrays.stream(numerosgrid.split("\\s+"))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();

        for (int i = 0; i < numerosArray.length; i++) {
            if (numerosArray[i] % numero == 0) {
                System.out.println(numerosArray[i] + " es múltiplo de " + numero);
                actor.attemptsTo(Click.on(Ciclos.math1.of(Integer.toString(numerosArray[i]))));
            } else {
                //System.out.println(numerosArray[i] + " no es múltiplo de " + numero);
            }
        }
        
        
    }

    public static SelectMultiplo value() {
        return Tasks.instrumented(SelectMultiplo.class);
    }

    
}
