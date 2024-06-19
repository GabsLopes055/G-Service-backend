package com.g_service.back_end.controllers;

import com.g_service.back_end.DTOs.request.LoginRequest;
import com.g_service.back_end.DTOs.request.UsuarioRequest;
import com.g_service.back_end.DTOs.response.LoginResponse;
import com.g_service.back_end.DTOs.response.UsuarioResponse;
import com.g_service.back_end.services.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/auth")
public class LoginController {

    private final LoginService service;

    @PostMapping(value = "/login")
    public ResponseEntity<LoginResponse> realizarLogin(@RequestBody LoginRequest loginRequest) {

        LoginResponse retornoLogin = service.realizarLogin(loginRequest);

        if (retornoLogin == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().body(retornoLogin);
    }

}
