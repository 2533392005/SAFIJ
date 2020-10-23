package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.PersonalContactos;

@Local
public interface PersonalContactosFacadeLocal {
	void create (PersonalContactos personalContactos);
	void modify (PersonalContactos personalContactos);
	void remove (PersonalContactos personalContactos);
	PersonalContactos find(Object id);
	List<PersonalContactos> findAll();
	List<PersonalContactos> findByContactosId(int i);
	int count();

}
