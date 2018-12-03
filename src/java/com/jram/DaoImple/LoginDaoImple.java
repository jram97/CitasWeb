package com.jram.DaoImple;

import com.jram.Dao.Connect;
import com.jram.Entity.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class LoginDaoImple {

    Connect con;
    private final String LOGIN = "SELECT * FROM LOGIN WHERE EMAIL_LOGIN = ? AND PASS_LOGIN = ?;";

    public LoginDaoImple(Connect con) {
        this.con = con;
    }

    public List<Login> Login(String email, String pass) {
        try {
            PreparedStatement ps = con.Start().prepareStatement(LOGIN);
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();

            List<Login> getLogin = new LinkedList<>();

            if (rs.next()) {
                while (rs.next()) {
                    Login login = new Login();

                    login.setEmail(rs.getString("EMAIL_LOGIN"));
                    login.setPass(rs.getString("PASS_LOGIN"));
                    login.setRolCode(rs.getInt("ID_ROL"));
                    login.setEstado(rs.getString("ESTADO"));
                    getLogin.add(login);
                }
                return getLogin;
            } else {
                return null;
            }

        } catch (SQLException e) {
            return null;
        }
    }

}
