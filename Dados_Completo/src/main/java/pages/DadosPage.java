package pages;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import actions.Action;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Constants;

public class DadosPage extends PageObject{
	
	By selectBuild = By.xpath("//*[@id='buildNumber']");
	By type;
	By btnroll = By.xpath("//*[@id='rollDiceButton']");
	By numberGuess = By.xpath("//*[@id='numberGuess']");
	By btnSubmit = By.xpath("//*[@id='submitButton']");
	
	By textWin = By.xpath("//label[@id='feedbackLabel']//i");
	public static String numberFound = "";
	public static int intentos = 0;

	
    public void navegateToUrl(String url){
        
        Action.navegateToUrl(getDriver(),  Constants.getData(url));
    }
    
    public void build(String strType) {
    	
    	
    	this.type = By.xpath("//*[@value='"+ strType +"']");
    	Action.clickElement(getDriver(), selectBuild);
    	Action.clickElement(getDriver(), this.type);
    	Action.clickElement(getDriver(), btnroll);
    	Action.clickElement(getDriver(), numberGuess);
    	
    }
    
    public void playDice(String strNumber){
    	
    	for(int i =0; i<10;i++){
    		Action.sendData(getDriver(), numberGuess, strNumber);
        	Action.clickElement(getDriver(), btnSubmit);
    		intentos++;
    		
    		String findWord = Action.getElementText(getDriver(), textWin);
    		if(findWord.contains("Correct")) {
				break;
			}
			if(findWord.contains("Too high")) {
				strNumber = (Integer.parseInt(strNumber)-1)+"";
			}
			if(findWord.contains("Too low")) {
				strNumber = (Integer.parseInt(strNumber)+1)+"";
			}
    	}
    	
    	numberFound = strNumber;
		System.out.println("Numero correcto :"+numberFound);
		System.out.println("Cantidad de intentos :"+intentos);
    }
    
    
    public void validateText() {
    	boolean booleanFound = Action.getElementText(getDriver(), this.textWin).contains("Correct");
		assertEquals("Numero no encontrado",true,booleanFound );
    	
    }



}
