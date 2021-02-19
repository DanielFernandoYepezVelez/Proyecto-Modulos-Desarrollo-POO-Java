package com.moduloDesarrollo._08_EjercicioJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 8. Crea una aplicación por consola que nos pida un día de la semana
         * y que nos diga si es un día laboral o no. Usa un switch para ello.*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese Un Dia De La Semana: ");
        String dia = teclado.next().toLowerCase().trim();

        switch (dia) {
            case "lunes":
                System.out.println("El Lunes Es Un Día Laboral.");
                break;

            case "martes":
                System.out.println("El Martes Es Un Día Laboral.");
                break;

            case "miercoles":
                System.out.println("El Miercoles Es Un Día Laboral.");
                break;

            case "jueves":
                System.out.println("El Jueves Es Un Día Laboral.");
                break;

            case "viernes":
                System.out.println("El Viernes Es Un Día Laboral.");
                break;

            case "sabado":
                System.out.println("El Sabado NO Es Un Día Laboral.");
                break;

            case "domingo":
                System.out.println("El Domingo NO Es Un Día Laboral.");
                break;

            default:
                System.out.println("El Valor Ingresado No Hace Parte De Los Dìas De La Semana.");
                break;
        }
    }
}
