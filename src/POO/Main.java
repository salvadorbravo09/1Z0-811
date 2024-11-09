package POO;

public class Main {
    public static void main(String[] args) {

        // Crear objetos con diferentes constructores
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Salvador", "sa.bravo0901@gmail.com");

        // Utilizando métodos de acceso y mutador
        persona1.setNombre("Alejandro");
        persona1.setEmail("sa.bravo@duocuc.cl");

        // Mostrar informacion del metodo sobrecargado
        System.out.println("Persona 1:");
        persona1.mostrar();

        System.out.println("Persona 2:");
        persona2.mostrar("Informacion");

        // Usando metodo estatico
        System.out.println("Edad: " + Persona.getEdad());
    }
}
