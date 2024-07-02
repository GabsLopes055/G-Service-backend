package com.g_service.back_end.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_fila-atendimento")
public class FilaAtendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idFilaAtendimento;

    private String nomeFilaAtendimento;

    private String descricao;

    @Column(length = 65555)
    private StringBuffer informacoes;

    private String urlImagem;
}
