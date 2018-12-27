package ar.edu.unnoba.poo2018.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "IMPACTO")
public class Impacto extends AbstractEntity {

    //@Id
    //@SequenceGenerator(name = "ID_IMPACTO_SEQ", sequenceName = "SEQ_IMPACTO", allocationSize = 1, initialValue = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_IMPACTO_SEQ")
    //private long nro;
    @ManyToOne(fetch = FetchType.LAZY)
    private Objetivo objetivo;    
    @OneToOne(fetch = FetchType.LAZY)
    private Actividad actividad;
    private int peso;

    // Constructores.
    public Impacto(int peso, Objetivo objetivo) {
        this.peso = peso;
        this.objetivo = objetivo;
    }

    public Impacto() {
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
