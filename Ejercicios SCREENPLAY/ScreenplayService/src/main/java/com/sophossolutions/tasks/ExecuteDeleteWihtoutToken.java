package com.sophossolutions.tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import com.sophossolutions.utils.Constants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ExecuteDeleteWihtoutToken implements Task{

	private String strEndpoint;
	private String strId;

	public ExecuteDeleteWihtoutToken(String strEndpoint, String strId) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Delete.from((strEndpoint).concat(strId))
				.with(requestEspecification -> requestEspecification));
		
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static ExecuteDeleteWihtoutToken withTokens(String strEndPoint,String strId) {
		
		return Tasks.instrumented(ExecuteDeleteWihtoutToken.class,strEndPoint,strId);
	}
}
