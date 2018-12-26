/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Simple extends Actividad {

    // Constructores.
    public Simple(String nombre, Date fechaInicio, Date fechaFin, String resolucion, String expediente, Convocatoria convocatoria, LineaEstrategica lineaEstrategica, Ambito ambito) {
        super(nombre, fechaInicio, fechaFin, resolucion, expediente, convocatoria, lineaEstrategica, ambito);
    }

    private List<Impacto> impactos = new ArrayList<Impacto>();

    public void addObjetivo(int peso, Objetivo objetivo) {
        impactos.add(new Impacto(peso, objetivo));
    }

    public void removeImpacto(Impacto impacto) {
        impactos.remove(impacto);
    }
        
    @Override
    public List<Impacto> getImpactos() {
        return impactos;
    }
}