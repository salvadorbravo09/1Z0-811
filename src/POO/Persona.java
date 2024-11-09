package POO;

public class Persona {
    String nombre;
    int edad;
    String ciudadResidencia;
    String profesion;
    String dni;

    public Persona(String nombre, int edad, String ciudadResidencia, String profesion, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadResidencia = ciudadResidencia;
        this.profesion = profesion;
        this.dni = dni;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("ciudadResidencia: " + ciudadResidencia);
        System.out.println("Profesion: " + profesion);
        System.out.println("Dni: " + dni);
    }
}
