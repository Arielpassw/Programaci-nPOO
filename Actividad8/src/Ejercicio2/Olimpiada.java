package Ejercicio2;

import java.util.ArrayList;

public class Olimpiada {

    private String nombre;
    private int anio;
    private ArrayList<Evento> eventos;

    public Olimpiada(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento e) {
        eventos.add(e);
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        for (Evento e : eventos) {
            System.out.println("- " + e.getNombre());
        }
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }
}
