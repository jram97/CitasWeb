package com.jram.Controllers;

import com.jram.Dao.Connect;
import com.jram.DaoImple.ConsultorioDaoImple;
import com.jram.DaoImple.DoctorDaoImple;
import com.jram.DaoImple.EspecialidadDaoImple;
import com.jram.DaoImple.HorarioDaoImple;
import com.jram.DaoImple.RoleDaoImple;
import com.jram.Entity.Consultorio;
import com.jram.Entity.Doctor;
import com.jram.Entity.Especialidad;
import com.jram.Entity.Horario;
import com.jram.Entity.Role;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jram97
 */
public class VerControllers extends HttpServlet {

    static Connect con = new Connect();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String param = request.getParameter("param");
        
        if (!param.isEmpty()) {
            switch (param) {
                case "roles":
                    viewRoles(request, response);
                    break;
                case "cons":
                    viewCons(request, response);
                    break;
                case "espe":
                    viewEspe(request, response);
                    break;
                case "doct":
                    viewDoct(request, response);
                    break;
                case "horario":
                    viewHorario(request, response);
                    break;    
                case "updespe":
                    int co = Integer.parseInt(request.getParameter("codigo"));
                    viewUpdateEspe(co, request, response);
                    break;    
                case "updrole":
                    int c = Integer.parseInt(request.getParameter("codigo"));
                    viewUpdateRoles(c, request, response);
                    break;
                case "updcons":
                   int codigo = Integer.parseInt(request.getParameter("codigo"));
                    viewUpdateCons(codigo, request, response);
                    break;
            }
        }
    }
    
    protected void viewCons(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ConsultorioDaoImple cdi = new ConsultorioDaoImple(con);
        List<Consultorio> findall = cdi.findAll();
        
        request.setAttribute("consultorios", findall);
        RequestDispatcher rd = request.getRequestDispatcher("cons-lista.jsp");
        rd.include(request, response);
    }
    
    protected void viewHorario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HorarioDaoImple hdi = new HorarioDaoImple(con);
        List<Horario> findall = hdi.getAll();
        
        request.setAttribute("horarios", findall);
        RequestDispatcher rd = request.getRequestDispatcher("horario-lista.jsp");
        rd.include(request, response);
    }
    
    protected void viewDoct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        DoctorDaoImple ddi = new DoctorDaoImple(con);
        List<Doctor> findall = ddi.findAll();

        request.setAttribute("doctores", findall);
        RequestDispatcher rd = request.getRequestDispatcher("doc-lista.jsp");
        rd.include(request, response);
    }
    
    protected void viewEspe(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        EspecialidadDaoImple edi = new EspecialidadDaoImple(con);
        List<Especialidad> findall = edi.findAll();
        
        request.setAttribute("especialidad", findall);
        RequestDispatcher rd = request.getRequestDispatcher("espe-lista.jsp");
        rd.include(request, response);
    }
    
    protected void viewRoles(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RoleDaoImple rdi = new RoleDaoImple(con);
        List<Role> findall = rdi.findAll();
        
        request.setAttribute("roles", findall);
        RequestDispatcher rd = request.getRequestDispatcher("roles-lista.jsp");
        rd.include(request, response);
    }
    
    protected void viewUpdateRoles(int codigo, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RoleDaoImple rdi = new RoleDaoImple(con);
        List<Role> findall = rdi.findById(codigo);
        
        request.setAttribute("roles", findall);
        RequestDispatcher rd = request.getRequestDispatcher("update-role.jsp");
        rd.include(request, response);
    }
    
    protected void viewUpdateEspe(int codigo, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        EspecialidadDaoImple edi = new EspecialidadDaoImple(con);
        List<Especialidad> findall = edi.findById(codigo);
        
        request.setAttribute("especialidad", findall);
        RequestDispatcher rd = request.getRequestDispatcher("update-espe.jsp");
        rd.include(request, response);
    }
    
    protected void viewUpdateCons(int codigo, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ConsultorioDaoImple cdi = new ConsultorioDaoImple(con);
        List<Consultorio> findall = cdi.findById(codigo);
        
        request.setAttribute("consultorios", findall);
        RequestDispatcher rd = request.getRequestDispatcher("update-cons.jsp");
        rd.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
