// Clase de excepción personalizada
class PagoInvalidoException extends Exception {
    public PagoInvalidoException(String mensaje) {
        super(mensaje); // Envía el mensaje a la clase Exception
    }
}

// Clase principal
public class PagoEjercicio {
    public static void main(String[] args) {
        double pago = -50; // puedes cambiar este valor para probar

        try {
            validarPago(pago);
            System.out.println(" Pago de $" + pago + " procesado correctamente.");
        }
        catch (PagoInvalidoException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }

    // Método que lanza la excepción personalizada
    public static void validarPago(double pago) throws PagoInvalidoException {
        if (pago < 0) {
            throw new PagoInvalidoException("El pago no puede ser negativo.");
        }
        else if (pago == 0) {
            throw new PagoInvalidoException("El pago no puede ser igual a 0.");
        }
        else if (pago > 5000) {
            throw new PagoInvalidoException("El pago no puede superar los $5000.");
        }
    }
}
