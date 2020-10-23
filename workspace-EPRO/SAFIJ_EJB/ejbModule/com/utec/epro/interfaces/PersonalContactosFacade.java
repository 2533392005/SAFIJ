package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.PersonalContactosFacadeLocal;
import com.utec.epro.entities.PersonalContactos;

@Stateless
public class PersonalContactosFacade extends AbstractFacade<PersonalContactos> implements PersonalContactosFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalContactosFacade() {
        super(PersonalContactos.class);
    }

	@Override
	public void modify(PersonalContactos personalContactos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonalContactos> findByContactosId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}