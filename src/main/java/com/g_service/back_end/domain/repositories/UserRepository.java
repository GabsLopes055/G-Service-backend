package com.g_service.back_end.domain.repositories;

import com.g_service.back_end.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsuario(String usuario);

}
