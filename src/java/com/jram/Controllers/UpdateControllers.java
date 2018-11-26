package com.jram.Controllers;

import com.jram.Dao.Connect;
import com.jram.DaoImple.ConsultorioDaoImple;
import com.jram.DaoImple.EspecialidadDaoImple;
import com.jram.DaoImple.RoleDaoImple;
import com.jram.Entity.Consultorio;
import com.jram.Entity.Especialidad;
import com.jram.Entity.Role;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jram97
 */
public class UpdateControllers extends HttpServlet {

    static Connect con = new Connect();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param = request.getParameter("param");
        
        switch(param){
            case "roles":
                updateRoles(request, response);
                break;
            case "cons":
                updateConsultorio(request, response);
                break;
            case "espe":
                updateEspecialidad(request, response);
                break;    
        }
        
    }
    
    protected void updateRoles(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nombre = request.getParameter("nombre");
        String desc = request.getParameter("descripcion");
        
        RoleDaoImple rdi = new RoleDaoImple(con);
        Role r = new Role();
        r.setCodigoRol(codigo);
        r.setNombreRol(nombre);
        r.setDescRol(desc);
        rdi.Update(r);
        response.sendRedirect("view?param=roles");
    }
    
    protected void updateConsultorio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nombre = request.getParameter("nombre");
        String dir = request.getParameter("direccion");
        int telefono = Integer.parseInt(request.getParameter("telefono"));
                
        ConsultorioDaoImple cdi = new ConsultorioDaoImple(con);
        Consultorio c = new Consultorio();
        c.setNombreCons(nombre);
        c.setDireccionCons(dir);
        c.setTelefonoCons(telefono);
        c.setCodigoCons(codigo);
        
        cdi.Update(c);
        response.sendRedirect("view?param=cons");
        
    }

    protected void updateEspecialidad(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nombre = request.getParameter("nombre");
        
        EspecialidadDaoImple edi = new EspecialidadDaoImple(con);
        Especialidad e = new Especialidad();
        e.setNombreEsp(nombre);
        e.setCodigoEsp(codigo);
        
        edi.Update(e);
        response.sendRedirect("view?param=espe");
        
    }
}
