package com.Cabanas.Tigre.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Cabanas.Tigre.models.Cabania;

public interface CabaniaRepository extends JpaRepository<Cabania, Long> {
	// Puedes agregar métodos personalizados si es necesario
	List<Cabania> findByDisponible(boolean disponible);
}
