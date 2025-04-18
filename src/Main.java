import java.util.*;

public class Main {
    private static List<Persona> personas = new ArrayList<>();
    private static List<Perro> disponibles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> registrarPersona();
                case 2 -> registrarPerro();
                case 3 -> verPersonas();
                case 4 -> verPerrosDisponibles();
                case 5 -> adoptarPerro();
                case 6 -> consultarPerroMasViejo();
                case 7 -> System.out.println("Adiós");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 7);
    }

    private static void mostrarMenu() {
        System.out.println("Menú de Adopción");
        System.out.println("1. Registrar persona");
        System.out.println("2. Registrar perro");
        System.out.println("3. Ver personas registradas");
        System.out.println("4. Ver perros disponibles");
        System.out.println("5. Adoptar perro");
        System.out.println("6. Consultar perro más viejo adoptado");
        System.out.println("7. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void registrarPersona() {
        System.out.print("Documento: ");
        String doc = scanner.nextLine();
        boolean existe = personas.stream()
                .anyMatch(p -> p.getDocumento().equals(doc));
        if (existe) {
            System.out.println("La persona ya está registrada");
            return;
        }
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        personas.add(new Persona(nombre, apellido, edad, doc));
        System.out.println("Persona registrada");
    }

    private static void registrarPerro() {
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        boolean existe = disponibles.stream()
                .anyMatch(p -> p.getPlaca().equals(placa));
        if (existe) {
            System.out.println("El perro ya está registrado");
            return;
        }
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Raza: ");
        String raza = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Tamaño: ");
        String tamano = scanner.nextLine();
        disponibles.add(new Perro(placa, nombre, raza, edad, tamano));
        System.out.println("Perro registrado");
    }

    private static void verPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas");
        } else {
            personas.forEach(System.out::println);
        }
    }

    private static void verPerrosDisponibles() {
        if (disponibles.isEmpty()) {
            System.out.println("No hay perros disponibles");
        } else {
            disponibles.forEach(System.out::println);
        }
    }

    private static void adoptarPerro() {
        System.out.print("Documento de persona: ");
        String doc = scanner.nextLine();
        Optional<Persona> optPersona = personas.stream()
                .filter(p -> p.getDocumento().equals(doc))
                .findFirst();
        if (optPersona.isEmpty()) {
            System.out.println("Persona no encontrada");
            return;
        }
        if (disponibles.isEmpty()) {
            System.out.println("No hay perros disponibles");
            return;
        }
        System.out.print("Placa del perro: ");
        String placa = scanner.nextLine();
        Optional<Perro> optPerro = disponibles.stream()
                .filter(p -> p.getPlaca().equals(placa))
                .findFirst();
        if (optPerro.isEmpty()) {
            System.out.println("Perro no encontrado");
            return;
        }
        Persona persona = optPersona.get();
        Perro perro = optPerro.get();
        if (persona.adoptarPerro(perro)) {
            disponibles.remove(perro);
            System.out.println("Adopción exitosa");
        } else {
            System.out.println("Límite de 3 perros alcanzado");
        }
    }

    private static void consultarPerroMasViejo() {
        System.out.print("Documento de persona: ");
        String doc = scanner.nextLine();
        personas.stream()
                .filter(p -> p.getDocumento().equals(doc))
                .findFirst()
                .ifPresentOrElse(
                        p -> {
                            Perro viejo = p.perroMasViejo();
                            System.out.println(viejo != null
                                    ? "Perro más viejo: " + viejo
                                    : "No ha adoptado perros");
                        },
                        () -> System.out.println("Persona no encontrada")
                );
    }
}
