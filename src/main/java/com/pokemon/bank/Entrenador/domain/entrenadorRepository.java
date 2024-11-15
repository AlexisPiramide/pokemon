package com.pokemon.bank.Entrenador.domain;

import java.util.List;

public interface entrenadorRepository {

    public List<Entrenador> get();
    public Entrenador get(String  id);
    public Entrenador insert(Entrenador entrenador);
    public Entrenador delete(Entrenador entrenador);

}
