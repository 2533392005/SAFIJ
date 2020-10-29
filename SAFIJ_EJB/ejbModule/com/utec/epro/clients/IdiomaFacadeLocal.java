package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Idioma;

@Local
public interface IdiomaFacadeLocal {
	void create (Idioma idioma);
	void modify (Idioma idioma);
	void remove (Idioma idioma);
	Idioma find(Object id);
	List<Idioma> findAll();
	List<Idioma> findByIdiomaId(int i);
	int count();

}
