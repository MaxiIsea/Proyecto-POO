package ar.edu.unnoba.poo2018.ods.controller;

import ar.edu.unnoba.poo2018.dao.ObjetivoDAO;
import ar.edu.unnoba.poo2018.model.Objetivo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
//import javax.faces.bean.SessionScoped;

@ManagedBean//(name = "objetivoBean")
@SessionScoped
public class ObjetivoBacking implements Serializable {

    private String nombre;
    private Objetivo objetivo;
    private List<Objetivo> objetivos;

    @EJB
    private ObjetivoDAO objetivoDAO;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

//    public List<Objetivo> getObjetivos() {
//        return objetivos;
//    }
    public void setObjetivos(List<Objetivo> objetivos) {
        this.objetivos = objetivos;
    }

    public String getByNombre() {
        objetivo = objetivoDAO.getByNombre(nombre);
        if (objetivo == null) {
            return null;
        }
        return "OK";
    }

    public List<Objetivo> getAllObjetivos() {
        objetivos = objetivoDAO.getAllObjetivos();
        return objetivos;
    }
}
