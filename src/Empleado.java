import java.util.Scanner;

public class Empleado extends Persona{

    private int salarioEmpleado;
    private int horario;

    public void vender() {
        System.out.println("Registro Venta");
    }

    public void registrarProducto() {
        System.out.println("Registrar Producto");
    }

    public void eliminarProducto() {
        System.out.println("Eliminar Producto");
    }

    public Empleado(String nombre, int nacimiento, String cedula, int horario, int salarioEmpleado) {
        super(nombre, nacimiento, cedula);
        this.horario = horario;
        this.salarioEmpleado = salarioEmpleado;
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
