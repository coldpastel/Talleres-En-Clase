public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String marca, String modelo, int año, double precioPorDia, int numeroPuertas) {
        super(marca, modelo, año, precioPorDia);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Auto, Puertas: " + numeroPuertas;
    }
}