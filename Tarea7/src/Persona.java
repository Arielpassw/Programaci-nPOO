public abstract class Persona {
    //atributos
    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void actualizarDatos(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
        System.out.println("Datos actualizados correctamente.");
    }

    public abstract void mostrarRol();
}
