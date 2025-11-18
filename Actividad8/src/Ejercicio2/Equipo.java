package Ejercicio2;

public class Equipo extends Participante {

    private int integrantes;

    public Equipo(int id, String nombre, String pais, int integrantes)
            throws ExcepcionDatosInvalidos {
        super(id, nombre, pais);

        if (integrantes < 1)
            throw new ExcepcionDatosInvalidos("Un equipo debe tener al menos 1 integrante");

        this.integrantes = integrantes;
    }

    @Override
    public String mostrarTipo() {
        return "Equipo - Integrantes: " + integrantes;
    }
}
