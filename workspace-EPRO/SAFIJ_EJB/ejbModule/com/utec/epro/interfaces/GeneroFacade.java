package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.GeneroFacadeLocal;
import com.utec.epro.entities.Genero;

@Stateless
public class GeneroFacade extends AbstractFacade<Genero> implements GeneroFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GeneroFacade() {
        super(Genero.class);
    }

	@Override
	public void modify(Genero genero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Genero> findByGeneroId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}