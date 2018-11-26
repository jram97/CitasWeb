package com.jram.DaoImple;

import com.jram.Dao.Connect;
import com.jram.Dao.CrudDao;
import com.jram.Entity.Especialidad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EspecialidadDaoImple implements CrudDao<Especialidad>{
    
    Connect con;
    private final String SELECT = "SELECT * FROM ESPECIALIDADES;";
    private final String SELECTID = "SELECT * FROM ESPECIALIDADES WHERE ID_ESPECIALIDAD = ?;";
    private final String SAVE = "INSERT INTO ESPECIALIDADES VALUES(?, ?)";
    private final String UPDATE = "UPDATE ESPECIALIDADES SET NOMBRE_ESP = ? WHERE ID_ESPECIALIDAD = ?";
    private final String DELETE = "DELETE FROM ESPECIALIDADES WHERE ID_ESPECIALIDAD = ?";
    
    public EspecialidadDaoImple(Connect con) {
        this.con = con;
    }

    @Override
    public List<Especialidad> findAll() {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(SELECT);
            ResultSet rs = ps.executeQuery();
            
            List<Especialidad> findall = new LinkedList<>();
            
            while(rs.next()){
                
                Especialidad e = new Especialidad();
                e.setCodigoEsp(rs.getInt("ID_ESPECIALIDAD"));
                e.setNombreEsp(rs.getString("NOMBRE_ESP"));
                
                findall.add(e);
            }
            return findall;
        } catch (SQLException e) {
            return null;
        }
        
    }
    
    @Override
    public List<Especialidad> findById(int codigo) {
        try {
            PreparedStatement ps = con.Start().prepareStatement(SELECTID);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            List<Especialidad> findall = new LinkedList<>();
            
            while(rs.next()){
                
                Especialidad e = new Especialidad();
                e.setCodigoEsp(rs.getInt("ID_ESPECIALIDAD"));
                e.setNombreEsp(rs.getString("NOMBRE_ESP"));
                
                findall.add(e);
            }
            return findall;
        } catch (SQLException e) {
            return null;
        }
    }
        
    @Override
    public boolean Save(Especialidad t) {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(SAVE);
            ps.setInt(1, t.getCodigoEsp());
            ps.setString(2, t.getNombreEsp());
            
            ps.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            return false;
        }
        
    }

    @Override
    public boolean Update(Especialidad t) {
        
        try {
            PreparedStatement ps = con.Start().prepareStatement(UPDATE);
            ps.setString(1, t.getNombreEsp());
            ps.setInt(2, t.getCodigoEsp());
            
            ps.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            return false;
        }
        
    }

    @Override
    public boolean Delete(int t) {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(DELETE);
            ps.setInt(1, t);
            
            ps.executeUpdate();
            
            return true;
        } catch (SQLException e) {
            return false;
        }
        
    }

    @Override
    public int Exists(int t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
