public abstract class Candidata {

    // Atributos
    protected int id;
    protected String nombre;
    protected int edad;
    protected String distrito;
    protected double punjeJurado;

    public Candidata(int id, String nombre, int edad, String distrito, double punjeJurado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.distrito = distrito;
        this.punjeJurado = punjeJurado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws DatosInvalidoException{
        if (nombre == null || nombre.trim().isEmpty())  {
            throw new DatosInvalidoException("El nombre es obligatorio");
        }
            this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatosInvalidoException {
        if (edad <= 16) {
            throw new DatosInvalidoException("La edad para participar es mayor o igual 16 años");
        }
        this.edad = edad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) throws DatosInvalidoException {
        if (distrito == null || distrito.trim().isEmpty())  {
            throw new DatosInvalidoException("La distrito es obligatorio");
        }
        this.distrito = distrito;
    }

    public double getPunjeJurado() {
        return punjeJurado;
    }

    public void setPunjeJurado(double punjeJurado) throws DatosInvalidoException {
        if (punjeJurado <= 0 || punjeJurado > 100) {
            throw new DatosInvalidoException("El puntaje debe ser entre 0 e 100");
        }
        this.punjeJurado = punjeJurado;
    }

    public abstract void mostrarDetalles(

    );
}
