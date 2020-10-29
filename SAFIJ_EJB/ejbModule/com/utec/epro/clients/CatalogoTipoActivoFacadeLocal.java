package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.CatalogoTipoActivo;

@Local
public interface CatalogoTipoActivoFacadeLocal {
	void create (CatalogoTipoActivo catalogoTipoActivo);
	void modify (CatalogoTipoActivo catalogoTipoActivo);
	void remove (CatalogoTipoActivo catalogoTipoActivo);
	CatalogoTipoActivo find(Object id);
	List<CatalogoTipoActivo> findAll();
	List<CatalogoTipoActivo> findByTipoActivoId(int i);
	int count();

}
