public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precioPorDia;
    protected boolean disponible;

    public Vehiculo(String marca, String modelo, int año, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precioPorDia = precioPorDia;
        this.disponible = true;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double calcularCostoAlquiler(int dias) {
        double costo = precioPorDia * dias;
        if (dias > 7) {
            costo *= 0.9; // Descuento del 10%
        }
        return costo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + año + ") - $" + precioPorDia + " por dia - " + (disponible ? "Disponible" : "No Disponible");
    }
}