package com.moduloDesarrollo._13_EjercicioJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /**
         * Realizar un algoritmo que permita consulta la
         * fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)
         * */

        Date fecha = new Date();
        SimpleDateFormat df1 = new SimpleDateFormat("'Fecha:' yyyy.MM.dd G 'Hora:' HH:mm:ss z");

        System.out.println(df1.format(fecha));
    }
}
