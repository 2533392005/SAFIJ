package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.EnrolamientoRolesFacadeLocal;
import com.utec.epro.entities.EnrolamientoRoles;

@Stateless
public class EnrolamientoRolesFacade extends AbstractFacade<EnrolamientoRoles> implements EnrolamientoRolesFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnrolamientoRolesFacade() {
        super(EnrolamientoRoles.class);
    }

	@Override
	public void modify(EnrolamientoRoles enrolamientoRoles) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EnrolamientoRoles> findByRolesId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}