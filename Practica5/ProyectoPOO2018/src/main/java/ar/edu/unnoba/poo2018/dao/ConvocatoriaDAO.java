package ar.edu.unnoba.poo2018.dao;

import ar.edu.unnoba.poo2018.model.Convocatoria;
import javax.ejb.Stateless;

@Stateless
public class ConvocatoriaDAO extends AbstractDAO<Convocatoria> {

    public ConvocatoriaDAO() {
        super(Convocatoria.class);
    }
}
