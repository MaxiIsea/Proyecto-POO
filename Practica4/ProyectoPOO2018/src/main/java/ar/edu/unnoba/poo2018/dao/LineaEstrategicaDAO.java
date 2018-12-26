package ar.edu.unnoba.poo2018.dao;

import ar.edu.unnoba.poo2018.model.LineaEstrategica;
import javax.ejb.Stateless;

@Stateless
public class LineaEstrategicaDAO extends AbstractDAO<LineaEstrategica> {

    public LineaEstrategicaDAO() {
        super(LineaEstrategica.class);
    }
}
