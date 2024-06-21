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
public class UsuarioJaExisteCadastrado extends ResponseEntityExceptionHandler {

    @ExceptionHandler(com.g_service.back_end.services.exceptions.UsuarioJaExisteCadastrado.class)
    public ResponseEntity<ExcecaoExemplo> usuarioCadastradoException(com.g_service.back_end.services.exceptions.UsuarioJaExisteCadastrado exception, HttpServletRequest request) {

        ExcecaoExemplo excecaoExemplo = new ExcecaoExemplo();

        excecaoExemplo.setCaminho(request.getRequestURI());
        excecaoExemplo.setMensagem(exception.getMessage());
        excecaoExemplo.setError("Erro ao cadastrar usuario");
        excecaoExemplo.setStatus(HttpStatus.BAD_REQUEST.value());
        excecaoExemplo.setMomentoDaExcecao(Instant.now());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(excecaoExemplo);

    }

}
