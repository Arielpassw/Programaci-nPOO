package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionPrecios {

    public static void ingresarPrecio(ArrayList<Double> precios) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio: ");

        try {
            double precio = sc.nextDouble();
            if (precio > 0) {
                precios.add(precio);
                System.out.println("Precio registrado correctamente.");
            } else {
                System.out.println("El precio debe ser mayor a 0.");
            }
        } catch (Exception e) {
            System.out.println("Valor inválido. Debe ingresar un número.");
        }
    }

    public static void mostrarPrecios(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No existen precios registrados.");
        } else {
            System.out.println("LISTA DE PRECIOS:");
            for (double p : precios) {
                System.out.println("• $" + p);
            }
        }
    }

    public static void precioMasAlto(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No hay precios registrados.");
            return;
        }

        double max = precios.get(0);
        for (double p : precios) {
            if (p > max) {
                max = p;
            }
        }

        System.out.println("El precio más alto es: $" + max);
    }

    public static void precioMasBajo(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No hay precios registrados.");
            return;
        }

        double min = precios.get(0);
        for (double p : precios) {
            if (p < min) {
                min = p;
            }
        }

        System.out.println("El precio más bajo es: $" + min);
    }

    public static void precioIguales(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No hay precios registrados.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio a comparar: ");
        double valor = sc.nextDouble();

        boolean encontrado = false;

        for (double p : precios) {
            if (p == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Sí existen precios iguales a $" + valor);
        } else {
            System.out.println("No existen precios iguales a $" + valor);
        }
    }

    public static void buscarPrecio(ArrayList<Double> precios) {
        if (precios.isEmpty()) {
            System.out.println("No hay precios registrados.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio a buscar: ");
        double valor = sc.nextDouble();

        if (precios.contains(valor)) {
            System.out.println("El precio $" + valor + " SÍ se encuentra en la lista.");
        } else {
            System.out.println("El precio $" + valor + " NO se encuentra.");
        }
    }
}
