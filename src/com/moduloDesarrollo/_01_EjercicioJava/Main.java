package com.moduloDesarrollo._01_EjercicioJava;

public class Main {
    public static void main(String[] args) {

        /**
         * 1. Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de  los  dos.
         * Si  son  iguales  indicarlo también.  Ve  cambiando  los  valores  para comprobar que funciona.
         * */

        Double numeroUno = 15.89D;
        Double numeroDos = -17D;

        if (numeroUno > numeroDos) {
            System.out.println("El Número Mayor Es: " + numeroUno);
        } else if (numeroDos > numeroUno) {
            System.out.println("El Número Mayor Es: " + numeroDos);
        } else {
            System.out.println("Los Números Son Iguales: " + numeroUno + " = " + numeroDos);
        }
    }
}
