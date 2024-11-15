package com.pokemon.bank.Entrenador.aplication;

import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Entrenador.domain.entrenadorRepository;

import java.util.List;

public class entrenadorUsecases {

    private entrenadorRepository entrenadorRepository;

    public entrenadorUsecases(entrenadorRepository entrenadorRepository){
        this.entrenadorRepository = entrenadorRepository;
    }

    public List<Entrenador> get(){
        return this.entrenadorRepository.get();
    }
    public Entrenador get(String id){
        return this.entrenadorRepository.get(id);
    }

    public Entrenador insert(Entrenador entrenador){
        return this.entrenadorRepository.insert(entrenador);
    }

    public Entrenador delete(Entrenador entrenador){
        return this.entrenadorRepository.delete(entrenador);
    }
}
