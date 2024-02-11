package controlDeProblemas;

import controlDeProblemas.users.cliente.Cliente;

public class Ordenador {
	private Cliente duenio;
	// Mas posibleas atributos

	// Constructor
	public Ordenador(Cliente duenio) {
		this.duenio = duenio;
	}
	
	//Getters y Setters
	public Cliente getDuenio() {
		return duenio;
	}

	public void setDuenio(Cliente duenio) {
		this.duenio = duenio;
	}
	
}
