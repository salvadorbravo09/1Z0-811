package Utils;

import java.util.Random;

public class Utils {
    public static void main(String[] args) {

        // Clase random
        Random random = new Random();
        System.out.println("Numero int random: " + random.nextInt(100));
        System.out.println("Numero double random: " + random.nextDouble());

        System.out.println("==========================================");

        // Clase Math
        System.out.println("Pi: " + Math.PI);
        System.out.println("Raíz cuadrada: " + Math.sqrt(25));
        System.out.println("Fuerza: " + Math.pow(2, 3));
        System.out.println("Maximo: " + Math.max(10, 20));
        System.out.println("Random: " + Math.random());
    }
}
