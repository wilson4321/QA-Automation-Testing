package actions;

import java.util.List;

//import cucumber.api.DataTable;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import java.util.ArrayList;
//import java.util.List;

public class Action {

    public static void navegateToUrl(WebDriver myBrowser, String url) {
        myBrowser.navigate().to(url);
    }

    public static void sendData(WebDriver myBrowser, By target, String strData) {
        if (myBrowser.findElements(target).size() > 0) {
            myBrowser.findElement(target).clear();
            myBrowser.findElement(target).sendKeys(strData);
        }
    }

    public static void clickElement(WebDriver myBrowser, By target) {
        if (myBrowser.findElements(target).size() > 0) {
            myBrowser.findElement(target).click();
        }
    }

    public static String getElementText(WebDriver myBrowser, By target) {
        if (myBrowser.findElements(target).size() > 0) {
            return myBrowser.findElement(target).getText();
        } else {
            return "Missing element: " + target.toString();
        }
    }

    public static String convert(String value, String... values) {
        return String.format(value, values);
    }

    public static void selectFromOption(WebDriver myBrowser, String option, By target)
    {
        WebElement selectList = myBrowser.findElement(target);
        Select select = new Select(selectList);
        select.selectByVisibleText(option);
    }

    public static List<WebElement> obtainElementsList(WebDriver myBrowser ,By target)
    {
        List<WebElement> listWebElements = myBrowser.findElements(target);
        return listWebElements;
    }
    
}
