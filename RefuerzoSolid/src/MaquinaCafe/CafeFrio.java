package MaquinaCafe;

class CafeFrio extends Bebida {
    public CafeFrio(String nombre) {
        super(nombre);
    }
    
    public String preparar() {
        return "Preparando su café frío...";
    }
}
