package com.pokemon.bank.Entrenador.infraestructure;

import com.pokemon.bank.Context.DBConnection;
import com.pokemon.bank.Entrenador.domain.Entrenador;
import com.pokemon.bank.Entrenador.domain.entrenadorRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class entrenadorRepositorySQL implements entrenadorRepository {

    @Override
    public List<Entrenador> get() {

        List<Entrenador> entrenadores = new ArrayList<>();
        String query = "SELECT * FROM entrenador";
        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Entrenador entrenador = new Entrenador(rs.getString("nombre"),rs.getString("sexo").charAt(0));
                entrenadores.add(entrenador);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return entrenadores;
    }

    @Override
    public Entrenador get(String nombre) {
        String query = "SELECT * FROM entrenador WHERE nombre= (?)";
        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            preparedStatement.setString(1,nombre);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Entrenador entrenador = new Entrenador(rs.getString("nombre"),rs.getString("sexo").charAt(0));
                return entrenador;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Entrenador insert(Entrenador entrenador) {

        String query = "INSERT INTO entrenador (nombre, sexo) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            ;
            preparedStatement.setString(1, entrenador.getNombre());
            preparedStatement.setString(2, String.valueOf(entrenador.getSexo()));

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) return entrenador;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Entrenador delete(Entrenador entrenador) {
        String query = "DELETE FROM entrenador WHERE nombre = ?";
        try {

            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            preparedStatement.setString(1,entrenador.getNombre());
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) return entrenador;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

}
