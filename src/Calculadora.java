public class Calculadora {

    // atributos
    private int numero1;
    private int numero2;

    // constructor vacio
    public Calculadora() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    // constructor con todos los parametros
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // getter y setter
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // toString
    @Override
    public String toString() {
        return "Calculadora{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }
}