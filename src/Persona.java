import java.util.*;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> perrosAdoptados = new ArrayList<>();

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getDocumento() {
        return documento;
    }

    public boolean adoptarPerro(Perro perro) {
        if (perrosAdoptados.size() < 3) {
            perrosAdoptados.add(perro);
            return true;
        }
        return false;
    }

    public Perro perroMasViejo() {
        return perrosAdoptados.stream()
                .max((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()))
                .orElse(null);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre).append(" ").append(apellido)
                .append("\nDocumento: ").append(documento)
                .append("\nEdad: ").append(edad)
                .append("\nPerros adoptados:");
        if (perrosAdoptados.isEmpty()) {
            sb.append(" Ninguno");
        } else {
            perrosAdoptados.forEach(p -> sb.append("\n - ").append(p));
        }
        return sb.toString();
    }
}
