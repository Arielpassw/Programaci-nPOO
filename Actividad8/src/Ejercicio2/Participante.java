package Ejercicio2;

public abstract class Participante {

    protected int id;
    protected String nombre;
    protected String pais;

    public Participante(int id, String nombre, String pais) throws ExcepcionDatosInvalidos {
        if (nombre == null || nombre.isEmpty())
            throw new ExcepcionDatosInvalidos("El nombre no puede estar vacío");
        if (pais == null || pais.isEmpty())
            throw new ExcepcionDatosInvalidos("El país no puede estar vacío");

        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPais() { return pais; }

    public abstract String mostrarTipo();  // POLIMORFISMO
}
