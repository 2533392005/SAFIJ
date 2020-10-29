package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.EnrolamientoUsuarios;

@Local
public interface EnrolamientoUsuariosFacadeLocal {
	void create (EnrolamientoUsuarios enrolamientoUsuarios);
	void modify (EnrolamientoUsuarios enrolamientoUsuarios);
	void remove (EnrolamientoUsuarios enrolamientoUsuarios);
	EnrolamientoUsuarios find(Object id);
	List<EnrolamientoUsuarios> findAll();
	List<EnrolamientoUsuarios> findByUsuarioId(int i);
	int count();

}
