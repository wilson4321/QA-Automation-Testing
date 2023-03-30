package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookingDataInfo extends PageObject{
	
	public static Target txtDatos = Target.the("Pagina datos").locatedBy("//*[@class='bui-card__title'and contains(text(),'Los datos de tu reserva')]");
	public static Target txtFechaEntrada = Target.the("Fecha de entrada").locatedBy("(//span[@class='bui-date__title'])[1]");
	public static Target txtHoraEntrada = Target.the("Hora de entrada").locatedBy("(//span[@class='bui-date__subtitle'])[1]");
	public static Target txtFechaSalida = Target.the("Fecha de Salida").locatedBy("(//span[@class='bui-date__title'])[2]");
	public static Target txtHoraSalida = Target.the("Hora de Salida").locatedBy("(//span[@class='bui-date__subtitle'])[2]");
	public static Target txtDuracion = Target.the("Duracion de la estancia").locatedBy("(//div[@class='bui-group__item bui-f-font-strong'])[1]");
	public static Target txtPrecio = Target.the("Precio de Reserva").locatedBy("//*[@class='bp-price-details__charge-value e2e-price-details__total-charge--user']");
}
