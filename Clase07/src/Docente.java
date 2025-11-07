public class Docente extends Persona {

    String materias;

    public Docente(String nombre, String cedula, int edad, String materias) {
        super(nombre, cedula, edad);
        this.materias = materias;
    }

    public void imprimirComoDocente() {
        super.imprimir();
        System.out.println("Materia: " + this.materias);
    }
}

