package com.moduloDesarrollo._03_EjercicioJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SolicitarDatos {
    private static Double radio;

    public static Double solicitarRadio() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nIngresa El Radio Para Calcular El Area De Un Circulo: ");

        try {
            radio = Math.pow(teclado.nextDouble(), 2);
        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
            solicitarRadio();
        }

        return radio;
    }
}
