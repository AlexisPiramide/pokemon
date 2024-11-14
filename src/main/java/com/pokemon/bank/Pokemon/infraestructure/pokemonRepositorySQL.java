package com.pokemon.bank.Pokemon.infraestructure;

import com.pokemon.bank.Context.DBConnection;
import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Pokemon.domain.Pokemon;
import com.pokemon.bank.Pokemon.domain.pokemonRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class pokemonRepositorySQL implements pokemonRepository {

    @Override
    public List<Pokemon> get() {
        List<Pokemon> pokemons = new ArrayList<>();
        String query = "SELECT * FROM pokemon";
        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Pokemon pokemon = new Pokemon(rs.getString("nombre"),rs.getString("tipoP"),rs.getString("tipoS"));
                pokemons.add(pokemon);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return pokemons;
    }

    @Override
    public Pokemon get(String nombre) {
        return null;
    }

    @Override
    public Pokemon insert(Pokemon pokemon) {
        return null;
    }
}
