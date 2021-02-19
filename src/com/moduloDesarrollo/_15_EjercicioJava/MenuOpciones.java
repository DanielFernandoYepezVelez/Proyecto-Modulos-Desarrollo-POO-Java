package com.moduloDesarrollo._15_EjercicioJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOpciones {
    private static Integer opcion;

    public static void menu() {
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\n****** GESTION CINEMATOGRÁFICA ********\n" +
                    " * 1-NUEVO ACTOR\n" +
                    " * 2-BUSCAR ACTOR\n" +
                    " * 3-ELIMINAR ACTOR\n" +
                    " * 4-MODIFICAR ACTOR\n" +
                    " * 5-VER TODOS LOS ACTORES\n" +
                    " * 6-VER PELICULAS DE LOS ACTORES\n" +
                    " * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    " * 8-SALIR\n");

            System.out.println("Ingrese Una Opción De La Lista Del Menú: ");

            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nEl Valor Ingresado No Es Válido. " + e);
                menu();
            }

            if (opcion > 7 && opcion != 8) {
                System.out.println("\n===== OPCIÓN INCORRECTA =====.");
                menu();
            }

        } while (opcion != 8);
    }
}
