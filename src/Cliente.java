import java.util.*;

public class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> compras = new ArrayList<>();

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                compras.add(producto);
            }
            producto.setCantidadStock(producto.getCantidadStock() - cantidad);
        } else {
            System.out.println("No hay suficiente stock de: " + producto.getNombre());
        }
    }

    public void mostrarCompra() {
        Map<Producto, Integer> resumen = new HashMap<>();
        double totalGeneral = 0;

        for (Producto p : compras) {
            resumen.put(p, resumen.getOrDefault(p, 0) + 1);
        }

        System.out.println("\nResumen de compra para: " + nombre);
        for (Map.Entry<Producto, Integer> entrada : resumen.entrySet()) {
            Producto p = entrada.getKey();
            int cantidad = entrada.getValue();
            double total = p.calcularPrecioVenta(cantidad);

            p.mostrarDetalles();
            System.out.println("Cantidad comprada: " + cantidad);
            System.out.println("Total: $" + String.format("%.2f", total) + "\n");
            totalGeneral += total;
        }
        System.out.println("Total a pagar: $" + String.format("%.2f", totalGeneral));
    }
}