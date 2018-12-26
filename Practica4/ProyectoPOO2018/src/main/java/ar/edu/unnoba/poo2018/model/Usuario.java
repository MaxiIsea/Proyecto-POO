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
@Table(name = "USUARIO")
public class Usuario extends AbstractEntity {

    //@Id
    //@SequenceGenerator(name = "ID_USUARIO_SEQ", sequenceName = "SEQ_USUARIO", allocationSize = 1, initialValue = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_USUARIO_SEQ")
    //private long nro;
    private String nombre;
    private String clave;
    private boolean administrador;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
    private List<Actividad> actividades;

    // Constructores.
    public Usuario(String nombre, String clave, boolean administrador) {
        this.nombre = nombre;
        this.clave = clave;
        this.administrador = administrador;
    }

    public Usuario() {
    }

    // Getters y Setters.
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
}
