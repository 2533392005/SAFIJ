package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CivilEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int estadoCivilId;
	private int estadoCivilEstado;
	private Date estadoCivilFechaCrea;
	private Date estadoCivilFechaModifica;
	private String estadoCivilNombre;
	private int estadoCivilUsuarioCrea;
	private int estadoCivilUsuarioModifica;
	private List<PersonalPersonaEjb> personalPersonas;

	public CivilEjb() {
	}

	public int getEstadoCivilId() {
		return this.estadoCivilId;
	}

	public void setEstadoCivilId(int estadoCivilId) {
		this.estadoCivilId = estadoCivilId;
	}

	public int getEstadoCivilEstado() {
		return this.estadoCivilEstado;
	}

	public void setEstadoCivilEstado(int estadoCivilEstado) {
		this.estadoCivilEstado = estadoCivilEstado;
	}

	public Date getEstadoCivilFechaCrea() {
		return this.estadoCivilFechaCrea;
	}

	public void setEstadoCivilFechaCrea(Date estadoCivilFechaCrea) {
		this.estadoCivilFechaCrea = estadoCivilFechaCrea;
	}

	public Date getEstadoCivilFechaModifica() {
		return this.estadoCivilFechaModifica;
	}

	public void setEstadoCivilFechaModifica(Date estadoCivilFechaModifica) {
		this.estadoCivilFechaModifica = estadoCivilFechaModifica;
	}

	public String getEstadoCivilNombre() {
		return this.estadoCivilNombre;
	}

	public void setEstadoCivilNombre(String estadoCivilNombre) {
		this.estadoCivilNombre = estadoCivilNombre;
	}

	public int getEstadoCivilUsuarioCrea() {
		return this.estadoCivilUsuarioCrea;
	}

	public void setEstadoCivilUsuarioCrea(int estadoCivilUsuarioCrea) {
		this.estadoCivilUsuarioCrea = estadoCivilUsuarioCrea;
	}

	public int getEstadoCivilUsuarioModifica() {
		return this.estadoCivilUsuarioModifica;
	}

	public void setEstadoCivilUsuarioModifica(int estadoCivilUsuarioModifica) {
		this.estadoCivilUsuarioModifica = estadoCivilUsuarioModifica;
	}

	public List<PersonalPersonaEjb> getPersonalPersonas() {
		return this.personalPersonas;
	}

	public void setPersonalPersonas(List<PersonalPersonaEjb> personalPersonas) {
		this.personalPersonas = personalPersonas;
	}

	public PersonalPersonaEjb addPersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().add(personalPersona);
		personalPersona.setCivil(this);

		return personalPersona;
	}

	public PersonalPersonaEjb removePersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().remove(personalPersona);
		personalPersona.setCivil(null);

		return personalPersona;
	}

}