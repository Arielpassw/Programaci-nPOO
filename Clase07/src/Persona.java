public class Persona {

    String cedula;
    String nombre;
    int edad;

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.cedula);
        System.out.println("Edad: " + this.edad);
    }
}



