package com.g_service.back_end.controllers;

import com.g_service.back_end.DTOs.request.FilaAtendimentoResponse;
import com.g_service.back_end.DTOs.response.FilaAtendimentoRequest;
import com.g_service.back_end.services.FilaAtendimentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fila-atendimento")
@AllArgsConstructor
public class FilaAtendimentoController {

    private final FilaAtendimentoService service;

    /*Metodo para salvar uma fila*/
    @PostMapping("/salvarFila")
    public ResponseEntity<FilaAtendimentoResponse> salvarFila(@RequestBody FilaAtendimentoRequest fila) {

        FilaAtendimentoResponse response = service.salvarFilaAtendimento(fila);

        return ResponseEntity.ok(response);

    }

    /*metodo para listar todas as filas*/
    @GetMapping("/listar-todas-filas")
    public ResponseEntity<List<FilaAtendimentoResponse>> listarTodasFilas() {
        return ResponseEntity.status(HttpStatus.OK).body(service.listarTodasFilasDeAtendimento());
    }

    /*metodo para editar uma fila de atendimento*/
    @PutMapping("/editar-fila/{idFila}")
    public ResponseEntity<FilaAtendimentoResponse> editarFilaDeAtendimento(@PathVariable(value = "idFila") String idFilaAtendimento, @RequestBody FilaAtendimentoRequest request) {

        FilaAtendimentoResponse filaEditada = service.editarFilaAtendimento(idFilaAtendimento, request);

        return ResponseEntity.status(HttpStatus.OK).body(filaEditada);
    }

    /*metodo para deletar uma fila*/
    @DeleteMapping("/deletar-fila/{idFila}")
    public ResponseEntity deletarFilaAtendimento(@PathVariable(value = "idFila") String idFila) {

        service.deletarFilaAtendimento(idFila);

        return ResponseEntity.noContent().build();

    }


}
