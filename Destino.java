import java.util.Random;
import java.util.Scanner;

public class Destino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ale = new Random();

        System.out.println("Bienvenido al juego del Destino");
        System.out.println();
        System.out.println("El modo de juego es el siguiente:");
        System.out.println("    1. Cuentas con 5 vidas y 0 puntos");
        System.out.println("    2. Si pierdes todas tus vidas perderas el juego");
        System.out.println("    3. Para ganar debes obtener mas de 10 puntos");
        System.out.println("");
        System.out.println("De las siguientes maneras ganaras puntos, o perderas vidas:");
        System.out.println("    Si te sale el numero 1 perderas una vida");
        System.out.println("    Si te sale el numero 2 o el 4 ganaras un punto");
        System.out.println("    Si te sale el numero 3 o 5 no pasara nada");
        System.out.println("    Si te sale el numero 6 ganaras 3 puntos");

        int vidas = 5;
        int puntos = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Tienes " + vidas + " vidas y " + puntos + " puntos.");
            System.out.print("Presiona Enter para lanzar el dado...");
            scanner.nextLine();

            int dado = ale.nextInt(6) + 1;
            System.out.println("El dado cayó en: " + dado);

            switch (dado) {
                case 1:
                    vidas--;
                    System.out.println("¡Oh no! Pierdes 1 vida.");
                    break;
                case 2:
                case 4:
                    puntos++;
                    System.out.println("¡Bien! Ganas 1 punto.");
                    break;
                case 3:
                case 5:
                    System.out.println("Nada nuevo, continúa igual.");
                    break;
                case 6:
                    puntos += 3;
                    System.out.println("¡De suerte! Ganas 3 puntos.");
                    break;
            }

            if (vidas <= 0) {
                System.out.println("Que mala racha, perdiste todas tus vidas! Fin del juego.");
                continuar = false;
            } else if (puntos > 10) {
                System.out.println("Conseguiste mas de 10 puntos. ¡Ganaste!");
                continuar = false;
            }
        }

        System.out.println("Gracias por jugar al Dado del Destino.");
        scanner.close();
    }
}