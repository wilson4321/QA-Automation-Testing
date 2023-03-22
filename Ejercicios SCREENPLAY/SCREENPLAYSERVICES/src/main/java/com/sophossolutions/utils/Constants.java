package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;


public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();

	private Constants() {

			constantDir.put("Go Rest", "https://gorest.co.in");
			constantDir.put("actor", "Wilson");
			constantDir.put("endpoint", "/public/v2/users/87763");
			constantDir.put("Token Go Rest","5e9557da7c74b3c745ceb62b60a65ce5ee68309ae1a880d31b4de6549b1b3676");
			
			
			constantDir.put("endpoint Delete", "/public/v2/users/86867");
			constantDir.put("Json schema Gorest","src/test/resources/com/sophossolutions/resources/GorestSchema.json");
			constantDir.put("frankfurter","https://www.frankfurter.app");
			constantDir.put("Endpoint api", "/latest?to=USD,GBP");
			constantDir.put("Json schema frank","src/test/resources/com/sophossolutions/resources/schema.json" );
			constantDir.put("Post Go Rest", "/public/v2/users");
			constantDir.put("reqres", "https://reqres.in");
			constantDir.put("reqres endpoint", "/api/users");
			constantDir.put("Reqres Post Schema","src/test/resources/com/sophossolutions/resources/ReqresPostSchema.json");
			constantDir.put("Apiwil","http://localhost:3000");
			constantDir.put("endpoint Apiwil Post", "/users");
			constantDir.put("endpoint Apiwil user", "/users/102");
			constantDir.put("Apiwil Schema", "src/test/resources/com/sophossolutions/resources/ApiwilSchema.json");
			

	}

	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
}
