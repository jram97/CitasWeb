package com.jram.Controllers;

import com.jram.Dao.Connect;
import com.jram.DaoImple.LoginDaoImple;
import com.jram.Entity.Login;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jram97
 */
public class LoginController extends HttpServlet {

    static HttpSession session = null;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param = request.getParameter("param");

        if (param == null) {
            viewLogin(request, response);

        } else {
            Logout(request, response);

        }

    }

    protected void viewLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param = request.getParameter("param");

        switch (param) {
            case "login":
                Login(request, response);
                break;
        }

    }

    protected void Login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        Connect con = new Connect();
        LoginDaoImple ldi = new LoginDaoImple(con);

        if (ldi.Login(email, pass) == null) {
            response.sendRedirect("login");
            
        } else {
            
            List<Login> getLogin = ldi.Login(email, pass);
            session = request.getSession(true);
            session.setAttribute("login", email);
            //session.setAttribute("rol", login.getRolCode());
            //RequestDispatcher rd = request.getRequestDispatcher("session/sesion.jsp");
            response.sendRedirect("home");
        }

    }

    protected void Logout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        session = request.getSession(true);

        session.invalidate();
        response.sendRedirect("home");
    }

}
