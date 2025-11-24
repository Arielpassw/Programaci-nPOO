package paquete1;

public class Juego {
    private String nombre;
    private int jugadores;

    public Juego(String nombre, int jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        if (jugadores > 0) {
            this.jugadores = jugadores;
        } else {
            System.out.println("Debe haber al menos un jugador.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Juego: " + nombre + " | Jugadores: " + jugadores);
    }
}
