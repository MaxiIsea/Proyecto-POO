package ar.edu.unnoba.poo2018.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CONVOCATORIA")
public class Convocatoria extends AbstractEntity {

    //@Id
    //@SequenceGenerator(name = "ID_CONVOCATORIA_SEQ", sequenceName = "SEQ_CONVOCATORIA", allocationSize = 1, initialValue = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_CONVOCATORIA_SEQ")
    //private long nro;
    private String nombre;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "convocatoria")
    private List<Actividad> actividades;

    // Constructores.
    public Convocatoria(String nombre) {
        this.nombre = nombre;
    }

    public Convocatoria() {
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
