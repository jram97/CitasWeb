package com.jram.Controllers;

import com.jram.Dao.Connect;
import com.jram.DaoImple.DoctorDaoImple;
import com.jram.Entity.Doctor;
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
public class DoctoresControllers extends HttpServlet {

    Connect con = new Connect();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        if (request.getParameter("doc") == null) {
            DoctorDaoImple ddi = new DoctorDaoImple(con);
            List<Doctor> findall = ddi.findAll();
           
            request.setAttribute("doctores", findall);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
        }else {
            int codigo = Integer.parseInt(request.getParameter("doc"));
            findById(codigo, request, response);
        }

    }

    protected void findById(int codigo, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DoctorDaoImple ddi = new DoctorDaoImple(con);

        List<Doctor> findall = ddi.findById(codigo);

        request.setAttribute("findall", findall);
        RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
        rd.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
