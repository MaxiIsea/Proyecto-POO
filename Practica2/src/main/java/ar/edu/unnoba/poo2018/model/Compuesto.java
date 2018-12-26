package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
//import java.util.HashMap;
import java.util.List;

public class Compuesto extends Actividad {

    // Constructores.
    public Compuesto(String nombre, Date fechaInicio, Date fechaFin, String resolucion, String expediente, Convocatoria convocatoria, LineaEstrategica lineaEstrategica, Ambito ambito) {
        super(nombre, fechaInicio, fechaFin, resolucion, expediente, convocatoria, lineaEstrategica, ambito);
    }
    
    private List<Actividad> actividades = new ArrayList<Actividad>();

    public void addActividad(Actividad a) {
        actividades.add(a);
    }
    
    public void removeActividad(Actividad a) {
        actividades.remove(a);
    }

    @Override
    public List<Impacto> getImpactos() {
    /*  Obtiene los impactos de todas las actividades. Por ser una actividad compuesta
        el peso del impacto sera el promedio del peso del impacto de las actividades
        que la componen para dicho objetivo.
        */
        return null;
    }
}