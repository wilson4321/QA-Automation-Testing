package com.sophossolutions.interactions;

import com.sophossolutions.ui.EvalartTest;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SelectImage implements Interaction{
	
	public String emoji(String imagen) {
		
		imagen = imagen.replaceAll("[a-zA-Z\\s:]", "");
		return imagen;
	}
	
	public Integer buscaremoji(String imagene, String emojibuscar) {
		
		int contador =0;
		int index = emojibuscar.indexOf(imagene);
		String resultado = "";
		if (index <0) {
			index = index;
		}else {
			resultado = emojibuscar.substring(index);
		}
		
		boolean condicion = true;
		int opt = 0;
		
		while(condicion) {
			contador++;
			index = resultado.indexOf(imagene);
			if(index>=0) {
				resultado = resultado.substring(index+1);
				condicion = true;
			}else {
				condicion = false;
			}
			
			
		}
		if(contador ==0) {
			
			contador = 0;
			return contador;
		}else {
			return contador-1;
		}
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		Target imageneTocomparar = Target.the("imagenes").locatedBy("(//div[@class = 'flex flex-col items-center p-4 space-y-5 bg-white rounded-md w-2/5 shadow-md my-5']//div//p)[1]");
		Target imagenes = Target.the("imagenes").locatedBy("(//div[@class = 'flex flex-col items-center p-4 space-y-5 bg-white rounded-md w-2/5 shadow-md my-5']//div//p)[2]");
		WebElementFacade imagenese = imagenes.resolveFor(actor);
		WebElementFacade imagene = imageneTocomparar.resolveFor(actor);
		String emojiBuscar = emoji(imagene.getText());
		int contador = buscaremoji(emojiBuscar,imagenese.getText());
		actor.attemptsTo(Enter.theValue(contador+"").into(EvalartTest.btnemoji));
		System.out.println("numero de emojis: "+contador);
		
	}
	
	
	public static SelectImage value() {
        return Tasks.instrumented(SelectImage.class);
    }

}
