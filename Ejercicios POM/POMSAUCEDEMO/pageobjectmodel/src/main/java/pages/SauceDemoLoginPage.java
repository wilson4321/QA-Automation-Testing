package pages;


import utils.Constants;
import net.thucydides.core.pages.PageObject;

import java.util.Map;
import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;

import actions.Action;



public class SauceDemoLoginPage extends PageObject{

    By txtUserName = By.name("user-name");
    By txtPassword = By.name("password");
    By btnLogin = By.name("login-button");
    By textSuccess = By.xpath("//*[text()='Products']");

    public void navegateToUrl(String url){
        
        Action.navegateToUrl(getDriver(),  Constants.getData(url));
    }

    public void login(DataTable dataTable)
    {
        Map<String, String> userInfo = dataTable.asMap(String.class, String.class);
        Action.sendData(getDriver(), txtUserName, userInfo.get("user"));
        Action.sendData(getDriver(), txtPassword, userInfo.get("password"));
        Action.clickElement(getDriver(), btnLogin);

    }
    public void check()
    {
        Action.clickElement(getDriver(), textSuccess);

    }
    
}
