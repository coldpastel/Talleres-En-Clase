import java.util.Random;
import java.util.Scanner;

public class Ejercicio_Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;

        while (continuar) {
            int num1 = random.nextInt (100) + 1;
            int num2 = random.nextInt (100) + 1;

            System.out.println("Numeros generados: " + num1 + " y " + num2);
            System.out.print("Ingrese el signo aritmetico entre +, -, *, /, ^, %): ");
            String signo = scanner.next();

            double resultado = 0;
            boolean operacionValida = true;

            switch (signo) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = (double) num1 / num2;
                    } else {
                        System.out.println("Syntax Error: No se puede dividir por cero.");
                        operacionValida = false;
                    }
                    break;
                case "^":
                    resultado = Math.pow(num1, num2);
                    break;
                case "%":
                    resultado = num1 % num2;
                    break;
                default:
                    System.out.println("Syntax Error (signos aritmeticos unicamente)");
                    operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }

            System.out.print("¿Desea realizar otra operacion? (1: si, 2: no): ");
            int opcion = scanner.nextInt();
            if (opcion != 1) {
                continuar = false;
            }
        }

        System.out.println("Calculadora Destruida");
        scanner.close();
    }
}
