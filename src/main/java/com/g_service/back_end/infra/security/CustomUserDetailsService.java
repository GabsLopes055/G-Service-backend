package com.g_service.back_end.infra.security;

import com.g_service.back_end.domain.repositories.UsuarioRepository;
import com.g_service.back_end.domain.user.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@Component
public class CustomUserDetailsService implements UserDetailsService {

    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = repository.findByUsuario(username).orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado. METODO: loadUserByUsername"));
        return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getSenha(), null);
    }
}
