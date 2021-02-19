package com.moduloDesarrollo._02_EjercicioJava;

public class Main {
    public static void main(String[] args) {

        /**
         * 2. Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores,
         * menores o iguales.*/

        Double numeroUno = SolicitarDatos.solicitarNumeroUno();
        Double numeroDos = SolicitarDatos.solicitarNumeroDos();

        if (numeroUno > numeroDos) {
            System.out.println("***** El Número Mayor Es: " + numeroUno + " *****");
        } else if (numeroDos > numeroUno) {
            System.out.println("***** El Número Mayor Es: " + numeroDos + " *****");
        } else {
            System.out.println("***** Los Números Son Iguales: " + numeroUno + " = " + numeroDos + " *****");
        }
    }
}
