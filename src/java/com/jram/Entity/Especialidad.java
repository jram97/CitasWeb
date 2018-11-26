package com.jram.Entity;

import java.util.List;

public class Especialidad {
    
    private int codigoEsp;
    private String nombreEsp;

    private List<Doctor> doc;
    
    public Especialidad() {
    }

    public Especialidad(int codigoEsp) {
        this.codigoEsp = codigoEsp;
    }

    public Especialidad(int codigoEsp, String nombreEsp) {
        this.codigoEsp = codigoEsp;
        this.nombreEsp = nombreEsp;
    }  
    
    public int getCodigoEsp() {
        return codigoEsp;
    }

    public void setCodigoEsp(int codigoEsp) {
        this.codigoEsp = codigoEsp;
    }

    public String getNombreEsp() {
        return nombreEsp;
    }

    public void setNombreEsp(String nombreEsp) {
        this.nombreEsp = nombreEsp;
    }

    public List<Doctor> getDoc() {
        return doc;
    }

    public void setDoc(List<Doctor> doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "codigoEsp=" + codigoEsp + ", nombreEsp=" + nombreEsp + '}';
    }
    
}
