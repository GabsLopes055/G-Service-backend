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

    public static FilaAtendimentoResponse fromEntity(FilaAtendimento filaSalva) {

        FilaAtendimentoResponse response = new FilaAtendimentoResponse();

        response.setIdFila(filaSalva.getIdFilaAtendimento());
        response.setNomeFila(filaSalva.getNomeFilaAtendimento());

        return response;

    }

}
