public class Estudiante extends Persona {

    String codigo;

    public Estudiante(String nombre, String cedula, int edad, String codigo) {
        super(nombre, cedula, edad);
        this.codigo = codigo;
    }

    public void imprimirComoEstudiante() {
        super.imprimir();
        System.out.println("Código: " + this.codigo);
    }
}


