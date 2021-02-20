package com.moduloDesarrollo._17_EjercicioJava;

import com.moduloDesarrollo._17_EjercicioJava.model.Electrodomestico;
import com.moduloDesarrollo._17_EjercicioJava.model.Lavadora;
import com.moduloDesarrollo._17_EjercicioJava.model.Television;

public class Main {
    public static void main(String[] args) {
        Double precioTotalLavadoras = 0D;
        Double precioTotalTelevisores = 0D;
        Double precioElectrodomesticos = 0D;

        Electrodomestico[] electrodomestico = new Electrodomestico[10];
        Integer longitud = electrodomestico.length;

        electrodomestico[0] = new Electrodomestico(5D, 10D, "blanco", 'A');
        electrodomestico[1] = new Electrodomestico(10D, 20D, "negro", 'B');
        electrodomestico[2] = new Electrodomestico(15D, 30D, "rojo", 'C');

        electrodomestico[7] = new Lavadora(40D, 80D, "azul", 'D', 45D);
        electrodomestico[8] = new Lavadora(45D, 90D, "gris", 'E', 23D);
        electrodomestico[9] = new Lavadora(50D, 100D, "blanco", 'F', 50D);

        electrodomestico[3] = new Television(20D, 40D, "negro", 'A', 50D, true);
        electrodomestico[4] = new Television(25D, 50D, "rojo", 'B', 25D, false);
        electrodomestico[5] = new Television(30D, 60D, "azul", 'C', 48D, true);
        electrodomestico[6] = new Television(35D, 70D, "gris", 'D', 10D, false);

        for (int i = 0; i < longitud; i++) {
            if (electrodomestico[i] instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico[i].precioFinal();
            }

            if (electrodomestico[i] instanceof Television) {
                precioTotalTelevisores += electrodomestico[i].precioFinal();
            }

            if (electrodomestico[i] instanceof Electrodomestico &&
                !(electrodomestico[i] instanceof Television) &&
                !(electrodomestico[i] instanceof Lavadora)) {
                precioElectrodomesticos += electrodomestico[i].precioFinal();
            }
        }

        System.out.println("========== TOTAL LAVADORAS ==========");
        System.out.println("Precio Lavadoras: " + precioTotalLavadoras + "$");

        System.out.println("\n========== TOTAL TELEVISORES ==========");
        System.out.println("Precio Televisores: " + precioTotalTelevisores + "$");

        System.out.println("\n========== TOTAL ELECTRODOMESTICOS ==========");
        System.out.println("Precio Electrodomesticos: " + (precioElectrodomesticos + precioTotalLavadoras + precioTotalTelevisores) + "$");
    }
}
