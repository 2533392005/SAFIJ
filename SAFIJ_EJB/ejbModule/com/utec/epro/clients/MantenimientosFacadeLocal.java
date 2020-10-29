package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Mantenimientos;

@Local
public interface MantenimientosFacadeLocal {
	void create (Mantenimientos mantenimientos);
	void modify (Mantenimientos mantenimientos);
	void remove (Mantenimientos mantenimientos);
	Mantenimientos find(Object id);
	List<Mantenimientos> findAll();
	List<Mantenimientos> findByMantenimientosId(int i);
	int count();

}
