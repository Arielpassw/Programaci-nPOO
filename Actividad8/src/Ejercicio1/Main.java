package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precios = new ArrayList<>();

        int opcion;

        do {
            System.out.println("===== MENÚ DE PRECIOS INMOBILIARIOS =====");
            System.out.println("1. Ingresar precio");
            System.out.println("2. Mostrar todos los precios");
            System.out.println("3. Mostrar precio más alto");
            System.out.println("4. Mostrar precio más bajo");
            System.out.println("5. Mostrar precios iguales");
            System.out.println("6. Buscar un precio");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    GestionPrecios.ingresarPrecio(precios);
                    break;

                case 2:
                    GestionPrecios.mostrarPrecios(precios);
                    break;

                case 3:
                    GestionPrecios.precioMasAlto(precios);
                    break;

                case 4:
                    GestionPrecios.precioMasBajo(precios);
                    break;

                case 5:
                    GestionPrecios.precioIguales(precios);
                    break;

                case 6:
                    GestionPrecios.buscarPrecio(precios);
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();

        } while (opcion != 7);

        sc.close();
    }
}
