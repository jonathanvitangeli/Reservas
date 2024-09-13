package com.Cabanas.Tigre.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Cabanas.Tigre.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	// Métodos personalizados según las necesidades
	Optional<Usuario> findByEmail(String email);
}
