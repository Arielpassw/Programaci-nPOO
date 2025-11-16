package sistemaproductos;

import java.util.Scanner;

public class SistemaProductosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroProductos registro = new RegistroProductos();
        int opcion = 0;

        do {
            System.out.println("\n MENÚ DEL SISTEMA DE PRODUCTOS ");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        registrarProducto(sc, registro);
                        break;
                    case 2:
                        registro.mostrarProductos();
                        break;
                    case 3:
                        System.out.println(" Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }

            } catch (NumberFormatException e) {
                System.out.println(" Error: Debe ingresar un número válido en el menú.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(" Error inesperado: " + e.getMessage());
            }

        } while (opcion != 3);
    }

    // Método auxiliar para registrar productos
    private static void registrarProducto(Scanner sc, RegistroProductos registro) {
        try {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = Double.parseDouble(sc.nextLine());

            Producto producto = new Producto(nombre, precio);
            registro.registrarProducto(producto);

            System.out.println("Producto registrado correctamente.");

        } catch (NumberFormatException e) {
            System.out.println(" Error: El precio debe ser un número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(" Error inesperado: " + e.getMessage());
        }
    }
}
