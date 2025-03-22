import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void ejecutar() {
        int opcion;
        do {
            System.out.println("menu gestion de empleados-");
            System.out.println("1. Registrar Empleado de Planta");
            System.out.println("2. Registrar Empleado por Horas");
            System.out.println("3. Mostrar Informacion de Empleados");
            System.out.println("4. Buscar Empleado por Nombre");
            System.out.println("5. Eliminar Empleado por Nombre");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> registrarEmpleadoPlanta();
                case 2 -> registrarEmpleadoPorHoras();
                case 3 -> mostrarEmpleados();
                case 4 -> buscarEmpleadoPorNombre();
                case 5 -> eliminarEmpleadoPorNombre();
                case 6 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion no valida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private void registrarEmpleadoPlanta() {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        double salarioFijo = 2100000;
        empleados.add(new EmpleadoPlanta(nombre, edad, salarioFijo));
        System.out.println("Empleado de planta registrado exitosamente.");
    }

    private void registrarEmpleadoPorHoras() {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        double pagoPorHora = 98000;
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        empleados.add(new EmpleadoPorHoras(nombre, edad, pagoPorHora, horasTrabajadas));
        System.out.println("Empleado por horas registrado exitosamente.");
    }

    private void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Listado de Empleados");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    private void buscarEmpleadoPorNombre() {
        System.out.print("Ingrese el nombre del empleado a buscar: ");
        String nombre = scanner.next();
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Empleado encontrado: " + empleado);
                return;
            }
        }
        System.out.println("No se encontro ningun empleado con ese nombre.");
    }

    private void eliminarEmpleadoPorNombre() {
        System.out.print("Ingrese el nombre del empleado a eliminar: ");
        String nombre = scanner.next();
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                empleados.remove(empleado);
                System.out.println("Empleado eliminado exitosamente.");
                return;
            }
        }
        System.out.println("No se encontro ningun empleado con ese nombre.");
    }
}