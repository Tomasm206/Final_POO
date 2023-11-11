package com.biblioteca.dominio.exceptions;

public class RecursoNoPrestableException extends RuntimeException{
    public RecursoNoPrestableException(){
        super("El recurso no se puede prestar");
    }
}
