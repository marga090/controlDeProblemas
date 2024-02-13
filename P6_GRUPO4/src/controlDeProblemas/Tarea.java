package controlDeProblemas;

public class Tarea {
    private Problema problema;
    private int numeroOrdenador;

    public Tarea(Problema problema, int numeroOrdenador) {
        this.problema = problema;
        this.numeroOrdenador = numeroOrdenador;
    }

    public Problema getProblema() {
        return problema;
    }

    public int getNumeroOrdenador() {
        return numeroOrdenador;
    }
}
