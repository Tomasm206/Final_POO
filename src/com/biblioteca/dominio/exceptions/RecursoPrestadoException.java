package com.biblioteca.dominio.exceptions;

public class RecursoPrestadoException extends RuntimeException{
    public RecursoPrestadoException(){
        super("El recurso esta prestado");
    }
}
