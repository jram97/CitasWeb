package com.jram.Entity;

import java.sql.Timestamp;
import java.util.List;

public class Horario {
    
    private int codigoHorario;
    private int codigoDoctor;
    private Timestamp horas;
    private String disponible = "S";


    public Horario() {
    }

    public Horario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public int getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public int getCodigoDoctor() {
        return codigoDoctor;
    }

    public void setCodigoDoctor(int codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }

    public Timestamp getHoras() {
        return horas;
    }

    public void setHoras(Timestamp horas) {
        this.horas = horas;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Horario{" + "codigoHorario=" + codigoHorario + ", codigoDoctor=" + codigoDoctor + ", horas=" + horas + ", disponible=" + disponible + '}';
    }
    
    
    
    
}
