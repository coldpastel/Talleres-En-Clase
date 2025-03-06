import java.util.Scanner;

public class Ejercicio_ClasificacionPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su estatura en metros:");
        double estatura = scanner.nextDouble();

        double IMC = peso / (estatura * estatura);

        System.out.printf("Su IMC es: %.2f%n", IMC);

        if (IMC < 18.5) {
            System.out.println("Tienes bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Tienes un peso normal");
        } else if (IMC >= 25 && IMC <= 26.9) {
            System.out.println("Tienes sobrepeso de grado 1");
        } else if (IMC >= 27 && IMC <= 29.9) {
            System.out.println("Tienes sobrepeso de grado 2");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Tienes obesidad tipo 1");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Tienes obesidad tipo 2");
        } else if (IMC >= 40 && IMC <= 49.9) {
            System.out.println("Tienes obesidad tipo 3");
        } else {
            System.out.println("Tienes obesidad tipo 4");
        }

        scanner.close();
    }
}