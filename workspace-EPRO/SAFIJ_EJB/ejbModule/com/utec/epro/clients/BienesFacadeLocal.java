package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Bienes;

@Local
public interface BienesFacadeLocal {
	void create (Bienes bienes);
	void modify (Bienes bienes);
	void remove (Bienes bienes);
	Bienes find(Object id);
	List<Bienes> findAll();
	List<Bienes> findByBienesId(int i);
	int count();
}
