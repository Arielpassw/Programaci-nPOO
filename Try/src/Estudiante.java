public class Estudiante {

    private String nombre;
    private int edad;

    // Constructor con validaciones
    public Estudiante(String nombre, int edad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(" El nombre no puede estar vacío.");
        }

        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException(" La edad debe estar entre 0 y 120 años.");
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para mostrar información
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Programa principal (main)
    public static void main(String[] args) {
        try {
            // 🔹 Caso correcto
            Estudiante e1 = new Estudiante("Ariel", 20);
            e1.mostrarDatos();

            // 🔹 Caso nombre vacío (provoca excepción)
            Estudiante e2 = new Estudiante("", 25);

            // 🔹 Caso edad inválida (provoca excepción)
            Estudiante e3 = new Estudiante("Lucía", 150);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
