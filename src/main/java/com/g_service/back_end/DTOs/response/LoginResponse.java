package com.g_service.back_end.DTOs.response;

import com.g_service.back_end.DTOs.request.LoginRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private String usuario;

    private String token;

}
