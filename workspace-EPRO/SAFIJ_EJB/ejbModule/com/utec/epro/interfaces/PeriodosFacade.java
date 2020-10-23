package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.PeriodosFacadeLocal;
import com.utec.epro.entities.Periodos;

@Stateless
public class PeriodosFacade extends AbstractFacade<Periodos> implements PeriodosFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeriodosFacade() {
        super(Periodos.class);
    }

	@Override
	public void modify(Periodos periodos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Periodos> findByPeriodosId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}