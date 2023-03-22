package utils;

import java.util.*;

public class Constants {

    private static Constants instance;
    private Map<String, String> constantDir = new HashMap<String, String>();

    private Constants() {
    	// pagina principal
        constantDir.put("Pagina inicial", "https://testsheepnz.github.io/random-number.html");
        

	    }
	
	    public static String getData(String key) {
        if (instance == null){
            instance = new Constants();
        }
        return instance.constantDir.get(key);
    }
    
}