
public class FigureAction extends Productos implements IDiscount{
	
	private double peso;
	
	public FigureAction(String name, String desciption, int precio,double peso) {
		super(name, desciption, precio);
		// TODO Auto-generated constructor stub
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public double discount(double price) {
		if(peso>=10 && peso <= 49 ) {
			return price*0.2; 
		}else if(peso>= 50 && peso<=100  ){
			return price*0.4;
		}else if(peso >100){
			
			return price*0.5;
		}else{
			
		return price;
		}
	}
	
	

}
