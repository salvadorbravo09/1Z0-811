package FlujosDeControl;

public class Control {
    public static void main(String[] args) {

        // If - Else
        int puntaje = 85;
        if (puntaje >= 90) {
            System.out.println("Excelente!");
        } else if (puntaje >= 80) {
            System.out.println("Buen trabajo!");
        } else {
            System.out.println("Sigue intentandolo!");
        }

        System.out.println("==========================================");

        // Switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            default:
                System.out.println("Otro dia");
        }

        System.out.println("==========================================");

        // For
        System.out.println("Foor - Loop");
        for (int i = 0; i < 3; i ++) {
            System.out.println(i);
        }

        System.out.println("==========================================");

        // For mejorado
        System.out.println("Foor - Mejorado");
        int[] numeros = {1, 2, 3};
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("==========================================");

        // While
        System.out.println("While");
        int count = 0;
        while (count < 3) {
            System.out.println(count);
            count++;
        }

        System.out.println("==========================================");

        // Do - While
        System.out.println("Do - While");
        int x = 0;
        do {
            System.out.println("Valor: " + x);
            x++;
        } while (x < 3);
    }
}
