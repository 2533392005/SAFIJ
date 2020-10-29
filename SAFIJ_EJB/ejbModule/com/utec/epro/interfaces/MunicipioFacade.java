package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.MunicipioFacadeLocal;
import com.utec.epro.entities.Municipio;

@Stateless
public class MunicipioFacade extends AbstractFacade<Municipio> implements MunicipioFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MunicipioFacade() {
        super(Municipio.class);
    }

	@Override
	public void modify(Municipio municipio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Municipio> findByMunicipioId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}