package com.moduloDesarrollo._16_EjercicioJava.model;

public class Persona {
    private static final Character HOMBRE = 'H';

    private String dni;
    private Integer edad = 0;
    private Double peso = 0D;
    private Double altura = 0D;
    private String nombre = "";
    private Character sexo = HOMBRE;

    private Integer persona_imc;
    private Boolean persona_edad;
    private String persona_peso_mensaje;

    public Persona() {
        this.generarDNI();
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.comprobarSexo(sexo);
    }

    public Persona(String nombre, Integer edad, Character sexo, Double peso, Double altura) {
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer calcularIMC() {
        double imc = this.peso / (Math.pow(this.altura, 2));

        if (imc < 20) {
            this.persona_imc = -1;
            this.persona_peso_mensaje = "********** Felicitaciones, Estas En Tu Peso Ideal **********";

        } else if (imc >= 20 && imc <= 25) {
            this.persona_imc = 0;
            this.persona_peso_mensaje = "********** Cuidado!, Estas Por Debajo De Tu Peso Ideal **********";

        } else if (imc > 25) {
            this.persona_imc = 1;
            this.persona_peso_mensaje = "********** Cuidado!, Estas Por Encima De Tu Peso Ideal **********";
        }

        return this.persona_imc;
    }

    public void esMayorDeEdad() {
        if (this.edad >= 18) {
            this.persona_edad = true;
        } else {
            this.persona_edad = false;
        }
    }

    private void comprobarSexo(char sexo) {
        String genero = String.valueOf(sexo).toUpperCase();

        if (!(genero.equalsIgnoreCase("H") || genero.equalsIgnoreCase("M"))) {
            this.sexo = HOMBRE;
            return;
        }

        this.sexo = sexo;
    }

    private void aleatorio() {
        this.dni = Math.round(Math.floor((Math.random() * (90 - 65 + 1) + 65)))
                + String.valueOf(Math.round(Math.floor((Math.random() * (90 - 65 + 1) + 65))))
                + Math.round(Math.floor((Math.random() * (90 - 65 + 1) + 65)))
                + Math.round(Math.floor((Math.random() * (90 - 65 + 1) + 65)));
    }

    private void generarDNI() {
        this.aleatorio();

        int uno = Integer.parseInt(this.dni.substring(0,2));
        int dos = Integer.parseInt(this.dni.substring(2,4));
        int tres = Integer.parseInt(this.dni.substring(4,6));
        int cuatro = Integer.parseInt(this.dni.substring(6,8));

        char pa = (char) uno;
        char la = (char) dos;
        char bri = (char) tres;
        char ta = (char) cuatro;

        this.dni = pa + "" + la + "" + bri + "" + ta;
    }

    @Override
    public String toString() {
        return  "DNI = " + dni +
                "\nnombre = " + nombre +
                "\nedad = " + edad +
                "\nsexo = " + sexo +
                "\npeso = " + peso + " kg" +
                "\naltura = " + altura + " m" +
                "\nEs Mayor De Edad = " + this.persona_edad +
                "\nIMC Resultado Valor = " + this.persona_imc +
                "\nIMC Resultado Mensaje = " + this.persona_peso_mensaje;
    }
}