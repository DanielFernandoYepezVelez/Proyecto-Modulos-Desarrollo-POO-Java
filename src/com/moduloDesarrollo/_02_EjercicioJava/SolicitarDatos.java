package com.moduloDesarrollo._02_EjercicioJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SolicitarDatos {
    private static Double numeroUno = 0D;
    private static Double numeroDos = 0D;

    public static Double solicitarNumeroUno() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nIngrese Un Valor Númerico #1: ");

        try {
            numeroUno = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido." + e);
            solicitarNumeroUno();
        }

        return numeroUno;
    }

    public static Double solicitarNumeroDos() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nIngrese Un Valor Númerico #2: ");

        try {
            numeroDos = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido." + e);
            solicitarNumeroDos();
        }

        return numeroDos;
    }
}
