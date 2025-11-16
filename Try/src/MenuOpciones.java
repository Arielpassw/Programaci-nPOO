import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println(" MENÚ PRINCIPAL ");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Consultar saldo");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");

        try {
            opcion = Integer.parseInt(scanner.nextLine()); // convierte texto a número

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido Registrar cliente.");
                    break;
                case 2:
                    System.out.println("Has elegido Consultar saldo.");
                    break;
                case 3:
                    System.out.println("Has elegido Retirar dinero.");
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println(" Opción no válida. Intente nuevamente.");
            }

        } catch (NumberFormatException e) {
            System.out.println(" Error: Debe ingresar un número válido (1–4).");
        }
    }
}
