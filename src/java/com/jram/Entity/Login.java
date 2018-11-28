package com.jram.Entity;

public class Login {
    
    private String email;
    private String pass;
    private int rolCode;
    private String estado;

    public Login() {
    }

    public Login(String email, String pass, int rolCode) {
        this.email = email;
        this.pass = pass;
        this.rolCode = rolCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRolCode() {
        return rolCode;
    }

    public void setRolCode(int rolCode) {
        this.rolCode = rolCode;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return email;
    }

    
    
    
}
