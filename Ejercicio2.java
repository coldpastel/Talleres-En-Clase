import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random ale = new Random();
        int numeroGanador = ale.nextInt(50) + 1;
        int intentos = 3;
        boolean adivinado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Tienes 3 intentos para adivinar un número entre 1 y 50.");

        while (intentos > 0 && !adivinado) {
            System.out.print("Introduce tu número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroGanador) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                adivinado = true;
            } else if (numeroUsuario < numeroGanador) {
                System.out.println("El número ganador es mayor.");
            } else {
                System.out.println("El número ganador es menor.");
            }

            intentos--;

            if (!adivinado && intentos > 0) {
                System.out.println("Te quedan " + intentos + " intentos.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has perdido. El número ganador era: " + numeroGanador);
        }

        scanner.close();
    }
}