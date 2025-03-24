public class Camioneta extends Vehiculo {
    private double capacidadCarga;

    public Camioneta(String marca, String modelo, int año, double precioPorDia, double capacidadCarga) {
        super(marca, modelo, año, precioPorDia);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Camioneta, Capacidad de Carga: " + capacidadCarga + " kg";
    }
}