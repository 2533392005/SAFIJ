package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Genero;

@Local
public interface GeneroFacadeLocal {
	void create (Genero genero);
	void modify (Genero genero);
	void remove (Genero genero);
	Genero find(Object id);
	List<Genero> findAll();
	List<Genero> findByGeneroId(int i);
	int count();

}
