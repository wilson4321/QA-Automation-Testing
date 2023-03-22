public class AudioBook extends Productos implements IDiscount{

    private double duration;

    public AudioBook(String name, String desciption, int precio, double duration) {
        super(name, desciption, precio);
        this.duration  = duration;
        //TODO Auto-generated constructor stub
    }

    public double getDuration() {
        return duration;
    }

	@Override
	public double discount(double price) {
		if(duration >=80 &&duration <=180) {
			return price*0.2;
			
		}else if(duration >=180 &&duration <=250){
			return price*0.4;
			
		}else if(duration >250 ){
			return price*0.5;
			
		}else{
			
		return price;
	
		}
    
}
}