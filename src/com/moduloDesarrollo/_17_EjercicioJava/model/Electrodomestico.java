package com.moduloDesarrollo._17_EjercicioJava.model;

import java.util.Objects;

public class Electrodomestico {
    private static final Double PESO_KG = 5D;
    private static final Double PRECIO_BASE = 100D;
    private static final String MENSAJE = "No Son Permitidos Valores Nulos";
    private static final String[] COLORES = {"blanco", "negro", "rojo", "azul", "gris"};
    private static final Character[] CONSUMO_ENERGETICO = {'A', 'B', 'C', 'D', 'E', 'F'};

    protected Double peso = PESO_KG;
    protected String color = COLORES[0];
    protected Double precioBase = PRECIO_BASE;
    protected Character consumoEnergetico = CONSUMO_ENERGETICO[5];

    public Electrodomestico() { }

    public Electrodomestico(Double peso, Double precioBase) {
        this();
        this.peso = Objects.requireNonNull(peso, MENSAJE);
        this.precioBase = Objects.requireNonNull(precioBase, MENSAJE);
    }

    public Electrodomestico(Double peso, Double precioBase, String color, Character consumoEnergetico) {
        this(peso, precioBase);
        this.color = Objects.requireNonNull(color, MENSAJE);
        this.consumoEnergetico = Objects.requireNonNull(consumoEnergetico, MENSAJE);

        this.comprobarConsumoEnergetico(consumoEnergetico);
        this.comprobarColor(color);
    }

    public Double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public Double getPrecioBase() { return precioBase; }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    private void comprobarConsumoEnergetico(char letra) {
        for (Character consumo: CONSUMO_ENERGETICO) {
            if (consumo == letra) {
                consumoEnergetico = letra;
                break;
            }
        }
    }

    private void comprobarColor(String color) {
        for (String colorcito: COLORES) {
            if (colorcito.equalsIgnoreCase(color)) {
                this.color = colorcito;
                break;
            }
        }
    }

     private Double definirPrecioPeso() {
         if (peso >= 0 && peso <= 19) {
            return 10D;
        }

        if (peso >= 20 && peso <= 49) {
            return 50D;
        }

        return (peso >= 50 && peso <= 79) ? 80D : 100D;
    }

    private Double definirPrecioConsumo() {
        if (consumoEnergetico == 'A') {
            return 100D;
        }

        if (consumoEnergetico == 'B') {
            return 80D;
        }

        if (consumoEnergetico == 'C') {
            return 60D;
        }

        if (consumoEnergetico == 'D') {
            return 50D;
        }

        return consumoEnergetico == 'E' ? 30D : 10D;
    }

    public Double precioFinal() {
        return this.precioBase += (this.definirPrecioConsumo() + this.definirPrecioPeso());
    }
}
