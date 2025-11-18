package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Olimpiada olimpiada = new Olimpiada("Olimpiadas Internacionales", 2025);

        int opcion;

        do {
            System.out.println("\nMENÚ OLIMPIADAS");
            System.out.println("1. Registrar evento");
            System.out.println("2. Registrar participante en evento");
            System.out.println("3. Mostrar eventos");
            System.out.println("4. Mostrar participantes de un evento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese nombre del evento: ");
                    String nombreE = sc.nextLine();
                    System.out.print("Ingrese categoría del evento: ");
                    String cat = sc.nextLine();

                    olimpiada.agregarEvento(new Evento(nombreE, cat));
                    System.out.println("Evento registrado.");
                    break;

                case 2:
                    if (olimpiada.getEventos().isEmpty()) {
                        System.out.println("Primero debe registrar eventos.");
                        break;
                    }

                    olimpiada.listarEventos();
                    System.out.print("Ingrese el nombre del evento: ");
                    String eventoSel = sc.nextLine();

                    Evento encontrado = null;
                    for (Evento e : olimpiada.getEventos()) {
                        if (e.getNombre().equalsIgnoreCase(eventoSel)) {
                            encontrado = e;
                            break;
                        }
                    }

                    if (encontrado == null) {
                        System.out.println("Evento no encontrado.");
                        break;
                    }

                    try {
                        System.out.println("1. Registrar Atleta");
                        System.out.println("2. Registrar Equipo");
                        System.out.print("Seleccione: ");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nombre: ");
                        String nom = sc.nextLine();

                        System.out.print("País: ");
                        String pais = sc.nextLine();

                        if (tipo == 1) {
                            System.out.print("Deporte: ");
                            String dep = sc.nextLine();
                            encontrado.agregarParticipante(new Atleta(id, nom, pais, dep));

                        } else {
                            System.out.print("Integrantes del equipo: ");
                            int integ = sc.nextInt();
                            encontrado.agregarParticipante(new Equipo(id, nom, pais, integ));
                        }

                        System.out.println("Participante registrado.");

                    } catch (ExcepcionDatosInvalidos ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }

                    break;

                case 3:
                    olimpiada.listarEventos();
                    break;

                case 4:
                    System.out.print("Escriba el nombre del evento: ");
                    String ev = sc.nextLine();

                    Evento evBuscado = null;
                    for (Evento e : olimpiada.getEventos()) {
                        if (e.getNombre().equalsIgnoreCase(ev)) {
                            evBuscado = e;
                            break;
                        }
                    }

                    if (evBuscado != null)
                        evBuscado.listarParticipantes();
                    else
                        System.out.println("Evento no encontrado.");
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
