package com.pokemon.bank.Entrenador.domain;

public class Entrenador {

    private int id;
    private String nombre;
    private char sexo;

    public Entrenador(int id, String nombre, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }


    public char getSexo() {
        return sexo;
    }

    public String toString() {
        return "Entrenador [id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + "]";
    }
}
