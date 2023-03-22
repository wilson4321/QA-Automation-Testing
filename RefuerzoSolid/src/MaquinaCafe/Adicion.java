package MaquinaCafe;

public class Adicion extends Bebida{

	public Adicion(String nombre) {
		super(nombre);
	}

	@Override
	public String preparar() {

		return "Agregando Adicion Seleccionada...";
	}

}
