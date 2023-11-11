package com.biblioteca.dominio.exceptions;

public class RecursoNoFotocopiableException extends RuntimeException{
    public RecursoNoFotocopiableException(){
        super("El Recurso no es fotocopiable");
    }
}
