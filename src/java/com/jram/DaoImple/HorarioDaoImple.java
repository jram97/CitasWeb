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
    
    public HorarioDaoImple(Connect con) {
        this.con = con;
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
}
