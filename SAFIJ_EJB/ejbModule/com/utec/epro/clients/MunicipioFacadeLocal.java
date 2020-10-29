package com.utec.epro.clients;

import javax.ejb.Local;
import com.utec.epro.entities.Municipio;
import java.util.List;

@Local
public interface MunicipioFacadeLocal {
	void create (Municipio municipio);
	void modify (Municipio municipio);
	void remove (Municipio municipio);
	Municipio find(Object id);
	List<Municipio> findAll();
	List<Municipio> findByMunicipioId(int i);
	int count();

}
