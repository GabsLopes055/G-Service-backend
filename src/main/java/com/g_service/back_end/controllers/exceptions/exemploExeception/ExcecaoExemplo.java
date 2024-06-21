package com.g_service.back_end.controllers.exceptions.exemploExeception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExcecaoExemplo {

    private Instant momentoDaExcecao;

    private Integer status;

    private String error;

    private String mensagem;

    private String caminho;

}
