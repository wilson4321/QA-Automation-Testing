public class App {
    public static void main(String[] args) throws Exception {
    
    	
       Estanteria.addBook(new PhysicalBook("librofisico1", "descripcion1", 200, 27,6));
       Estanteria.addBook(new PhysicalBook("librofisico2", "descripcion2", 100, 20,0));
       Estanteria.addBook(new AudioBook("libroaudio1", "descripcion3", 300, 185.3));
       Estanteria.addBook(new FigureAction("Goku SS1", "Chroma red", 400, 250));
       
       Estanteria.sortBookList();
       Estanteria.getBooksTotalPages();
       
       
    }
}
