

// código, nombre, apellido, cargo y sueldo base, pero cada tipo
// de empleado podría tener otros atributos(a análisis del estudiante).
public abstract class  Empleados {

    // ATRIBUTOS
    protected String nombre;
    protected String apellido;
    protected String cargo;
    protected Double sueldo_Base;

    //CONSTRUCTOR
    public Empleados(String nombre, String apellido, String cargo, Double sueldo_Base) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.sueldo_Base = sueldo_Base;
    }



        // MÉTODO BASE
        public void calcularSueldo(double sueldo_Base, double sueldo_Total) {
            sueldo_Total = sueldo_Base + sueldo_Base;
        }

}
