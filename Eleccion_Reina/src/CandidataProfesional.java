
public class CandidataProfesional extends Candidata {

    // Atributos
    private String profesion;
    private int añosExperiencia;

    public CandidataProfesional(int id, String nombre, int edad, String distrito, double punjeJurado, String profesion, int añosExperiencia) {
        super(id, nombre, edad, distrito, punjeJurado);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setProfesion(String profesion) throws DatosInvalidoException {
        if (profesion == null || profesion.trim().isEmpty())  {
            throw new DatosInvalidoException("El profesion es obligatorio");
        }
        this.profesion = profesion;
    }

    public void setAñosExperiencia(int añosExperiencia) throws DatosInvalidoException {
        if (añosExperiencia <=2){
            throw new DatosInvalidoException("La experiencia minina es de dos años");
        }
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + id + " | Profesional: " + nombre + " | Edad: " + edad +
                " | Profesión: " + profesion);
    }
}
