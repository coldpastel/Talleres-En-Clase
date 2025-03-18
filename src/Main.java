import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        double monto;
        boolean estado = true;

        List<CuentaBancaria> lstBanco = new ArrayList<>();

        do {
            System.out.println("""
                    1. crear un cliente
                    2. mostrar
                    3. mostrar informacion de la cuenta especifica
                    4. depositar dinero
                    5. retirar dinero
                    6. mostrar datos de la cuenta
                    7. mostrar clientes desde la lista
                    8. salir
                    """);
            op = teclado.nextInt();
            switch (op) {

                case 1 -> {
                    // crear un nuevo objeto CuentaBancaria dentro del case 1
                    CuentaBancaria cl1 = new CuentaBancaria();

                    System.out.println("INGRESE NOMBRE DEL TITULAR");
                    cl1.setTitular(teclado.next());

                    System.out.println("INGRESE SALDO DE LA CUENTA");
                    cl1.setSaldo(teclado.nextDouble());

                    System.out.println("INGRESE NUMERO DE CUENTA");
                    cl1.setNumeroCuenta(teclado.next());

                    lstBanco.add(cl1);
                }

                case 2 -> {
                    for (CuentaBancaria cu : lstBanco) {
                        System.out.println(cu);
                    }
                }

                case 3 -> {
                    String nCuenta;
                    System.out.println("INGRESE SU NUMERO DE CUENTA");
                    nCuenta = teclado.next();
                    for (int i = 0; i < lstBanco.size(); i++) {
                        if (lstBanco.get(i).getNumeroCuenta().equalsIgnoreCase(nCuenta)) {
                            System.out.println(lstBanco.get(i));
                        }
                    }
                }

                case 4 -> {
                    // depositar dinero en una cuenta especifica
                    System.out.println("DEPOSITAR");
                    System.out.println("INGRESE EL NUMERO DE CUENTA");
                    String nCuenta = teclado.next();
                    CuentaBancaria cuenta = null;

                    // buscar la cuenta en la lista
                    for (CuentaBancaria cb : lstBanco) {
                        if (cb.getNumeroCuenta().equalsIgnoreCase(nCuenta)) {
                            cuenta = cb;
                            break;
                        }
                    }

                    if (cuenta != null) {
                        do {
                            System.out.println("¿Cuanto dinero desea depositar?");
                            monto = teclado.nextDouble();
                        } while (monto <= 0);
                        cuenta.depositarDinero(monto);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                }

                case 5 -> {
                    // retirar dinero de una cuenta especifica
                    System.out.println("RETIRAR");
                    System.out.println("INGRESE EL NUMERO DE CUENTA");
                    String nCuenta = teclado.next();
                    CuentaBancaria cuenta = null;

                    for (CuentaBancaria cb : lstBanco) {
                        if (cb.getNumeroCuenta().equalsIgnoreCase(nCuenta)) {
                            cuenta = cb;
                            break;
                        }
                    }

                    if (cuenta != null) {
                        do {
                            System.out.println("¿Cuanto dinero desea retirar?");
                            monto = teclado.nextDouble();
                            if (monto <= 0) {
                                System.out.println("No puede retirar una cantidad negativa.");
                            } else if (monto > cuenta.getSaldo()) {
                                System.out.println("No tiene suficiente saldo.");
                            } else {
                                cuenta.retirarDinero(monto);
                                break;
                            }
                        } while (true);
                    } else {
                        System.out.println("Cuenta no encontrada.");
                    }
                }

                case 6 -> {
                    System.out.println("MOSTRAR DATOS DE LA CUENTA");
                    if (!lstBanco.isEmpty()) {
                        lstBanco.get(0).mostrarInformacion();
                    } else {
                        System.out.println("No hay cuentas creadas.");
                    }
                }

                case 7 -> {
                    System.out.println("MOSTRAR DATOS DE LA CUENTA DESDE LAS LISTAS");
                    for (CuentaBancaria cb : lstBanco) {
                        cb.mostrarInformacion();
                    }
                }

                case 8 -> {
                    System.out.println("SALIR...");
                    estado = false;
                }

                default -> {
                    System.out.println("NO EXISTE OPCION");
                }
            }
        } while (estado);
    }
    /*
    Solucion
    1. Cree un nuevo objeto CuentaBancaria dentro del case 1 para evitar reutilizar el mismo objeto.
       Esto asegura que cada cuenta sea independiente y no se sobrescriban los datos.
    2. Añadi restricciones para evitar retiros negativos y retiros mayores al saldo disponible y montos invalidos
    3. Añadi la funcionalidad para buscar una cuenta específica por su numero y realizar depositos o retiros en ella.
       Esto hace que el sistema sea más flexible y realista.
    4. Edite los siguientes Case:
        case 1: crear un cliente.
        case 3: mostrar informacion de una cuenta especifica.
        case 4: depositar dinero en una cuenta especifica.
        case 5: retirar dinero de una cuenta especifica.
     */
}

