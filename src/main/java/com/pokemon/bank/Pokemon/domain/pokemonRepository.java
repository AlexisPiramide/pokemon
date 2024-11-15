package com.pokemon.bank.Pokemon.domain;

import java.util.List;

public interface pokemonRepository {

    public List<Pokemon> get();
    public List<Pokemon> getTipo(String tipo);
    public Pokemon get(String nombre);
    public Pokemon insert(Pokemon pokemon);

}
