package com.sophossolutions.Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sophossolutions.Actions.Actions;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://demo.guru99.com/test/newtours/reservation.php")
public class TourFlight extends PageObject{
	
	//Nombro cada cajoncito de la pagina
	By type;
	By passengers = By.name("passCount");
	By departingFrom = By.name("fromPort");
	By onMonth = By.name("fromMonth");
	By onDay = By.name("fromDay");
	By arriving = By.name("toPort");
	By returning = By.name("toMonth");
	By returningDay = By.name("toDay");
	By serviceClass;
	By airline = By.name("airline");
	By bcontinue = By.name("findFlights");
    
	
    public void navegar(String url) {
    	getDriver().navigate().to(url);
    }
    
    public void reserva(String type, String passengers, String departingFrom, String onMonth, String onDay,
    		String arriving,String returning, String returningDay, String serviceClass, String airline) {
    	
    	this.type = By.xpath("//input[@name='tripType' and @value='" + type + "']");
    	this.serviceClass = By.xpath("//input[@name='servClass' and @value='" + serviceClass + "']");
    	
    	//Llamo la clase accion con sus metodos
    	Actions.clickElement(getDriver(), this.type);
    	Actions.selectFromOption(getDriver(), passengers, this.passengers);
    	Actions.selectFromOption(getDriver(), departingFrom, this.departingFrom);
    	Actions.selectFromOption(getDriver(), onMonth, this.onMonth);
    	Actions.selectFromOption(getDriver(), onDay, this.onDay);
    	Actions.selectFromOption(getDriver(), arriving, this.arriving);
    	Actions.selectFromOption(getDriver(), returning, this.returning);
    	Actions.selectFromOption(getDriver(), returningDay, this.returningDay);
    	Actions.clickElement(getDriver(), this.serviceClass);
    	Actions.selectFromOption(getDriver(), airline, this.airline);
    	Actions.clickElement(getDriver(), bcontinue);
    	
    	
    	
    	
    }
    
    public void reserva(DataTable gato) {
    	Map<String,String> mapaReservas = gato.asMap(String.class,String.class);
    	
    	this.type = By.xpath("//input[@name='tripType' and @value='" + mapaReservas.get("type") + "']");
    	this.serviceClass = By.xpath("//input[@name='servClass' and @value='" + mapaReservas.get("serviceClass") + "']");
    	
    	Actions.clickElement(getDriver(), this.type);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("passenger"), this.passengers);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("departingFrom"), this.departingFrom);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("onMonth"), this.onMonth);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("onDay"), this.onDay);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("arriving"), this.arriving);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("returning"), this.returning);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("returningDay"), this.returningDay);
    	Actions.clickElement(getDriver(), this.serviceClass);
    	Actions.selectFromOption(getDriver(), mapaReservas.get("airline"), this.airline);
    	Actions.clickElement(getDriver(), bcontinue);
    	
    	
    	
    	
    }

}
