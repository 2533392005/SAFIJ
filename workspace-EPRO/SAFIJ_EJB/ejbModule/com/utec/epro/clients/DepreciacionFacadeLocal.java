package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Depreciacion;

@Local
public interface DepreciacionFacadeLocal {
	void create (Depreciacion depreciacion);
	void modify (Depreciacion depreciacion);
	void remove (Depreciacion depreciacion);
	Depreciacion find(Object id);
	List<Depreciacion> findAll();
	List<Depreciacion> findByDepreciacionId(int i);
	int count();

}
