package com.sophossolutions.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
	private static Constants instance;
	private Map<String, String> constantDir = new HashMap<String, String>();
	
	private Constants() {
	constantDir.put("Go Rest", "https://gorest.co.in");
	constantDir.put("actor", "Wilson");
	constantDir.put("Go Rest endpoint", "/public/v2/users/");
	constantDir.put("Token Go Rest","5e9557da7c74b3c745ceb62b60a65ce5ee68309ae1a880d31b4de6549b1b3676");
	constantDir.put("Json schema Gorest","src/test/resources/com/sophossolutions/resources/gorest_schema.json");
	constantDir.put("Go Rest endpoint delete", "/public/v2/users/");
	
	constantDir.put("Apiwil","http://localhost:3000");
	constantDir.put("endpoint Apiwil", "/users/");
	constantDir.put("Apiwil Schema", "src/test/resources/com/sophossolutions/resources/apiwilschema.json");
	
	
}
	public static String getData(String key) {
		if (instance == null) {
			instance = new Constants();
		}
		return instance.constantDir.get(key);
	}
	
}