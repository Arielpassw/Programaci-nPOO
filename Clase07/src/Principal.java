public class Principal {
        public static void main(String[] args) {
            Persona p1 = new Persona("Ariel","1727736314",22);
            Estudiante e1 = new Estudiante("Ariel","1727736314",22,"A001");
            Docente d1 = new Docente("Yadira","1777363334",28,"POO");

            System.out.println("\n--- PERSONA ---");
            p1.imprimir();

            System.out.println("\n--- ESTUDIANTE ---");
            e1.imprimirComoEstudiante();

            System.out.println("\n--- DOCENTE ---");
            d1.imprimirComoDocente();
        }

}
