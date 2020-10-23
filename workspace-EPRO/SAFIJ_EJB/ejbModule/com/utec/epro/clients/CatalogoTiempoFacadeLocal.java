package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.CatalogoTiempo;

@Local
public interface CatalogoTiempoFacadeLocal {
	void create (CatalogoTiempo catalogoTiempo);
	void modify (CatalogoTiempo catalogoTiempo);
	void remove (CatalogoTiempo catalogoTiempo);
	CatalogoTiempo find(Object id);
	List<CatalogoTiempo> findAll();
	List<CatalogoTiempo> findByTiempoId(int i);
	int count();

}
