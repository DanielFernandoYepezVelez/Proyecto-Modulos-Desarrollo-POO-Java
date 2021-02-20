package com.moduloDesarrollo._18_EjercicioJava.model;

import com.moduloDesarrollo._18_EjercicioJava.Interface.Entregable;

public class Serie implements Entregable {
    private String titulo = "";
    private String genero = "";
    private String creador = "";
    private Boolean entregado = false;
    private Integer numeroTemporadas = 3;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, String genero, String creador, Integer numeroTemporadas) {
        this(titulo, creador);
        this.genero = genero;
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "titulo = " + titulo +
                "\ngenero = " + genero +
                "\ncreador = " + creador +
                "\nentregado = " + entregado +
                "\nnumeroTemporadas = " + numeroTemporadas +
                "\n-----------------------------------------";
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return entregado;
    }
}
