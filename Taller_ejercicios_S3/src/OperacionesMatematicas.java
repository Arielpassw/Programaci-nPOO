public class OperacionesMatematicas {
    // Atributos privados
    private double numero1;
    private double numero2;
    private double numero3;

    // Constructor para asignar los 3 valores
    public OperacionesMatematicas(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    // Constructor para asignar los 2 valores
    public OperacionesMatematicas(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters
    public double getNumero1() {
        return numero1; }
    public double getNumero2() {
        return numero2; }
    public double getNumero3() {
        return numero3; }

    // Método para calcular
    public double calcular() {
        return numero1 + numero2 + numero3;
    }

    public void mostrarInformacion() {
        System.out.println("La cantidad de productos es: " + calcular());
    }
}

