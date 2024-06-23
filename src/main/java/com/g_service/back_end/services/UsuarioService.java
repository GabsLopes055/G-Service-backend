package com.g_service.back_end.services;

import com.g_service.back_end.DTOs.request.UsuarioRequest;
import com.g_service.back_end.DTOs.response.UsuarioResponse;
import com.g_service.back_end.domain.repositories.UsuarioRepository;
import com.g_service.back_end.domain.entities.Usuario;
import com.g_service.back_end.services.exceptions.UsuarioJaExisteCadastrado;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioResponse registrarUsuario(UsuarioRequest usuarioRequest) {

        Optional<Usuario> pesquisarUsuario = repository.findByUsuario(usuarioRequest.getUsuario());

        if (pesquisarUsuario.isEmpty()) {

            Usuario salvarUsuario = new Usuario();

            salvarUsuario.setNomeCompleto(usuarioRequest.getNomeCompleto());
            salvarUsuario.setUsuario(usuarioRequest.getUsuario());
            salvarUsuario.setEmail(usuarioRequest.getEmail());
            salvarUsuario.setSenha(passwordEncoder.encode(usuarioRequest.getSenha()));
            salvarUsuario.setTipoUsuario(usuarioRequest.getTipoUsuario());

            Usuario retornarUsuario = this.repository.save(salvarUsuario);

            return new UsuarioResponse().userResponse(retornarUsuario);

        } else {
            throw new UsuarioJaExisteCadastrado("Já existe um registro com esse nome de usuário");
        }

    }

}
