package com.sophossolutions.stepdifinitions;

import java.util.Map;

import com.sophossolutions.tasks.BookingData;
import com.sophossolutions.tasks.FillBookingInfo;
import com.sophossolutions.tasks.Reservar;
import com.sophossolutions.tasks.SelectFilter;
import com.sophossolutions.ui.BookingDataInfo;
import com.sophossolutions.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class BookingResInfoStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	 
	@Given("Debo estar en la pagina de booking {string}")
	public void deboEstarEnLaPaginaDeBooking(String strUrl) {
		OnStage.theActorCalled("QAUser").wasAbleTo(Open.url(Constants.getData(strUrl)));
		
		
	}
	@When("Ingreso los datos requeridos para reserva")
	public void ingresoLosDatosRequeridosParaReserva(DataTable dataTable){
		Map<String,String> mapTable = dataTable.asMap();
		OnStage.theActorInTheSpotlight().wasAbleTo(FillBookingInfo.form(
				mapTable.get("destino"),mapTable.get("fechaIngreso"),mapTable.get("fechaSalida"),
				mapTable.get("adultos"),mapTable.get("niños"),mapTable.get("habitaciones")));
	}
	@Then("Valido la informacion de reserva con los filtros")
	public void validoLaInformacionDeReservaConLosFiltros(DataTable dataTable)  {
		Map<String,String> mapTable = dataTable.asMap();
		
		OnStage.theActorInTheSpotlight().wasAbleTo(SelectFilter.form(mapTable.get("filtro")));
		OnStage.theActorInTheSpotlight().wasAbleTo(Reservar.value());
		
		OnStage.theActorInTheSpotlight().wasAbleTo(BookingData.from(
				BookingDataInfo.txtFechaEntrada, BookingDataInfo.txtHoraEntrada, 
				BookingDataInfo.txtFechaSalida, BookingDataInfo.txtHoraSalida,
				BookingDataInfo.txtDuracion, BookingDataInfo.txtPrecio));
			
		
	}
}
