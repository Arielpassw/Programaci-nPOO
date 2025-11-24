//Escenario:
//Trabajas en un sistema bancario. El cliente tiene una CuentaBancaria con saldo y titular.
//El saldo no se puede modificar directamente, solo mediante depósitos o retiros.

//Lo que tienes que hacer:
//1. En el main, intenta escribir c.saldo = 500; y observa el error.
//2. Crea los métodos:
//   - depositar(double monto) → suma al saldo si el monto es positivo.
//   - retirar(double monto) → resta del saldo solo si hay suficiente dinero.
//   - getSaldo() → muestra el saldo actual.

public class CuentaBancaria {
    private double saldo = 0;
    private String titular;

    // Constructor opcional
    public CuentaBancaria(String titular) {
        this.titular = titular;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado: $" + monto);
        } else if (monto > saldo) {
            System.out.println("Saldo insuficiente. No se puede retirar $" + monto);
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }

    // Método para consultar saldo
    public double getSaldo() {
        return saldo;
    }
}

