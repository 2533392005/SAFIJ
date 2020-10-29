package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.InventarioFacadeLocal;
import com.utec.epro.entities.Inventario;

@Stateless
public class InventarioFacade extends AbstractFacade<Inventario> implements InventarioFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventarioFacade() {
        super(Inventario.class);
    }

	@Override
	public void modify(Inventario inventario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Inventario> findByInventarioId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}