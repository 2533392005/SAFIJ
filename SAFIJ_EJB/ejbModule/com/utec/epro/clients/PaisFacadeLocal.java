package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Pais;

@Local
public interface PaisFacadeLocal {
	void create (Pais pais);
	void modify (Pais pais);
	void remove (Pais pais);
	Pais find(Object id);
	List<Pais> findAll();
	List<Pais> findByPaisId(int i);
	int count();

}
