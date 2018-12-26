package ar.edu.unnoba.poo2018.dao;

import ar.edu.unnoba.poo2018.model.Simple;
import javax.ejb.Stateless;


@Stateless
public class SimpleDAO extends AbstractDAO<Simple>  {

    public SimpleDAO(){
        
        super(Simple.class);
    }    
}
