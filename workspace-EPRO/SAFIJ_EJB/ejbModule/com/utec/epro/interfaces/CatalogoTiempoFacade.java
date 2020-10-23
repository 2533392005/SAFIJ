package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.CatalogoTiempoFacadeLocal;
import com.utec.epro.entities.CatalogoTiempo;

@Stateless
public class CatalogoTiempoFacade extends AbstractFacade<CatalogoTiempo> implements CatalogoTiempoFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoTiempoFacade() {
        super(CatalogoTiempo.class);
    }

	@Override
	public void modify(CatalogoTiempo catalogoTiempo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CatalogoTiempo> findByTiempoId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}