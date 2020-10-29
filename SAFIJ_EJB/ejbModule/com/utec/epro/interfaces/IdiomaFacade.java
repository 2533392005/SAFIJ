package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.IdiomaFacadeLocal;
import com.utec.epro.entities.Idioma;

@Stateless
public class IdiomaFacade extends AbstractFacade<Idioma> implements IdiomaFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IdiomaFacade() {
        super(Idioma.class);
    }

	@Override
	public void modify(Idioma idioma) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Idioma> findByIdiomaId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}