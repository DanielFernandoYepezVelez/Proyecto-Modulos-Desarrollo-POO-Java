package com.moduloDesarrollo._05_EjercicioJava;

public class Main {
    public static void main(String[] args) {

        /**
         * 5. Muestra los números impares y pares del 1 al 100
         * (ambos incluidos). Usa un bucle while. */

        Integer i = 1;

        System.out.println("********** CICLO WHILE **********");
        while (i <= 100) {
            if(i % 2 == 0) {
                System.out.println("Numero PAR => " + i);
            } else {
                System.out.println("Numero IMPAR => " + i);
            }

            i += 1;
        }
    }
}
