
import java.util.Scanner;

public class javaejercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int suma = 0;

        System.out.println("=== Suma Acumulativa ===");
        System.out.println("Introduce números. Escribe 0 para terminar.\n");

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                suma += numero;
                System.out.println("Suma parcial: " + suma);
            }
        } while (numero != 0);

        System.out.println("\n=== Resultado Final ===");
        System.out.println("Suma total: " + suma);

        scanner.close();
    }

}
