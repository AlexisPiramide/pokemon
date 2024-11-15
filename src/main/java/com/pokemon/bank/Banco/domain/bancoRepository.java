package com.pokemon.bank.Banco.domain;

import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Pokemon.domain.Pokemon;

import java.util.List;

public interface bancoRepository {
    public List<Banco> get(Entrenador entrenador);
    public List<Banco> insert(Pokemon pokemon, Entrenador entrenador, int nivel);
    public List<Banco> delete(Pokemon pokemon, Entrenador entrenador);
}
