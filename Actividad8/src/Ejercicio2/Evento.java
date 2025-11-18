package Ejercicio2;

import java.util.ArrayList;

public class Evento {

    private String nombre;
    private String categoria;
    private ArrayList<Participante> participantes;

    public Evento(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante p) {
        participantes.add(p);
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("No hay participantes registrados en este evento.");
            return;
        }

        for (Participante p : participantes) {
            System.out.println(p.getId() + " - " + p.getNombre() + " (" + p.getPais() + ") - " + p.mostrarTipo());
        }
    }

    public String getNombre() {
        return nombre;
    }
}
