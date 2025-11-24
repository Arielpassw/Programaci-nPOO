import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        SistemaCandidatas sistema = new SistemaCandidatas();

        int opcion;

        do {
            System.out.println("\n MENÚ REINA DE QUITO ");
            System.out.println("1. Registrar candidata");
            System.out.println("2. Listar todas");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Buscar por nombre");
            System.out.println("5. Filtrar por tipo");
            System.out.println("6. Filtrar por distrito");
            System.out.println("7. Registrar voto manual");
            System.out.println("8. Simular votos");
            System.out.println("9. Mostrar resultados y ganadora");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // limpiar buffer

            switch (opcion) {

                // 1. REGISTRAR CANDIDATA
                case 1:
                    System.out.println("\n--- Registrar Candidata ---");

                    System.out.print("ID: ");
                    int id = leer.nextInt();
                    leer.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = leer.nextLine();

                    System.out.print("Edad: ");
                    int edad = leer.nextInt();
                    leer.nextLine();

                    System.out.print("Distrito: ");
                    String distrito = leer.nextLine();

                    System.out.print("Puntaje del Jurado (0 - 100): ");
                    double puntaje = leer.nextDouble();
                    leer.nextLine();

                    System.out.println("Tipo de candidata:");
                    System.out.println("1. Estudiante");
                    System.out.println("2. Profesional");
                    System.out.print("Seleccione: ");
                    int tipo = leer.nextInt();
                    leer.nextLine();

                    if (tipo == 1) {

                        System.out.print("Universidad: ");
                        String uni = leer.nextLine();

                        System.out.print("Carrera: ");
                        String carrera = leer.nextLine();

                        // Constructor corregido
                        sistema.registrar(
                                new CandidataEstudiante(id, nombre, edad, distrito, puntaje, uni, carrera)
                        );

                    } else if (tipo == 2) {

                        System.out.print("Profesión: ");
                        String profesion = leer.nextLine();

                        System.out.print("Años de experiencia: ");
                        int exp = leer.nextInt();
                        leer.nextLine();

                        sistema.registrar(
                                new CandidataProfesional(id, nombre, edad, distrito,puntaje, profesion,exp)
                        );

                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                // 2. LISTAR
                case 2:
                    sistema.listar();
                    break;

                // 3. BUSCAR POR ID
                case 3:
                    System.out.print("Ingrese el ID: ");
                    int idBus = leer.nextInt();
                    Candidata encontrada = sistema.buscarPorId(idBus);

                    if (encontrada != null) {
                        encontrada.mostrarDetalles();
                    } else {
                        System.out.println("Candidata no encontrada.");
                    }
                    break;

                // 4. BUSCAR POR NOMBRE
                case 4:
                    System.out.print("Ingrese el nombre: ");
                    String nombreBus = leer.nextLine();
                    sistema.buscarPorNombre(nombreBus);
                    break;

                // 5. FILTRAR POR TIPO
                case 5:
                    System.out.print("Tipo (CandidataEstudiante / CandidataProfesional): ");
                    String tipoFiltro = leer.nextLine();
                    sistema.filtrarPorTipo(tipoFiltro);
                    break;

                // 6. FILTRAR POR DISTRITO
                case 6:
                    System.out.print("Ingrese distrito: ");
                    String dis = leer.nextLine();
                    sistema.filtrarPorDistrito(dis);  // método correcto
                    break;

                // 7. VOTAR MANUAL
                case 7:
                    System.out.print("ID candidata a votar: ");
                    int idV = leer.nextInt();
                    sistema.registrarVoto(idV);
                    break;

                // 8. SIMULAR VOTOS
                case 8:
                    sistema.importarVotosDeEjemplo();
                    break;

                // 9. MOSTRAR GANADORA
                case 9:
                    sistema.mostrarGanadora();
                    break;

                // 10. SALIR
                case 10:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 10);
    }
}
