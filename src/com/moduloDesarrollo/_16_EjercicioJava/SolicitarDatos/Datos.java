package com.moduloDesarrollo._16_EjercicioJava.SolicitarDatos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Datos {
    private static Double peso;
    private static Integer edad;
    private static Double altura;

    public static String solicitarNombre() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa El Nombre De La Persona: ");
        return teclado.nextLine();
    }

    public static Character solicitarSexo() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa El Sexo De La Persona (H ó M): ");
        return teclado.nextLine().toCharArray()[0];
    }

    public static Integer solicitarEdad() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa La Edad De La Persona: ");

        try {
            edad = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e + "\n");
            solicitarEdad();
        }

        return edad;
    }

    public static Double solicitarPeso() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa El Peso De La Persona: ");

        try {
            peso = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e + "\n");
            solicitarPeso();
        }

        return peso;
    }

    public static Double solicitarAltura() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa La Altura De La Persona: ");

        try {
            altura = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("El Valor Ingresado No Es Válido. " + e + "\n");
            solicitarAltura();
        }

        return altura;
    }

    public static void pesoPersona(Integer peso) {
        if (peso == (-1)) {
            System.out.println("\n********** Felicitaciones, Estas En Tu Peso Ideal **********\n");
        } else if (peso == 0) {
            System.out.println("\n********** Cuidado!, Estas Por Debajo De Tu Peso Ideal **********\n");
        } else if (peso == 1) {
            System.out.println("\n********** Cuidado!, Estas Por Encima De Tu Peso Ideal **********\n");
        }
    }
}