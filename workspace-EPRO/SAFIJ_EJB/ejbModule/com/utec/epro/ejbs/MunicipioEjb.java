package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class MunicipioEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int municipioId;
	private int municipioEstado;
	private Date municipioFechaCrea;
	private Date municipioFechaModifica;
	private String municipioNombre;
	private int municipioUsuarioCrea;
	private int municipioUsuarioModifica;
	private List<CatalogoAgenciasEjb> catalogoAgencias;
	private List<CiudadEjb> ciudads;
	private DepartamentoEjb departamento;
	private List<PersonalPersonaEjb> personalPersonas;

	public MunicipioEjb() {
	}

	public int getMunicipioId() {
		return this.municipioId;
	}

	public void setMunicipioId(int municipioId) {
		this.municipioId = municipioId;
	}

	public int getMunicipioEstado() {
		return this.municipioEstado;
	}

	public void setMunicipioEstado(int municipioEstado) {
		this.municipioEstado = municipioEstado;
	}

	public Date getMunicipioFechaCrea() {
		return this.municipioFechaCrea;
	}

	public void setMunicipioFechaCrea(Date municipioFechaCrea) {
		this.municipioFechaCrea = municipioFechaCrea;
	}

	public Date getMunicipioFechaModifica() {
		return this.municipioFechaModifica;
	}

	public void setMunicipioFechaModifica(Date municipioFechaModifica) {
		this.municipioFechaModifica = municipioFechaModifica;
	}

	public String getMunicipioNombre() {
		return this.municipioNombre;
	}

	public void setMunicipioNombre(String municipioNombre) {
		this.municipioNombre = municipioNombre;
	}

	public int getMunicipioUsuarioCrea() {
		return this.municipioUsuarioCrea;
	}

	public void setMunicipioUsuarioCrea(int municipioUsuarioCrea) {
		this.municipioUsuarioCrea = municipioUsuarioCrea;
	}

	public int getMunicipioUsuarioModifica() {
		return this.municipioUsuarioModifica;
	}

	public void setMunicipioUsuarioModifica(int municipioUsuarioModifica) {
		this.municipioUsuarioModifica = municipioUsuarioModifica;
	}

	public List<CatalogoAgenciasEjb> getCatalogoAgencias() {
		return this.catalogoAgencias;
	}

	public void setCatalogoAgencias(List<CatalogoAgenciasEjb> catalogoAgencias) {
		this.catalogoAgencias = catalogoAgencias;
	}

	public CatalogoAgenciasEjb addCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().add(catalogoAgencia);
		catalogoAgencia.setMunicipio(this);

		return catalogoAgencia;
	}

	public CatalogoAgenciasEjb removeCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().remove(catalogoAgencia);
		catalogoAgencia.setMunicipio(null);

		return catalogoAgencia;
	}

	public List<CiudadEjb> getCiudads() {
		return this.ciudads;
	}

	public void setCiudads(List<CiudadEjb> ciudads) {
		this.ciudads = ciudads;
	}

	public CiudadEjb addCiudad(CiudadEjb ciudad) {
		getCiudads().add(ciudad);
		ciudad.setMunicipio(this);

		return ciudad;
	}

	public CiudadEjb removeCiudad(CiudadEjb ciudad) {
		getCiudads().remove(ciudad);
		ciudad.setMunicipio(null);

		return ciudad;
	}

	public DepartamentoEjb getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(DepartamentoEjb departamento) {
		this.departamento = departamento;
	}

	public List<PersonalPersonaEjb> getPersonalPersonas() {
		return this.personalPersonas;
	}

	public void setPersonalPersonas(List<PersonalPersonaEjb> personalPersonas) {
		this.personalPersonas = personalPersonas;
	}

	public PersonalPersonaEjb addPersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().add(personalPersona);
		personalPersona.setMunicipio(this);

		return personalPersona;
	}

	public PersonalPersonaEjb removePersonalPersona(PersonalPersonaEjb personalPersona) {
		getPersonalPersonas().remove(personalPersona);
		personalPersona.setMunicipio(null);

		return personalPersona;
	}

}