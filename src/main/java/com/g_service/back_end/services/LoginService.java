package com.g_service.back_end.services;

import com.g_service.back_end.DTOs.request.LoginRequest;
import com.g_service.back_end.DTOs.response.LoginResponse;
import com.g_service.back_end.domain.repositories.UsuarioRepository;
import com.g_service.back_end.domain.entities.Usuario;
import com.g_service.back_end.infra.security.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;


    public LoginResponse realizarLogin(LoginRequest loginRequest) {

        Usuario user = repository.findByUsuario(loginRequest.getUsuario()).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        if (passwordEncoder.matches(loginRequest.getPassword(), user.getSenha())) {
            String token = tokenService.retornaToken(user);
            return new LoginResponse(user.getUsuario(), token);
        } else {
            return null;
        }

    }
}
