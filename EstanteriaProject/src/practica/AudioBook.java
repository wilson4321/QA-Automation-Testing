package practica;

public class AudioBook extends Book {

    private double duration;

    public AudioBook(String name, String desciption, double duration) {
        super(name, desciption);
        this.duration  = duration;
        //TODO Auto-generated constructor stub
    }

    public double getDuration() {
        return duration;
    }
    
    
}