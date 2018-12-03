package com.jram.DaoImple;

import com.jram.Dao.Connect;
import com.jram.Dao.CrudDao;
import com.jram.Entity.Consultorio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class ConsultorioDaoImple implements CrudDao<Consultorio> {

    Connect con;
    private final String CONSULTORIOS = "SELECT * FROM CONSULTORIOS";
    private final String SAVE = "INSERT INTO CONSULTORIOS VALUES (?, ?, ?, ?);";
    private final String UPDATE = "UPDATE CONSULTORIOS SET NOM_CONS = ?, DIR_CONS = ?, TEL_CONS = ? WHERE ID_CONSULTORIO = ?;";
    private final String CONSULTORIOID = "SELECT * FROM CONSULTORIOS WHERE ID_CONSULTORIO = ?;";
    private final String DELETE = "DELETE FROM CONSULTORIOS WHERE ID_CONSULTORIO = ?;";
    public ConsultorioDaoImple(Connect con) {
        this.con = con;
    }

    @Override
    public List<Consultorio> findAll() {
        try {
            PreparedStatement ps = con.Start().prepareStatement(CONSULTORIOS);
            ResultSet rs = ps.executeQuery();
            List<Consultorio> getall = new LinkedList<>();

            while (rs.next()) {
                Consultorio c = new Consultorio();
                c.setCodigoCons(rs.getInt("ID_CONSULTORIO"));
                c.setNombreCons(rs.getString("NOM_CONS"));
                c.setDireccionCons(rs.getString("DIR_CONS"));
                c.setTelefonoCons(rs.getInt("TEL_CONS"));

                getall.add(c);
            }
            return getall;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Consultorio> findById(int codigo) {

        try {
            PreparedStatement ps = con.Start().prepareStatement(CONSULTORIOID);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            List<Consultorio> getall = new LinkedList<>();

            while (rs.next()) {
                Consultorio c = new Consultorio();
                c.setCodigoCons(rs.getInt("ID_CONSULTORIO"));
                c.setNombreCons(rs.getString("NOM_CONS"));
                c.setDireccionCons(rs.getString("DIR_CONS"));
                c.setTelefonoCons(rs.getInt("TEL_CONS"));

                getall.add(c);
            }
            return getall;
        } catch (Exception e) {
            return null;
        }

    }

    @Override
    public boolean Save(Consultorio t) {
        try {
            PreparedStatement ps = con.Start().prepareStatement(SAVE);
            ps.setInt(1, t.getCodigoCons());
            ps.setString(2, t.getNombreCons());
            ps.setString(3, t.getDireccionCons());
            ps.setInt(4, t.getTelefonoCons());

            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean Update(Consultorio t) {

        try {
            PreparedStatement ps = con.Start().prepareStatement(UPDATE);
            ps.setString(1, t.getNombreCons());
            ps.setString(2, t.getDireccionCons());
            ps.setInt(3, t.getTelefonoCons());
            ps.setInt(4, t.getCodigoCons());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("eeerrroorr" + e );
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
