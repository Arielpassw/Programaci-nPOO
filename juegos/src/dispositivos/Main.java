package dispositivos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dispositivo> lista = new ArrayList<>();

        try {
            lista.add(new Laptop("Lenovo", "ThinkPad X1", 1200.50, 16));
            lista.add(new Telefono("Samsung", "Galaxy S22", 899.99, "Android"));

            // Prueba con error para ver excepción
            lista.add(new Telefono("", "iPhone 15", 1500, "iOS"));
        }
        catch (DatoInvalidoException e) {
            System.out.println(" Error al crear dispositivo: " + e.getMessage());
        }

        System.out.println("\n LISTA DE DISPOSITIVOS ");
        for (Dispositivo d : lista) {
            d.mostrarInfo();  // POLIMORFISMO
        }
    }
}
