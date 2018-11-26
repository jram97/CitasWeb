package com.jram.Entity;

public class Doctor {
    
    private int codigoDoctor;
    private Persona persona;
    private Consultorio consultorio;
    private Especialidad especialidad;
    private int TiempoMedico;
    private String estudio;
    private String location;

    public Doctor() {
    }

    public Doctor(int codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }

    public int getCodigoDoctor() {
        return codigoDoctor;
    }

    public void setCodigoDoctor(int codigoDoctor) {
        this.codigoDoctor = codigoDoctor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getTiempoMedico() {
        return TiempoMedico;
    }

    public void setTiempoMedico(int TiempoMedico) {
        this.TiempoMedico = TiempoMedico;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Doctor{" + "codigoDoctor=" + codigoDoctor + ", persona=" + persona + ", consultorio=" + consultorio + ", especialidad=" + especialidad + ", TiempoMedico=" + TiempoMedico + ", estudio=" + estudio + ", location=" + location + '}';
    }
    
    
   
}
