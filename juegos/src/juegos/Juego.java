package juegos;

public abstract class Juego {
    protected String nombre;
    protected int anioLanzamiento;

    public Juego(String nombre, int anioLanzamiento) {
        this.nombre = nombre;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    // Método abstracto para polimorfismo
    public abstract void mostrarDetalles();
}
