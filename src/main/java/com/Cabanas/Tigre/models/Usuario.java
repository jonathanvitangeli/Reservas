package com.Cabanas.Tigre.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String email;
	private String telefono;

	@OneToMany(mappedBy = "usuario") // Relación con la tabla de reservas
	private List<Reserva> reservas;

	// Constructor vacío (requerido por JPA)
	public Usuario() {
	}

	// Constructor con todos los campos (excepto id y reservas)
	public Usuario(String nombre, String email, String telefono) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}
	

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	private void setId(Long id) {
		this.id = id;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	private void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
}
