package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.EnrolamientoAcceso;

@Local
public interface EnrolamientoAccesoFacadeLocal {
	void create (EnrolamientoAcceso enrolamientoAcceso);
	void modify (EnrolamientoAcceso enrolamientoAcceso);
	void remove (EnrolamientoAcceso enrolamientoAcceso);
	EnrolamientoAcceso find(Object id);
	List<EnrolamientoAcceso> findAll();
	List<EnrolamientoAcceso> findByAccesosId(int i);
	int count();

}
