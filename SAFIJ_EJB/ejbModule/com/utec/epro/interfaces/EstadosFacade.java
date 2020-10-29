package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.EstadosFacadeLocal;
import com.utec.epro.entities.Estados;

@Stateless
public class EstadosFacade extends AbstractFacade<Estados> implements EstadosFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadosFacade() {
        super(Estados.class);
    }

	@Override
	public void modify(Estados estados) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estados> findByEstadoId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}