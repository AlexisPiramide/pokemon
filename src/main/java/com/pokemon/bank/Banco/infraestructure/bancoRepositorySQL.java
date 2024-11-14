package com.pokemon.bank.Banco.infraestructure;

import com.pokemon.bank.Banco.domain.Banco;
import com.pokemon.bank.Banco.domain.bancoRepository;
import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Pokemon.domain.Pokemon;

import java.util.List;

public class bancoRepositorySQL implements bancoRepository {
    @Override
    public List<Banco> get(Entrenador entrenador) {
        return List.of();
    }

    @Override
    public List<Banco> insert(Pokemon pokemon, Entrenador entrenador) {
        return List.of();
    }

    @Override
    public List<Banco> delete(Pokemon pokemon, Entrenador entrenador) {
        return List.of();
    }
}
