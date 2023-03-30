package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookingReservationInfo extends PageObject{
	
	
	public static Target btnpublicidad = Target.the("Cerrar publicidad").locatedBy("//*[@aria-label='Ignorar información sobre el inicio de sesión.']");   
	public static Target txtDestino = Target.the("Destino").locatedBy("//*[@class='ce45093752']");
	public static Target selectCiudad = Target.the("Seleccionar Opcion").locatedBy("(//*[@class='f9a8ccdcc6'])[1]");
	public static Target txtFecha = Target.the("fecha").locatedBy("//span[@data-date={0}]");
	public static Target btnRight = Target.the("Right Button").locatedBy("//*[@class='fc63351294 a822bdf511 e3c025e003 fa565176a8 cfb238afa1 c334e6f658 ae1678b153 c9fa5fc96d be298b15fa']");
	public static Target btnPersonas = Target.the("Cantidad Personas").locatedBy("//*[@class='d47738b911 b7d08821c3']");
	
	public static Target txtAdultos = Target.the("Adultos").locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_adults']]//span[@class='e615eb5e43']");
	public static Target btnAdultosMas = Target.the("Aumentar adultos").locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_adults']]//button[contains(@class, 'd64a4ea64d')]");
	public static Target btnAdultosMenos = Target.the("Disminuir adultos").locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_adults']]//button[contains(@class, 'cd7aa7c891')]");
	 
	public static Target txtNiños = Target.the("Niños").locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_children']]//span[@class='e615eb5e43']");
	public static Target btnNiñosMenos = Target.the("Disminuir niños").locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_children']]//button[contains(@class, 'cd7aa7c891')]");
	public static Target btnNiñosMas = Target.the("Aumentar niños").locatedBy("//div[@class='b2b5147b20' and .//label[@for='group_children']]//button[contains(@class, 'd64a4ea64d')]");
	public static Target txtCantNiños = Target.the("cantidad niños").locatedBy("//div[@class='d6bfadf8de']//div[@data-testid='kids-ages-select'][{0}]//select");
	public static Target txtSelectedad = Target.the("edad").locatedBy("//div[@data-testid='kids-ages-select'][{0}]");
	
	public static Target txtHabitacion = Target.the("Habitaciones").locatedBy("//div[@class='b2b5147b20' and .//label[@for='no_rooms']]//span[@class='e615eb5e43']");
	public static Target btnHabitacionMenos = Target.the("Disminuir habitaciones").locatedBy("//div[@class='b2b5147b20' and .//label[@for='no_rooms']]//button[contains(@class, 'cd7aa7c891')]");
	public static Target btnHabitacionMas = Target.the("Aumentar Habitaciones").locatedBy("//div[@class='b2b5147b20' and .//label[@for='no_rooms']]//button[contains(@class, 'd64a4ea64d')]");
	
	public static Target BtnBuscar = Target.the("Boton Buscar").locatedBy("(//*[@class='e57ffa4eb5' and contains(text(),'Buscar')])[1]");
}
