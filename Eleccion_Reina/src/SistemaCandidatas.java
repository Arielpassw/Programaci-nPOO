import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Collections;


public class SistemaCandidatas {

    private ArrayList<Candidata> lista = new ArrayList<>();
    private Map<Integer, Integer> votos = new HashMap<>();


    // Registrar
    public void registrar(Candidata c) {
        lista.add(c);
        System.out.println("Candidata registrada correctamente.");
    }

    // Listar
    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("No hay candidatas registradas.");
            return;
        }
        for (Candidata c : lista) {
            c.mostrarDetalles();
        }
    }

    // Buscar por ID
    public Candidata buscarPorId(int id) {
        for (Candidata c : lista) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    // Buscar por nombre
    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (Candidata c : lista) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                c.mostrarDetalles();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró una candidata con ese nombre.");
        }
    }

    // Filtrar por tipo
    public void filtrarPorTipo(String tipo) {
        boolean encontrado = false;

        for (Candidata c : lista) {
            if (c.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                c.mostrarDetalles();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay candidatas del tipo: " + tipo);
        }
    }

    // Eliminar por ID
    public void eliminar(int id) {
        Candidata c = buscarPorId(id);

        if (c != null) {
            lista.remove(c);
            System.out.println("Candidata eliminada correctamente.");
        } else {
            System.out.println("No existe una candidata con ese ID.");
        }
    }

    // Editar nombre
    public void editarNombre(int id, String nuevoNombre) {
        Candidata c = buscarPorId(id);

        if (c != null) {
            c.nombre = nuevoNombre;
            System.out.println("Nombre actualizado correctamente.");
        } else {
            System.out.println("No existe una candidata con ese ID.");
        }
    }

    //           VOTACIONES
    // ---------------------------------

    // Registrar voto
    public void registrarVoto(int idCandidata) {
        Candidata c = buscarPorId(idCandidata);

        if (c == null) {
            System.out.println("No existe una candidata con ese ID.");
            return;
        }

        votos.put(idCandidata, votos.getOrDefault(idCandidata, 0) + 1);
        System.out.println("Voto registrado para: " + c.getNombre());
    }

    // Cargar votos de ejemplo
    public void importarVotosDeEjemplo() {
        if (lista.isEmpty()) {
            System.out.println("No hay candidatas registradas.");
            return;
        }

        Random r = new Random();

        for (Candidata c : lista) {
            int cantidad = r.nextInt(10) + 1; // votos aleatorios 1 a 10
            votos.put(c.getId(), cantidad);
        }

        System.out.println("Votos de ejemplo cargados correctamente.");
    }

    // Mostrar ganadora
    public void mostrarGanadora() {
        if (votos.isEmpty()) {
            System.out.println("No hay votos registrados.");
            return;
        }

        int maxVotos = Collections.max(votos.values());
        ArrayList<Candidata> empatadas = new ArrayList<>();

        for (Candidata c : lista) {
            int v = votos.getOrDefault(c.getId(), 0);
            if (v == maxVotos) {
                empatadas.add(c);
            }
        }

        // Sin empate
        if (empatadas.size() == 1) {
            System.out.println("GANADORA:");
            empatadas.get(0).mostrarDetalles();
            System.out.println("Votos: " + maxVotos);
            return;
        }

        // Empate → desempatar por puntaje jurado
        System.out.println("Empate detectado. Desempate por puntaje del jurado...");
        resolverEmpate(empatadas);
    }

    // Desempate usando puntaje del jurado
    private void resolverEmpate(ArrayList<Candidata> empatadas) {
        empatadas.sort((a, b) ->
                Double.compare(b.getPunjeJurado(), a.getPunjeJurado())
        );

        Candidata ganadora = empatadas.get(0);
        double mejorPuntaje = ganadora.getPunjeJurado();

        long conteo = empatadas.stream()
                .filter(c -> c.getPunjeJurado() == mejorPuntaje)
                .count();

        if (conteo > 1) {
            System.out.println("Empate total incluso con puntaje del jurado.");
            System.out.println("GANADORAS:");
            for (Candidata c : empatadas) {
                if (c.getPunjeJurado() == mejorPuntaje) {
                    c.mostrarDetalles();
                }
            }
        } else {
            System.out.println("GANADORA POR DESEMPATE:");
            ganadora.mostrarDetalles();
        }
    }

    public void filtrarPorDistrito(String distrito) {
        boolean encontrado = false;

        for (Candidata c : lista) {
            if (c.getDistrito().equalsIgnoreCase(distrito)) {
                c.mostrarDetalles();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay candidatas en ese distrito.");
        }
    }

}
