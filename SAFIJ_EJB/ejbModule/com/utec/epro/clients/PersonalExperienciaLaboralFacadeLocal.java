package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.PersonalExperienciaLaboral;

@Local
public interface PersonalExperienciaLaboralFacadeLocal {
	void create (PersonalExperienciaLaboral personalExperienciaLaboral);
	void modify (PersonalExperienciaLaboral personalExperienciaLaboral);
	void remove (PersonalExperienciaLaboral personalExperienciaLaboral);
	PersonalExperienciaLaboral find(Object id);
	List<PersonalExperienciaLaboral> findAll();
	List<PersonalExperienciaLaboral> findByExperienciaLaboralId(int i);
	int count();

}
