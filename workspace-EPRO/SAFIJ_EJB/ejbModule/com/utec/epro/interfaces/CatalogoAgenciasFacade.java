package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.CatalogoAgenciasFacadeLocal;
import com.utec.epro.entities.CatalogoAgencias;

@Stateless
public class CatalogoAgenciasFacade extends AbstractFacade<CatalogoAgencias> implements CatalogoAgenciasFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoAgenciasFacade() {
        super(CatalogoAgencias.class);
    }

	@Override
	public void modify(CatalogoAgencias catalogoAgencias) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CatalogoAgencias> findByAgenciasId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}