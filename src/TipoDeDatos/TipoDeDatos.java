package TipoDeDatos;

public class TipoDeDatos {
    public static void main(String[] args) {

        // Tipo de datos primitivos
        byte numeroByte = 127; // -128 a 127
        short numeroShort = 32767; // -32,768 a 32,767
        int numeroInt = 2147483647; // -2,147,483,648 a 2,147,483,647
        long numeroLong = 9223372036854775807L; // Incluye una "L" al final -> -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        float numeroFloat = 3.14f; // Incluye una "F" al final
        double numeroDouble = 3.14159;
        boolean varBoolean = true; // true o false
        char varChar = 'A'; // Carácter simple

        // Variables de tipo "final"
        final double PI = 3.14159;

        // Casteo de tipo de datos
        int valorInt = (int) numeroDouble;
        double valorDouble = numeroInt;

        // Imprimir resultados
        System.out.println("Double a int: " + valorInt);
        System.out.println("Int a double: " + valorDouble);
    }
}
