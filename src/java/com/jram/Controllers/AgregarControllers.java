package com.jram.Controllers;

import com.jram.Dao.Connect;
import com.jram.DaoImple.ConsultorioDaoImple;
import com.jram.DaoImple.DoctorDaoImple;
import com.jram.DaoImple.EspecialidadDaoImple;
import com.jram.DaoImple.HorarioDaoImple;
import com.jram.DaoImple.PersonaDaoImple;
import com.jram.DaoImple.RoleDaoImple;
import com.jram.Entity.Consultorio;
import com.jram.Entity.Doctor;
import com.jram.Entity.Especialidad;
import com.jram.Entity.Horario;
import com.jram.Entity.Persona;
import com.jram.Entity.Role;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AgregarControllers extends HttpServlet {

    static Connect con = new Connect();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String param = request.getParameter("param");

        if (!param.isEmpty()) {
            switch (param) {
                case "doctor":
                    viewDoctor(request, response);
                    break;
                case "cita":
                    viewCrearCitas(request, response);
                    break;
                case "cons":
                    viewCons(request, response);
                    break;
                case "person":
                    viewPerson(request, response);
                    break;
                case "horario":
                    viewHorario(request, response);
                    break;
                case "roles":
                    viewRoles(request, response);
                    break;
                case "espe":
                    viewEspe(request, response);
                    break;
            }
        }

    }

    protected void viewRoles(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("register-rol.jsp");
        rd.include(request, response);
    }

    protected void viewCrearCitas(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int codigoM = Integer.parseInt(request.getParameter("codigomedico"));
        String emailP = request.getParameter("codigopersona");

        DoctoresName(codigoM, request, response);
        PersonaName(emailP, request, response);
        RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
        rd.include(request, response);
    }

    protected void viewEspe(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("register-espe.jsp");
        rd.include(request, response);
    }

    protected void viewPerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("register-person.jsp");
        rd.include(request, response);
    }

    protected void viewHorario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Doctores(request, response);
        RequestDispatcher rd = request.getRequestDispatcher("register-horario-doctor.jsp");
        rd.include(request, response);

    }

    protected void Doctores(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DoctorDaoImple ddi = new DoctorDaoImple(con);
        List<Doctor> findall = ddi.findAll();

        request.setAttribute("doctores", findall);
    }

    protected void DoctoresName(int codigo, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PersonaDaoImple pdi = new PersonaDaoImple(con);
        List<Persona> findName = pdi.findName(codigo);

        request.setAttribute("namedoct", findName);
    }

    protected void PersonaName(String email, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PersonaDaoImple pdi = new PersonaDaoImple(con);
        List<Persona> findName = pdi.findNamePerson(email);

        request.setAttribute("namepers", findName);
    }

    protected void viewDoctor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Consultorios(request, response);
        Especialidades(request, response);
        RequestDispatcher rd = request.getRequestDispatcher("register-doctor.jsp");
        rd.include(request, response);

    }

    protected void viewCons(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("register-cons.jsp");
        rd.include(request, response);

    }

    protected void Consultorios(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ConsultorioDaoImple cdi = new ConsultorioDaoImple(con);
        List<Consultorio> getall = cdi.findAll();
        request.setAttribute("consultorios", getall);
    }

    protected void Especialidades(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        EspecialidadDaoImple edi = new EspecialidadDaoImple(con);
        List<Especialidad> getall = edi.findAll();
        request.setAttribute("especialidades", getall);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String param = request.getParameter("param");

        if (!param.isEmpty()) {
            switch (param) {
                case "doctor":
                    addDoctor(request, response);
                    break;
                case "cons":
                    addConsultorio(request, response);
                    break;
                case "roles":
                    addRol(request, response);
                    break;
                case "espe":
                    addEspe(request, response);
                    break;
                case "horario":
                    addHorario(request, response);
                    break;
                case "person":
                    addPerson(request, response);
                    break;
            }
        }

    }

    protected void addDoctor(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        int consu = Integer.parseInt(request.getParameter("cons"));
        int esp = Integer.parseInt(request.getParameter("esp"));
        int tiempo = Integer.parseInt(request.getParameter("tiempo"));
        String locacion = request.getParameter("locacion");
        String estudio = request.getParameter("estudio");

        DoctorDaoImple ddi = new DoctorDaoImple(con);

        Persona p = new Persona(0);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setEdad(edad);
        p.setTelefono(telefono);
        p.setEmail(email);
        p.setPass(pass);

        Especialidad e = new Especialidad();
        e.setCodigoEsp(esp);

        Consultorio c = new Consultorio();
        c.setCodigoCons(consu);

        Doctor d = new Doctor();
        d.setTiempoMedico(tiempo);
        d.setEstudio(estudio);
        d.setLocation(locacion);

        if (ddi.savePerson(p, d, c, e)) {
            System.out.println("EXITO");
            response.sendRedirect("home");
        }

    }

    protected void addPerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int telefono = Integer.parseInt(request.getParameter("telefono"));
        String email = request.getParameter("email");
        String pass = request.getParameter("password");

        PersonaDaoImple pdi = new PersonaDaoImple(con);

        Persona p = new Persona(0);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setEdad(edad);
        p.setTelefono(telefono);
        p.setEmail(email);
        p.setPass(pass);

        if (pdi.Save(p)) {
            System.out.println("EXITO");
            response.sendRedirect("home");
        }

    }

    protected void addRol(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String desc = request.getParameter("descripcion");

        RoleDaoImple rdi = new RoleDaoImple(con);

        Role r = new Role(0);
        r.setNombreRol(nombre);
        r.setDescRol(desc);

        if (rdi.Save(r)) {
            System.out.println("EXITO");
            response.sendRedirect("view?param=roles");
        }

    }

    protected void addHorario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int codigoDoctor = Integer.parseInt(request.getParameter("doct"));
        String horario = request.getParameter("horario");

        HorarioDaoImple h = new HorarioDaoImple(con);
        Horario ho = new Horario(0);
        ho.setCodigoDoctor(codigoDoctor);
        ho.setHoras(Timestamp.valueOf(horario));
        ho.setDisponible("S");

        if (h.save(ho)) {
            response.sendRedirect("home");

        }

    }

    protected void addEspe(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        EspecialidadDaoImple edi = new EspecialidadDaoImple(con);

        Especialidad e = new Especialidad(0);
        e.setNombreEsp(nombre);

        if (edi.Save(e)) {
            System.out.println("EXITO");
            response.sendRedirect("view?param=espe");
        }

    }

    protected void addConsultorio(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        int telefono = Integer.parseInt(request.getParameter("telefono"));

        ConsultorioDaoImple cdi = new ConsultorioDaoImple(con);

        Consultorio c = new Consultorio(0);
        c.setNombreCons(nombre);
        c.setDireccionCons(direccion);
        c.setTelefonoCons(telefono);

        if (cdi.Save(c)) {
            System.out.println("EXITO");
            response.sendRedirect("view?param=cons");
        }

    }

}
