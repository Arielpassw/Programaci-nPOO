
//4. En el main, crea un objeto Persona, prueba asignando valores correctos e incorrectos.
//5. Muestra los resultados con System.out.println.

public class mainPersona {
    public static void main(String[] args) {

        //Objeto persona
        Persona persona1 = new Persona();

        //Asignar valores incorrectos
        System.out.println("PRUEBA CON VALORES INCORRECTOS ");
        persona1.setNombre("");
        persona1.setEdad(-1);
        persona1.setProfesion("");

        //Asignar valores correctos
        System.out.println("------------------------------");
        System.out.println("PRUEBA CON VALORES CORRECTOS ");
        persona1.setNombre("Ariel Arias");
        persona1.setEdad(22);
        persona1.setProfesion("Estudiante");

        //Mostrar resultados
        System.out.println("------------------------------");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Profesión: " + persona1.getProfesion());

    }

}
