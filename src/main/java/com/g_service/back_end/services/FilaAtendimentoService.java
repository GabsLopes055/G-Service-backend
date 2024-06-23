package com.g_service.back_end.services;

import com.g_service.back_end.DTOs.request.FilaAtendimentoResponse;
import com.g_service.back_end.DTOs.response.FilaAtendimentoRequest;
import com.g_service.back_end.domain.entities.FilaAtendimento;
import com.g_service.back_end.domain.repositories.FilaAtendimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FilaAtendimentoService {

    private final FilaAtendimentoRepository repository;

    /*metodo para salvar uma fila*/
    public FilaAtendimentoResponse salvarFilaAtendimento(FilaAtendimentoRequest request) {

        FilaAtendimento fila = new FilaAtendimento();

        fila.setNomeFilaAtendimento(request.getNomeFila());

        FilaAtendimento filaSalva = repository.save(fila);

        return FilaAtendimentoResponse.fromEntity(filaSalva);

    }

    /*metodo para listar todas as filas*/
    public List<FilaAtendimentoResponse> listarTodasFilasDeAtendimento() {

        List<FilaAtendimento> listaFilaAtendimento = repository.findAll();

        List<FilaAtendimentoResponse> listaFilaAtendimentoResponse = new ArrayList<>();

        for (FilaAtendimento filaRetorno : listaFilaAtendimento) {
            listaFilaAtendimentoResponse.add(FilaAtendimentoResponse.fromEntity(filaRetorno));
        }

        return listaFilaAtendimentoResponse;

    }

}
