package com.pokemon.bank.Pokemon.domain;

public class Pokemon {

    private String nombre;
    private String tipoP;
    private String tipoS;

    public Pokemon(String nombre, String tipoP, String tipoS) {
        this.nombre = nombre;
        this.tipoP = tipoP;
        this.tipoS = tipoS;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoP() {
        return tipoP;
    }


    public String getTipoS() {
        return tipoS;
    }

    @Override
    public String toString() {
        return "Pokemon [nombre=" + nombre + ", tipoP=" + tipoP + ", tipoS=" + tipoS + "]";
    }
}
