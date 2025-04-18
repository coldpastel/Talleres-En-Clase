public class Perro {
    private String placa;
    private String nombre;
    private String raza;
    private int edad;
    private String tamano;

    public Perro(String placa, String nombre, String raza, int edad, String tamano) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return String.format("Placa: %s | Nombre: %s | Raza: %s | Edad: %d | Tamaño: %s", placa, nombre, raza, edad, tamano);
    }
}
