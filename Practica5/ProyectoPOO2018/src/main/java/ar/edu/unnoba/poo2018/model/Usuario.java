package ar.edu.unnoba.poo2018.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
@NamedQueries({
    @NamedQuery(name = "usuario.findbyEmailAndPassword",
            query = "SELECT u FROM Usuario u WHERE u.email = :email and u.password = :password")
    ,
    @NamedQuery(name = "usuario.allUsuarios",
            query = "SELECT u FROM Usuario u"),})

public class Usuario extends AbstractEntity {

    //@Id
    //@SequenceGenerator(name = "ID_USUARIO_SEQ", sequenceName = "SEQ_USUARIO", allocationSize = 1, initialValue = 1)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_USUARIO_SEQ")
    //private long nro;
    private String email;
    private String password;
    private boolean administrador;

    @OneToMany(mappedBy = "responsables", fetch = FetchType.LAZY)
    private List<Actividad> actividades;

    // Constructores.
    public Usuario(String email, String password, boolean administrador) {
        this.email = email;
        this.password = password;
        this.administrador = administrador;
    }

    public Usuario() {
    }

    // Getters y Setters.
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean esAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }
}
