package com.moduloDesarrollo._03_EjercicioJava;

public class Main {
    public static void main(String[] args) {

        /**
         * 3. Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá porteclado
         * (recuerda  pasar  de  String  a  double  con Double.parseDouble).  Usa  la constante PI y
         * el método pow de Math.
         * */

        Double radio = SolicitarDatos.solicitarRadio();
        Double areaCirculo = Math.PI * radio;
        System.out.println("El Area Del Circulo Es: " + areaCirculo);
    }
}
