package ar.edu.unnoba.poo2018.dao;

import ar.edu.unnoba.poo2018.model.Ambito;
import javax.ejb.Stateless;

@Stateless
public class AmbitoDAO extends AbstractDAO<Ambito> {

    public AmbitoDAO() {
        super(Ambito.class);
    }
}
