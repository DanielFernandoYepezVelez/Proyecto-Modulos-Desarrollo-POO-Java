package com.moduloDesarrollo._11_EjercicioJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 11. Realizar  la  construcción  de  un  algoritmo  que  permita  de  acuerdo
         * a una frase pasada  por  consola, indicar  cual  es  la  longitud  de  esta  frase,
         * adicionalmente cuantas vocales tiene de “a,e,i,o,u”. */

        Scanner teclado = new Scanner(System.in);
        Integer contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        System.out.println("Ingrese Una Frase: ");
        String frase = teclado.nextLine();

        Integer longitud = frase.length();
        char[] fraseArray = frase.toCharArray();

        for (int i = 0; i < fraseArray.length; i++) {

            String valorArray = String.valueOf(fraseArray[i]).toLowerCase().trim();

            switch (valorArray) {
                case "a":
                    contadorA += 1;
                    break;

                case "e":
                    contadorE += 1;
                    break;

                case "i":
                    contadorI += 1;
                    break;

                case "o":
                    contadorO += 1;
                    break;

                case "u":
                    contadorU += 1;
                    break;
            }
        }

        System.out.println("\nLa Vocal \"a\" Se Encuentra: " + contadorA + " Veces.");
        System.out.println("La Vocal \"e\" Se Encuentra: " + contadorE + " Veces.");
        System.out.println("La Vocal \"i\" Se Encuentra: " + contadorI + " Veces.");
        System.out.println("La Vocal \"o\" Se Encuentra: " + contadorO + " Veces.");
        System.out.println("La Vocal \"u\" Se Encuentra: " + contadorU + " Veces.");
        System.out.println("Longitud De La Frase Ingresada: " + frase.length() + "Caracteres");
    }
}
