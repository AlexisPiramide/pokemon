package com.pokemon.bank.Entrenador.domain;

public class Entrenador {

    private String nombre;
    private char sexo;

    public Entrenador( String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }


    public String getNombre() {
        return nombre;
    }


    public char getSexo() {
        return sexo;
    }

}
