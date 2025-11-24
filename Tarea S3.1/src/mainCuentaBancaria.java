
public class mainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria("Ariel");

        // Intento de modificar directamente (esto genera error)
        // c.saldo = 500;  // Error: saldo tiene acceso privado

        // Depósito válido
        c.depositar(300);

        // Retiro válido
        c.retirar(100);

        // Retiro mayor al saldo
        c.retirar(500);

        // Mostrar saldo actual
        System.out.println("Saldo final: $" + c.getSaldo());

    }
}
