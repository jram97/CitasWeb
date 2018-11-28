package com.jram.DaoImple;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.jram.Dao.Connect;
import com.jram.Dao.CrudDao;
import com.jram.Entity.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDaoImple implements CrudDao<Persona> {

    Connect con;
    private final String SELECT = "SELECT * FROM PERSONAS INNER JOIN ROLES ON ROLES.ID_ROL = PERSONAS.ID_ROL;";
    private final String SELECTWHERE = "SELECT * FROM PERSONAS INNER JOIN ROLES ON ROLES.ID_ROL = PERSONAS.ID_ROL WHERE ID_PERSONA = ?;";

    private final String SAVE = "{CALL INSERT_PERSONS(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
    private final String UPDATE = "UPDATE PERSONAS SET NOMBRE_PERS = ?, APELLIDO_PERS = ?, EDAD_PERS = ?, TELEFONO_PERS = ? WHERE ID_PERSONA = ?;";
    private final String DELETE = "DELETE FROM PERSONAS WHERE ID_PERSONA = ?;";
    
    public PersonaDaoImple(Connect con) {
        this.con = con;
    }

    @Override
    public List<Persona> findAll() {

        try {

            PreparedStatement s = con.Start().prepareStatement(SELECT);
            ResultSet rs = s.executeQuery();

            List<Persona> findall = new LinkedList<>();

            while (rs.next()) {
                Persona p = new Persona();
                
                p.setCodigo(rs.getInt("ID_PERSONA"));
                p.setNombre(rs.getString("NOMBRE_PERS"));
                p.setApellido(rs.getString("APELLIDO_PERS"));
                p.setEdad(rs.getInt("EDAD_PERS"));
                p.setTelefono(rs.getInt("TELEFONO_PERS"));
                p.setEmail(rs.getString("EMAIL_PERS"));
                p.setPass(rs.getString("PASS_PERS"));
                p.setFechaInicio(rs.getDate("FECHAINI_PERS"));
                p.setCodigoRole(rs.getInt("ID_ROL"));

                findall.add(p);
            }
            return findall;
        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public List<Persona> findById(int codigo) {

        try {

            PreparedStatement s = con.Start().prepareStatement(SELECTWHERE);
            s.setInt(1, codigo);
            ResultSet rs = s.executeQuery();

            List<Persona> findall = new LinkedList<>();

            while (rs.next()) {
            Persona p = new Persona();

                p.setCodigo(rs.getInt("ID_PERSONA"));
                p.setNombre(rs.getString("NOMBRE_PERS"));
                p.setApellido(rs.getString("APELLIDO_PERS"));
                p.setEdad(rs.getInt("EDAD_PERS"));
                p.setTelefono(rs.getInt("TELEFONO_PERS"));
                p.setEmail(rs.getString("EMAIL_PERS"));
                p.setPass(rs.getString("PASS_PERS"));
                p.setFechaInicio(rs.getDate("FECHAINI_PERS"));
                p.setCodigoRole(rs.getInt("ID_ROL"));

                findall.add(p);
            }
            return findall;
        } catch (SQLException e) {
            return null;
        }

    }

    @Override
    public boolean Save(Persona t) {
                      
        try {
            PreparedStatement ps = con.Start().prepareCall(SAVE);
            ps.setInt(1, t.getCodigo());
            ps.setString(2, t.getNombre());
            ps.setString(3, t.getApellido());
            ps.setInt(4, t.getEdad());
            ps.setInt(5, t.getTelefono());
            ps.setString(6, t.getEmail());
            ps.setString(7, t.getPass());
            ps.setInt(8, t.getCodigoRole());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        }
        
    }

    @Override
    public boolean Update(Persona t) {
    
        try {
            PreparedStatement ps = con.Start().prepareStatement(UPDATE);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getApellido());
            ps.setInt(3, t.getEdad());
            ps.setInt(4, t.getTelefono());
            
            ps.executeUpdate();
            
            return true;
            
        } catch (Exception e) {
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
            
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int Exists(int t) {
        // TODO Auto-generated method stub
        return 0;
    }

}
