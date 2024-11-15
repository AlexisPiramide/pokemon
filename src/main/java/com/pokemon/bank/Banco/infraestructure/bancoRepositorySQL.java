package com.pokemon.bank.Banco.infraestructure;

import com.pokemon.bank.Banco.domain.Banco;
import com.pokemon.bank.Banco.domain.bancoRepository;
import com.pokemon.bank.Context.DBConnection;
import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Entrenador.infraestructure.entrenadorRepositorySQL;
import com.pokemon.bank.Pokemon.domain.Pokemon;
import com.pokemon.bank.Pokemon.infraestructure.pokemonRepositorySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bancoRepositorySQL implements bancoRepository {

    private pokemonRepositorySQL pokemonRepositorySQL;
    private entrenadorRepositorySQL entrenadorRepositorySQL;

    public bancoRepositorySQL(){
        this.pokemonRepositorySQL= new pokemonRepositorySQL();
        this.entrenadorRepositorySQL = new entrenadorRepositorySQL();
    }

    @Override
    public List<Banco> get(Entrenador entrenador) {
        List<Banco> bancoList = new ArrayList<>();
        String query = "SELECT pokemon, entrenador, nivel FROM banco WHERE entrenador = ?";

        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            preparedStatement.setString(1, entrenador.getNombre());
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Pokemon pokemon = pokemonRepositorySQL.get(rs.getString("pokemon"));
                Entrenador entrenadorResult = entrenadorRepositorySQL.get(rs.getString("entrenador"));
                int nivel = rs.getInt("nivel");

                Banco banco = new Banco(pokemon, entrenadorResult, nivel);
                bancoList.add(banco);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return bancoList;
    }


    @Override
    public List<Banco> insert(Pokemon pokemon, Entrenador entrenador, int nivel) {
        String query = "INSERT INTO banco (pokemon, entrenador, nivel) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            preparedStatement.setString(1, pokemon.getNombre());
            preparedStatement.setString(2, entrenador.getNombre());
            preparedStatement.setInt(3, nivel);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Insert successful.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting into Banco table: " + e.getMessage(), e);
        }

        // Optionally return the updated list of entries for the given entrenador
        return get(entrenador);
    }

    @Override
    public List<Banco> delete(Pokemon pokemon, Entrenador entrenador) {
        String query = "DELETE FROM banco WHERE pokemon = ? AND entrenador = ?";

        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            preparedStatement.setString(1, pokemon.getNombre());
            preparedStatement.setString(2, entrenador.getNombre());

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Delete successful.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting from Banco table: " + e.getMessage(), e);
        }

        // Optionally return the updated list of entries for the given entrenador
        return get(entrenador);
    }

}
