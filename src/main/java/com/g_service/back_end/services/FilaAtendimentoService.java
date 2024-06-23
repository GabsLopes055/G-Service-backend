package com.g_service.back_end.services;

import com.g_service.back_end.DTOs.request.FilaAtendimentoResponse;
import com.g_service.back_end.DTOs.response.FilaAtendimentoRequest;
import com.g_service.back_end.domain.entities.FilaAtendimento;
import com.g_service.back_end.domain.repositories.FilaAtendimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FilaAtendimentoService {

    private final FilaAtendimentoRepository repository;

    public FilaAtendimentoResponse salvarFilaAtendimento(FilaAtendimentoRequest request) {

        FilaAtendimento fila = new FilaAtendimento();

        fila.setNomeFilaAtendimento(request.getNomeFila());

        FilaAtendimento filaSalva = repository.save(fila);

        return FilaAtendimentoResponse.fromEntity(filaSalva);

    }

}
