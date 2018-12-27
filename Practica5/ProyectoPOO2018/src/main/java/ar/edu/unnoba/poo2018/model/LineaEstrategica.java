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
@Table(name = "LINEAS")
public class LineaEstrategica extends AbstractEntity {

    //@Id
    //@SequenceGenerator(name = "ID_LINEAS_SEQ", sequenceName = "SEQ_LINEAS", allocationSize = 1, initialValue = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_LINEAS_SEQ")
    //private long nro;
    private String nombre;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lineaEstrategica")
    private List<Actividad> actividades;

    // Constructores.
    public LineaEstrategica(String nombre) {
        this.nombre = nombre;
    }

    public LineaEstrategica() {
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
