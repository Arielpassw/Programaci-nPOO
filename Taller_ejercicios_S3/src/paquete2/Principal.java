package paquete2;
import paquete1.Juego; // Importamos la clase de otro paquete

public class Principal {
    public static void main(String[] args) {
        Juego j1 = new Juego("Mario Kart", 4);

        // No se puede acceder directamente a los atributos:
        // j1.nombre = "Zelda"; // Error: nombre tiene acceso privado

        // Se accede correctamente usando getters y setters:
        j1.setNombre("Zelda");
        j1.setJugadores(2);

        j1.mostrarInfo();


}
