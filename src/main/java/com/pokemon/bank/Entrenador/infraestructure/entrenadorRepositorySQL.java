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
                Entrenador entrenador = new Entrenador(rs.getInt("id"),rs.getString("nombre"),rs.getString("sexo").charAt(0));
                entrenadores.add(entrenador);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return entrenadores;
    }

    @Override
    public Entrenador get(Integer id) {
        String query = "SELECT * FROM entrenador WHERE id= (?)";
        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Entrenador entrenador = new Entrenador(rs.getInt("id"),rs.getString("nombre"),rs.getString("sexo").charAt(0));
                return entrenador;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Entrenador insert(Entrenador entrenador) {

        String query = "INSERT INTO entrenador (id, nombre, sexo) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);

            preparedStatement.setInt(1, entrenador.getId());
            preparedStatement.setString(2, entrenador.getNombre());
            preparedStatement.setString(3, String.valueOf(entrenador.getSexo()));

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) return entrenador;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public Entrenador delete(Entrenador entrenador) {
        String query = "DELETE FROM entrenador WHERE id = ?";
        try {

            PreparedStatement preparedStatement = DBConnection.getInstance().prepareStatement(query);
            preparedStatement.setInt(1, entrenador.getId());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) return entrenador;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

}
