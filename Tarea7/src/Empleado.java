public abstract class Empleado extends Persona {
    protected String usuario;
    protected String clave;

    public Empleado(String nombre, String cedula, String direccion, String telefono,
                    String usuario, String clave) {
        super(nombre, cedula, direccion, telefono);
        this.usuario = usuario;
        this.clave = clave;
    }

    // Autenticación básica
    public boolean autenticarEmpleado(String usuario, String clave) {
        return this.usuario.equals(usuario) && this.clave.equals(clave);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Empleado del banco");
    }

    // Métodos comunes para empleados
    public void crearCuentaParaCliente(Cliente cliente, String tipo) {
        cliente.registrarCuenta(tipo);
        System.out.println("Cuenta creada por empleado.");
    }

    public void modificarDatosCliente(Cliente cliente) {
        cliente.actualizarDatos(this.direccion, this.telefono);
        System.out.println("Datos del cliente actualizados.");
    }

    public void registrarPrestamo(Cliente cliente, double monto) {
        cliente.solicitarPrestamo(monto);
    }

    public void cerrarCuenta(Cliente cliente) {
        System.out.println("Cuenta de cliente cerrada correctamente.");
    }
}

