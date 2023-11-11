package com.biblioteca.dominio;

public class Libro extends Recurso implements Copiable,Prestable{
    @Override
    public void fotocopiar() {
        this.nroCopias = ++nroCopias;
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
}
