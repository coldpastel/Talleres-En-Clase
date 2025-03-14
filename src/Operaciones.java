public class Operaciones {

    // metodo suma
    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    // metodo resta
    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    // metodo multiplicar
    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    // metodo dividir
    public double dividir(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return (double) numero1 / numero2;
    }

    // metodo para mostrar los resultados
    public void probarCalculadora() {

        Calculadora calc1 = new Calculadora();
        calc1.setNumero1(10);
        calc1.setNumero2(5);
        System.out.println("Calculadora 1: " + calc1.toString());


        System.out.println("Suma: " + sumar(calc1.getNumero1(), calc1.getNumero2()));
        System.out.println("Resta: " + restar(calc1.getNumero1(), calc1.getNumero2()));
        System.out.println("Multiplicación: " + multiplicar(calc1.getNumero1(), calc1.getNumero2()));
        System.out.println("División: " + dividir(calc1.getNumero1(), calc1.getNumero2()));


        Calculadora calc2 = new Calculadora(20, 4);
        System.out.println("\nCalculadora 2: " + calc2.toString());


        System.out.println("Suma: " + sumar(calc2.getNumero1(), calc2.getNumero2()));
        System.out.println("Resta: " + restar(calc2.getNumero1(), calc2.getNumero2()));
        System.out.println("Multiplicación: " + multiplicar(calc2.getNumero1(), calc2.getNumero2()));
        System.out.println("División: " + dividir(calc2.getNumero1(), calc2.getNumero2()));
    }
    
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        operaciones.probarCalculadora();
    }
}