package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.PersonalProfesionFacadeLocal;
import com.utec.epro.entities.PersonalProfesion;

@Stateless
public class PersonalProfesionFacade extends AbstractFacade<PersonalProfesion> implements PersonalProfesionFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalProfesionFacade() {
        super(PersonalProfesion.class);
    }

	@Override
	public void modify(PersonalProfesion personalProfesion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonalProfesion> findByProfesionId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}