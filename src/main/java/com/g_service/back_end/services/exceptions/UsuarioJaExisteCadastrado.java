package com.g_service.back_end.services.exceptions;

public class UsuarioJaExisteCadastrado extends RuntimeException{

    public UsuarioJaExisteCadastrado(String mensagem) {
        super(mensagem);
    }

}
