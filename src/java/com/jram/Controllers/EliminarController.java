/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jram.Controllers;

import com.jram.Dao.Connect;
import com.jram.DaoImple.ConsultorioDaoImple;
import com.jram.DaoImple.EspecialidadDaoImple;
import com.jram.DaoImple.RoleDaoImple;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jram97
 */
public class EliminarController extends HttpServlet {

    static Connect con = new Connect();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param = request.getParameter("param");
        int codigo = Integer.parseInt(request.getParameter("codigo"));

        switch (param) {
            case "delete_role":
                RoleDaoImple r = new RoleDaoImple(con);
                r.Delete(codigo);
                response.sendRedirect("view?param=roles");
                break;
            case "delete_cons":
                ConsultorioDaoImple cdi = new ConsultorioDaoImple(con);
                cdi.Delete(codigo);
                response.sendRedirect("view?param=cons");
                break;
            case "delete_espe":
                EspecialidadDaoImple edi = new EspecialidadDaoImple(con);
                edi.Delete(codigo);
                response.sendRedirect("view?param=espe");
                break;
        }
    }
}
