package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Estados;

@Local
public interface EstadosFacadeLocal {
	void create (Estados estados);
	void modify (Estados estados);
	void remove (Estados estados);
	Estados find(Object id);
	List<Estados> findAll();
	List<Estados> findByEstadoId(int i);
	int count();

}
