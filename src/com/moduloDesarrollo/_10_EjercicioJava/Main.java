package com.moduloDesarrollo._10_EjercicioJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 10. Realizar una aplicación de consola, que al ingresar una
         * frase por teclado elimine los espacios que esta contenga. */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa Una Frase Con Espacios En Blancos: ");
        String frase = teclado.nextLine();

        String entreMedios = frase.replaceAll("\\s+", "");

        System.out.println("Frase Ingresada Sin Espacios: " + entreMedios);
    }
}
