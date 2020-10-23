package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.CiudadFacadeLocal;
import com.utec.epro.entities.Ciudad;

@Stateless
public class CiudadFacade extends AbstractFacade<Ciudad> implements CiudadFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadFacade() {
        super(Ciudad.class);
    }

	@Override
	public void modify(Ciudad ciudad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ciudad> findByCiudadId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}