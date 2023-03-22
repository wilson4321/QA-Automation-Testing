package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.rest.interactions.Delete;
import com.sophossolutions.utils.Constants;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ExecuteDelete implements Task{

	private String strEndpoint;
	private String strId;

	public ExecuteDelete(String strEndpoint, String strId) {
		super();
		this.strEndpoint = strEndpoint;
		this.strId = strId;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Delete.from((strEndpoint).concat(strId))
				.with(requestEspecification -> requestEspecification.auth().oauth2(Constants.getData("Token Go Rest"))));
		
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static ExecuteDelete withTokens(String strEndPoint,String strId) {
		
		return Tasks.instrumented(ExecuteDelete.class,strEndPoint,strId);
	}
}
