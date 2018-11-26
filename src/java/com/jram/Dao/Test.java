/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jram.Dao;

import com.jram.DaoImple.ConsultorioDaoImple;
import com.jram.DaoImple.DoctorDaoImple;
import com.jram.DaoImple.EspecialidadDaoImple;
import com.jram.DaoImple.PersonaDaoImple;
import com.jram.DaoImple.RoleDaoImple;
import com.jram.Entity.Consultorio;
import com.jram.Entity.Doctor;
import com.jram.Entity.Especialidad;
import com.jram.Entity.Persona;
import com.jram.Entity.Role;
import java.util.List;

/**
 *
 * @author jram97
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connect con;
        con = new Connect();
        con.Start();
        
        EspecialidadDaoImple edi = new EspecialidadDaoImple(con);
        
        List<Especialidad> find = edi.findAll();
        
        for (Especialidad persona : find) {
            System.out.println(persona);
        }
        
//        Role e = new Role(0);
//        e.setNombreRol("GRT");
//        e.setDescRol("Gerente");
//        
//        pdi.Save(e);
        
//
//        List<Persona> find = pdi.findAll();
//        
//        for (Persona persona : find) {
//            System.out.println(persona);
//        }
//        
//        
        
//        
//        
//        Persona p = new Persona(0);
//        p.setNombre("Michelle");
//        p.setApellido("Rodriguez");
//        p.setEdad(29);
//        p.setFoto("persona.jpg");
//        p.setTelefono(73737373);
//        p.setEmail("michelle@mail.com");
//        p.setPass("pass");
//        p.setCodigoRole(2);
        
        
  

//      
//        DoctorDaoImple dd = new DoctorDaoImple(con);
//        List<Doctor> findAll = dd.findById(1);
//        
//        for (Doctor doctor : findAll) {
//            System.out.println(doctor);
//        }
        
        
//        EspecialidadDaoImple edi = new EspecialidadDaoImple(con);
//        
//        List<Especialidad> find = edi.findById(2);
//        
//        for (Especialidad persona : find) {
//            System.out.println(persona);
//        }


    }

}
