package com.moduloDesarrollo._16_EjercicioJava;

import com.moduloDesarrollo._16_EjercicioJava.SolicitarDatos.Datos;
import com.moduloDesarrollo._16_EjercicioJava.model.Persona;

public class Main {
    public static void main(String[] args) {

        /** ============ Objeto #1 ============ */
        System.out.println("======== OBJETO #1 ============");
        String nombre = Datos.solicitarNombre();
        Integer edad = Datos.solicitarEdad();
        Character sexo = Datos.solicitarSexo();
        Double peso = Datos.solicitarPeso();
        Double altura = Datos.solicitarAltura();

        Persona personaUno = new Persona(nombre, edad, sexo, peso, altura);
        Datos.pesoPersona(personaUno.calcularIMC());
        personaUno.esMayorDeEdad();

        /** ============ Objeto #2 ============ */
        System.out.println("\n======== OBJETO #2 ============");
        nombre = Datos.solicitarNombre();
        edad = Datos.solicitarEdad();
        sexo = Datos.solicitarSexo();
        peso = Datos.solicitarPeso();
        altura = Datos.solicitarAltura();

        Persona personaDos = new Persona(nombre, edad, sexo);

        personaDos.setPeso(peso);
        personaDos.setAltura(altura);

        Datos.pesoPersona(personaDos.calcularIMC());
        personaDos.esMayorDeEdad();

        /** ============ Objeto #3 ============ */
        System.out.println("\n======== OBJETO #3 ============");
        nombre = Datos.solicitarNombre();
        edad = Datos.solicitarEdad();
        sexo = Datos.solicitarSexo();
        peso = Datos.solicitarPeso();
        altura = Datos.solicitarAltura();

        Persona personaTres = new Persona();

        personaTres.setNombre(nombre);
        personaTres.setEdad(edad);
        personaTres.setSexo(sexo);
        personaTres.setPeso(peso);
        personaTres.setAltura(altura);

        Datos.pesoPersona(personaTres.calcularIMC());
        personaTres.esMayorDeEdad();

        /** -------------- INFORMACIÓN DE LOS OBJETOS -------------- */
        System.out.println("====== INFORMACIÓN PERSONA #1 ======");
        System.out.println(personaUno.toString());

        System.out.println("\n====== INFORMACIÓN PERSONA #2 ======");
        System.out.println(personaDos.toString());

        System.out.println("\n====== INFORMACIÓN PERSONA #3 ======");
        System.out.println(personaTres.toString());
    }
}
