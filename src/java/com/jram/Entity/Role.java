package com.jram.Entity;

public class Role {
    
    private int codigoRol;
    private String nombreRol;
    private String descRol = "Sin Datos";

    public Role() {
    }

    public Role(int codigoRol) {
        this.codigoRol = codigoRol;
    }

    public int getCodigoRol() {
        return codigoRol;
    }

    public void setCodigoRol(int codigoRol) {
        this.codigoRol = codigoRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescRol() {
        return descRol;
    }

    public void setDescRol(String descRol) {
        this.descRol = descRol;
    }

    @Override
    public String toString() {
        return "Role{" + "codigoRol=" + codigoRol + ", nombreRol=" + nombreRol + ", descRol=" + descRol + '}';
    }
    
}
