package com.jram.Entity;

import java.util.List;

public class Consultorio {
    
    private int codigoCons;
    private String nombreCons;
    private String direccionCons;
    private int telefonoCons;
    
    private List<Doctor> doc;

    public Consultorio() {
    }

    public Consultorio(int codigoCons) {
        this.codigoCons = codigoCons;
    }

    public Consultorio(int codigoCons, String direccionCons, int telefonoCons) {
        this.codigoCons = codigoCons;
        this.direccionCons = direccionCons;
        this.telefonoCons = telefonoCons;
    }
      
    public int getCodigoCons() {
        return codigoCons;
    }

    public void setCodigoCons(int codigoCons) {
        this.codigoCons = codigoCons;
    }

    public String getDireccionCons() {
        return direccionCons;
    }

    public void setDireccionCons(String direccionCons) {
        this.direccionCons = direccionCons;
    }

    public int getTelefonoCons() {
        return telefonoCons;
    }

    public void setTelefonoCons(int telefonoCons) {
        this.telefonoCons = telefonoCons;
    }

    public List<Doctor> getDoc() {
        return doc;
    }

    public void setDoc(List<Doctor> doc) {
        this.doc = doc;
    }

    public String getNombreCons() {
        return nombreCons;
    }

    public void setNombreCons(String nombreCons) {
        this.nombreCons = nombreCons;
    }

    @Override
    public String toString() {
        return "Consultorio{" + "codigoCons=" + codigoCons + ", nombreCons=" + nombreCons + ", direccionCons=" + direccionCons + ", telefonoCons=" + telefonoCons + ", doc=" + doc + '}';
    }
            
    
}
