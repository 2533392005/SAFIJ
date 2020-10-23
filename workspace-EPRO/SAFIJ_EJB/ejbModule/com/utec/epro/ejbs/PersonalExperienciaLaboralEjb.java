package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class PersonalExperienciaLaboralEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int experienciaLaboralId;
	private int experienciaLaboralAnio;
	private String experienciaLaboralCargo;
	private String experienciaLaboralComentarios;
	private String experienciaLaboralContacto;
	private String experienciaLaboralEmpresa;
	private int experienciaLaboralEstado;
	private Date experienciaLaboralFechaCrea;
	private Date experienciaLaboralFechaDesde;
	private Date experienciaLaboralFechaModifica;
	private String experienciaLaboralTelefono;
	private int experienciaLaboralUsuarioCrea;
	private int experienciaLaboralUsuarioModifica;
	private PersonalPersonaEjb personalPersona;

	public PersonalExperienciaLaboralEjb() {
	}

	public int getExperienciaLaboralId() {
		return this.experienciaLaboralId;
	}

	public void setExperienciaLaboralId(int experienciaLaboralId) {
		this.experienciaLaboralId = experienciaLaboralId;
	}

	public int getExperienciaLaboralAnio() {
		return this.experienciaLaboralAnio;
	}

	public void setExperienciaLaboralAnio(int experienciaLaboralAnio) {
		this.experienciaLaboralAnio = experienciaLaboralAnio;
	}

	public String getExperienciaLaboralCargo() {
		return this.experienciaLaboralCargo;
	}

	public void setExperienciaLaboralCargo(String experienciaLaboralCargo) {
		this.experienciaLaboralCargo = experienciaLaboralCargo;
	}

	public String getExperienciaLaboralComentarios() {
		return this.experienciaLaboralComentarios;
	}

	public void setExperienciaLaboralComentarios(String experienciaLaboralComentarios) {
		this.experienciaLaboralComentarios = experienciaLaboralComentarios;
	}

	public String getExperienciaLaboralContacto() {
		return this.experienciaLaboralContacto;
	}

	public void setExperienciaLaboralContacto(String experienciaLaboralContacto) {
		this.experienciaLaboralContacto = experienciaLaboralContacto;
	}

	public String getExperienciaLaboralEmpresa() {
		return this.experienciaLaboralEmpresa;
	}

	public void setExperienciaLaboralEmpresa(String experienciaLaboralEmpresa) {
		this.experienciaLaboralEmpresa = experienciaLaboralEmpresa;
	}

	public int getExperienciaLaboralEstado() {
		return this.experienciaLaboralEstado;
	}

	public void setExperienciaLaboralEstado(int experienciaLaboralEstado) {
		this.experienciaLaboralEstado = experienciaLaboralEstado;
	}

	public Date getExperienciaLaboralFechaCrea() {
		return this.experienciaLaboralFechaCrea;
	}

	public void setExperienciaLaboralFechaCrea(Date experienciaLaboralFechaCrea) {
		this.experienciaLaboralFechaCrea = experienciaLaboralFechaCrea;
	}

	public Date getExperienciaLaboralFechaDesde() {
		return this.experienciaLaboralFechaDesde;
	}

	public void setExperienciaLaboralFechaDesde(Date experienciaLaboralFechaDesde) {
		this.experienciaLaboralFechaDesde = experienciaLaboralFechaDesde;
	}

	public Date getExperienciaLaboralFechaModifica() {
		return this.experienciaLaboralFechaModifica;
	}

	public void setExperienciaLaboralFechaModifica(Date experienciaLaboralFechaModifica) {
		this.experienciaLaboralFechaModifica = experienciaLaboralFechaModifica;
	}

	public String getExperienciaLaboralTelefono() {
		return this.experienciaLaboralTelefono;
	}

	public void setExperienciaLaboralTelefono(String experienciaLaboralTelefono) {
		this.experienciaLaboralTelefono = experienciaLaboralTelefono;
	}

	public int getExperienciaLaboralUsuarioCrea() {
		return this.experienciaLaboralUsuarioCrea;
	}

	public void setExperienciaLaboralUsuarioCrea(int experienciaLaboralUsuarioCrea) {
		this.experienciaLaboralUsuarioCrea = experienciaLaboralUsuarioCrea;
	}

	public int getExperienciaLaboralUsuarioModifica() {
		return this.experienciaLaboralUsuarioModifica;
	}

	public void setExperienciaLaboralUsuarioModifica(int experienciaLaboralUsuarioModifica) {
		this.experienciaLaboralUsuarioModifica = experienciaLaboralUsuarioModifica;
	}

	public PersonalPersonaEjb getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersonaEjb personalPersona) {
		this.personalPersona = personalPersona;
	}

}