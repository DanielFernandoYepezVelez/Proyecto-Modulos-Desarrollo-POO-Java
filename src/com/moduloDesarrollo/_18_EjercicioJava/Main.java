package com.moduloDesarrollo._18_EjercicioJava;

import com.moduloDesarrollo._18_EjercicioJava.model.Serie;
import com.moduloDesarrollo._18_EjercicioJava.model.VideoJuego;

public class Main {
    public static void main(String[] args) {
        Integer contadorSerie = 0;
        Integer contadorVideoJuego = 0;

        Serie[] serie = new Serie[5];
        VideoJuego[] videoJuego = new VideoJuego[5];

        serie[0] = new Serie("Serie Uno", "Carlos Andres");
        serie[1] = new Serie("Serie Dos", "Drama", "Constancia Hernandez", 4);
        serie[2] = new Serie("Serie Tres", "Maria Camila");
        serie[3] = new Serie("Serie Cuatro", "Investigativo", "Bernardo Silva", 5);
        serie[4] = new Serie("Serie Cinco", "Antonia Goez");

        videoJuego[0] = new VideoJuego("Video Juego Uno", 6);
        videoJuego[1] = new VideoJuego("Video Juego Dos", "Aventura", "Compañia World", 2);
        videoJuego[2] = new VideoJuego("Video Juego Tres", 7);
        videoJuego[3] = new VideoJuego("Video Juego Cuatro", "Deportes", "Compañia Spox", 1);
        videoJuego[4] = new VideoJuego("Video Juego Cinco", 3);

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                serie[i].entregar();
                contadorSerie += 1;
            }

            if (i % 2 != 0) {
                videoJuego[i].entregar();
                contadorVideoJuego += 1;
            }
        }

        System.out.println("===== Proyectando Las Series =====");

        for (int i = 0; i < 5; i++) {
            System.out.println(serie[i].toString());
        }

        System.out.println("Cantidad De Series Entregadas = " + contadorSerie);

        System.out.println("\n===== Proyectando Los Video Juegos =====");

        for (int i = 0; i < 5; i++) {
            System.out.println(videoJuego[i].toString());
        }

        System.out.println("Cantidad De Video Juegos Entregadas = " + contadorVideoJuego);
    }
}
