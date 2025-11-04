package ec.gob.subsidio.modelo;

public class Solicitante {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    // Constructor por defecto
    public Solicitante() {
        this.nombre = "";
        this.cedula = "";
        this.ingresosMensuales = 0.0;
        this.cantidadVehiculos = 0;
        this.viveEnEcuador = false;
    }

    // Constructor sobrecargado
    public Solicitante(String nombre, String cedula, double ingresosMensuales, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ingresosMensuales = ingresosMensuales;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    // Métodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    // Método estático
    public static void mostrarReglasSubsidio() {
        System.out.println("===== Reglas para obtener el subsidio =====");
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2. No poseer más de un vehículo registrado.");
        System.out.println("3. Tener residencia en Ecuador.");
        System.out.println("============================================");
    }

    // Método que evalúa si cumple los requisitos
    public boolean subsidioAprobado() {
        return (ingresosMensuales <= 1200) && (cantidadVehiculos <= 1) && viveEnEcuador;
    }

    // Método que muestra resultado de evaluación
    public void generarResultado() {
        System.out.println("\n===== Resultado de la evaluación =====");
        if (subsidioAprobado()) {
            System.out.println("Subsidio aprobado: Cumple con todos los requisitos establecidos por el Gobierno del Ecuador.");
        } else {
            System.out.println("Subsidio rechazado: No cumple con todos los requisitos para acceder al subsidio.");
        }
    }

    // Método sobrecargado 1: sin parámetros
    public double calcularConsumoMensual() {
        double consumo = 400.0 / 40.0; // 400 km mensuales promedio, 40 km por galón
        return consumo;
    }

    // Método sobrecargado 2: con parámetro adicional
    public double calcularConsumoMensual(double kmExtra) {
        double consumo = (400.0 + kmExtra) / 40.0;
        return consumo;
    }

    // Método toString
    @Override
    public String toString() {
        return "\n===== Datos del solicitante =====\n" +
                "Nombre: " + nombre + "\n" +
                "Cédula: " + cedula + "\n" +
                "Ingresos mensuales: $" + ingresosMensuales + "\n" +
                "Cantidad de vehículos: " + cantidadVehiculos + "\n" +
                "Vive en Ecuador: " + viveEnEcuador;
    }
}



