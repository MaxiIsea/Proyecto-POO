package ar.edu.unnoba.poo2018.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OBJETIVO")
@NamedQuery(name = "objetivo.allObjetivos", query = "SELECT o FROM Objetivo o")

public class Objetivo extends AbstractEntity {

    //@Id
    //@SequenceGenerator(name = "ID_OBJETIVO_SEQ", sequenceName = "SEQ_OBJETIVO", allocationSize = 1, initialValue = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_OBJETIVO_SEQ")
    //private long nro;
    private String nombre;
    //@OneToMany(mappedBy = "objetivo")
    //private List<Impacto> impactos;

    // Constructores.
    public Objetivo(String nombre) {
        this.nombre = nombre;
    }

    public Objetivo() {
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
