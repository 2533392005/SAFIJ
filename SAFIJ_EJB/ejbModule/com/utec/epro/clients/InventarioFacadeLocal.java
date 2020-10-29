package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Inventario;

@Local
public interface InventarioFacadeLocal {
	void create (Inventario inventario);
	void modify (Inventario inventario);
	void remove (Inventario inventario);
	Inventario find(Object id);
	List<Inventario> findAll();
	List<Inventario> findByInventarioId(int i);
	int count();

}
