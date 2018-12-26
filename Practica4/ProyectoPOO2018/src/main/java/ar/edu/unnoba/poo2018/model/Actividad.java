package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "Actividad")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Actividad extends AbstractEntity {

    //@Id
    //@SequenceGenerator(name = "ID_ACTIVIDAD_SEQ", sequenceName = "SEQ_ACTIVIDAD", allocationSize = 1, initialValue = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ACTIVIDAD_SEQ")
    //private long nro;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    private String resolucion;
    private String expediente;

    @ManyToOne(fetch = FetchType.LAZY)
    private Convocatoria convocatoria;
    @ManyToOne(fetch = FetchType.LAZY)
    private LineaEstrategica lineaEstrategica;    
    @ManyToOne(fetch = FetchType.LAZY)
    private Ambito ambito;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    private Simple simple;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "Responsables",
            joinColumns = @JoinColumn(name = "actividad_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id")
    )

    private List<Usuario> responsables = new ArrayList<Usuario>();

    @Version
    protected int version;
    @OneToOne(mappedBy = "actividad")
    private Impacto impacto;

    // Constructores.
    public Actividad(String nombre, Date fechaInicio, Date fechaFin, String resolucion, String expediente, Convocatoria convocatoria, LineaEstrategica lineaEstrategica, Ambito ambito) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.resolucion = resolucion;
        this.expediente = expediente;
        this.convocatoria = convocatoria;
        this.lineaEstrategica = lineaEstrategica;
        this.ambito = ambito;
    }

    public Actividad() {
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

    public LineaEstrategica getLineaEstrategica() {
        return lineaEstrategica;
    }

    public void setLineaEstrategica(LineaEstrategica lineaEstrategica) {
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

    @Override
    public String toString() {
        return "Actividad [nro=" + "nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
                + fechaFin + ", resolucion=" + resolucion + ", expediente=" + expediente + ", convocatoria="
                + convocatoria + ", linea=" + lineaEstrategica + ", ambito=" + ambito + ", responsables=" + responsables + "]";
    }

    public abstract List<Impacto> getImpactos();
}
