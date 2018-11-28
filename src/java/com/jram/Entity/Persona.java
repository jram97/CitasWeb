package com.jram.Entity;

import java.util.Date;
import java.util.List;

public class Persona {

    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String email;
    private String pass;
    private Date fechaInicio;
    private int codigoRole;
    
    private List<Doctor> doc = null; 

    public Persona() {
    }

    public Persona(int codigo) {
        this.codigo = codigo;
    }

    public Persona(int codigo, String nombre, String apellido, int edad, int telefono, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
    }
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getCodigoRole() {
        return codigoRole;
    }

    public void setCodigoRole(int codigoRole) {
        this.codigoRole = codigoRole;
    }

    public List<Doctor> getDoc() {
        return doc;
    }

    public void setDoc(List<Doctor> doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono + ", email=" + email + ", pass=" + pass + ", fechaInicio=" + fechaInicio + ", codigoRole=" + codigoRole + '}';
    }
        
}
