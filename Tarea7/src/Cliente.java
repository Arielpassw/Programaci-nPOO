public class Cliente extends Persona {
    private String tipoCuenta;
    private double saldo;
    private double prestamoSolicitado = 0; // <-- NUEVO
    private double prestamoAprobado = 0;


    public Cliente(String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
        this.saldo = 0;
    }

    @Override
    public void mostrarRol() {
        System.out.println("Rol: Cliente bancario");
    }

    public boolean ingresarAlSistema() {
        System.out.println(nombre + " ha ingresado al sistema.");
        return true;
    }

    public void registrarCuenta(String tipo) {
        this.tipoCuenta = tipo;
        System.out.println("Cuenta registrada tipo: " + tipo);
    }

    public void solicitarPrestamo(double monto) {
        try {
            if (monto <= 0) throw new Exception("El monto debe ser positivo.");

            prestamoSolicitado = monto; // <-- SE GUARDA EL PRÉSTAMO

            System.out.println("Solicitud de préstamo por $" + monto + " enviada al Jefe de Agencia.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void verResumenFinanciero() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono:" + telefono);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Préstamo solicitado: $" + prestamoSolicitado);

    }

    public void depositar(double monto) {
        try {
            if (monto <= 0) throw new Exception("Monto inválido.");
            saldo += monto;
            System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void retirar(double monto) {
        try {
            if (monto > saldo) throw new Exception("Fondos insuficientes.");
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void aprobarPrestamo(double monto) {
        this.prestamoAprobado = monto;
        this.saldo += monto;
        System.out.println("Préstamo de $" + monto + " acreditado al saldo del cliente.");
    }

}
