
// código, nombre, apellido, cargo y sueldo base, pero cada tipo
// de empleado podría tener otros atributos(a análisis del estudiante).

public class EmpleadoTiempoCompleto extends Empleados {

    // ATRIBUTOS
    private String tipoEmpleado;
    private Double sueldoTotal;
    private String direccion;
    private double bonosAdicional;

    // CONSTRUCTOR
    public EmpleadoTiempoCompleto(String nombre, String apellido, String cargo, Double sueldo_Base, String tipoEmpleado, String direccion, double sueldoTotal, double bonosAdicional) {
        super(nombre, apellido, cargo, sueldo_Base);
        this.tipoEmpleado = tipoEmpleado;
        this.sueldoTotal = sueldoTotal;
        this.direccion = direccion;
        this.bonosAdicional = bonosAdicional;
    }

    // Getters and Setters

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        if (tipoEmpleado == null || tipoEmpleado.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de empleado es obligatorio");
        }
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.trim().isEmpty()) {
            throw new IllegalArgumentException("Direccion es obligatorio");
        }
        this.direccion = direccion;
    }

    public Double getSueldoTotal() {
        return sueldoTotal;
    }

    public double getBonosAdicional() {
        return bonosAdicional;
    }

    public void setBonosAdicional(double bonosAdicional) {
        this.bonosAdicional = bonosAdicional;
    }

    // CALCULAR EL SUELDO
    public void setSueldoTotal(Double sueldoTotal) {
        if (sueldoTotal < 0 || sueldoTotal > 500) {
            throw new IllegalArgumentException("Sueldo total invalidas");
        }
        this.sueldoTotal = sueldoTotal+bonosAdicional;
    }

    // MÉTODO SOBREESCRITO
    @Override
    public void calcularSueldo(double sueldo_Base, double sueldo_Total) {
        sueldo_Total = sueldo_Base + bonosAdicional;
    }

}
