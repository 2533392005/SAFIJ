package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.PersonalPersonaFacadeLocal;
import com.utec.epro.entities.PersonalPersona;

@Stateless
public class PersonalPersonaFacade extends AbstractFacade<PersonalPersona> implements PersonalPersonaFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalPersonaFacade() {
        super(PersonalPersona.class);
    }

	@Override
	public void modify(PersonalPersona personalPersona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonalPersona> findByPersonaId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}