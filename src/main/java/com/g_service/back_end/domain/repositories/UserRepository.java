package com.g_service.back_end.domain.repositories;

import com.g_service.back_end.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
