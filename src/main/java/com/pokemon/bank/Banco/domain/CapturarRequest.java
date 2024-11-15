package com.pokemon.bank.Banco.domain;

import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Pokemon.domain.Pokemon;

public class CapturarRequest {
    private Entrenador entrenador;
    private Pokemon pokemon;
    private Integer nivel;

    // Getters and Setters
    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
