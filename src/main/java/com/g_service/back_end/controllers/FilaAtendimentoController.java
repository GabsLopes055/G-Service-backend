package com.g_service.back_end.controllers;

import com.g_service.back_end.DTOs.request.FilaAtendimentoResponse;
import com.g_service.back_end.DTOs.response.FilaAtendimentoRequest;
import com.g_service.back_end.services.FilaAtendimentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fila-atendimento")
@AllArgsConstructor
public class FilaAtendimentoController {

    private final FilaAtendimentoService service;

    @PostMapping("/salvarFila")
    public ResponseEntity<FilaAtendimentoResponse> salvarFila(@RequestBody FilaAtendimentoRequest fila) {

        FilaAtendimentoResponse response = service.salvarFilaAtendimento(fila);

        return ResponseEntity.ok(response);

    }


}
