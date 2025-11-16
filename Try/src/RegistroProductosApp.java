import java.util.Scanner;

public class RegistroProductosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroProductos registro = new RegistroProductos();
        int opcion = 0;

        do {
            System.out.println("\n MENÚ DE PRODUCTOS ");
            System.out.println("1. Registrar producto nacional");
            System.out.println("2. Registrar producto importado");
            System.out.println("3. Mostrar lista de productos");
            System.out.println("4. Calcular promedio de precios finales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        registrarProducto(sc, registro, true);
                        break;
                    case 2:
                        registrarProducto(sc, registro, false);
                        break;
                    case 3:
                        registro.mostrarLista();
                        break;
                    case 4:
                        registro.calcularPromedio();
                        break;
                    case 5:
                        System.out.println(" Saliendo del sistema...");
                        break;
                    default:
                        System.out.println(" Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.out.println(" Error: Debe ingresar un número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (DatosInvalidosException e) {
                System.out.println("" + e.getMessage());
            } catch (Exception e) {
                System.out.println(" Error inesperado: " + e.getMessage());
            }

        } while (opcion != 5);
    }

    // 🔹 Método auxiliar para registrar productos
    private static void registrarProducto(Scanner sc, RegistroProductos registro, boolean esNacional) {
        try {
            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio base: ");
            double precio = Double.parseDouble(sc.nextLine());

            Producto producto = esNacional
                    ? new ProductoNacional(codigo, nombre, precio)
                    : new ProductoImportado(codigo, nombre, precio);

            registro.agregarProducto(producto);
            System.out.println(" Producto registrado correctamente.");

        } catch (NumberFormatException e) {
            System.out.println(" Error: El precio debe ser un número válido.");
        }
    }
}
