package com.pokemon.bank.Pokemon.aplication;

import com.pokemon.bank.Pokemon.domain.Pokemon;
import com.pokemon.bank.Pokemon.domain.pokemonRepository;

import java.util.List;

public class pokemonUsecases {

    public pokemonRepository pokemonRepository;

    public pokemonUsecases(pokemonRepository pokemonRepository){
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> get() {
        return this.pokemonRepository.get();
    }

    public List<Pokemon> getTipo(String tipo) {
        return this.pokemonRepository.getTipo(tipo);
    }

    public Pokemon get(String nombre){
        return this.pokemonRepository.get(nombre);
    }

    public Pokemon insert(Pokemon pokemon){
        return this.pokemonRepository.insert(pokemon);
    }
}
