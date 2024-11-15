package com.pokemon.bank.Banco.aplication;

import com.pokemon.bank.Banco.domain.Banco;
import com.pokemon.bank.Banco.domain.bancoRepository;
import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Pokemon.domain.Pokemon;

import java.util.List;

public class bancoUsecases {

    private bancoRepository bancoRepository;

    public bancoUsecases(bancoRepository bancoRepository){
        this.bancoRepository = bancoRepository;
    }

    public List<Banco> get(Entrenador entrenador){
        return this.bancoRepository.get(entrenador);
    }
    public List<Banco> insert(Pokemon pokemon, Entrenador entrenador, int nivel){
        return this.bancoRepository.insert(pokemon,entrenador,nivel);
    }

    public List<Banco> delete(Pokemon pokemon, Entrenador entrenador){
        return this.bancoRepository.delete(pokemon,entrenador);
    }
}
