package com.moduloDesarrollo._17_EjercicioJava.model;

import com.moduloDesarrollo._17_EjercicioJava.model.Electrodomestico;

public class Lavadora extends Electrodomestico {
    private static final Double CARGA_KG = 5D;

    private Double carga = CARGA_KG;

    public Lavadora() { }

    public Lavadora(Double peso, Double precioBase) {
        super(peso, precioBase);
    }

    public Lavadora(Double peso, Double precioBase, String color, Character consumoEnergetico, Double carga) {
        super(peso, precioBase, color, consumoEnergetico);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    @Override
    public Double precioFinal() {
        return carga > 30 ? super.precioFinal() + 50D : super.precioFinal();
    }
}
