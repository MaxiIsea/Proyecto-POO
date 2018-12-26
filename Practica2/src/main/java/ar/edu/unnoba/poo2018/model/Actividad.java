package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Actividad {
	
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String resolucion;
    private String expediente;
    private Convocatoria convocatoria;
    private LineaEstrategica lineaEstrategica;
    private Ambito ambito;	
    private List<Usuario> responsables = new ArrayList<Usuario>();

    // Constructores.
    public Actividad(String nombre, Date fechaInicio, Date fechaFin, String resolucion, String expediente, Convocatoria convocatoria, LineaEstrategica linea, Ambito ambito) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.resolucion = resolucion;
        this.expediente = expediente;
        this.convocatoria = convocatoria;
        this.lineaEstrategica = linea;
        this.ambito = ambito;
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getResolucion() {
        return resolucion;
    }
    
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getExpediente() {
        return expediente;
    }
    
    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }
    
    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public LineaEstrategica getlineaEstrategica() {
        return lineaEstrategica;
    }
    
    public void setlineaEstrategica(LineaEstrategica lineaEstrategica) {
        this.lineaEstrategica = lineaEstrategica;
    }

    public Ambito getAmbito() {
        return ambito;
    }
    public void setAmbito(Ambito ambito) {
        this.ambito = ambito;
    }

    public List<Usuario> getResponsables() {
        return responsables;
    }   

    public void setResponsables(List<Usuario> responsables) {
        this.responsables = responsables;
    }

    public void addResponsable(Usuario u) {
        responsables.add(u);
    }

    public void removeResponsable(Usuario u) {
        responsables.remove(u);
    }

    public abstract List<Impacto> getImpactos();
	
}
