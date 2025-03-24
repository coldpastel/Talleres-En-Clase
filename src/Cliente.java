public class Cliente {
    private String nombre;
    private String cedula;
    private String licencia;

    // Constructor
    public Cliente(String nombre, String cedula, String licencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getLicencia() {
        return licencia;
    }

    @Override
    public String toString() {
        return nombre + " (Cedula: " + cedula + ", Licencia: " + licencia + ")";
    }
}