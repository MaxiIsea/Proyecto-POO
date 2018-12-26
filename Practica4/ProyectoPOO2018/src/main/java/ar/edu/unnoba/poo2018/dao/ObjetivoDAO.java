package ar.edu.unnoba.poo2018.dao;

import ar.edu.unnoba.poo2018.model.Objetivo;
import javax.ejb.Stateless;

@Stateless
public class ObjetivoDAO extends AbstractDAO<Objetivo> {

    public ObjetivoDAO() {
        super(Objetivo.class);
    }
}
