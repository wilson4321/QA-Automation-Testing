package MaquinaCafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiposCafe {
    private ArrayList<Bebida> listaCafes;
    private ArrayList<Bebida> listaAdiciones;

    public TiposCafe() {
        listaCafes = new ArrayList<>();
        listaCafes.add(new CafeCaliente("Café Espresso (Caliente)"));
        listaCafes.add(new CafeCaliente("Café Americano (Caliente)"));
        listaCafes.add(new CafeCaliente("Café Capuchino (Caliente)"));
        listaCafes.add(new CafeFrio("Cold Brew (Frio)"));
        listaCafes.add(new CafeFrio("Ice Latte (Frio)"));
        listaCafes.add(new CafeFrio("Frappe (Frio)"));
        

        listaAdiciones = new ArrayList<>();
        listaAdiciones.add(new Adicion("Adicion Leche"));
        listaAdiciones.add(new Adicion("Adicion Chocolate"));
        listaAdiciones.add(new Adicion("Adicion Azucar"));
    }

    public void mostrarCafes() {
        System.out.println("Tipos de café:");
        int i = 1;
        for (Bebida cafe : listaCafes) {
            System.out.println(i + ". " + cafe.getNombre());
            i++;
        }
    }

    public void mostrarAdiciones() {
        System.out.println("Tipos de adiciones:");
        int i = 1;
        for (Bebida adicion : listaAdiciones) {
            System.out.println(i + ". " + adicion.getNombre());
            i++;
        }
    }

    public Bebida seleccionarCafe(int indice) {
    	Bebida cafe = null;
    	do {
        if (indice < 1 || indice > listaCafes.size()) {
            System.out.println("Opcion Invalida");
            mostrarCafes();
            System.out.println("Seleccione su café : ");
            Scanner scanner = new Scanner(System.in);
        	indice = scanner.nextInt();
        	return seleccionarCafe(indice);
        }else {
        	cafe = listaCafes.get(indice-1);
        }
    	}while(cafe == null);
        return listaCafes.get(indice -1);
    }

    public Bebida seleccionarAdicion(int indice) {
    	Bebida adicion = null;
    	do {
    		if (indice < 1 || indice > listaAdiciones.size()) {
            	System.out.println("Opcion Invalida");
            	mostrarAdiciones();
            	System.out.println("(ingrese el número correspondiente): ");
            	Scanner scanner = new Scanner(System.in);
            	indice = scanner.nextInt();
            	return seleccionarAdicion(indice);
            }else {
            	adicion = listaAdiciones.get(indice -1);
            }
    	}while(adicion == null);
    	
        
        return adicion;
    }
}