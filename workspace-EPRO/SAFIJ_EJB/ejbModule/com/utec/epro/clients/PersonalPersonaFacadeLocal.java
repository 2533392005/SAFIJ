package com.utec.epro.clients;

import java.util.List;
import javax.ejb.Local;
import com.utec.epro.entities.PersonalPersona;

@Local
public interface PersonalPersonaFacadeLocal {
	void create (PersonalPersona personalPersona);
	void modify (PersonalPersona personalPersona);
	void remove (PersonalPersona personalPersona);
	PersonalPersona find(Object id);
	List<PersonalPersona> findAll();
	List<PersonalPersona> findByPersonaId(int i);
	int count();

}
