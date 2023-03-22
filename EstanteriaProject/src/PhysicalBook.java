public class PhysicalBook extends Productos implements IDiscount{

    private int pages;
	private int quantity;
    
    
    public PhysicalBook(String name, String desciption,int precio, int pages, int quantity) {
        super(name, desciption, precio);
        this.pages = pages;
        this.quantity = quantity;
        //TODO Auto-generated constructor stub
    }

    public int getPages() {
        return pages;
    }
    
    public int getQuantity() {
    	return quantity;
    }
 
	@Override
	public double discount(double price) {
		
		if(quantity >5 && quantity <=8) {
			return price*0.2;
		}else if(quantity >=9 && quantity <=15){
			return price*0.4;
			
		} else if(quantity >15){
			return price*0.6;
		}else{
		
		return price;
	}
	}
    
}
