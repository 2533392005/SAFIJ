package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.TransaccionFacadeLocal;
import com.utec.epro.entities.Transaccion;

@Stateless
public class TransaccionFacade extends AbstractFacade<Transaccion> implements TransaccionFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TransaccionFacade() {
        super(Transaccion.class);
    }

	@Override
	public void modify(Transaccion transaccion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Transaccion> findByTransaccionId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}