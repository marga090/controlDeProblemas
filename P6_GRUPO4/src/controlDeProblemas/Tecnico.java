package controlDeProblemas.users.tecnico;

import controlDeProblemas.users.Persona;

public class Tecnico {
	//Atributos
	private Persona tec;
	// Mas posibleas atributos
	
	//Constructor
	public Tecnico(Persona tec) {
		this.tec=tec;
	}
	
	//Getters y setters
	public Persona getTec() {
		return tec;
	}

	public void setTec(Persona tec) {
		this.tec = tec;
	}
}
