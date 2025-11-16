import java.util.Scanner;

public class PrecioProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio = 0.0;

        try {
            System.out.print("Ingrese el precio del producto: ");
            precio = Double.parseDouble(scanner.nextLine()); // Convierte texto a número

            if (precio < 0) {
                System.out.println("Error: el precio no puede ser negativo.");
            } else {
                double iva = precio * 0.15;
                double total = precio + iva;

                System.out.println("Precio sin IVA: $" + precio);
                System.out.println("IVA (15%): $" + iva);
                System.out.println("Precio total con IVA: $" + total);
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un valor numérico válido.");
        }
    }
}
