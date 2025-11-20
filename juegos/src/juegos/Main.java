package juegos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Juego> listaJuegos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n SISTEMA DE REGISTRO DE JUEGOS ");
            System.out.println("1. Registrar Mario Bros");
            System.out.println("2. Registrar Juego de Carreras");
            System.out.println("3. Mostrar todos los juegos");
            System.out.println("4. Buscar juego por nombre");
            System.out.println("5. Filtrar por tipo de juego");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1 -> registrarMario();
                case 2 -> registrarCarrera();
                case 3 -> mostrarTodos();
                case 4 -> buscarPorNombre();
                case 5 -> filtrarPorTipo();
                case 6 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 6);
    }

    // REGISTROS

    private static void registrarMario() {
        try {
            System.out.print("Nombre del juego: ");
            String nombre = leerTexto();

            System.out.print("Año de lanzamiento: ");
            int anio = leerPositivo();

            System.out.print("Mundo del juego: ");
            String mundo = leerTexto();

            listaJuegos.add(new MarioBros(nombre, anio, mundo));
            System.out.println("✔ Mario Bros registrado correctamente.");

        } catch (DatosInvalidosException e) {
            System.out.println("error " + e.getMessage());
        }
    }

    private static void registrarCarrera() {
        try {
            System.out.print("Nombre del juego: ");
            String nombre = leerTexto();

            System.out.print("Año de lanzamiento: ");
            int anio = leerPositivo();

            System.out.print("Número de vehículos: ");
            int vehiculos = leerPositivo();

            listaJuegos.add(new CarreraVehiculos(nombre, anio, vehiculos));
            System.out.println("✔ Juego de Carreras registrado correctamente.");

        } catch (DatosInvalidosException e) {
            System.out.println("error " + e.getMessage());
        }
    }

    //  MOSTRAR

    private static void mostrarTodos() {
        if (listaJuegos.isEmpty()) {
            System.out.println("No hay juegos registrados.");
            return;
        }

        System.out.println("\n LISTA DE JUEGOS REGISTRADOS ");
        for (Juego j : listaJuegos) {
            j.mostrarDetalles();
        }
    }

    //  BUSCAR

    private static void buscarPorNombre() {
        if (listaJuegos.isEmpty()) {
            System.out.println("Aún no hay juegos registrados.");
            return;
        }

        try {
            System.out.print("Ingrese el nombre a buscar: ");
            String nombre = leerTexto().toLowerCase();

            boolean encontrado = false;

            for (Juego j : listaJuegos) {
                if (j.getNombre().toLowerCase().contains(nombre)) {
                    j.mostrarDetalles();
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontraron juegos con ese nombre.");
            }

        } catch (DatosInvalidosException e) {
            System.out.println("error " + e.getMessage());
        }
    }

    // FILTRAR

    private static void filtrarPorTipo() {
        System.out.println("Filtrar por:");
        System.out.println("1. Mario Bros");
        System.out.println("2. Juegos de Carreras");
        System.out.print("Opción: ");
        int tipo = leerEntero();

        boolean encontrado = false;

        for (Juego j : listaJuegos) {
            if (tipo == 1 && j instanceof MarioBros) {
                j.mostrarDetalles();
                encontrado = true;
            }
            if (tipo == 2 && j instanceof CarreraVehiculos) {
                j.mostrarDetalles();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay juegos del tipo seleccionado.");
        }
    }

    //  VALIDACIONES

    private static String leerTexto() throws DatosInvalidosException {
        String texto = sc.nextLine().trim();
        if (texto.isEmpty()) {
            throw new DatosInvalidosException("El texto no puede estar vacío.");
        }
        return texto;
    }

    private static int leerEntero() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }

    private static int leerPositivo() throws DatosInvalidosException {
        try {
            int n = Integer.parseInt(sc.nextLine());
            if (n <= 0) throw new DatosInvalidosException("Debe ser un número positivo.");
            return n;
        } catch (NumberFormatException e) {
            throw new DatosInvalidosException("Debe ingresar un número válido.");
        }
    }
}
