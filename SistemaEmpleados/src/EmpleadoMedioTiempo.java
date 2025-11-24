
public class EmpleadoMedioTiempo extends Empleados{

    // ATRBUTOS
    private int horasTrabajadas;
    private double sueldoTotal;

   // CONSTRUCTOR

    public EmpleadoMedioTiempo(String nombre, String apellido, String cargo, Double sueldo_Base, int horasTrabajadas, double sueldoTotal) {
        super(nombre, apellido, cargo, sueldo_Base);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoTotal = sueldoTotal;
    }


    // Getters and Setters

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas < 0 || horasTrabajadas > 12) {
            throw new IllegalArgumentException("Horas trabajadas invalidas");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        if (sueldoTotal < 0 || sueldoTotal > 500) {
            throw new IllegalArgumentException("Sueldo total invalidas");
        }
        this.sueldoTotal = sueldoTotal;
    }

   @Override
    public void calcularSueldo(double sueldo_Base, double sueldo_Total) {
        sueldo_Total = sueldo_Base * horasTrabajadas;
   }
}


