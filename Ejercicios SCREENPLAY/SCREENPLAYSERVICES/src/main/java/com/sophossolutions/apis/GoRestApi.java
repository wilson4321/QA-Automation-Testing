package com.sophossolutions.apis;


import com.sophossolutions.restinteractions.RestInteraction;


public class GoRestApi {
	
	public static final String STR_TOKEN = "5e9557da7c74b3c745ceb62b60a65ce5ee68309ae1a880d31b4de6549b1b3676";
	
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
	
    public static void validateData(String strSchema) {
		
		RestInteraction.validateSchema(strSchema);
	}

}
