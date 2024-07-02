package com.g_service.back_end.DTOs.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilaAtendimentoRequest {

    private String nomeFila;

    private String descricao;

    private String urlImagem;

    private StringBuffer informacoes;

//    private List<Usuario> listaUsuarios;

}
