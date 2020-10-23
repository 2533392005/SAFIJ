package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Parentesco;

@Local
public interface ParentescoFacadeLocal {
	void create (Parentesco parentesco);
	void modify (Parentesco parentesco);
	void remove (Parentesco parentesco);
	Parentesco find(Object id);
	List<Parentesco> findAll();
	List<Parentesco> findByParentescoId(int i);
	int count();

}
