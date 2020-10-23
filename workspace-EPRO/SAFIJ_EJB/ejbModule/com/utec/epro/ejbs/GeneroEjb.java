package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GeneroEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int generoId;
	private int generoEstado;
	private Date generoFechaCrea;
	private Date generoFechaModifica;
	private String generoNombre;
	private int generoUsuarioCrea;
	private int generoUsuarioModifica;
	private List<PersonalPersonaEjb> personalPersonas;

	public GeneroEjb() {
	}

	public int getGeneroId() {
		return this.generoId;
	}

	public void setGeneroId(int generoId) {
		this.generoId = generoId;
	}

	public int getGeneroEstado() {
		return this.generoEstado;
	}

	public void setGeneroEstado(int generoEstado) {
		this.generoEstado = generoEstado;
	}

	public Date getGeneroFechaCrea() {
		return this.generoFechaCrea;
	}

	public void setGeneroFechaCrea(Date generoFechaCrea) {
		this.generoFechaCrea = generoFechaCrea;
	}

	public Date getGeneroFechaModifica() {
		return this.generoFechaModifica;
	}

	public void setGeneroFechaModifica(Date generoFechaModifica) {
		this.generoFechaModifica = generoFechaModifica;
	}

	public String getGeneroNombre() {
		return this.generoNombre;
	}

	public void setGeneroNombre(String generoNombre) {
		this.generoNombre = generoNombre;
	}

	public int getGeneroUsuarioCrea() {
		return this.generoUsuarioCrea;
	}

	public void setGeneroUsuarioCrea(int generoUsuarioCrea) {
		this.generoUsuarioCrea = generoUsuarioCrea;
	}

	public int getGeneroUsuarioModifica() {
		return this.generoUsuarioModifica;
	}

	public void setGeneroUsuarioModifica(int generoUsuarioModifica) {
		this.generoUsuarioModifica = generoUsuarioModifica;
	}

	public List<PersonalPersonaEjb> getPersonalPersonas() {
		return this.personalPersonas;
	}

	public void setPersonalPersonas(List<PersonalPersonaEjb> personalPersonas) {
		this.personalPersonas = personalPersonas;
	}

	public PersonalPersonaEjb addPersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().add(personalPersona);
		personalPersona.setGenero(this);

		return personalPersona;
	}

	public PersonalPersonaEjb removePersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().remove(personalPersona);
		personalPersona.setGenero(null);

		return personalPersona;
	}

}