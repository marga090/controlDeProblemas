package controlDeProblemas.users;

public class Persona {
	// Atributos
	private String nombre;
	private String apellidos;
	private int codigo;

	// Atributos Estaticos
	private static int contCodigo = 0;

	// Contructor
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.codigo = contCodigo + 1;
		contCodigo++;
	}
	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public static int getContCodigo() {
		return contCodigo;
	}

	public static void setContCodigo(int contCodigo) {
		Persona.contCodigo = contCodigo;
	}

}
