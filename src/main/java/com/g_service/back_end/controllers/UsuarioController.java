package com.g_service.back_end.controllers;

import com.g_service.back_end.DTOs.request.UsuarioRequest;
import com.g_service.back_end.DTOs.response.UsuarioResponse;
import com.g_service.back_end.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping(value = "/buscarUsuario")
    public ResponseEntity<String> buscarUsuario() {
        return ResponseEntity.ok("Achei o bendito do usuario");
    }

    @PostMapping(value = "/registrar")
    public ResponseEntity<UsuarioResponse> cadastrarUsuario(@RequestBody UsuarioRequest usuarioRequest) {

        return ResponseEntity.status(HttpStatus.CREATED).body(service.registrarUsuario(usuarioRequest));


    }
}
