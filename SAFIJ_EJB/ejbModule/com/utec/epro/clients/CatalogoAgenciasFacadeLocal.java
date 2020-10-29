package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.CatalogoAgencias;

@Local
public interface CatalogoAgenciasFacadeLocal {
	void create (CatalogoAgencias catalogoAgencias);
	void modify (CatalogoAgencias catalogoAgencias);
	void remove (CatalogoAgencias catalogoAgencias);
	CatalogoAgencias find(Object id);
	List<CatalogoAgencias> findAll();
	List<CatalogoAgencias> findByAgenciasId(int i);
	int count();

}
