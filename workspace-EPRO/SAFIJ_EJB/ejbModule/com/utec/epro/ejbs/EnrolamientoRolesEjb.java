package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class EnrolamientoRolesEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rolesId;
	private int rolesDescripcion;
	private int rolesEstado;
	private Date rolesFechaCrea;
	private Date rolesFechaModi;
	private String rolesIdUsuarioCrea;
	private String rolesIdUsuarioModi;
	private int rolesLlave0;
	private String rolesLlave1;
	private int rolesNivel0;
	private int rolesNivel1;
	private int rolesNivel2;
	private int rolesNivel3;
	private int rolesNivel4;
	private int rolesNombre;
	private EnrolamientoAccesoEjb enrolamientoAcceso;
	private List<EnrolamientoUsuariosEjb> enrolamientoUsuarios;

	public EnrolamientoRolesEjb() {
	}

	public int getRolesId() {
		return this.rolesId;
	}

	public void setRolesId(int rolesId) {
		this.rolesId = rolesId;
	}

	public int getRolesDescripcion() {
		return this.rolesDescripcion;
	}

	public void setRolesDescripcion(int rolesDescripcion) {
		this.rolesDescripcion = rolesDescripcion;
	}

	public int getRolesEstado() {
		return this.rolesEstado;
	}

	public void setRolesEstado(int rolesEstado) {
		this.rolesEstado = rolesEstado;
	}

	public Date getRolesFechaCrea() {
		return this.rolesFechaCrea;
	}

	public void setRolesFechaCrea(Date rolesFechaCrea) {
		this.rolesFechaCrea = rolesFechaCrea;
	}

	public Date getRolesFechaModi() {
		return this.rolesFechaModi;
	}

	public void setRolesFechaModi(Date rolesFechaModi) {
		this.rolesFechaModi = rolesFechaModi;
	}

	public String getRolesIdUsuarioCrea() {
		return this.rolesIdUsuarioCrea;
	}

	public void setRolesIdUsuarioCrea(String rolesIdUsuarioCrea) {
		this.rolesIdUsuarioCrea = rolesIdUsuarioCrea;
	}

	public String getRolesIdUsuarioModi() {
		return this.rolesIdUsuarioModi;
	}

	public void setRolesIdUsuarioModi(String rolesIdUsuarioModi) {
		this.rolesIdUsuarioModi = rolesIdUsuarioModi;
	}

	public int getRolesLlave0() {
		return this.rolesLlave0;
	}

	public void setRolesLlave0(int rolesLlave0) {
		this.rolesLlave0 = rolesLlave0;
	}

	public String getRolesLlave1() {
		return this.rolesLlave1;
	}

	public void setRolesLlave1(String rolesLlave1) {
		this.rolesLlave1 = rolesLlave1;
	}

	public int getRolesNivel0() {
		return this.rolesNivel0;
	}

	public void setRolesNivel0(int rolesNivel0) {
		this.rolesNivel0 = rolesNivel0;
	}

	public int getRolesNivel1() {
		return this.rolesNivel1;
	}

	public void setRolesNivel1(int rolesNivel1) {
		this.rolesNivel1 = rolesNivel1;
	}

	public int getRolesNivel2() {
		return this.rolesNivel2;
	}

	public void setRolesNivel2(int rolesNivel2) {
		this.rolesNivel2 = rolesNivel2;
	}

	public int getRolesNivel3() {
		return this.rolesNivel3;
	}

	public void setRolesNivel3(int rolesNivel3) {
		this.rolesNivel3 = rolesNivel3;
	}

	public int getRolesNivel4() {
		return this.rolesNivel4;
	}

	public void setRolesNivel4(int rolesNivel4) {
		this.rolesNivel4 = rolesNivel4;
	}

	public int getRolesNombre() {
		return this.rolesNombre;
	}

	public void setRolesNombre(int rolesNombre) {
		this.rolesNombre = rolesNombre;
	}

	public EnrolamientoAccesoEjb getEnrolamientoAcceso() {
		return this.enrolamientoAcceso;
	}

	public void setEnrolamientoAcceso(EnrolamientoAccesoEjb enrolamientoAcceso) {
		this.enrolamientoAcceso = enrolamientoAcceso;
	}

	public List<EnrolamientoUsuariosEjb> getEnrolamientoUsuarios() {
		return this.enrolamientoUsuarios;
	}

	public void setEnrolamientoUsuarios(List<EnrolamientoUsuariosEjb> enrolamientoUsuarios) {
		this.enrolamientoUsuarios = enrolamientoUsuarios;
	}

	public EnrolamientoUsuariosEjb addEnrolamientoUsuario(EnrolamientoUsuariosEjb enrolamientoUsuario) {
		getEnrolamientoUsuarios().add(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoRole(this);

		return enrolamientoUsuario;
	}

	public EnrolamientoUsuariosEjb removeEnrolamientoUsuario(EnrolamientoUsuariosEjb enrolamientoUsuario) {
		getEnrolamientoUsuarios().remove(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoRole(null);

		return enrolamientoUsuario;
	}

}