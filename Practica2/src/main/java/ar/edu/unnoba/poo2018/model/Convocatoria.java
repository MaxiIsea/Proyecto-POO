package ar.edu.unnoba.poo2018.model;

public class Convocatoria {

    private String nombre;

    // Constructores.
    public Convocatoria(String nombre) {
        this.nombre = nombre;
    }
    
    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}