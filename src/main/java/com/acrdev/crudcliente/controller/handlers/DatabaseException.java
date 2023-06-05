package com.acrdev.crudcliente.controller.handlers;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg) {
        super(msg);
    }
}
