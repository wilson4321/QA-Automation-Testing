package MaquinaCafe;

public abstract class Bebida {
    private String nombre;

    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String preparar();
}