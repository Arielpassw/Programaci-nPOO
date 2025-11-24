public class Principal {
    public static void main(String[] args) {
        // Parte 1: Videojuego
        VideoJuegos vj = new VideoJuegos();
        vj.setTitulo("God of War");
        vj.setPlataforma("PC");
        vj.setPuntuacion(150.2);
        vj.mostrar();

        System.out.println("--------------------");

        // Parte 2: Personaje
        Personaje p1 = new Personaje();
        p1.setNombrePersonaje("Ares");
        p1.mostrar();

        System.out.println("--------------------");

        // Parte 3: JuegoOnline
        JuegoOnline jo = new JuegoOnline();
        jo.setNivel(3);
        System.out.println("Has avanzado al nivel " + jo.getNivel());

        // Intentar un valor inválido
        jo.setNivel(-2);
        System.out.println("Nivel actual: " + jo.getNivel());
    }
}
