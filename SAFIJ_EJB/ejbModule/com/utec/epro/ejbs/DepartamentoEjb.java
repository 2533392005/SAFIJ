package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DepartamentoEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int departamentoId;
	private int departamentoEstado;
	private Date departamentoFechaCrea;
	private Date departamentoFechaModifica;
	private String departamentoNombre;
	private int departamentoUsuarioCrea;
	private int departamentoUsuarioModifica;
	private List<CatalogoAgenciasEjb> catalogoAgencias;
	private PaisEjb pai;
	private List<MunicipioEjb> municipios;

	public DepartamentoEjb() {
	}

	public int getDepartamentoId() {
		return this.departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
	}

	public int getDepartamentoEstado() {
		return this.departamentoEstado;
	}

	public void setDepartamentoEstado(int departamentoEstado) {
		this.departamentoEstado = departamentoEstado;
	}

	public Date getDepartamentoFechaCrea() {
		return this.departamentoFechaCrea;
	}

	public void setDepartamentoFechaCrea(Date departamentoFechaCrea) {
		this.departamentoFechaCrea = departamentoFechaCrea;
	}

	public Date getDepartamentoFechaModifica() {
		return this.departamentoFechaModifica;
	}

	public void setDepartamentoFechaModifica(Date departamentoFechaModifica) {
		this.departamentoFechaModifica = departamentoFechaModifica;
	}

	public String getDepartamentoNombre() {
		return this.departamentoNombre;
	}

	public void setDepartamentoNombre(String departamentoNombre) {
		this.departamentoNombre = departamentoNombre;
	}

	public int getDepartamentoUsuarioCrea() {
		return this.departamentoUsuarioCrea;
	}

	public void setDepartamentoUsuarioCrea(int departamentoUsuarioCrea) {
		this.departamentoUsuarioCrea = departamentoUsuarioCrea;
	}

	public int getDepartamentoUsuarioModifica() {
		return this.departamentoUsuarioModifica;
	}

	public void setDepartamentoUsuarioModifica(int departamentoUsuarioModifica) {
		this.departamentoUsuarioModifica = departamentoUsuarioModifica;
	}

	public List<CatalogoAgenciasEjb> getCatalogoAgencias() {
		return this.catalogoAgencias;
	}

	public void setCatalogoAgencias(List<CatalogoAgenciasEjb> catalogoAgencias) {
		this.catalogoAgencias = catalogoAgencias;
	}

	public CatalogoAgenciasEjb addCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().add(catalogoAgencia);
		catalogoAgencia.setDepartamento(this);

		return catalogoAgencia;
	}

	public CatalogoAgenciasEjb removeCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().remove(catalogoAgencia);
		catalogoAgencia.setDepartamento(null);

		return catalogoAgencia;
	}

	public PaisEjb getPai() {
		return this.pai;
	}

	public void setPai(PaisEjb pai) {
		this.pai = pai;
	}

	public List<MunicipioEjb> getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(List<MunicipioEjb> municipios) {
		this.municipios = municipios;
	}

	public MunicipioEjb addMunicipio(MunicipioEjb municipio) {
		getMunicipios().add(municipio);
		municipio.setDepartamento(this);

		return municipio;
	}

	public MunicipioEjb removeMunicipio(MunicipioEjb municipio) {
		getMunicipios().remove(municipio);
		municipio.setDepartamento(null);

		return municipio;
	}

}