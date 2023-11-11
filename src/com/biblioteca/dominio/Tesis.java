package com.biblioteca.dominio;

public class Tesis extends Recurso implements Copiable{
    @Override
    public void fotocopiar() {
        this.nroCopias = ++nroCopias;
    }
}
