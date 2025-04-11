public abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStock;

    public Producto(String nombre, String marca, double precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStock = stock;
    }

    public abstract void mostrarDetalles();
    public abstract double calcularPrecioVenta(int cantidad);

    public String getNombre() { return nombre; }
    public int getCantidadStock() { return cantidadStock; }
    public void setCantidadStock(int stock) { this.cantidadStock = stock; }
}