package MaquinaCafe;

class CafeCaliente extends Bebida {
    public CafeCaliente(String nombre) {
        super(nombre);
    }
    
    public String preparar() {
        return "Preparando su café caliente...";
    }
}