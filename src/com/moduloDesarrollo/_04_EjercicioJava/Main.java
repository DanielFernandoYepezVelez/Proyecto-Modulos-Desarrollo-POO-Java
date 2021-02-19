package com.moduloDesarrollo._04_EjercicioJava;

public class Main {
    public static void main(String[] args) {
        /**
         * 4. Lee  un  número  por  teclado  que  pida  el  precio  de  un  producto  (puede tener decimales)
         * y calcule el precio final con IVA. El IVA sera una constante que sera del 21%. */

        Double total = SolicitarDatos.solictarPrecio();

        System.out.println("\nPrecio Inicial " + SolicitarDatos.precio + "$" +
                "\nIVA 21%: " + SolicitarDatos.retencion + "$" +
                "\nPrecio Final: " + SolicitarDatos.pagoTotal + "$");
    }
}
