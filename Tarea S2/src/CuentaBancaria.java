public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldoInicial) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + this.nombreTitular);
        System.out.println("Saldo actual: $" + this.saldo);
        System.out.println("-----------------------------");
    }

    public void depositar(double monto) {
        if (monto > (double)0.0F) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Has depositado $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }

    }

    public void retirar(double monto) {
        if (monto > (double)0.0F && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Has retirado $" + monto);
        } else if (monto > this.saldo) {
            System.out.println("Fondos insuficientes. No se puede retirar $" + monto);
        } else {
            System.out.println("El monto a retirar debe ser mayor que cero.");
        }

    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", (double)100.0F);
        cuenta1.mostrarInformacion();
        cuenta1.depositar((double)50.0F);
        cuenta1.mostrarInformacion();
        cuenta1.retirar((double)30.0F);
        cuenta1.mostrarInformacion();
    }
}