package ar.edu.unnoba.poo2018.ods.controller;

import ar.edu.unnoba.poo2018.dao.ActividadDAO;
import ar.edu.unnoba.poo2018.model.Actividad;
import ar.edu.unnoba.poo2018.model.Impacto;
import ar.edu.unnoba.poo2018.model.Objetivo;
import ar.edu.unnoba.poo2018.model.Simple;
import ar.edu.unnoba.poo2018.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ActividadBacking implements Serializable {
    
    private Actividad actividad;
    private Simple simple;
    private Impacto impacto;
    private Usuario usuario;
    private List<Simple> simples;
    private List<Objetivo> objetivos;
    private List<Usuario> usuarios;
    
    @EJB
    private ActividadDAO actividadDAO;
    

 
}