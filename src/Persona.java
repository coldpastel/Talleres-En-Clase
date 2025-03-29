public abstract class Persona {

    private String cedula;
    private int anioNacimiento;
    private String nombre;

    public void ingresar (){
        System.out.println("ingreso: "+nombre);
    }

    public void salir (){
        System.out.println("salio: "+nombre);
    }

    public Persona(String nombre, int nacimiento, String cedula) {
        this.nombre = nombre;
        this.anioNacimiento = nacimiento;
        this.cedula = cedula;
    }

    public int calcularEdad(){
        int edad=(2025-anioNacimiento);
        System.out.println(edad);
        return edad;


    }
}
