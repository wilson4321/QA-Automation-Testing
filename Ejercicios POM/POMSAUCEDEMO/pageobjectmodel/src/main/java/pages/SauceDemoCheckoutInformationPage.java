package pages;


import utils.Constants;
import net.thucydides.core.pages.PageObject;

import java.util.Map;
import org.openqa.selenium.By;
import io.cucumber.datatable.DataTable;

import actions.Action;

public class SauceDemoCheckoutInformationPage extends PageObject{

    By txtFirstName = By.name("firstName");
    By txtLastName = By.name("lastName");
    By txtPostalCode = By.name("postalCode");
    By btnContinue = By. name("continue");
    

    public void navegateToUrl(String url){
         
        Action.navegateToUrl(getDriver(),  Constants.getData(url));
    }

    public void saveClientPersonalData(DataTable dataTable)
    {
        Map<String, String> clientInfo = dataTable.asMap(String.class, String.class);
        Action.sendData(getDriver(), txtFirstName, clientInfo.get("firsName"));
        Action.sendData(getDriver(), txtLastName, clientInfo.get("lastName"));
        Action.sendData(getDriver(), txtPostalCode, clientInfo.get("postalCode"));
        Action.clickElement(getDriver(), btnContinue);

    }
    
}
