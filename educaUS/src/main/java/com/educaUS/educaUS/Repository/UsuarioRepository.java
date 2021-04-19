package com.educaUS.educaUS.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educaUS.educaUS.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findAllByNomeUsuarioContainingIgnoreCase(String nomeUsuario);
	
	
	
}
