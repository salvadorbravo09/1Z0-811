package Excepciones;

public class Excepciones {
    public static void main(String[] args) {

        // Try - Catch
        try {
            int resultado = divicion(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bloque final ejecutado");
        }

        System.out.println("==========================================");

        // Múltiples bloques catch
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException ejecutado");
        } catch (Exception e) {
            System.out.println("Excepcion generica");
        }

    }


    public static int divicion(int a, int b) {
        return a / b;
    }
}
