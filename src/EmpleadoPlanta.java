public class EmpleadoPlanta extends Empleado {
    private double salarioFijo;

    public EmpleadoPlanta() {}

    public EmpleadoPlanta(String nombre, int edad, double salarioFijo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salarioFijo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Empleado de Planta";
    }
}