package juegos;

public class MarioBros extends Juego {

    private String mundo;

    public MarioBros(String nombre, int anioLanzamiento, String mundo) {
        super(nombre, anioLanzamiento);
        this.mundo = mundo;
    }

    public String getMundo() {
        return mundo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("🎮 [Mario Bros]");
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de lanzamiento: " + anioLanzamiento);
        System.out.println("Mundo: " + mundo);
        System.out.println("------------------------------------");
    }
}
