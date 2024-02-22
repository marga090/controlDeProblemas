package controlDeProblemas;

public class Main {
    public static void main(String[] args) {
        // Crear un técnico
        Tecnico tecnico = new Tecnico("Juan", "Perez", 1);

        // Crear una tarea
        Tarea tarea = new Tarea(123, "El ordenador no enciende.");

        // Imprimir información de la tarea antes de resolverla
        System.out.println("Información del problema");
        System.out.println("----------------------------------");
        System.out.println("ID: " + tarea.getId());
        System.out.println("Descripción: " + tarea.getDescripcion());
        System.out.println("Ordenador: " + tarea.getOrdenador());
        System.out.println("Estado: " + tarea.getEstado());
        System.out.println("*****************************************************");

        // Resolver la tarea
        tarea.resolverTarea(tecnico, "El problema era un cable suelto.");

        // Imprimir información de la tarea después de resolverla
        System.out.println("Información del problema");
        System.out.println("----------------------------------");
        System.out.println("ID: " + tarea.getId());
        System.out.println("Descripción: " + tarea.getDescripcion());
        System.out.println("Técnico asignado: " + tarea.getTecnico().getNombre() + " " + tarea.getTecnico().getApellidos());
        System.out.println("Ordenador: " + tarea.getOrdenador());
        System.out.println("Estado: " + tarea.getEstado());
        System.out.println("Solución: " + tarea.getSolucion());
        System.out.println("Fecha de resolución: " + tarea.getFecha());
    }
}
