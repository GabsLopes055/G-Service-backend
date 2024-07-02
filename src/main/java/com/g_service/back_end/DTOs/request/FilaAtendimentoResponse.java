package com.g_service.back_end.DTOs.request;

import com.g_service.back_end.domain.entities.FilaAtendimento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilaAtendimentoResponse {

    private String idFila;

    private String nomeFila;

    private String descricao;

    private String urlImagem;

    private StringBuffer informacoes;

    public static FilaAtendimentoResponse fromEntity(FilaAtendimento filaSalva) {

        FilaAtendimentoResponse response = new FilaAtendimentoResponse();

        response.setIdFila(filaSalva.getIdFilaAtendimento());
        response.setNomeFila(filaSalva.getNomeFilaAtendimento());
        response.setDescricao(filaSalva.getDescricao());
        response.setUrlImagem(filaSalva.getUrlImagem());
        response.setInformacoes(filaSalva.getInformacoes());

        return response;

    }

}
