package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DespegarFlightInfo extends PageObject{
	public static Target txtOrigen = Target.the("Origen").locatedBy("//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Ingresa desde dónde viajas']");
	public static Target txtDestino = Target.the("Destino").locatedBy("//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Ingresa hacia dónde viajas']");
	public static Target btnDestino = Target.the("Destino").locatedBy("//li[@class='item -active']");
	public static Target txtIda = Target.the("Ida").locatedBy("//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::div[@class='sbox5-dates-input1']");
    public static Target txtVuelta = Target.the("Vuelta").locatedBy("//div[@class='sbox5-segment--2_IQ3' and span[contains(text(), 'Tramo 1')]]/descendant::input[@placeholder='Vuelta']");
    public static Target btnIda = Target.the("Boton Ida").locatedBy("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-month='2023-03']/descendant::div[@class='sbox5-monthgrid-datenumber-number' and text()='28'][1]");
    public static Target btnRight = Target.the("Right Button").locatedBy("(//*[@class='calendar-arrow-right'])[1]");
    public static Target btnVuelta = Target.the("Boton Vuelta").locatedBy("//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-month='2023-05']/descendant::div[@class='sbox5-monthgrid-datenumber-number' and text()='30'][1]");
	public static Target btnBuscar = Target.the("Boton Buscar").locatedBy("//*[@class='btn-text' and contains(text(),'Buscar')]");
	public static Target btnCookies = Target.the("Boton Cookies").locatedBy("//*[@class='btn-text' and contains(text(), 'Entendí')]");
	public static Target selectCiudad = Target.the("Seleccionar Opcion").locatedBy("//li[@class='item -active']");
	public static Target BtnPasajeros = Target.the("Seleccionar pasajeros").locatedBy("//div[@class='sbox5-segment--2_IQ3']/descendant::div[@class='sbox5-distributionPassengers']");
	public static Target BtnAdultos = Target.the("Cantidad Adultos").locatedBy("//div[contains(div/span/text(), 'Adultos')]/descendant::*[@id='svg-plus-MLZpsEK']");
	public static Target BtnMenores = Target.the("Cantidad Menores").locatedBy("//div[contains(div/span/text(), 'Menores')]/descendant::*[@id='svg-plus-MLZpsEK']");
	public static Target btnEdad = Target.the("Edad Menor").locatedBy("//*[@class='select']");
    public static Target selectEdad = Target.the("Selecciona Edad del Menor").locatedBy("//*[@class='select-option' and contains(text(), '10 años')]");
    public static Target resultadosVuelos = Target.the("Pagina resultados check").locatedBy("//span[contains(text(),'Escalas')]");
}
