package MaquinaCafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Bebida> pedidos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        TiposCafe tiposcafe = new TiposCafe(); 
        
        System.out.println("Bienvenido a la cafetería de Wilson");

        while (true) {
        	System.out.println("A continuacion te mostramos los cafes disponibles: ");
        	tiposcafe.mostrarCafes();
            System.out.print("Seleccione su café : ");
            int cafeSelect = scanner.nextInt();
            Bebida cafe = tiposcafe.seleccionarCafe(cafeSelect);

            tiposcafe.mostrarAdiciones();
            System.out.print("Seleccione su adición ");
            int adicionSelect = scanner.nextInt();
            Bebida adicion = tiposcafe.seleccionarAdicion(adicionSelect);

            System.out.println(cafe.preparar());
            System.out.println(adicion.preparar());
            System.out.println("Listo para servir!");

            pedidos.add(cafe);
            pedidos.add(adicion);

            System.out.print("¿Desea para llevar (L) o consumir aquí (C)? ");
            String opcion = scanner.next();
            if (opcion.equalsIgnoreCase("L")) {
                System.out.println("Su café está listo para llevar");
            } else if (opcion.equalsIgnoreCase("C")) {
                System.out.println("Su café está listo para consumir aquí");
            }

            System.out.print("¿Desea otro café? (S/N) ");
            opcion = scanner.next();
            if (!opcion.equalsIgnoreCase("S")) {
                break;
            }
        }

        System.out.println("Lista de pedidos:");
        Iterator<Bebida> iterador = pedidos.iterator();
        while (iterador.hasNext()) {
            Bebida bebida = iterador.next();
            System.out.println(bebida.getNombre());
        }
    }
}
