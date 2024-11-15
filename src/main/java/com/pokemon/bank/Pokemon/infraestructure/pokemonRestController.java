package com.pokemon.bank.Pokemon.infraestructure;

import com.pokemon.bank.Pokemon.aplication.pokemonUsecases;
import com.pokemon.bank.Pokemon.domain.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class pokemonRestController {

    private pokemonUsecases pokemonUsecases;

    public pokemonRestController(){
        this.pokemonUsecases= new pokemonUsecases(new pokemonRepositorySQL());
    }

    @GetMapping("/api/pokemon/")
    public List<Pokemon> getPokemons(){
        return this.pokemonUsecases.get();
    }

    @GetMapping("/api/pokemon/{tipo}")
    public List<Pokemon> getTipo(@PathVariable String tipo ){
        return this.pokemonUsecases.getTipo(tipo);
    }

}
