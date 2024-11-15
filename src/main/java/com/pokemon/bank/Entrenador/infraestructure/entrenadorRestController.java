package com.pokemon.bank.Entrenador.infraestructure;

import com.pokemon.bank.Banco.aplication.bancoUsecases;
import com.pokemon.bank.Banco.domain.Banco;
import com.pokemon.bank.Banco.domain.CapturarRequest;
import com.pokemon.bank.Banco.infraestructure.bancoRepositorySQL;
import com.pokemon.bank.Entrenador.aplication.entrenadorUsecases;
import com.pokemon.bank.Entrenador.domain.Entrenador;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class entrenadorRestController {

    private entrenadorUsecases entrenadorUsecases;
    private bancoUsecases bancoUsecases;

    public entrenadorRestController(){
        this.entrenadorUsecases = new entrenadorUsecases(new entrenadorRepositorySQL());
        this.bancoUsecases = new bancoUsecases(new bancoRepositorySQL());
    }

    @GetMapping("/api/entrenador/")
    public List<Entrenador> getEntrenadores(){
        return this.entrenadorUsecases.get();
    }

    @PostMapping("/api/entrenador/")
    public Entrenador nuevo(@RequestBody Entrenador entrenador) {
        return this.entrenadorUsecases.insert(entrenador);
    }

    @DeleteMapping("/api/entrenador/")
    public void remover(@RequestBody Entrenador entrenador) {
        this.entrenadorUsecases.delete(entrenador); // Assuming `delete` exists in usecases
    }

    @PutMapping("/api/entrenador/capturar")
    public List<Banco> capturar(@RequestBody CapturarRequest request) {
        return this.bancoUsecases.insert(request.getPokemon(), request.getEntrenador(), request.getNivel());
    }
}
