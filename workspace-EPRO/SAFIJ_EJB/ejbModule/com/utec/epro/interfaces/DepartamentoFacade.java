package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.DepartamentoFacadeLocal;
import com.utec.epro.entities.Departamento;

@Stateless
public class DepartamentoFacade extends AbstractFacade<Departamento> implements DepartamentoFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartamentoFacade() {
        super(Departamento.class);
    }

	@Override
	public void modify(Departamento departamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Departamento> findByDepartamentoId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}