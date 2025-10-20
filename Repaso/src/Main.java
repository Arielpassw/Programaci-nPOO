import artista.Artista;
import cancion.Cancion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------------------
        // PARTE 3: Crear artistas
        // ---------------------------

        // Artista con constructor con parámetros
        Artista artista1 = new Artista("Adele", "Pop", 5000000);
        System.out.println("Artista creado con constructor:");
        artista1.mostrarPerfil();

        // Artista con constructor vacío + Scanner
        Artista artista2 = new Artista();
        System.out.println("\nIngrese datos de un nuevo artista:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        while (nombre.isBlank()) {
            System.out.print("No puede estar vacío. Intente de nuevo: ");
            nombre = sc.nextLine();
        }
        artista2.setNombre(nombre);

        System.out.print("Género: ");
        String genero = sc.nextLine();
        while (genero.isBlank()) {
            System.out.print("No puede estar vacío. Intente de nuevo: ");
            genero = sc.nextLine();
        }
        artista2.setGenero(genero);

        System.out.print("Seguidores: ");
        while (!sc.hasNextInt()) {
            System.out.print("Número inválido. Intente de nuevo: ");
            sc.next();
        }
        int seguidores = sc.nextInt();
        while (seguidores < 0) {
            System.out.print("Debe ser positivo. Intente de nuevo: ");
            seguidores = sc.nextInt();
        }
        artista2.setSeguidores(seguidores);
        sc.nextLine(); // limpiar buffer

        System.out.println("\nArtista creado con Scanner:");
        artista2.mostrarPerfil();

        // ---------------------------
        // PARTE 4: Menú con métodos propios
        // ---------------------------

        Cancion cancion = null;
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Registrar canción");
            System.out.println("2. Aumentar seguidores del artista 2");
            System.out.println("3. Reproducir canción");
            System.out.println("4. Mostrar información general");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    cancion = new Cancion();
                    System.out.print("Título de la canción: ");
                    String titulo = sc.nextLine();
                    while (titulo.isBlank()) {
                        System.out.print("No puede estar vacío. Intente de nuevo: ");
                        titulo = sc.nextLine();
                    }
                    cancion.setTitulo(titulo);

                    System.out.print("Duración (minutos): ");
                    while (!sc.hasNextDouble()) {
                        System.out.print("Número inválido. Intente de nuevo: ");
                        sc.next();
                    }
                    double duracion = sc.nextDouble();
                    while (duracion <= 0) {
                        System.out.print("Debe ser mayor a 0. Intente de nuevo: ");
                        duracion = sc.nextDouble();
                    }
                    cancion.setDuracion(duracion);
                    sc.nextLine(); // limpiar buffer
                    cancion.setReproducciones(0);
                    System.out.println("Canción registrada correctamente!");
                    break;

                case 2:
                    System.out.print("Cantidad de seguidores a sumar: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Número inválido. Intente de nuevo: ");
                        sc.next();
                    }
                    int cant = sc.nextInt();
                    artista2.ganarSeguidores(cant);
                    sc.nextLine(); // limpiar buffer
                    break;

                case 3:
                    if (cancion != null) {
                        cancion.reproducir();
                    } else {
                        System.out.println("Primero registre una canción.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Artista 1 ---");
                    artista1.mostrarPerfil();
                    System.out.println("\n--- Artista 2 ---");
                    artista2.mostrarPerfil();
                    if (cancion != null)
                        System.out.println("Canción: " + cancion.getTitulo() +
                                ", Duración: " + cancion.getDuracion() +
                                " min, Reproducciones: " + cancion.getReproducciones());
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close(); // buena práctica
    }
}

