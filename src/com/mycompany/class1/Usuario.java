package com.mycompany.class1;

public class Usuario {
    private String nombre;
    private int puntos;
    private boolean moderador;

    public Usuario() {
    }
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public Usuario(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.moderador = false;
    }
    
    public void cambiarAModerador(){
        this.moderador = true;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isModerador() {
        return moderador;
    }

    public void setModerador(boolean moderador) {
        this.moderador = moderador;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", puntos=" + puntos + ", moderador=" + moderador + '}';
    }
    
    
}
