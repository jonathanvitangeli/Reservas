package com.Cabanas.Tigre.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Cabanas.Tigre.models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	List<Reserva> findByEstado(boolean estado);

}
