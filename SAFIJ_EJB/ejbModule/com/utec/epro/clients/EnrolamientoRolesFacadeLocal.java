package com.utec.epro.clients;

import javax.ejb.Local;
import java.util.List;
import com.utec.epro.entities.EnrolamientoRoles;

@Local
public interface EnrolamientoRolesFacadeLocal {
	void create (EnrolamientoRoles enrolamientoRoles);
	void modify (EnrolamientoRoles enrolamientoRoles);
	void remove (EnrolamientoRoles enrolamientoRoles);
	EnrolamientoRoles find(Object id);
	List<EnrolamientoRoles> findAll();
	List<EnrolamientoRoles> findByRolesId(int i);
	int count();

}
