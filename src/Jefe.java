public class Jefe extends Persona{

    public void contratar() {
        System.out.println("Contratar Empleado");
    }

    public void pagarSalarios() {
        System.out.println("Pagar Salarios");
    }

    public void despedirEmpleados() {
        System.out.println("Despedir Empleados");
    }

    public Jefe(String nombre, int nacimiento, String cedula) {
        super(nombre, nacimiento, cedula);
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
