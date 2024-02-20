package controlDeProblemas;



public class Tecnico {
	//Atributos
	private String nombre;
	private String apellidos;
	private int cod;
	
	
	
	//Constructor
	public Tecnico(String nombre, String apellidos, int cod) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cod = cod;
	}



	
	
	//Getters y setters
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



	public int getCod() {
		return cod;
	}



	public void setCod(int cod) {
		this.cod = cod;
	}


}
