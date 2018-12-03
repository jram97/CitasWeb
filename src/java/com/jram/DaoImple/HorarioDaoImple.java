package com.jram.DaoImple;

import com.jram.Dao.Connect;
import com.jram.Entity.Horario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class HorarioDaoImple {

    Connect con;

    private final String HORA = "SELECT * FROM HORARIOS WHERE ID_DOCTOR = ?;";
    private final String HORAALL = "SELECT * FROM HORARIOS;";
    private final String SAVEHORA = "INSERT INTO HORARIOS VALUES(?, ?, ?, ?);";
    private final String DELETE = "DELETE FROM HORARIOS WHERE ID_HORARIO = ?;";

    public HorarioDaoImple(Connect con) {
        this.con = con;
    }

    public List<Horario> getAll() {

        try {
            PreparedStatement ps = con.Start().prepareStatement(HORAALL);
            ResultSet rs = ps.executeQuery();

            List<Horario> horario = new LinkedList<>();

            while (rs.next()) {

                Horario h = new Horario();
                h.setCodigoHorario(rs.getInt("ID_HORARIO"));
                h.setCodigoDoctor(rs.getInt("ID_DOCTOR"));
                h.setHoras(rs.getTimestamp("HORAS_DISPONIBLES"));
                h.setDisponible(rs.getString("DISPONIBLE"));

                horario.add(h);

            }

            return horario;

        } catch (SQLException e) {
            return null;

        }        
    }
    
    

    public List<Horario> findAll(int codigo) {

        try {
            PreparedStatement ps = con.Start().prepareStatement(HORA);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            List<Horario> horario = new LinkedList<>();

            while (rs.next()) {

                Horario h = new Horario();
                h.setCodigoHorario(rs.getInt("ID_HORARIO"));
                h.setCodigoDoctor(rs.getInt("ID_DOCTOR"));
                h.setHoras(rs.getTimestamp("HORAS_DISPONIBLES"));
                h.setDisponible(rs.getString("DISPONIBLE"));

                horario.add(h);

            }

            return horario;

        } catch (SQLException e) {
            return null;
        }
    }

    public boolean save(Horario h) {
        try {
            PreparedStatement ps = con.Start().prepareStatement(SAVEHORA);
            ps.setInt(1, h.getCodigoHorario());
            ps.setInt(2, h.getCodigoDoctor());
            ps.setTimestamp(3, h.getHoras());
            ps.setString(4, h.getDisponible());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;

        }
    }

    public boolean delete(int t) {
        try {
            PreparedStatement p = con.Start().prepareStatement(DELETE);
            p.setInt(1, t);
            p.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
