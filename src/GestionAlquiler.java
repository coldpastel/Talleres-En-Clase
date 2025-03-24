import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlquiler {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void ejecutar() {
        int opcion;
        do {
            System.out.println("Menu de gestion de alquiler");
            System.out.println("1. Registrar nuevo vehiculo");
            System.out.println("2. Registrar nuevo cliente");
            System.out.println("3. Realizar un alquiler");
            System.out.println("4. Mostrar vehiculos disponibles");
            System.out.println("5. Registrar devolucion de vehiculo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> registrarVehiculo();
                case 2 -> registrarCliente();
                case 3 -> realizarAlquiler();
                case 4 -> mostrarVehiculosDisponibles();
                case 5 -> registrarDevolucion();
                case 6 -> System.out.println("Saliendo del sistema");
                default -> System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private void registrarVehiculo() {
        System.out.print("Ingrese el tipo de vehiculo (1: Auto, 2: Camioneta): ");
        int tipo = scanner.nextInt();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.next();
        System.out.print("Ingrese el modelo: ");
        String modelo = scanner.next();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();
        System.out.print("Ingrese el precio por dia: ");
        double precioPorDia = scanner.nextDouble();

        if (tipo == 1) {
            System.out.print("Ingrese el numero de puertas: ");
            int puertas = scanner.nextInt();
            vehiculos.add(new Auto(marca, modelo, año, precioPorDia, puertas));
        } else if (tipo == 2) {
            System.out.print("Ingrese la capacidad de carga (kg): ");
            double capacidad = scanner.nextDouble();
            vehiculos.add(new Camioneta(marca, modelo, año, precioPorDia, capacidad));
        } else {
            System.out.println("Tipo de vehiculo no valido.");
        }
        System.out.println("Vehiculo registrado exitosamente.");
    }

    private void registrarCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la cedula: ");
        String cedula = scanner.next();
        System.out.print("Ingrese el numero de licencia: ");
        String licencia = scanner.next();
        clientes.add(new Cliente(nombre, cedula, licencia));
        System.out.println("Cliente registrado exitosamente.");
    }

    private void realizarAlquiler() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.next();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = scanner.next();
        System.out.print("Ingrese la cantidad de dias: ");
        int dias = scanner.nextInt();

        Cliente cliente = buscarCliente(nombreCliente);
        Vehiculo vehiculo = buscarVehiculo(marca, modelo);

        if (cliente != null && vehiculo != null && vehiculo.isDisponible()) {
            double costo = vehiculo.calcularCostoAlquiler(dias);
            vehiculo.setDisponible(false);
            System.out.println("Alquiler realizado. Costo total: $" + costo);
        } else {
            System.out.println("No se pudo realizar el alquiler. Verifique los datos.");
        }
    }

    private void mostrarVehiculosDisponibles() {
        System.out.println("\n--- Vehiculos Disponibles ---");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.isDisponible()) {
                System.out.println(vehiculo);
            }
        }
    }

    private void registrarDevolucion() {
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.next();
        System.out.print("Ingrese el modelo del vehiculo: ");
        String modelo = scanner.next();

        Vehiculo vehiculo = buscarVehiculo(marca, modelo);
        if (vehiculo != null && !vehiculo.isDisponible()) {
            vehiculo.setDisponible(true);
            System.out.println("Devolucion registrada. Vehiculo disponible nuevamente.");
        } else {
            System.out.println("No se pudo registrar la devolucion. Verifique los datos.");
        }
    }

    private Cliente buscarCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    private Vehiculo buscarVehiculo(String marca, String modelo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marca) && vehiculo.getModelo().equalsIgnoreCase(modelo)) {
                return vehiculo;
            }
        }
        return null;
    }
}