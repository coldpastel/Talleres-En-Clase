import java.util.Random;
import java.util.Scanner;

public class Ejercicio_Casino {
    public static void main(String[] args) {

        System.out.println("BIENVENIDO AL CASINO VIRTUAL");
        System.out.println("Es tu oportunidad de ser millonario");
        System.out.println("");

        System.out.println("Nuestras reglas son sencillas, son las siguientes:");
        System.out.println("1. ingresaras una cantidad de dinero de forma sencilla, unicamente ingresas el valor y automaticamente queda subido");
        System.out.println("2. luego de ingresar tu dinero se hara automaticamente la primer apuesta");
        System.out.println("3. el sistema generara un numero de 1 a 3 aleatoriamente");
        System.out.println("4. si sale el numero 1 (se duplicara tu dinero, si sale el numero), si sale el numero 2 (perderas la mitad de tu dinero), si sale el numero 3 (perderas todo tu dinero)");
        System.out.println("5. despues de cada apuesta, si aun tienes dinero se te preguntara si quieres continuar o retirarte");
        System.out.println("6. disfruta el juego");

        int max = 3;
        int min = 1;
        double dinero;
        int apuestas = 0;
        int duplica = 0;
        int pierde_mitad = 0;
        int pierde_todo = 0;

        Scanner scanner = new Scanner(System.in);
        Random ale = new Random();

        System.out.println("Ingrese la cantidad de dinero que quiere apostar:");
        dinero = scanner.nextDouble();

        boolean continuar = true;

        while (continuar) {
            int numero = ale.nextInt((max - min + 1)) + min;
            System.out.println("Numero generado: " + numero);

            if (numero == 1) {
                System.out.println("Duplicaste tu dinero");
                dinero *= 2;
                duplica++;
            } else if (numero == 2) {
                System.out.println("Perdiste la mitad de tu dinero");
                dinero /= 2;
                pierde_mitad++;
            } else if (numero == 3) {
                System.out.println("Perdiste todo tu dinero");
                dinero = 0;
                pierde_todo++;
            }

            apuestas++;
            System.out.println("Dinero actual: $" + dinero);

            if (dinero == 0) {
                System.out.println("Perdiste todo tu dinero. Fin del juego.");
                continuar = false;
            } else {
                System.out.println("¿Desea continuar? (1: Sí, 2: No)");
                int opcion = scanner.nextInt();
                if (opcion != 1) {
                    continuar = false;
                }
            }
        }

        System.out.println("\nResumen de apuestas:");
        System.out.println("Veces que duplicaste tu dinero: " + duplica);
        System.out.println("Veces que perdiste la mitad: " + pierde_mitad);
        System.out.println("Veces que perdiste todo: " + pierde_todo);
        System.out.println("Total de apuestas: " + apuestas);
        System.out.println("Dinero final: $" + dinero);

        scanner.close();
    }
}