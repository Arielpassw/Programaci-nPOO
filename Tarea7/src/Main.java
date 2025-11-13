import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente clienteRegistrado = null;

        // Empleados fijos
        Cajero cajero = new Cajero("Carlos", "1727736314", "Carcelen", "0984567321", "cajero", "1234");
        BalconServicios balcon = new BalconServicios("Maria", "1723845691", "La Prensa", "0968723145", "balcon", "2345");
        JefeAgencia jefe = new JefeAgencia("Ana", "1725673184", "Cumbayá", "0992347816", "jefe", "5432");

        int opcion = 0;

        do {
            System.out.println("\n MENÚ PRINCIPAL ");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Ingresar como Cliente");
            System.out.println("3. Ingresar como Empleado");
            System.out.println("4. Salir");

            try {
                System.out.print("Opción: ");
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(" Entrada inválida.");
                opcion = 0;
            }

            switch (opcion) {

                case 1 -> {
                    // Registrar cliente
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese cédula: ");
                    String cedula = scanner.nextLine();

                    System.out.print("Ingrese dirección: ");
                    String direccion = scanner.nextLine();

                    System.out.print("Ingrese teléfono: ");
                    String telefono = scanner.nextLine();

                    clienteRegistrado = new Cliente(nombre, cedula, direccion, telefono);

                    System.out.print("Ingrese tipo de cuenta (Ahorros / Corriente): ");
                    String tipoCuenta = scanner.nextLine();
                    clienteRegistrado.registrarCuenta(tipoCuenta);

                    System.out.println(" Cliente registrado correctamente.");
                }

                case 2 -> {
                    if (clienteRegistrado == null) {
                        System.out.println(" No hay cliente registrado.");
                    } else {
                        menuCliente(clienteRegistrado, scanner);
                    }
                }

                case 3 -> menuEmpleado(scanner, cajero, balcon, jefe, clienteRegistrado);

                case 4 -> System.out.println("Saliendo");

                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }


    //  SUBMENÚ CLIENTE
    public static void menuCliente(Cliente cliente, Scanner scanner) {

        int opcionCliente = 0;

        do {
            System.out.println("\n--- MENÚ CLIENTE ---");
            System.out.println("1. Ver resumen financiero");
            System.out.println("2. Solicitar préstamo");
            System.out.println("3. Volver");

            try {
                System.out.print("Opción: ");
                opcionCliente = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println(" Número inválido.");
                continue;
            }

            switch (opcionCliente) {
                case 1 -> cliente.verResumenFinanciero();

                case 2 -> {
                    System.out.print("Monto del préstamo: ");
                    double montoPrestamo = Double.parseDouble(scanner.nextLine());
                    cliente.solicitarPrestamo(montoPrestamo);
                }
            }

        } while (opcionCliente != 3);
    }


    //  SUBMENÚ EMPLEADO
    public static void menuEmpleado(
            Scanner scanner,
            Cajero cajero,
            BalconServicios balcon,
            JefeAgencia jefe,
            Cliente clienteActual
    ) {

        System.out.print("Usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Clave: ");
        String claveIngresada = scanner.nextLine();

        if (cajero.autenticarEmpleado(usuarioIngresado, claveIngresada)) {
            menuCajero(scanner, cajero, clienteActual);
        }
        else if (balcon.autenticarEmpleado(usuarioIngresado, claveIngresada)) {
            menuBalcon(scanner, balcon, clienteActual);
        }
        else if (jefe.autenticarEmpleado(usuarioIngresado, claveIngresada)) {
            menuJefe(scanner, jefe, clienteActual);
        }
        else {
            System.out.println(" Empleado no encontrado.");
        }
    }


    //  MENÚ CAJERO
    public static void menuCajero(Scanner scanner, Cajero cajero, Cliente clienteActual) {

        if (clienteActual == null) {
            System.out.println(" No hay cliente registrado.");
            return;
        }

        System.out.println("\n--- MENÚ CAJERO ---");
        System.out.print("Monto a depositar: ");
        double montoDeposito = Double.parseDouble(scanner.nextLine());
        cajero.procesarDeposito(clienteActual, montoDeposito);

        System.out.print("Monto a retirar: ");
        double montoRetiro = Double.parseDouble(scanner.nextLine());
        cajero.procesarRetiro(clienteActual, montoRetiro);
    }


    // MENÚ BALCÓN
    public static void menuBalcon(Scanner scanner, BalconServicios balcon, Cliente clienteActual) {

        if (clienteActual == null) {
            System.out.println(" No hay cliente registrado.");
            return;
        }

        System.out.println("\n--- MENÚ BALCÓN ---");
        balcon.actualizarDatosCliente(clienteActual);
    }


    // MENÚ JEFE DE AGENCIA
    public static void menuJefe(Scanner scanner, JefeAgencia jefe, Cliente clienteActual) {

        if (clienteActual == null) {
            System.out.println("No hay cliente registrado.");
            return;
        }

        System.out.println("\n--- MENÚ JEFE DE AGENCIA ---");
        System.out.print("Monto del préstamo: ");
        double montoPrestamo = Double.parseDouble(scanner.nextLine());

        jefe.aprobarPrestamo(clienteActual, montoPrestamo);
        jefe.generarReporteOperaciones();
    }
}
