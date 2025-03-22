public class EmpleadoPorHoras extends Empleado {
    private double pagoPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras() {}

    public EmpleadoPorHoras(String nombre, int edad, double pagoPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return pagoPorHora * horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Empleado por Horas";
    }
}