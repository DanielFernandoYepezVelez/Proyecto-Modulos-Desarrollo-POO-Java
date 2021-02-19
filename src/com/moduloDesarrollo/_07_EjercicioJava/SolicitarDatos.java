package com.moduloDesarrollo._07_EjercicioJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SolicitarDatos {
    private static Double valor;

    public static Double valorNumerico() {
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\nIngrese Un Valor Númerico: ");

            try {
                valor = teclado.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("El Valor Ingresado No Es Válido. " + e);
                valorNumerico();
            }
        } while (!(valor >= 0));

        return valor;
    }
}
