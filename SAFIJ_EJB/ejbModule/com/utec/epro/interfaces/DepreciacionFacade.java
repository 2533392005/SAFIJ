package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.DepreciacionFacadeLocal;
import com.utec.epro.entities.Depreciacion;

@Stateless
public class DepreciacionFacade extends AbstractFacade<Depreciacion> implements DepreciacionFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepreciacionFacade() {
        super(Depreciacion.class);
    }

	@Override
	public void modify(Depreciacion depreciacion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Depreciacion> findByDepreciacionId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}