package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Departamento;

@Local
public interface DepartamentoFacadeLocal {
	void create (Departamento departamento);
	void modify (Departamento departamento);
	void remove (Departamento departamento);
	Departamento find(Object id);
	List<Departamento> findAll();
	List<Departamento> findByDepartamentoId(int i);
	int count();

}
