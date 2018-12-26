package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Actividad_Simple")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Simple extends Actividad {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Actividad")

    private List<Impacto> impactos = new ArrayList<Impacto>();
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "simple")
    private List<Actividad> actividades;

    // Constructores.
    public Simple(String nombre, Date fechaInicio, Date fechaFin, String resolucion, String expediente, Convocatoria convocatoria, LineaEstrategica lineaEstrategica, Ambito ambito) {
        super(nombre, fechaInicio, fechaFin, resolucion, expediente, convocatoria, lineaEstrategica, ambito);
    }

    public Simple() {
    }

    public void addObjetivo(int peso, Objetivo objetivo) {
        impactos.add(new Impacto(peso, objetivo));
    }

    public void removeImpacto(Impacto impacto) {
        impactos.remove(impacto);
    }

    @Override
    public String toString() {
        return "Simple: " + getNombre() + " [impactos=" + impactos + "]";
    }

    @Override
    public List<Impacto> getImpactos() {
        return impactos;
    }
}
