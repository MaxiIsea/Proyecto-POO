package ar.edu.unnoba.poo2018.dao;

import ar.edu.unnoba.poo2018.model.Compuesto;
import javax.ejb.Stateless;


@Stateless
public class CompuestoDAO extends AbstractDAO<Compuesto> {

    public CompuestoDAO() {
        
        super(Compuesto.class);
    }    
}
