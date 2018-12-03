package com.jram.DaoImple;

import com.jram.Dao.Connect;
import com.jram.Dao.CrudDao;
import com.jram.Entity.Role;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class RoleDaoImple implements CrudDao<Role>{
    
    Connect con;
    private final String SELECT = "SELECT * FROM ROLES;";
    private final String SELECTWHERE = "SELECT * FROM ROLES WHERE ID_ROL = ?;";
    private final String SAVE = "INSERT INTO ROLES VALUES (?, ?, ?);";
    private final String UPDATE = "UPDATE ROLES SET NOMBRE_ROL = ?, DESC_ROL = ? WHERE ID_ROL = ?;";
    private final String DELETE = "DELETE FROM ROLES WHERE ID_ROL = ?;";
    
    public RoleDaoImple(Connect con) {
        this.con = con;
    }

    @Override
    public List<Role> findAll() {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(SELECT);
            ResultSet rs = ps.executeQuery();
            
            List<Role> role = new LinkedList<>();
            
            while(rs.next()){
                
                Role r = new Role();
                r.setCodigoRol(rs.getInt("ID_ROL"));
                r.setNombreRol(rs.getString("NOMBRE_ROL"));
                r.setDescRol(rs.getString("DESC_ROL"));
                
                role.add(r);
                                
            }
            return role;
            
        } catch (Exception e) {
            return null;
        }
        
    }

    @Override
    public List<Role> findById(int codigo) {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(SELECTWHERE);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            List<Role> role = new LinkedList<>();
            
            while(rs.next()){
                
                Role r = new Role();
                r.setCodigoRol(rs.getInt("ID_ROL"));
                r.setNombreRol(rs.getString("NOMBRE_ROL"));
                r.setDescRol(rs.getString("DESC_ROL"));
                
                role.add(r);
                                
            }
            return role;
            
        } catch (Exception e) {
            return null;
        }
        
    }

    @Override
    public boolean Save(Role t) {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(SAVE);
            ps.setInt(1, t.getCodigoRol());
            ps.setString(2, t.getNombreRol());
            ps.setString(3, t.getDescRol());
            
            ps.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public boolean Update(Role t) {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(UPDATE);
            ps.setString(1, t.getNombreRol());
            ps.setString(2, t.getDescRol());
            ps.setInt(3, t.getCodigoRol());
            
            ps.executeUpdate();
            
            
            return true;
            
        } catch (Exception e) {
            return false;
        }
        
    }

    @Override
    public boolean Delete(int t) {
        try {
            PreparedStatement p = con.Start().prepareStatement(DELETE);
            p.setInt(1, t);
            
            p.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int Exists(int t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
