import java.util.ArrayList;
import java.util.Scanner;

public class ControlGastos {
    private static ArrayList<CabinaTelefonica> cabinas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static String[] tiposLlamada = {"Local", "Larga distancia", "Celular"};

    public static void main(String[] args) {
        while(true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            procesarOpcion(opcion);
        }
    }

    private static void mostrarMenu() {
        System.out.println("CONTROL DE GASTOS CABINAS TELEFONICAS");
        System.out.println("1. Crear nueva cabina");
        System.out.println("2. Registrar llamada");
        System.out.println("3. Ver informe cabina");
        System.out.println("4. Informe general");
        System.out.println("5. Reiniciar cabina");
        System.out.println("6. Salir");
        System.out.println("Seleccione opcion: ");
    }

    private static void procesarOpcion(int opcion) {
        switch(opcion) {
            case 1 -> crearCabina();
            case 2 -> registrarLlamada();
            case 3 -> mostrarInformeCabina();
            case 4 -> mostrarInformeGeneral();
            case 5 -> reiniciarCabina();
            case 6 -> System.exit(0);
            default -> System.out.println("Opcion no valida!");
        }
    }

    private static void crearCabina() {
        cabinas.add(new CabinaTelefonica());
        System.out.println("Cabina creada, Total: " + cabinas.size());
    }

    private static void registrarLlamada() {
        if(cabinas.isEmpty()) {
            System.out.println("Error 404: No hay cabinas registradas");
            return;
        }

        CabinaTelefonica cabina = seleccionarCabina();
        int tipo = seleccionarTipoLlamada();

        if(tipo != -1) {
            cabina.registrarLlamada(tipo);
            System.out.println("Llamada registrada exitosamente");
        }
    }

    private static CabinaTelefonica seleccionarCabina() {
        System.out.print("Ingrese numero de cabina (1-" + cabinas.size() + "): ");
        return cabinas.get(scanner.nextInt() - 1);
    }

    private static int seleccionarTipoLlamada() {
        System.out.println("Tipos de llamada:");
        for(int i = 0; i < tiposLlamada.length; i++) {
            System.out.println((i + 1) + ". " + tiposLlamada[i]);
        }
        System.out.print("Seleccione tipo: ");
        int tipo = scanner.nextInt() - 1;

        if(tipo < 0 || tipo >= tiposLlamada.length) {
            System.out.println("Tipo invalido");
            return -1;
        }
        return tipo;
    }

    private static void mostrarInformeCabina() {
        CabinaTelefonica cabina = seleccionarCabina();
        System.out.println("INFORME CABINA");
        System.out.println("Local - Llamadas: " + cabina.getTotalLlamadas()[0] +
                ", Minutos: " + cabina.getTotalMinutos()[0] +
                ", Costo: $" + cabina.getTotalCostos()[0]);
        System.out.println("Larga distancia - Llamadas: " + cabina.getTotalLlamadas()[1] +
                ", Minutos: " + cabina.getTotalMinutos()[1] +
                ", Costo: $" + cabina.getTotalCostos()[1]);
        System.out.println("Celular - Llamadas: " + cabina.getTotalLlamadas()[2] +
                ", Minutos: " + cabina.getTotalMinutos()[2] +
                ", Costo: $" + cabina.getTotalCostos()[2]);
    }

    private static void mostrarInformeGeneral() {
        int[] totalLlamadas = new int[3];
        int[] totalMinutos = new int[3];
        int[] totalCostos = new int[3];

        for(CabinaTelefonica cabina : cabinas) {
            for(int i = 0; i < 3; i++) {
                totalLlamadas[i] += cabina.getTotalLlamadas()[i];
                totalMinutos[i] += cabina.getTotalMinutos()[i];
                totalCostos[i] += cabina.getTotalCostos()[i];
            }
        }

        System.out.println("INFORME GENERAL DE LAS CABINAS");
        System.out.println("Total llamadas locales: " + totalLlamadas[0] +
                " || Minutos: " + totalMinutos[0] +
                " || Costo total: $" + totalCostos[0]);
        System.out.println("Total llamadas larga distancia: " + totalLlamadas[1] +
                " || Minutos: " + totalMinutos[1] +
                " || Costo total: $" + totalCostos[1]);
        System.out.println("Total llamadas celulares: " + totalLlamadas[2] +
                " || Minutos: " + totalMinutos[2] +
                " || Costo total: $" + totalCostos[2]);
    }

    private static void reiniciarCabina() {
        CabinaTelefonica cabina = seleccionarCabina();
        cabina.reiniciar();
        System.out.println("Cabina reiniciada correctamente");
    }
}