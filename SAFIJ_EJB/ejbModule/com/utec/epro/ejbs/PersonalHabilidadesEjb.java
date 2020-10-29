package com.utec.epro.ejbs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PersonalHabilidadesEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int habilidadesId;
	private String habilidadesDescripcion;
	private int habilidadesEstado;
	private Date habilidadesFechaCrea;
	private Date habilidadesFechaModifica;
	private BigDecimal habilidadesPorcentaje;
	private int habilidadesUsuarioCrea;
	private int habilidadesUsuarioModifica;
	private PersonalPersonaEjb personalPersona;

	public PersonalHabilidadesEjb() {
	}

	public int getHabilidadesId() {
		return this.habilidadesId;
	}

	public void setHabilidadesId(int habilidadesId) {
		this.habilidadesId = habilidadesId;
	}

	public String getHabilidadesDescripcion() {
		return this.habilidadesDescripcion;
	}

	public void setHabilidadesDescripcion(String habilidadesDescripcion) {
		this.habilidadesDescripcion = habilidadesDescripcion;
	}

	public int getHabilidadesEstado() {
		return this.habilidadesEstado;
	}

	public void setHabilidadesEstado(int habilidadesEstado) {
		this.habilidadesEstado = habilidadesEstado;
	}

	public Date getHabilidadesFechaCrea() {
		return this.habilidadesFechaCrea;
	}

	public void setHabilidadesFechaCrea(Date habilidadesFechaCrea) {
		this.habilidadesFechaCrea = habilidadesFechaCrea;
	}

	public Date getHabilidadesFechaModifica() {
		return this.habilidadesFechaModifica;
	}

	public void setHabilidadesFechaModifica(Date habilidadesFechaModifica) {
		this.habilidadesFechaModifica = habilidadesFechaModifica;
	}

	public BigDecimal getHabilidadesPorcentaje() {
		return this.habilidadesPorcentaje;
	}

	public void setHabilidadesPorcentaje(BigDecimal habilidadesPorcentaje) {
		this.habilidadesPorcentaje = habilidadesPorcentaje;
	}

	public int getHabilidadesUsuarioCrea() {
		return this.habilidadesUsuarioCrea;
	}

	public void setHabilidadesUsuarioCrea(int habilidadesUsuarioCrea) {
		this.habilidadesUsuarioCrea = habilidadesUsuarioCrea;
	}

	public int getHabilidadesUsuarioModifica() {
		return this.habilidadesUsuarioModifica;
	}

	public void setHabilidadesUsuarioModifica(int habilidadesUsuarioModifica) {
		this.habilidadesUsuarioModifica = habilidadesUsuarioModifica;
	}

	public PersonalPersonaEjb getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersonaEjb personalPersona) {
		this.personalPersona = personalPersona;
	}

}