public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Inspiron", "Dell", 1000, 10, "i7", "16GB");
        Celular celular = new Celular("Galaxy S20", "Samsung", 800, 15, 4000, "48MP");

        Cliente cliente1 = new Cliente("Juan", "juan@email.com");
        Cliente cliente2 = new Cliente("Maria", "maria@email.com");

        cliente1.comprarProducto(laptop, 3);
        cliente1.comprarProducto(celular, 6);
        cliente2.comprarProducto(laptop, 7);
        cliente2.comprarProducto(celular, 2);

        cliente1.mostrarCompra();
        cliente2.mostrarCompra();

        System.out.println("Inventario Actualizado:");
        laptop.mostrarDetalles();
        celular.mostrarDetalles();
    }
}