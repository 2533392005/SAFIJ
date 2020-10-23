package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.MantenimientosFacadeLocal;
import com.utec.epro.entities.Mantenimientos;

@Stateless
public class MantenimientosFacade extends AbstractFacade<Mantenimientos> implements MantenimientosFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MantenimientosFacade() {
        super(Mantenimientos.class);
    }

	@Override
	public void modify(Mantenimientos mantenimientos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Mantenimientos> findByMantenimientosId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}