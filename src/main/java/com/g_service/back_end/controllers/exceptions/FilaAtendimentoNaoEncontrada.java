package com.g_service.back_end.controllers.exceptions;

import com.g_service.back_end.controllers.exceptions.exemploExeception.ExcecaoExemplo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class FilaAtendimentoNaoEncontrada extends ResponseEntityExceptionHandler {

    @ExceptionHandler(com.g_service.back_end.services.exceptions.FilaAtendimentoNaoEncontrada.class)
    public ResponseEntity<ExcecaoExemplo> FilaAtendimentoNaoEncontrada(com.g_service.back_end.services.exceptions.FilaAtendimentoNaoEncontrada exception, HttpServletRequest request) {

        ExcecaoExemplo excecaoExemplo = new ExcecaoExemplo();

        excecaoExemplo.setCaminho(request.getRequestURI());
        excecaoExemplo.setMensagem(exception.getMessage());
        excecaoExemplo.setError("Fila de Atendimento não encontrada");
        excecaoExemplo.setStatus(HttpStatus.NOT_FOUND.value());
        excecaoExemplo.setMomentoDaExcecao(Instant.now());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(excecaoExemplo);

    }



}
