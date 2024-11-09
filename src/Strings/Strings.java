package Strings;

public class Strings {
    public static void main(String[] args) {

        String string1 = "Hola";
        String string2 = new String("Hola");

        // Metodos de los String
        System.out.println("Longitud: " + string1.length());
        System.out.println("Mayusculas: " + string1.toUpperCase());
        System.out.println("Subcadena: " + string1.substring(0, 3));

        System.out.println("==========================================");

        // Comparacion de String
        System.out.println("string1.equals(string2): " + string1.equals(string2));
        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1.compareTo(string2): " + string1.compareTo(string2));
    }
}
