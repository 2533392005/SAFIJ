package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Civil;

@Local
public interface CivilFacadeLocal {
	void create (Civil civil);
	void modify (Civil civil);
	void remove (Civil civil);
	Civil find(Object id);
	List<Civil> findAll();
	List<Civil> findByEstadoCivilId(int i);
	int count();

}
