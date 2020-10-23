package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.CivilFacadeLocal;
import com.utec.epro.entities.Civil;

@Stateless
public class CivilFacade extends AbstractFacade<Civil> implements CivilFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CivilFacade() {
        super(Civil.class);
    }

	@Override
	public void modify(Civil civil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Civil> findByEstadoCivilId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}