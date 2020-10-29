package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.ParentescoFacadeLocal;
import com.utec.epro.entities.Parentesco;

@Stateless
public class ParentescoFacade extends AbstractFacade<Parentesco> implements ParentescoFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParentescoFacade() {
        super(Parentesco.class);
    }

	@Override
	public void modify(Parentesco parentesco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Parentesco> findByParentescoId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}