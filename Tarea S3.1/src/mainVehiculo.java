public class mainVehiculo {
    public static void main(String[] args) {
        // Crear vehículo
        Vehiculo v = new Vehiculo("Toyota", "Corolla", 180);

        // Acceso directo a atributo público
        System.out.println("Marca (acceso directo): " + v.marca);

        // Intento de leer codigoSeguridad (no permitido)
        // System.out.println(v.codigoSeguridad); // Esto da error

        // Modificar color con valor no permitido
        v.setColor("verde"); // Mensaje de error

        // Asignar color válido
        v.setColor("azul");

        // Asignar código de seguridad
        v.setCodigoSeguridad("ABC123");

        // Mostrar datos válidos
        System.out.println("\n=== Datos válidos del vehículo ===");
        v.mostrarDatos();

        // Leer velocidad máxima con get
        System.out.println("Velocidad máxima (solo lectura): " + v.getVelocidadMaxima());
    }
}
