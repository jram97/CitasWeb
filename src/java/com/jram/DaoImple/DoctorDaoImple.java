package com.jram.DaoImple;

import com.jram.Dao.Connect;
import com.jram.Entity.Consultorio;
import com.jram.Entity.Doctor;
import com.jram.Entity.Especialidad;
import com.jram.Entity.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DoctorDaoImple {
    
    Connect con;
    private final String FINDALLDOCTOR = "SELECT * FROM DOCTORES INNER JOIN PERSONAS ON PERSONAS.ID_PERSONA = DOCTORES.ID_PERSONA INNER JOIN CONSULTORIOS ON CONSULTORIOS.ID_CONSULTORIO = DOCTORES.ID_CONSULTORIO INNER JOIN ESPECIALIDADES ON ESPECIALIDADES.ID_ESPECIALIDAD = DOCTORES.ID_ESPECIALIDAD ORDER BY DOCTORES.ID_DOCTOR ASC;";
    private final String FINDALLDOCTORBYID = "SELECT * FROM DOCTORES LEFT JOIN PERSONAS ON PERSONAS.ID_PERSONA = DOCTORES.ID_PERSONA LEFT JOIN CONSULTORIOS ON CONSULTORIOS.ID_CONSULTORIO = DOCTORES.ID_CONSULTORIO LEFT JOIN ESPECIALIDADES ON ESPECIALIDADES.ID_ESPECIALIDAD = DOCTORES.ID_ESPECIALIDAD WHERE ID_DOCTOR = ?;";
   
    private final String SAVE = "{CALL INSERT_PERSONS(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

    public DoctorDaoImple(Connect con) {
        this.con = con;
    }
    
    public List<Doctor> findAll(){
        
        try {
            PreparedStatement ps = con.Start().prepareStatement(FINDALLDOCTOR);
            ResultSet rs = ps.executeQuery();
           
            List<Doctor> findall = new LinkedList<>();

            while(rs.next()){
                Doctor d = new Doctor();
                
                Persona p = new Persona(rs.getInt("ID_PERSONA"), rs.getString("NOMBRE_PERS"), rs.getString("APELLIDO_PERS"), rs.getInt("EDAD_PERS"), rs.getString("FOTO_PERS"), rs.getInt("TELEFONO_PERS"), rs.getString("EMAIL_PERS"));
                Especialidad e = new Especialidad(rs.getInt("ID_ESPECIALIDAD"), rs.getString("NOMBRE_ESP"));
                Consultorio c = new Consultorio(rs.getInt("ID_CONSULTORIO"), rs.getString("DIR_CONS"), rs.getInt("TEL_CONS"));
                
                d.setCodigoDoctor(rs.getInt("ID_DOCTOR"));
                d.setTiempoMedico(rs.getInt("TIEMPO_DOCTOR"));
                d.setEstudio(rs.getString("ESTUDIO_DOCTOR"));
                d.setLocation(rs.getString("LOCACION_DOCTOR"));
                
                d.setPersona(p);
                d.setEspecialidad(e);
                d.setConsultorio(c);
               
                p.setDoc(findall);
                e.setDoc(findall);
                c.setDoc(findall);
                
                findall.add(d);
            }
            
            return findall;
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public List<Doctor> findById(int codigo){
        
        try {
            PreparedStatement ps = con.Start().prepareStatement(FINDALLDOCTORBYID);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
                        
            List<Doctor> findall = new LinkedList<>();
            
            
            while(rs.next()){
                Doctor d = new Doctor();

                Persona p = new Persona(rs.getInt("ID_PERSONA"), rs.getString("NOMBRE_PERS"), rs.getString("APELLIDO_PERS"), rs.getInt("EDAD_PERS"), rs.getString("FOTO_PERS"), rs.getInt("TELEFONO_PERS"), rs.getString("EMAIL_PERS"));
                Especialidad e = new Especialidad(rs.getInt("ID_ESPECIALIDAD"), rs.getString("NOMBRE_ESP"));
                Consultorio c = new Consultorio(rs.getInt("ID_CONSULTORIO"), rs.getString("DIR_CONS"), rs.getInt("TEL_CONS"));
                
                d.setCodigoDoctor(rs.getInt("ID_DOCTOR"));
                d.setTiempoMedico(rs.getInt("TIEMPO_DOCTOR"));
                d.setEstudio(rs.getString("ESTUDIO_DOCTOR"));
                d.setLocation(rs.getString("LOCACION_DOCTOR"));
                
                d.setPersona(p);
                d.setEspecialidad(e);
                d.setConsultorio(c);
               
                p.setDoc(findall);
                e.setDoc(findall);
                c.setDoc(findall);
                
                findall.add(d);
            }
            
            return findall;
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public boolean savePerson(Persona p, Doctor d, Consultorio c, Especialidad es) {
        try {
            PreparedStatement ps = con.Start().prepareCall(SAVE);

            ps.setInt(1, 0);
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setInt(4, p.getEdad());
            ps.setString(5, p.getFoto());
            ps.setInt(6, p.getTelefono());
            ps.setString(7, p.getEmail());
            ps.setString(8, p.getPass());
            ps.setInt(9, es.getCodigoEsp());
            ps.setInt(10, c.getCodigoCons());
            ps.setInt(11, d.getTiempoMedico());
            ps.setString(12, d.getEstudio());
            ps.setString(13, d.getLocation());
            
            ps.executeUpdate();
            
            return true; 
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }
            
}
