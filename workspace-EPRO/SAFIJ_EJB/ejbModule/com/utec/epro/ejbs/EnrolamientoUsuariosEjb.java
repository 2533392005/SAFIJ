package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class EnrolamientoUsuariosEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int usuarioId;
	private String usuariosDescripcion;
	private int usuariosEstado;
	private Date usuariosFechaCrea;
	private Date usuariosFechaModi;
	private String usuariosIdUsuarioCrea;
	private String usuariosIdUsuarioModi;
	private int usuariosTipo;
	private EnrolamientoAccesoEjb enrolamientoAcceso;
	private PersonalPersonaEjb personalPersona;
	private EnrolamientoRolesEjb enrolamientoRole;

	public EnrolamientoUsuariosEjb() {
	}

	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuariosDescripcion() {
		return this.usuariosDescripcion;
	}

	public void setUsuariosDescripcion(String usuariosDescripcion) {
		this.usuariosDescripcion = usuariosDescripcion;
	}

	public int getUsuariosEstado() {
		return this.usuariosEstado;
	}

	public void setUsuariosEstado(int usuariosEstado) {
		this.usuariosEstado = usuariosEstado;
	}

	public Date getUsuariosFechaCrea() {
		return this.usuariosFechaCrea;
	}

	public void setUsuariosFechaCrea(Date usuariosFechaCrea) {
		this.usuariosFechaCrea = usuariosFechaCrea;
	}

	public Date getUsuariosFechaModi() {
		return this.usuariosFechaModi;
	}

	public void setUsuariosFechaModi(Date usuariosFechaModi) {
		this.usuariosFechaModi = usuariosFechaModi;
	}

	public String getUsuariosIdUsuarioCrea() {
		return this.usuariosIdUsuarioCrea;
	}

	public void setUsuariosIdUsuarioCrea(String usuariosIdUsuarioCrea) {
		this.usuariosIdUsuarioCrea = usuariosIdUsuarioCrea;
	}

	public String getUsuariosIdUsuarioModi() {
		return this.usuariosIdUsuarioModi;
	}

	public void setUsuariosIdUsuarioModi(String usuariosIdUsuarioModi) {
		this.usuariosIdUsuarioModi = usuariosIdUsuarioModi;
	}

	public int getUsuariosTipo() {
		return this.usuariosTipo;
	}

	public void setUsuariosTipo(int usuariosTipo) {
		this.usuariosTipo = usuariosTipo;
	}

	public EnrolamientoAccesoEjb getEnrolamientoAcceso() {
		return this.enrolamientoAcceso;
	}

	public void setEnrolamientoAcceso(EnrolamientoAccesoEjb enrolamientoAcceso) {
		this.enrolamientoAcceso = enrolamientoAcceso;
	}

	public PersonalPersonaEjb getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersonaEjb personalPersona) {
		this.personalPersona = personalPersona;
	}

	public EnrolamientoRolesEjb getEnrolamientoRole() {
		return this.enrolamientoRole;
	}

	public void setEnrolamientoRole(EnrolamientoRolesEjb enrolamientoRole) {
		this.enrolamientoRole = enrolamientoRole;
	}

}