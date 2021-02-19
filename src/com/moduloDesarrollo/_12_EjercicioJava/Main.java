package com.moduloDesarrollo._12_EjercicioJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** ***** POR CONFIRMAR *****
         * 12. Pedir dos palabras por teclado, indicar si
         * son iguales, sino son iguales mostrar sus diferencias.
         * */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese La Primera Palabra: ");
        String fraseUno = teclado.nextLine().toLowerCase().trim();

        System.out.println("Ingrese La Segunda Palabra: ");
        String fraseDos = teclado.nextLine().toLowerCase().trim();

        if (fraseUno.equalsIgnoreCase(fraseDos)) {
            System.out.println("Las Dos Palabras Son Iguales. " + fraseUno + " -- " + fraseDos);
        } else {
            System.out.println("Las Dos Palabras Son Diferentes. " + fraseUno + " -- " + fraseDos);
        }
    }
}
