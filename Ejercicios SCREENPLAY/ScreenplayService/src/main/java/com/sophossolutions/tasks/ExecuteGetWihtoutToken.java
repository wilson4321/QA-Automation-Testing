package com.sophossolutions.tasks;
import com.sophossolutions.utils.Constants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ExecuteGetWihtoutToken implements Task{

	private String strEndpoint;
	private String strId;

	public ExecuteGetWihtoutToken(String strEndpoint, String strId) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Get.resource(strEndpoint.concat(strId)).with(
				requestEspecification -> requestEspecification));

		SerenityRest.lastResponse().prettyPeek();
	}

	public static ExecuteGetWihtoutToken withtokens(String strEndpoint, String strId) {

		return Tasks.instrumented(ExecuteGetWihtoutToken.class, strEndpoint, strId);
	}
}
