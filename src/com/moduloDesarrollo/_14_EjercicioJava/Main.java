package com.moduloDesarrollo._14_EjercicioJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 14. Crear un programa que pida un numero por teclado y que
         * imprima por pantalla los números desde el numero introducido
         * hasta 1000 con saldos de 2 en 2.
         * */

        Double valorNumerico = SolicitarDatos.valorNumerico();

        if (valorNumerico > 1000) {
            System.out.println("El Valor Ingresado Es Mayor A 1000, No Es Posible Mostrar Valores Númericos.");
        } else {
            for (Double i = valorNumerico; i <= 1000; i+=2) {
                System.out.println(i);
            }
        }
    }
}
