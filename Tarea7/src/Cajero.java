public class Cajero extends Empleado {

    public Cajero(String nombre, String cedula, String direccion, String telefono,
                  String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Cajero");
    }

    public void procesarRetiro(Cliente cliente, double monto) {
        cliente.retirar(monto);
    }

    public void procesarDeposito(Cliente cliente, double monto) {
        cliente.depositar(monto);
    }

    public void consultarSaldo(Cliente cliente) {
        cliente.verResumenFinanciero();
    }
}
