package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Ciudad;

@Local
public interface CiudadFacadeLocal {
	void create (Ciudad ciudad);
	void modify (Ciudad ciudad);
	void remove (Ciudad ciudad);
	Ciudad find(Object id);
	List<Ciudad> findAll();
	List<Ciudad> findByCiudadId(int i);
	int count();

}
