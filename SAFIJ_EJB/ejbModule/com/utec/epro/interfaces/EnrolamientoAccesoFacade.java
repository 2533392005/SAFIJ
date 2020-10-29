package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.EnrolamientoAccesoFacadeLocal;
import com.utec.epro.entities.EnrolamientoAcceso;

@Stateless
public class EnrolamientoAccesoFacade extends AbstractFacade<EnrolamientoAcceso> implements EnrolamientoAccesoFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnrolamientoAccesoFacade() {
        super(EnrolamientoAcceso.class);
    }

	@Override
	public void modify(EnrolamientoAcceso enrolamientoAcceso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EnrolamientoAcceso> findByAccesosId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}