package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.PersonalHabilidades;

@Local
public interface PersonalHabilidadesFacadeLocal {
	void create (PersonalHabilidades personalHabilidades);
	void modify (PersonalHabilidades personalHabilidades);
	void remove (PersonalHabilidades personalHabilidades);
	PersonalHabilidades find(Object id);
	List<PersonalHabilidades> findAll();
	List<PersonalHabilidades> findByHabilidadesId(int i);
	int count();

}
