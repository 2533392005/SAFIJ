package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.Periodos;

@Local
public interface PeriodosFacadeLocal {
	void create (Periodos periodos);
	void modify (Periodos periodos);
	void remove (Periodos periodos);
	Periodos find(Object id);
	List<Periodos> findAll();
	List<Periodos> findByPeriodosId(int i);
	int count();

}
