package com.sophossolutions.tasks;

import java.util.Map;

import org.apache.http.HttpHeaders;

import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class ExecutePost implements Task{
	private String strEndpoint;
	private Map<String, String> mapBody;

	public ExecutePost(String strEndpoint, DataTable dataTable) {
		super();
		this.strEndpoint = strEndpoint;
		this.mapBody = dataTable.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Post.to(strEndpoint).with(
				requestEspecification -> 
				requestEspecification.header(
						HttpHeaders.CONTENT_TYPE, ContentType.JSON)
				.auth().oauth2(Constants.getData("Token Go Rest"))
				.body(mapBody)));
	}

	public static ExecutePost withtokens(String strEndpoint, DataTable dataTable) {
		return Tasks.instrumented(ExecutePost.class, strEndpoint, dataTable);
	}
	
}