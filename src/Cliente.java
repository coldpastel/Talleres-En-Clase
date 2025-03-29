public class Cliente extends Persona{
    private int puntos;
    private int cuenta;

    public void pagar(){
        System.out.println("Pago con la cuenta: "+cuenta);
    }

    public void devolver() {
        System.out.println("Solicitar Devolucion");
    }

    public Cliente(String nombre, int nacimiento, String cedula, int cuenta, int puntos) {
        super(nombre, nacimiento, cedula);
        this.cuenta = cuenta;
        this.puntos = puntos;
    }

    @Override
    public void ingresar() {
        super.ingresar();
    }

    @Override
    public void salir() {
        super.salir();
    }

    @Override
    public int calcularEdad() {
        return super.calcularEdad();
    }
}
