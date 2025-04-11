public class Laptop extends Producto {
    private String procesador;
    private String memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int stock, String procesador, String ram) {
        super(nombre, marca, precio, stock);
        this.procesador = procesador;
        this.memoriaRAM = ram;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + " | Marca: " + marca);
        System.out.println("Procesador: " + procesador + ", RAM: " + memoriaRAM);
        System.out.println("Precio: $" + precio + " | Stock: " + cantidadStock);
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = cantidad * precio;
        return (cantidad > 5) ? total * 0.90 : total; // 10% descuento
    }
}