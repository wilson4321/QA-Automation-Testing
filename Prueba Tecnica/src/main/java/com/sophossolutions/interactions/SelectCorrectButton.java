package com.sophossolutions.interactions;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.sophossolutions.ui.EvalartTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SelectCorrectButton implements Interaction {
	private final int mathResult;

	public SelectCorrectButton(int mathResult) {
		this.mathResult = mathResult;
	}

	public static Performable withResult(int mathResult) {
		return instrumented(SelectCorrectButton.class, mathResult);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String resultString = Integer.toString(mathResult);
		EvalartTest.btnCorrecto.of(resultString).resolveFor(actor).click();
		actor.remember("mathResult", mathResult);
	}
}
