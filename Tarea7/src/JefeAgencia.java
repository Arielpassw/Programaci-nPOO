public class JefeAgencia extends Empleado {

    public JefeAgencia(String nombre, String cedula, String direccion, String telefono,
                       String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Jefe de Agencia");
    }

    public boolean aprobarPrestamo(Cliente cliente, double montoPrestamo) {

        if (cliente == null) {
            System.out.println("No hay cliente para aprobar préstamo.");
            return false;
        }

        if (montoPrestamo <= 0) {
            System.out.println("Monto del préstamo inválido.");
            return false;
        }

        // Llamamos al método del Cliente para que actualice sus datos
        cliente.aprobarPrestamo(montoPrestamo);

        System.out.println("Préstamo aprobado correctamente.");

        return true;
    }



    public void generarReporteOperaciones() {
        System.out.println("Reporte generado: Operaciones del día.");
    }

    public void evaluarEmpleado(Empleado empleado) {
        System.out.println("Evaluación realizada al empleado: " + empleado.nombre);
    }
}
