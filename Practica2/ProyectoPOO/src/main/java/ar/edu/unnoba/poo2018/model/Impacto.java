package ar.edu.unnoba.poo2018.model;

public class Impacto {

    private Objetivo objetivo;
    private int peso;

    // Constructores.
    public Impacto(int peso, Objetivo objetivo) {
        this.peso = peso;
        this.objetivo = objetivo;
    }

    // Getters y Setters.
    public int getPeso() {
        return peso;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }
    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }	
}