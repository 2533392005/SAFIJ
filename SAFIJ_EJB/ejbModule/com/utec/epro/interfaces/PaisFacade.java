package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.PaisFacadeLocal;
import com.utec.epro.entities.Pais;

@Stateless
public class PaisFacade extends AbstractFacade<Pais> implements PaisFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaisFacade() {
        super(Pais.class);
    }

	@Override
	public void modify(Pais pais) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pais> findByPaisId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}