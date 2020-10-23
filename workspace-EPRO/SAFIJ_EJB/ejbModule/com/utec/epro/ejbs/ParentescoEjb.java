package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ParentescoEjb implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int parentescoId;
	private int parentescoEstado;
	private Date parentescoFechaCrea;
	private Date parentescoFechaModifica;
	private String parentescoNombre;
	private int parentescoUsuarioCrea;
	private int parentescoUsuarioModifica;
	private List<PersonalContactosEjb> personalContactos;

	public ParentescoEjb() {
	}

	public int getParentescoId() {
		return this.parentescoId;
	}

	public void setParentescoId(int parentescoId) {
		this.parentescoId = parentescoId;
	}

	public int getParentescoEstado() {
		return this.parentescoEstado;
	}

	public void setParentescoEstado(int parentescoEstado) {
		this.parentescoEstado = parentescoEstado;
	}

	public Date getParentescoFechaCrea() {
		return this.parentescoFechaCrea;
	}

	public void setParentescoFechaCrea(Date parentescoFechaCrea) {
		this.parentescoFechaCrea = parentescoFechaCrea;
	}

	public Date getParentescoFechaModifica() {
		return this.parentescoFechaModifica;
	}

	public void setParentescoFechaModifica(Date parentescoFechaModifica) {
		this.parentescoFechaModifica = parentescoFechaModifica;
	}

	public String getParentescoNombre() {
		return this.parentescoNombre;
	}

	public void setParentescoNombre(String parentescoNombre) {
		this.parentescoNombre = parentescoNombre;
	}

	public int getParentescoUsuarioCrea() {
		return this.parentescoUsuarioCrea;
	}

	public void setParentescoUsuarioCrea(int parentescoUsuarioCrea) {
		this.parentescoUsuarioCrea = parentescoUsuarioCrea;
	}

	public int getParentescoUsuarioModifica() {
		return this.parentescoUsuarioModifica;
	}

	public void setParentescoUsuarioModifica(int parentescoUsuarioModifica) {
		this.parentescoUsuarioModifica = parentescoUsuarioModifica;
	}

	public List<PersonalContactosEjb> getPersonalContactos() {
		return this.personalContactos;
	}

	public void setPersonalContactos(List<PersonalContactosEjb> personalContactos) {
		this.personalContactos = personalContactos;
	}

	public PersonalContactosEjb addPersonalContacto(PersonalContactosEjb personalContacto) {
		getPersonalContactos().add(personalContacto);
		personalContacto.setParentesco(this);

		return personalContacto;
	}

	public PersonalContactosEjb removePersonalContacto(PersonalContactosEjb personalContacto) {
		getPersonalContactos().remove(personalContacto);
		personalContacto.setParentesco(null);

		return personalContacto;
	}

}