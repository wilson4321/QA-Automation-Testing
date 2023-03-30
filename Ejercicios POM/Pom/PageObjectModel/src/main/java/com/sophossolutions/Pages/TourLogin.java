package com.sophossolutions.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophossolutions.Actions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/")
public class TourLogin extends PageObject {
	By userName = By.name("userName");
    By password = By.name("password");
    By button = By.name("submit");
    //By buttonf = By.xpath("//a[contains(text(),'Flights')]");
    
    public void navegar(String url) {
   	 getDriver().navigate().to(url);
    }
    
    public void login(String userName,String password) {
   	 
   	 Actions.sendData(getDriver(),this.userName,userName);
   	 Actions.sendData(getDriver(),this.password,password);
   	 Actions.clickElement(getDriver(),this.button);
   	// Actions.clickElement(getDriver(),this.buttonf);
   	 
    }
    
   
   
    

}
