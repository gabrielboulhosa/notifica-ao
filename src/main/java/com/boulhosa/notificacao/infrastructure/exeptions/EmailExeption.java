package com.boulhosa.notificacao.infrastructure.exeptions;

public class EmailExeption extends RuntimeException{
    public EmailExeption(String message) {
        super(message);
    }

    public EmailExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
