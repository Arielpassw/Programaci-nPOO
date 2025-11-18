package Ejercicio2;

public class Atleta extends Participante {

    private String deporte;

    public Atleta(int id, String nombre, String pais, String deporte)
            throws ExcepcionDatosInvalidos {
        super(id, nombre, pais);

        if (deporte == null || deporte.isEmpty())
            throw new ExcepcionDatosInvalidos("El deporte no puede estar vacío");

        this.deporte = deporte;
    }

    @Override
    public String mostrarTipo() {
        return "Atleta - Deporte: " + deporte;
    }
}
