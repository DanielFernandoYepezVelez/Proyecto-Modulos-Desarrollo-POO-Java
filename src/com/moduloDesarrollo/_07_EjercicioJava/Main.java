package com.moduloDesarrollo._07_EjercicioJava;

public class Main {
    public static void main(String[] args) {
        /**
         * 7. Lee un número por teclado y comprueba que este numero
         * es mayor o igual que cero, si no lo es lo volverá a pedir
         * (do while), después muestra ese número por consola. */

        Double valorNumerico = SolicitarDatos.valorNumerico();
        System.out.println("\nEl Valor Ingresado Es : " + valorNumerico);
    }
}
