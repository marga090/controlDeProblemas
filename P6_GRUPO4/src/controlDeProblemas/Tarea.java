package controlDeProblemas;

import java.util.Date;

import controlDeProblemas.enumerado.EstadoOrdenador;


public class Tarea {
	//Atributos
	private int id;
	private String descripcion;
	private Tecnico tecnico;
	private int ordenador;
	private EstadoOrdenador estado;
	private String solucion;
	private Date fecha;

	//Atributos estatico
	static int contId = 0;

	//Constructor
	
	public Tarea(int ordenador, String descripcion) {
		this.id = contId++;
		this.descripcion = descripcion;
		this.tecnico = null;
		this.ordenador = ordenador;
		this.estado = EstadoOrdenador.PENDIENTE;
	}

	// Método
	
	public void resolverTarea(Tecnico tecnico, String solucion) {
        if (this.estado != EstadoOrdenador.PENDIENTE) {
            throw new IllegalArgumentException("La tarea ya ha sido resuelta o no existe ningun problema asignado");
        } else {
        	this.tecnico = tecnico;
            this.solucion = solucion;
            this.estado = EstadoOrdenador.RESUELTA;
            this.fecha = new Date();
        }
    }

	//Getters y setters

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
