package com.moduloDesarrollo._17_EjercicioJava;

public class Television  extends Electrodomestico {
    private Double resolucion = 20D;
    private Boolean sintonizadorTDT = false;

    public Television() { }

    public Television(Double peso, Double precioBase) {
        super(peso, precioBase);
    }

    public Television(Double peso, Double precioBase, String color, Character consumoEnergetico, Double resolucion, Boolean sintonizadorTDT) {
        super(peso, precioBase, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public Double precioFinal() {
        Double precioFinal = super.precioFinal();
        Double porcentaje = precioFinal * 0.30;
        Integer aumentoTDT = 50;

        return (resolucion > 40 && sintonizadorTDT) ? (precioFinal + porcentaje + aumentoTDT) : precioFinal;
    }
}
