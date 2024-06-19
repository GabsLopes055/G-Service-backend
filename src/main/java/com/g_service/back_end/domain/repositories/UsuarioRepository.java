package com.g_service.back_end.domain.repositories;

import com.g_service.back_end.domain.user.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    Optional<Usuario> findByUsuario(String usuario);

}
