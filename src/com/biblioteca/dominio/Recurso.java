package com.biblioteca.dominio;

public abstract class Recurso {
    protected String codigo;
    protected String nombre;
    protected boolean prestado;
    protected int nroCopias;

    @Override
    public String toString() {
        return "Recurso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", prestado=" + prestado +
                ", nroCopias=" + nroCopias +
                '}';
    }
}
