package juegos;

public class CarreraVehiculos extends Juego {

    private int numeroVehiculos;

    public CarreraVehiculos(String nombre, int anioLanzamiento, int numeroVehiculos) {
        super(nombre, anioLanzamiento);
        this.numeroVehiculos = numeroVehiculos;
    }

    public int getNumeroVehiculos() {
        return numeroVehiculos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🏎️ [Carrera de Vehículos]");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de lanzamiento: " + anioLanzamiento);
        System.out.println("Número de vehículos: " + numeroVehiculos);
        System.out.println("------------------------------------");
    }
}
