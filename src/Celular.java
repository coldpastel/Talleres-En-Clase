public class Celular extends Producto {
    private int capacidadBateria;
    private String resolucionCamara;

    public Celular(String nombre, String marca, double precio, int stock, int bateria, String camara) {
        super(nombre, marca, precio, stock);
        this.capacidadBateria = bateria;
        this.resolucionCamara = camara;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular: " + nombre + " | Marca: " + marca);
        System.out.println("Batería: " + capacidadBateria + "mAh | Cámara: " + resolucionCamara);
        System.out.println("Precio: $" + precio + " | Stock: " + cantidadStock);
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = cantidad * precio;
        return (cantidad > 5) ? total * 0.95 : total; // 5% descuento
    }
}