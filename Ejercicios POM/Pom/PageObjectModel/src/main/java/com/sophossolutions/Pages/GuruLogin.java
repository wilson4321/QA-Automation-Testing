package com.sophossolutions.Pages;

import org.openqa.selenium.By;

import com.sophossolutions.Actions.Actions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://demo.guru99.com/V4/")
public class GuruLogin extends PageObject{
     By userName = By.name("uid");
     By password = By.name("password");
     By button = By.name("btnLogin");
     
     public void navegar(String url) {
    	 getDriver().navigate().to(url);
     }
     
     public void login(String userName,String password) {
    	 
    	 Actions.sendData(getDriver(),this.userName,userName);
    	 Actions.sendData(getDriver(),this.password,password);
    	 Actions.clickElement(getDriver(),this.button);
    	 
     }
}
