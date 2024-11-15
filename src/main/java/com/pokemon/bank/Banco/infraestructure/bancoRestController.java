package com.pokemon.bank.Banco.infraestructure;

import com.pokemon.bank.Banco.aplication.bancoUsecases;
import com.pokemon.bank.Pokemon.domain.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class bancoRestController {

    private bancoUsecases bancoUsecases;

    public  bancoRestController(){
        this.bancoUsecases = new bancoUsecases(new bancoRepositorySQL());
    }


}
