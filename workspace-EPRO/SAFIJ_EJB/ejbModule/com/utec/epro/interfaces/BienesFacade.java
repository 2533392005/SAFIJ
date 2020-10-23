package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.BienesFacadeLocal;
import com.utec.epro.entities.Bienes;

@Stateless
public class BienesFacade extends AbstractFacade<Bienes> implements BienesFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BienesFacade() {
        super(Bienes.class);
    }

	@Override
	public void modify(Bienes bienes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bienes> findByBienesId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
