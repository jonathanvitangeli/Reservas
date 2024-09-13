package com.Cabanas.Tigre.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cabanas.Tigre.models.Reserva;
import com.Cabanas.Tigre.repositories.ReservaRepository;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

	@Autowired
	private ReservaRepository reservaRepository;

	
	@GetMapping("/")
	public List<Reserva> getAllReservas() {
		return reservaRepository.findAll();
	}

	
	@GetMapping("/{id}")
	public ResponseEntity<Reserva> getReservaById(@PathVariable Long id) {
		Optional<Reserva> reserva = reservaRepository.findById(id);
		return reserva.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	
	@PostMapping
	public ResponseEntity<Reserva> createReserva(@RequestBody Reserva reserva) {
		Reserva saveReserva = reservaRepository.save(reserva);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveReserva);
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteReserva(@PathVariable Long id) {
		ResponseEntity<Void> respuesta = ResponseEntity.notFound().build();
		if (reservaRepository.existsById(id)) {
			reservaRepository.deleteById(id);
			respuesta = ResponseEntity.noContent().build(); // Retorna 204 No Content si se elimina correctamente
		}
		return respuesta;
	}

	
	@PutMapping("/{id}")
	public ResponseEntity<Reserva> updateReserva(@PathVariable Long id, @RequestBody Reserva updateReserva) {
		ResponseEntity<Reserva> respuesta = ResponseEntity.notFound().build();
		if (reservaRepository.existsById(id)) {
			updateReserva.setId(id);
			Reserva saveReserva = reservaRepository.save(updateReserva);
			respuesta = ResponseEntity.ok(saveReserva);
		}
		return respuesta;
	}
}
