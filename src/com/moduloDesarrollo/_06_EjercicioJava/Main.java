package com.moduloDesarrollo._06_EjercicioJava;

public class Main {
    public static void main(String[] args) {

        /**
         * 5. Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
         * 6. Realiza el ejercicio anterior usando un ciclo for. */

        System.out.println("********** CICLO FOR **********");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero PAR => " + i);
            } else {
                System.out.println("Numero IMPAR => " + i);
            }
        }
    }
}
