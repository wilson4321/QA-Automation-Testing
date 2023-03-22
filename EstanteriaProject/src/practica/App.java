package practica;

public class App {
    public static void main(String[] args) throws Exception {
       Estanteria.addBook(new PhysicalBook("librofisico1", "descripcion1", 27));
       Estanteria.addBook(new PhysicalBook("librofisico2", "descripcion2", 20));
       Estanteria.addBook(new AudioBook("libroaudio1", "descripcion3", 185.3));
       Estanteria.sortBookList();
       Estanteria.getBooksTotalPages();
       
    }
}
