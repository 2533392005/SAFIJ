package com.utec.epro.interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.utec.epro.clients.PersonalHabilidadesFacadeLocal;
import com.utec.epro.entities.PersonalHabilidades;

@Stateless
public class PersonalHabilidadesFacade extends AbstractFacade<PersonalHabilidades> implements PersonalHabilidadesFacadeLocal {
	@PersistenceContext(unitName = "SAFIJ_JPA") 
	private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonalHabilidadesFacade() {
        super(PersonalHabilidades.class);
    }

	@Override
	public void modify(PersonalHabilidades personalHabilidades) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonalHabilidades> findByHabilidadesId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}