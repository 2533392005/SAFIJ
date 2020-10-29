package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.PersonalProfesion;

@Local
public interface PersonalProfesionFacadeLocal {
	void create (PersonalProfesion personalProfesion);
	void modify (PersonalProfesion personalProfesion);
	void remove (PersonalProfesion personalProfesion);
	PersonalProfesion find(Object id);
	List<PersonalProfesion> findAll();
	List<PersonalProfesion> findByProfesionId(int i);
	int count();

}
