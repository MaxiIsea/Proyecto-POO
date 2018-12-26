package ar.edu.unnoba.poo2018.model;

public class Usuario {

    private String nombre;
    private String clave;
    private boolean administrador;

    // Constructores.
    public Usuario(String nombre, String clave, boolean administrador) {
        this.nombre = nombre;
        this.clave = clave;
        this.administrador = administrador;
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
