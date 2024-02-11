package controlDeProblemas;

public class Problema {
	// Atributos
	private int cod;
	private String nombre;
	private Ordenador aparato;

	// Atributos estaticos
	private static int contProblemas = 0;

	// Constructor
	public Problema(String nombre, Ordenador aparato) {
		this.cod = contProblemas + 1;
		this.nombre = nombre;
		this.aparato = aparato;
		contProblemas++;
	}
	// Getters y Setters
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ordenador getAparato() {
		return aparato;
	}

	public void setAparato(Ordenador aparato) {
		this.aparato = aparato;
	}

	public static int getContProblemas() {
		return contProblemas;
	}

	public static void setContProblemas(int contProblemas) {
		Problema.contProblemas = contProblemas;
	}

}
