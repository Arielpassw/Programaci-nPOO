public class JuegoOnline {
    private int nivel = 1; // nivel inicial obligatorio

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1) {
            this.nivel = nivel;
        } else {
            System.out.println("Error: el nivel no puede ser menor que 1. Se mantiene el nivel actual (" + this.nivel + ").");
        }
    }
}
