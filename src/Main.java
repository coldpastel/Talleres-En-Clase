import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;
        int rondas, dado1, dado2, suma;
        int contDado1 = 0;
        int contDado2 = 0;
        int ganadasDado1 = 0;
        int ganadasDado2 = 0;

        Random ale = new Random();

        rondas = ale.nextInt((max - min + 1)) + min;
        System.out.println("número de rondas: " + rondas);

        for (int i = 1; i <= rondas; i++) {

            dado1 = ale.nextInt((6 - 1 + 1)) + min;
            dado2 = ale.nextInt((6 - 1 + 1)) + min;

            suma = dado1 + dado2;

            System.out.println("ronda " + i);
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("suma de los dados: " + suma);

            if (dado1 > dado2) {
                System.out.println("gana Dado 1 en esta ronda");
                ganadasDado1++;
            } else if (dado1 < dado2) {
                System.out.println("gana Dado 2 en esta ronda");
                ganadasDado2++;
            } else {
                System.out.println("empate en esta ronda");
            }
        }

        System.out.println("resultados finales:");
        System.out.println("rondas ganadas por Dado 1: " + ganadasDado1);
        System.out.println("rondas ganadas por Dado 2: " + ganadasDado2);

        if (ganadasDado1 > ganadasDado2) {
            System.out.println("dado 1 es el ganador general");
        } else if (ganadasDado1 < ganadasDado2) {
            System.out.println("dado 2 es el ganador general");
        } else {
            System.out.println("empate general");
        }
    }
}