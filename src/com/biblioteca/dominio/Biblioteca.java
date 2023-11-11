package com.biblioteca.dominio;

import com.biblioteca.dominio.exceptions.RecursoNoFotocopiableException;
import com.biblioteca.dominio.exceptions.RecursoNoPrestableException;
import com.biblioteca.dominio.exceptions.RecursoPrestadoException;

import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Recurso> biblioteca;
    public void agregarRecurso(Recurso recurso){
        if (!biblioteca.equals(recurso)){
            biblioteca.add(recurso);
        } else {
            System.out.println("El recurso ya existe en la biblioteca");
        }
    }
    public boolean prestar(String codigo){
        for (Recurso recurso : biblioteca){
            if (recurso.codigo.equals(codigo) && recurso instanceof Prestable){
                ((Prestable) recurso).prestar();
                return true;
            }else if (recurso.prestado && recurso instanceof Prestable){
                throw new RecursoPrestadoException();
            }else {
                throw new RecursoNoPrestableException();
            }
        }
        return false;
    }
    public boolean devolver(String codigo){
        for (Recurso recurso : biblioteca){
            if (recurso.codigo.equals(codigo) && recurso instanceof Prestable){
                ((Prestable) recurso).devolver();
                return true;
            }else{
                throw new RecursoNoPrestableException();
            }
        }
        return false;
    }
    public boolean fotocopiar(String codigo){
        for (Recurso recurso : biblioteca){
            if (recurso.codigo.equals(codigo) && recurso instanceof Copiable){
                ((Copiable) recurso).fotocopiar();
                return true;
            }else if (!(recurso instanceof Copiable)){
                throw new RecursoNoFotocopiableException();
            }else {
                System.out.println("No esta en la biblioteca");
            }
        }
        return false;
    }
    public List<Recurso> listarPrestados(){
        return this.biblioteca.stream().filter(pres -> pres.prestado).toList();
    }
    public List<Copiable> listarCopiasPorRecurso(){
        biblioteca.toString();
        return biblioteca.stream()
                .filter(cop -> cop instanceof Copiable)
                .map(cop -> (Copiable) cop)
                .collect(Collectors.toList());
    }

}
