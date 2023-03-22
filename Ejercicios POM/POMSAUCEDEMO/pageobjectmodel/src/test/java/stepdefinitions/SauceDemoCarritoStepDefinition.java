package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceDemoCarritoPage;

public class SauceDemoCarritoStepDefinition {
	SauceDemoCarritoPage carrito;
	
	@Given("Estar logueado en {string}")
	public void estarLogueadoEn(String string) {
		carrito.navegateToUrl(string);
	}
	@When("Agregar al carrito de compra dos productos")
	public void agregarAlCarritoDeCompraDosProductos() {
		carrito.addProductos();
	}
	@Then("Pasar a la pagina Sauce Checkout")
	public void pasarALaPaginaSauceCheckout() {
		System.out.println("Estoy en el then");
		carrito.comprobarCart();
	}
}
