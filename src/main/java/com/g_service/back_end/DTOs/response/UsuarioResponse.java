package com.g_service.back_end.DTOs.response;

import com.g_service.back_end.domain.user.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {

    private String nomeCompleto;

    private String usuario;

    private String email;

    private com.g_service.back_end.domain.tipoUsuario.tipoUsuario tipoUsuario;

    private LocalDateTime dataCadastro;

    public UsuarioResponse userResponse(Usuario usuario) {

        UsuarioResponse retorno = new UsuarioResponse();

        retorno.setNomeCompleto(usuario.getNomeCompleto());
        retorno.setUsuario(usuario.getUsuario());
        retorno.setEmail(usuario.getEmail());
        retorno.setTipoUsuario(usuario.getTipoUsuario());
        retorno.setDataCadastro(usuario.getDataCadastro());

        return retorno;
    }

}
