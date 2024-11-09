package POO;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Alejandro", 21, "Concepcion", "Software Engineer", "208115707");
        Persona persona2 = new Persona("John", 45, "Santiago", "Profesor", "12345678");

        persona.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
    }
}
