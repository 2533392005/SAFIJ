package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.EnrolamientoUsuariosFacadeLocal;
import com.utec.epro.entities.EnrolamientoUsuarios;

@Stateless
public class EnrolamientoUsuariosFacade extends AbstractFacade<EnrolamientoUsuarios> implements EnrolamientoUsuariosFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnrolamientoUsuariosFacade() {
        super(EnrolamientoUsuarios.class);
    }

	@Override
	public void modify(EnrolamientoUsuarios enrolamientoUsuarios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EnrolamientoUsuarios> findByUsuarioId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}