package ec.gob.subsidio.modelo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Mostrar reglas del subsidio
        Solicitante.mostrarReglasSubsidio();

        // Ingreso de datos
        System.out.print("\nIngrese su nombre completo: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su cédula: ");
        String cedula = entrada.nextLine();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de vehículos registrados: ");
        int vehiculos = entrada.nextInt();

        System.out.print("¿Vive en Ecuador? (true/false): ");
        boolean vive = entrada.nextBoolean();

        // Crear objeto con el constructor sobrecargado
        Solicitante solicitante = new Solicitante(nombre, cedula, ingresos, vehiculos, vive);

        // Mostrar datos del solicitante
        System.out.println(solicitante.toString());

        // Mostrar resultado de la evaluación
        solicitante.generarResultado();

        // Calcular consumo mensual (sobrecarga de métodos)
        System.out.println("\n===== Cálculo de consumo mensual =====");
        double consumoNormal = solicitante.calcularConsumoMensual();
        double consumoExtra = solicitante.calcularConsumoMensual(80.0);

        System.out.println("Consumo mensual estimado (sin km extra): " + consumoNormal + " galones");
        System.out.println("Consumo con kilómetros extra (80 km adicionales): " + consumoExtra + " galones");
    }
}
