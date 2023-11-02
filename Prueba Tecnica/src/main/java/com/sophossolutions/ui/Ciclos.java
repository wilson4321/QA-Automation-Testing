package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Ciclos extends PageObject{
	

	public static Target math1 = Target.the("math1").locatedBy("//*[@value={0}]");
	public static Target math2 = Target.the("math2").locatedBy("//select[@name='select']");
	public static Target emoji = Target.the("emoji").locatedBy("//input[@name = 'number']");
	public static Target date = Target.the("date").locatedBy("//input[@name = 'date']");

	public static Target num1 = Target.the("num1").locatedBy("(//*[@class='grid grid-cols-4 gap-4 mt-4'])[1]");
	public static Target num2 = Target.the("num2").locatedBy("(//div[@class='grid grid-cols-4 gap-4 mt-4'])[2]");

	
	public static Target textoLeer = Target.the("texto Leer").locatedBy("//div[@class= 'flex flex-col p-4 w-2/5 bg-white rounded-md shadow-md my-5 justify-around']//p[@class = 'text-center text-xl']");
	public static Target texto = Target.the("texto ingresar").locatedBy("//*[@name='text']");
	
	
	public static Target txtMultiplo = Target.the("txtMultiplo").locatedBy("//div[@class='bg-white rounded-md shadow-md p-5 flex flex-col items-center my-5 w-2/5 ']//p[@class='text-center text-xl']");
	public static Target gridmultiplo= Target.the("grid multiplo").locatedBy("//div[@class='bg-white rounded-md shadow-md p-5 flex flex-col items-center my-5 w-2/5 ']//div[@class='grid grid-cols-4 gap-4 mt-4']");
	
	
	public static Target btnsubmit = Target.the("btnsubmit").locatedBy("//*[@type = 'submit']");
	
	
	public static Target txtFecha = Target.the("txtfecha").locatedBy("//div[@class= 'flex flex-col items-center p-4 space-y-5 bg-white rounded-md w-2/5 shadow-md my-5']//p[@class = 'text-center text-xl'and contains(text(),'dias')]");
	
	public static Target txtComplete = Target.the("Hash").locatedBy("//p[@class='text-white text-2xl text-center break-all']");
	

}
