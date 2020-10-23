package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.PersonalExperienciaLaboralFacadeLocal;
import com.utec.epro.entities.PersonalExperienciaLaboral;

@Stateless
public class PersonalExperienciaLaboralFacade extends AbstractFacade<PersonalExperienciaLaboral> implements PersonalExperienciaLaboralFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalExperienciaLaboralFacade() {
        super(PersonalExperienciaLaboral.class);
    }

	@Override
	public void modify(PersonalExperienciaLaboral personalExperienciaLaboral) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonalExperienciaLaboral> findByExperienciaLaboralId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}