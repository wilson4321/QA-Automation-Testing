package com.sophossolutions.interactions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sophossolutions.ui.Ciclos;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class OperacionMatematicaSelect implements Interaction {
	
	public static String numeros(String numeros) {
		
		numeros = numeros.replaceAll("[=?]", "");
		return numeros;
	}
	
	static int posInicio=0;
	static int posFinal=0;
	static int finalizado=0;
	
	static int buscarNumeroAdelante(int posicion,String numero) {
		String numeroAdelante ="";
		for (int i = posicion+1; i <numero.length() ; i++) {
			posFinal = i;
			if (numero.charAt(i) == '+' || numero.charAt(i) == '-'|| numero.charAt(i) == '*') {
				break;
			} else {
				numeroAdelante = numeroAdelante+numero.charAt(i);
			}

		}
		if(posFinal==numero.length()-1)posFinal++;
		
		
		return Integer.parseInt(numeroAdelante);
		
	}

	static int buscarNumeroAtras(int posicion, String numero) {
		String numeroAtras = "";
		for (int i = posicion - 1; i >= 0; i--) {
			posInicio = i;
			if ((numero.charAt(i) == '+' || numero.charAt(i) == '-'|| numero.charAt(i) == '*') && i !=0) {
				break;
			} else {
				numeroAtras = numero.charAt(i) + numeroAtras;
			}

		}
		if(posInicio==0)posInicio--;
		if(numeroAtras.equals("")) {finalizado=1; numeroAtras=0+"";}
		return Integer.parseInt(numeroAtras);

	}

	static String resolverOperacion(int posicion, String numero,char operator) {
		int num1  =  buscarNumeroAtras(posicion, numero);
		int num2 =  buscarNumeroAdelante(posicion, numero);
		int resultado = 0;
		if(operator=='*')resultado = num1*num2;
		if(operator=='-')resultado = num1-num2;
		if(operator=='+')resultado = num1+num2;
	
		return resultado+"";
	}

	static void solve(String numero, Actor actor) {

		for (int i = 0; i < numero.length(); i++) {
			if (numero.charAt(i) == '*') {
				String resultado = resolverOperacion(i,numero,'*');
				numero = numero.substring(0,posInicio+1)+resultado+ numero.substring(posFinal,numero.length());
				i = -1;
			}
		}
		
		for (int i = 0; i < numero.length(); i++) {

			if ((numero.charAt(i) == '+'||numero.charAt(i) == '-')&& i!=0 ) {
				String resultado = resolverOperacion(i,numero,numero.charAt(i));
				if(finalizado==1)break;
				numero =numero.substring(0,posInicio+1)+resultado+ numero.substring(posFinal,numero.length());
				i = -1;
				//System.out.println(numero);
			}
		}
		
		System.out.println(numero);
		
		actor.attemptsTo(
				
				SelectFromOptions.byValue(numero).from(Ciclos.math2));
		 
		
		
		
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		Target operacion = Target.the("operacion").locatedBy("//div[@class=' flex flex-col items-center bg-white rounded-md shadow-md p-5 space-y-4 my-5 w-2/5 ']//p[@class='text-center text-xl font-bold']");
		WebElementFacade operaciones = operacion.resolveFor(actor);
		String numeros = numeros(operaciones.getText());
		solve(numeros,actor);
		
		
		
	}
	
	public static OperacionMatematicaSelect value() {
        return Tasks.instrumented(OperacionMatematicaSelect.class);
    }
}
