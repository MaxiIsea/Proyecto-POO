package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Actividades_Compuestas")
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class Compuesto extends Actividad {

    // Constructores.
    public Compuesto(String nombre, Date fechaInicio, Date fechaFin, String resolucion, String expediente, Convocatoria convocatoria, LineaEstrategica lineaEstrategica, Ambito ambito) {
        super(nombre, fechaInicio, fechaFin, resolucion, expediente, convocatoria, lineaEstrategica, ambito);
    }

    public Compuesto() {
    }

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "Actividades_Relacionadas",
            joinColumns = @JoinColumn(name = "Actividades_Compuestas_id"),
            inverseJoinColumns = @JoinColumn(name = "Actividad_id")
    )

    private List<Actividad> actividades = new ArrayList<Actividad>();

    public void addActividad(Actividad a) {
        actividades.add(a);
    }

    public void removeActividad(Actividad a) {
        actividades.remove(a);
    }

    @Override
    public List<Impacto> getImpactos() {
        // Obtiene los impactos de todas las actividades. Por ser una actividad compuesta
        // el peso del impacto sera el promedio del peso del impacto de las actividades
        // que la componen para dicho objetivo.
        return null;
    }
}
