package com.moduloDesarrollo._04_EjercicioJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SolicitarDatos {
    private static final Double IVA = 0.21;
    public static Double precio;
    public static Double retencion;
    public static Double pagoTotal;

    public static Double solictarPrecio() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nIngrese Un Precio Para Un Producto: ");

        try {
            precio = teclado.nextDouble();
            retencion = precio * IVA;
            pagoTotal = precio + retencion;

        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e);
            solictarPrecio();
        }

        return pagoTotal;
    }
}
