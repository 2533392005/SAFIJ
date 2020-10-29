package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PersonalProfesionEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int profesionId;
	private int profesionEstado;
	private Date profesionFechaCrea;
	private Date profesionFechaModifica;
	private String profesionNombre;
	private int profesionUsuarioCrea;
	private int profesionUsuarioModifica;
	private List<PersonalPersonaEjb> personalPersonas;

	public PersonalProfesionEjb() {
	}

	public int getProfesionId() {
		return this.profesionId;
	}

	public void setProfesionId(int profesionId) {
		this.profesionId = profesionId;
	}

	public int getProfesionEstado() {
		return this.profesionEstado;
	}

	public void setProfesionEstado(int profesionEstado) {
		this.profesionEstado = profesionEstado;
	}

	public Date getProfesionFechaCrea() {
		return this.profesionFechaCrea;
	}

	public void setProfesionFechaCrea(Date profesionFechaCrea) {
		this.profesionFechaCrea = profesionFechaCrea;
	}

	public Date getProfesionFechaModifica() {
		return this.profesionFechaModifica;
	}

	public void setProfesionFechaModifica(Date profesionFechaModifica) {
		this.profesionFechaModifica = profesionFechaModifica;
	}

	public String getProfesionNombre() {
		return this.profesionNombre;
	}

	public void setProfesionNombre(String profesionNombre) {
		this.profesionNombre = profesionNombre;
	}

	public int getProfesionUsuarioCrea() {
		return this.profesionUsuarioCrea;
	}

	public void setProfesionUsuarioCrea(int profesionUsuarioCrea) {
		this.profesionUsuarioCrea = profesionUsuarioCrea;
	}

	public int getProfesionUsuarioModifica() {
		return this.profesionUsuarioModifica;
	}

	public void setProfesionUsuarioModifica(int profesionUsuarioModifica) {
		this.profesionUsuarioModifica = profesionUsuarioModifica;
	}

	public List<PersonalPersonaEjb> getPersonalPersonas() {
		return this.personalPersonas;
	}

	public void setPersonalPersonas(List<PersonalPersonaEjb> personalPersonas) {
		this.personalPersonas = personalPersonas;
	}

	public PersonalPersonaEjb addPersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().add(personalPersona);
		personalPersona.setPersonalProfesion(this);

		return personalPersona;
	}

	public PersonalPersonaEjb removePersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().remove(personalPersona);
		personalPersona.setPersonalProfesion(null);

		return personalPersona;
	}

}