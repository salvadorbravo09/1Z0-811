package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Colecciones {
    public static void main(String[] args) {

        // Array simple
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        // Recorrer array
        System.out.println("Recorrer array");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("==========================================");

        // Arraylist
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        // Recorrer arraylist usando iterator
        System.out.println("Recorrer arraylist usando iterator");
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==========================================");

        // Recorrer arraylist usando un for mejorado
        System.out.println("Recorrer arraylist usando un for mejorado");
        for (String list : lista) {
            System.out.println(list);
        }

    }
}
