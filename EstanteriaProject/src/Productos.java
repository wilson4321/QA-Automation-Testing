public class Productos {

    private String name;
    private String desciption;
    private int precio;
    
    public Productos(String name, String desciption, int precio) {
        this.name = name;
        this.desciption = desciption;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

    

    
}