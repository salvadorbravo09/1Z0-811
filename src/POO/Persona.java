package POO;

public class Persona {

    // Variables de la clase
    private String nombre;
    private String email;

    // Variables estaticas
    private static int edad = 20;

    // Constructor vacio
    public Persona() {
    }

    // Constructor con parametros
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        edad++;
    }

    // Metodos de Acceso o Getter - Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getEdad() {
        return edad;
    }

    // Metodo sobrecargado
    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", email: " + email);
    }

    public void mostrar(String prefix) {
        System.out.println(prefix + " - Nombre: " + nombre + ", email: " + email);
    }
}
