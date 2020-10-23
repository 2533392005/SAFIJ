package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class EnrolamientoAccesoEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accesosId;
	private int accesosDescripcion;
	private int accesosEstado;
	private Date accesosFechaCrea;
	private Date accesosFechaModi;
	private String accesosIdUsuarioCrea;
	private String accesosIdUsuarioModi;
	private int accesosNivel0;
	private int accesosNivel1;
	private int accesosNivel2;
	private int accesosNivel3;
	private int accesosNivel4;
	private int accesosNombre;
	private List<EnrolamientoRolesEjb> enrolamientoRoles;
	private List<EnrolamientoUsuariosEjb> enrolamientoUsuarios;

	public EnrolamientoAccesoEjb() {
	}

	public int getAccesosId() {
		return this.accesosId;
	}

	public void setAccesosId(int accesosId) {
		this.accesosId = accesosId;
	}

	public int getAccesosDescripcion() {
		return this.accesosDescripcion;
	}

	public void setAccesosDescripcion(int accesosDescripcion) {
		this.accesosDescripcion = accesosDescripcion;
	}

	public int getAccesosEstado() {
		return this.accesosEstado;
	}

	public void setAccesosEstado(int accesosEstado) {
		this.accesosEstado = accesosEstado;
	}

	public Date getAccesosFechaCrea() {
		return this.accesosFechaCrea;
	}

	public void setAccesosFechaCrea(Date accesosFechaCrea) {
		this.accesosFechaCrea = accesosFechaCrea;
	}

	public Date getAccesosFechaModi() {
		return this.accesosFechaModi;
	}

	public void setAccesosFechaModi(Date accesosFechaModi) {
		this.accesosFechaModi = accesosFechaModi;
	}

	public String getAccesosIdUsuarioCrea() {
		return this.accesosIdUsuarioCrea;
	}

	public void setAccesosIdUsuarioCrea(String accesosIdUsuarioCrea) {
		this.accesosIdUsuarioCrea = accesosIdUsuarioCrea;
	}

	public String getAccesosIdUsuarioModi() {
		return this.accesosIdUsuarioModi;
	}

	public void setAccesosIdUsuarioModi(String accesosIdUsuarioModi) {
		this.accesosIdUsuarioModi = accesosIdUsuarioModi;
	}

	public int getAccesosNivel0() {
		return this.accesosNivel0;
	}

	public void setAccesosNivel0(int accesosNivel0) {
		this.accesosNivel0 = accesosNivel0;
	}

	public int getAccesosNivel1() {
		return this.accesosNivel1;
	}

	public void setAccesosNivel1(int accesosNivel1) {
		this.accesosNivel1 = accesosNivel1;
	}

	public int getAccesosNivel2() {
		return this.accesosNivel2;
	}

	public void setAccesosNivel2(int accesosNivel2) {
		this.accesosNivel2 = accesosNivel2;
	}

	public int getAccesosNivel3() {
		return this.accesosNivel3;
	}

	public void setAccesosNivel3(int accesosNivel3) {
		this.accesosNivel3 = accesosNivel3;
	}

	public int getAccesosNivel4() {
		return this.accesosNivel4;
	}

	public void setAccesosNivel4(int accesosNivel4) {
		this.accesosNivel4 = accesosNivel4;
	}

	public int getAccesosNombre() {
		return this.accesosNombre;
	}

	public void setAccesosNombre(int accesosNombre) {
		this.accesosNombre = accesosNombre;
	}

	public List<EnrolamientoRolesEjb> getEnrolamientoRoles() {
		return this.enrolamientoRoles;
	}

	public void setEnrolamientoRoles(List<EnrolamientoRolesEjb> enrolamientoRoles) {
		this.enrolamientoRoles = enrolamientoRoles;
	}

	public EnrolamientoRolesEjb addEnrolamientoRole(EnrolamientoRolesEjb enrolamientoRole) {
		getEnrolamientoRoles().add(enrolamientoRole);
		enrolamientoRole.setEnrolamientoAcceso(this);

		return enrolamientoRole;
	}

	public EnrolamientoRolesEjb removeEnrolamientoRole(EnrolamientoRolesEjb enrolamientoRole) {
		getEnrolamientoRoles().remove(enrolamientoRole);
		enrolamientoRole.setEnrolamientoAcceso(null);

		return enrolamientoRole;
	}

	public List<EnrolamientoUsuariosEjb> getEnrolamientoUsuarios() {
		return this.enrolamientoUsuarios;
	}

	public void setEnrolamientoUsuarios(List<EnrolamientoUsuariosEjb> enrolamientoUsuarios) {
		this.enrolamientoUsuarios = enrolamientoUsuarios;
	}

	public EnrolamientoUsuariosEjb addEnrolamientoUsuario(EnrolamientoUsuariosEjb enrolamientoUsuario) {
		getEnrolamientoUsuarios().add(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoAcceso(this);

		return enrolamientoUsuario;
	}

	public EnrolamientoUsuariosEjb removeEnrolamientoUsuario(EnrolamientoUsuariosEjb enrolamientoUsuario) {
		getEnrolamientoUsuarios().remove(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoAcceso(null);

		return enrolamientoUsuario;
	}

}