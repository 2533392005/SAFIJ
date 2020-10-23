package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class PersonalContactosEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int contactosId;
	private String contactoTelefonoFijo;
	private String contactoTelefonoMovil;
	private String contactosDireccion;
	private int contactosEstado;
	private Date contactosFechaCrea;
	private Date contactosFechaModifica;
	private String contactosNombre;
	private int contactosUsuarioCrea;
	private int contactosUsuarioModifica;
	private ParentescoEjb parentesco;
	private PersonalPersonaEjb personalPersona;

	public PersonalContactosEjb() {
	}

	public int getContactosId() {
		return this.contactosId;
	}

	public void setContactosId(int contactosId) {
		this.contactosId = contactosId;
	}

	public String getContactoTelefonoFijo() {
		return this.contactoTelefonoFijo;
	}

	public void setContactoTelefonoFijo(String contactoTelefonoFijo) {
		this.contactoTelefonoFijo = contactoTelefonoFijo;
	}

	public String getContactoTelefonoMovil() {
		return this.contactoTelefonoMovil;
	}

	public void setContactoTelefonoMovil(String contactoTelefonoMovil) {
		this.contactoTelefonoMovil = contactoTelefonoMovil;
	}

	public String getContactosDireccion() {
		return this.contactosDireccion;
	}

	public void setContactosDireccion(String contactosDireccion) {
		this.contactosDireccion = contactosDireccion;
	}

	public int getContactosEstado() {
		return this.contactosEstado;
	}

	public void setContactosEstado(int contactosEstado) {
		this.contactosEstado = contactosEstado;
	}

	public Date getContactosFechaCrea() {
		return this.contactosFechaCrea;
	}

	public void setContactosFechaCrea(Date contactosFechaCrea) {
		this.contactosFechaCrea = contactosFechaCrea;
	}

	public Date getContactosFechaModifica() {
		return this.contactosFechaModifica;
	}

	public void setContactosFechaModifica(Date contactosFechaModifica) {
		this.contactosFechaModifica = contactosFechaModifica;
	}

	public String getContactosNombre() {
		return this.contactosNombre;
	}

	public void setContactosNombre(String contactosNombre) {
		this.contactosNombre = contactosNombre;
	}

	public int getContactosUsuarioCrea() {
		return this.contactosUsuarioCrea;
	}

	public void setContactosUsuarioCrea(int contactosUsuarioCrea) {
		this.contactosUsuarioCrea = contactosUsuarioCrea;
	}

	public int getContactosUsuarioModifica() {
		return this.contactosUsuarioModifica;
	}

	public void setContactosUsuarioModifica(int contactosUsuarioModifica) {
		this.contactosUsuarioModifica = contactosUsuarioModifica;
	}

	public ParentescoEjb getParentesco() {
		return this.parentesco;
	}

	public void setParentesco(ParentescoEjb parentesco) {
		this.parentesco = parentesco;
	}

	public PersonalPersonaEjb getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersonaEjb personalPersona) {
		this.personalPersona = personalPersona;
	}

}