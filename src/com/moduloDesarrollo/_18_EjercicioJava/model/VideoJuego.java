package com.moduloDesarrollo._18_EjercicioJava.model;

import com.moduloDesarrollo._18_EjercicioJava.Interface.Entregable;

public class VideoJuego implements Entregable {
    private String titulo = "";
    private String genero = "";
    private String compañia = "";
    private Boolean entregado = false;
    private Integer horasEstimadas = 10;

    public VideoJuego() {
    }

    public VideoJuego(String titulo, Integer horasEstimadas) {
        this();
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, String genero, String compañia, Integer horasEstimadas) {
        this(titulo, horasEstimadas);
        this.genero = genero;
        this.compañia = compañia;
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

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return  "titulo = " + titulo +
                "\ngenero = " + genero +
                "\ncompañia = " + compañia +
                "\nentregado = " + entregado +
                "\nhorasEstimadas = " + horasEstimadas +
                "\n-----------------------------------";
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
