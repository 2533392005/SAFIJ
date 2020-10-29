package com.utec.epro.clients;

import java.util.List;
import javax.ejb.Local;
import com.utec.epro.entities.Transaccion;

@Local
public interface TransaccionFacadeLocal {
	void create (Transaccion transaccion);
	void modify (Transaccion transaccion);
	void remove (Transaccion transaccion);
	Transaccion find(Object id);
	List<Transaccion> findAll();
	List<Transaccion> findByTransaccionId(int i);
	int count();
}
