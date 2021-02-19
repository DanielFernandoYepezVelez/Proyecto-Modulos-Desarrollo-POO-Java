package com.moduloDesarrollo._09_EjercicioJava;

public class Main {
    public static void main(String[] args) {
        /**
         * 9. Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza  todas las a del
         * String anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes
         * quieran incluir por consola y las muestre luego unidas.
         * */

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        System.out.println("Frase Original: " + texto);

        String adicional = " ***** Los Valores De Las Personas Se Conocen Cuando Los Obstaculos Se Presentan";
        String modificado = texto.replace("a", "e").concat(adicional);

        System.out.println("Frase Modificada: " + modificado);
        System.out.println("Longitud Frase Modificada: " + modificado.length() + " Unidades");
    }
}
