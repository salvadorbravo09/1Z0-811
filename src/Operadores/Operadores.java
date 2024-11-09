package Operadores;

public class Operadores {
    public static void main(String[] args) {

        // Operadores aritmeticos
        int a = 10;
        int b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        System.out.println("==========================================");

        // Operadores de incremento
        int c = a++;
        System.out.println("Post-incremento: " + c);

        // Operadores de decremento
        int d = --b;
        System.out.println("Pre-incremento: " + d);

        System.out.println("==========================================");

        // Operadores relacionales
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        System.out.println("==========================================");

        // Operadores logicos
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));

        System.out.println("==========================================");

        // Operadores ternarios
        int resultado = (a > b) ? a : b;
        System.out.println("Valor maximo: " + resultado);
    }
}
