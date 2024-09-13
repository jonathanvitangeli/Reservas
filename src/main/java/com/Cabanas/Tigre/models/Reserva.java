package com.Cabanas.Tigre.models;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import com.Cabanas.Tigre.models.Cabania;
import com.Cabanas.Tigre.models.Usuario;

@Entity
@Table(name = "reservas") // busca exactamenta la tabla en la DB
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "cabania_id")
	private Cabania cabania;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	private double montoTotal;
	private boolean estado;

	public Reserva() {
	}

	// Constructor con todos los campos
	public Reserva(Usuario usuario, Cabania cabania, Date fechaInicio, double montoTotal, boolean estado) {
		this.usuario = usuario;
		this.cabania = cabania;
		this.fechaInicio = fechaInicio;
		this.montoTotal = montoTotal;
		this.estado = estado;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	private void setCabania(Cabania cabania) {
		this.cabania = cabania;
	}

	private void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	private void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	private void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Cabania getCabania() {
		return cabania;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public boolean isEstado() {
		return estado;
	}

}
