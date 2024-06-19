package com.g_service.back_end.DTOs.request;

import com.g_service.back_end.domain.tipoUsuario.tipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {

    private String nomeCompleto;

    private String usuario;

    private String email;

    private String senha;

    private tipoUsuario tipoUsuario;

}
