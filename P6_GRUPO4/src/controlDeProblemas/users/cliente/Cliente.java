package controlDeProblemas.users.cliente;

import controlDeProblemas.users.Persona;

public class Cliente {
	// Atributos
	private Persona cli;
	private int saldo; // opcional
	
	// Constructor
	public Cliente(Persona cli) {
		this.cli = cli;
	}
	
	//Getters y setters
	public Persona getCli() {
		return cli;
	}

	public void setCli(Persona cli) {
		this.cli = cli;
	}

	public int getSaldo() { // opcional
		return saldo;
	}

	public void setSaldo(int saldo) { // opcional
		this.saldo = saldo;
	}
	
	
}
