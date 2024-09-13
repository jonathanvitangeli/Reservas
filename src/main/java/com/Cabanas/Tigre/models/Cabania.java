package com.Cabanas.Tigre.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cabania {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	private String descripcion;

	@Column(name = "precio_por_noche")
	private double precioPorNoche;

	private int capacidad;

	private boolean disponible;
	
	@OneToMany(mappedBy = "cabania")
	private List<Reserva> reservas;

	public Cabania() {
	}

	// Constructor con todos los campos
	public Cabania(String nombre, String descripcion, double precioPorNoche, int capacidad, boolean disponible) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioPorNoche = precioPorNoche;
		this.capacidad = capacidad;
		this.disponible = disponible;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public boolean isDisponible() {
		return disponible;
	}

	private void setId(Long id) {
		this.id = id;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	private void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	private void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
