



public class CandidataEstudiante extends Candidata {

    // Atributos
    private String universidad ;
    private String carrera;

    public CandidataEstudiante(int id, String nombre, int edad, String distrito, double punjeJurado, String carrera, String universidad) {
        super(id, nombre, edad, distrito, punjeJurado);
        this.carrera = carrera;
        this.universidad = universidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setUniversidad(String universidad) throws DatosInvalidoException {
        if (universidad == null || universidad.trim().isEmpty())  {
            throw new DatosInvalidoException("El universidad es obligatorio");
        }
        this.universidad = universidad;
    }

    public void setCarrera(String carrera) throws DatosInvalidoException {
        if (carrera == null || carrera.trim().isEmpty())  {
            throw new DatosInvalidoException("El carrera es obligatorio");
        }
        this.carrera = carrera;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + id + " | Estudiante: " + nombre + " | Edad: " + edad +
                " | Universidad: " + universidad);
    }
}
