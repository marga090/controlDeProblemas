package controlDeProblemas;

import java.util.Date;

import controlDeProblemas.enumerado.EstadoOrdenador;


public class Tarea {
	private int id;
	private String descripcion;
	private Tecnico tecnico;
	private int ordenador;
	private EstadoOrdenador estado;
	private String solucion;
	private Date fecha;

	static int contId = 0;

	// costructor
	
	public Tarea(Tecnico tecnico, int ordenador, String descripcion) {
		this.id = this.contId + 1;
		this.descripcion = descripcion;
		this.tecnico = null;
		this.ordenador = ordenador;
		this.estado = EstadoOrdenador.PENDIENTE;
		this.contId++;
	}

	// metodo

	public void resolverTarea(Tecnico tecnico,EstadoOrdenador estado, String solucion) {
		this.tecnico = tecnico;
		this.solucion = solucion;
		this.estado = EstadoOrdenador.RESUELTA;
		this.fecha = new Date();
	}

// geter y seter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public int getOrdenador() {
		return ordenador;
	}

	public void setOrdenador(int ordenador) {
		this.ordenador = ordenador;
	}

	public EstadoOrdenador getEstado() {
		return estado;
	}

	public void setEstado(EstadoOrdenador estado) {
		this.estado = estado;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
