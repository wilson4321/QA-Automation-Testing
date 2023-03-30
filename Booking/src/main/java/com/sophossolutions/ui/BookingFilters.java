package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BookingFilters extends PageObject{
	
	public static Target BtnFiltro = Target.the("Seleccion filtro").locatedBy("//*[@data-testid='sorters-dropdown-trigger']");
	public static Target BtnFiltroMejoryBarato = Target.the("Seleccion filtro Mejor puntuacion y precio").locatedBy("//*[@data-id='review_score_and_price']");
	public static Target BtnFiltroBarato = Target.the("Seleccion filtro mas barato").locatedBy("//*[@data-id='price']");
	public static Target txtPuntuacion = Target.the("Puntuacion").locatedBy("//div[@data-testid='property-card']/descendant::div[@data-testid='review-score']//div[@class='b5cd09854e d10a6220b4']");
	public static Target txtComentarios = Target.the("Comentarios").locatedBy("//div[@data-testid='property-card']/descendant::div[@data-testid='review-score']//div[@class='d8eab2cf7f c90c0a70d3 db63693c62']");
	public static Target btnDisponibilidad = Target.the("Disponibilidad").locatedBy("(//*[@class='e57ffa4eb5'and contains(text(),'Ver disponibilidad')])[{0}]");
	public static Target listElementos = Target.the("elementos").locatedBy("//div[@data-testid='property-card']");
	public static Target txtConfort = Target.the("Confort").locatedBy(".//*[contains(text(),'Confort')]");
	public static Target btnPop = Target.the("popup").locatedBy("//div[@data-testid='overlay-message-body']");

} 
