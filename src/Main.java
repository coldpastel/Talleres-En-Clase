import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juan", 1982, "1056482428", 432658, 52);
        Cliente c2 = new Cliente("Erika", 1998, "52825170", 16251548, 845);
        Cliente c3 = new Cliente("Camilo", 2001, "16315464", 15654586, 290);

        Empleado e1 = new Empleado("Laura", 2004, "1011232313", 40, 1350000);
        Empleado e2 = new Empleado("Sebastian", 2003, "1056482404", 40, 1350000);
        Empleado e3 = new Empleado("Jonathan", 2000, "1074564849", 40, 1350000);

        Proveedor p1 = new Proveedor("Ramiro", 1979, "5282639", "Ramo", 54);

        Jefe j1 = new Jefe("Carlos", 1981, "7459156");

        Scanner menu = new Scanner(System.in);

            int opcion;
            do {
                System.out.println("MENU");
                System.out.println("1. cliente");
                System.out.println("2. empleado");
                System.out.println("3. jefe");
                System.out.println("4. proveedor");
                System.out.println("5. salir");
                System.out.println("ELEGIR OPCION:");
                opcion = menu.nextInt();

                switch (opcion) {
                    case 1 -> menuCliente(menu, c2);
                    case 2 -> menuEmpleado(menu, e1);
                    case 3 -> menuJefe(menu, j1);
                    case 4 -> menuProveedor(menu, p1);
                    case 5 -> System.out.println("Saliendo del sistema");
                    default -> System.out.println("Opcion Invalida, intente de nuevo");
                }
            }while (opcion != 5);
        }

    public static void menuCliente(Scanner menu, Cliente c1) {
        int opcion1 = 0;
        do {
            System.out.println("MENU CLIENTE");
            System.out.println("1. Pagar Cuenta");
            System.out.println("2. Devolver Producto");
            System.out.println("3. Salir");
            System.out.println("ELEGIR OPCION:");
            opcion1 = menu.nextInt();

            switch (opcion1) {
                case 1 -> c1.pagar();
                case 2 -> c1.devolver();
                case 3 -> c1.salir();
                default -> System.out.println("Opcion Invalida, intente de nuevo");
            }
        }while (opcion1 != 3);

    }

    public static void menuEmpleado(Scanner menuEmpleado, Empleado e1) {
        int opcion2 = 0;
        do{
        System.out.println("MENU EMPLEADO:");
        System.out.println("1. Vender Producto");
        System.out.println("2. Registrar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Salir");
        System.out.println("ELEGIR OPCION:");
        opcion2 = menuEmpleado.nextInt();

        switch (opcion2) {
            case 1 -> e1.vender();
            case 2 -> e1.registrarProducto();
            case 3 -> e1.eliminarProducto();
            case 4 -> e1.salir();
            default -> System.out.println("Opcion Invalida, intente de nuevo");
        }
        }while (opcion2 != 4);
    }

    public static void menuJefe(Scanner menuJefe, Jefe j1) {
        int opcion3 = 0;
        do{
        System.out.println("MENU JEFE:");
        System.out.println("1. Contratar Empleado");
        System.out.println("2. Despedir Empleado");
        System.out.println("3. Pagar Salario");
        System.out.println("4. Salir");
        System.out.println("ELEGIR OPCION:");
        opcion3 = menuJefe.nextInt();

        switch (opcion3) {
            case 1 -> j1.contratar();
            case 2 -> j1.despedirEmpleados();
            case 3 -> j1.pagarSalarios();
            case 4 -> j1.salir();
            default -> System.out.println("Opcion Invalida, intente de nuevo");
        }
        }while (opcion3 !=4);
    }

    public static void menuProveedor(Scanner menuProveedor, Proveedor p1) {
        int opcion4 = 0;
        do{
            System.out.println("MENU PROVEEDOR");
            System.out.println("1. Tomar el Pedido");
            System.out.println("2. Enviar el Producto");
            System.out.println("3. Entregar el Surtido");
            System.out.println("4. Salir");
            opcion4 = menuProveedor.nextInt();

            switch (opcion4) {
                case 1 -> p1.Pedido();
                case 2 -> p1.Envio();
                case 3 -> p1.Entrega();
                case 4 -> p1.salir();
                default -> System.out.println("Opcion Invalida, intente de nuevo");
            }
        }while (opcion4 !=4);
    }
}