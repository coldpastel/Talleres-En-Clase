public class Proveedor extends Persona {
    private int cantidadProducto;
    private String nombreEmpresa;

    public void Envio () {
        System.out.println("Envio del producto");
    }

    public void Entrega () {
        System.out.println("Entrega del surtido");
    }

    public void Pedido () {
        System.out.println("Toma De Pedido");
    }

    public Proveedor(String nombre, int nacimiento, String cedula, String nombreEmpresa, int cantidadProducto) {
        super(nombre, nacimiento, cedula);
        this.nombreEmpresa = nombreEmpresa;
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public int calcularEdad() {
        return super.calcularEdad();
    }

    @Override
    public void salir() {
        super.salir();
    }

    @Override
    public void ingresar() {
        super.ingresar();
    }
}
