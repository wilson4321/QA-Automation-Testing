package practica;

public class PhysicalBook extends Book{

    private int pages;

    public PhysicalBook(String name, String desciption, int pages) {
        super(name, desciption);
        this.pages = pages;
        //TODO Auto-generated constructor stub
    }

    public int getPages() {
        return pages;
    }
    
    
}