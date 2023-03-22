package com.sophossolutions.restinteractions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.List;

import com.sophossolutions.models.Prueba;
import com.sophossolutions.utils.Constants;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;

public class RestInteraction {
	public static String strBaseUrl;
	
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.strBaseUrl=strBaseUrl;
	}
	
	public static void executeGetRest(String strEndPoint) {
		SerenityRest.given().when().get(strBaseUrl.concat(strEndPoint));
	
	SerenityRest.lastResponse().prettyPeek();
	}
	
	public static void validateStatusCode(int intStatusCode) {
		int responseCode = SerenityRest.lastResponse().getStatusCode();
		assertEquals(intStatusCode, responseCode,"The status code doesnt match");
		
	}
	
	public static void validateField(String strKey,String strValue) {
		JsonPath responseJSON = SerenityRest.lastResponse().jsonPath();
	
		String strValueObtained =responseJSON.getString(strKey); 
		assertEquals(strValue, strValueObtained," Los campos no coinciden");
	}
	
	public static void prueba() {
		
		Prueba prueba = SerenityRest.lastResponse().as(Prueba.class);
		System.out.println(prueba.getRates().getUsd());
	}
	
	public static void validateSchema(String strSchema) {
		SerenityRest.lastResponse().then().assertThat()
		.body(JsonSchemaValidator.matchesJsonSchema(new File(Constants.getData(strSchema))));
	}
	
}