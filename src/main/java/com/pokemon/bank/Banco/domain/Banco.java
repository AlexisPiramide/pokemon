package com.pokemon.bank.Banco.domain;

import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Pokemon.domain.Pokemon;

public class Banco {
    private Pokemon pokemon;
    private Entrenador entrenador;
    private int nivel;

    public Banco(Pokemon pokemon, Entrenador entrenador, int nivel) {
        this.pokemon = pokemon;
        this.entrenador = entrenador;
        this.nivel = nivel;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public int getNivel() {
        return nivel;
    }


    public void mostrarInformacion() {
        System.out.println("Entrenador: " + entrenador.getNombre() + " (ID: " + entrenador.getId() + ")");
        System.out.println("Pokémon: " + pokemon.getNombre() + " - Tipo: " + pokemon.getTipoP());
        if (pokemon.getTipoS() != null) {
            System.out.println("Tipo Secundario: " + pokemon.getTipoS());
        }
        System.out.println("Nivel: " + nivel);
    }
}
