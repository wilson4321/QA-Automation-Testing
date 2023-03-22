package com.sophossolutions.apis;

import com.sophossolutions.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class FrankfurterApi {
	
	public static void setBaseUrl(String strBaseUrl) {
		RestInteraction.setBaseUrl(strBaseUrl);
	}

	public static void executeGetRest(String strEndPoint) {
		RestInteraction.executeGetRest(strEndPoint);
	}

	public static void validateStatusCode(int intStatusCode) {
		RestInteraction.validateStatusCode(intStatusCode);
	}
	
	public static void validateNameField(String strFieldValue) {
		String strFieldName = "name";
		
		RestInteraction.validateField(strFieldName, strFieldValue);
	}

	public static void validateField(String strKey, String strValue) {
		RestInteraction.validateField(strKey, strValue);
	}
	public static void prueba() {
		
		
	}
	
    public static void validateData(String strSchema) {
		
		RestInteraction.validateSchema(strSchema);
	}

}
