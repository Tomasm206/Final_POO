package com.biblioteca.dominio;

public class Revista extends Recurso implements Prestable{
    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
}
