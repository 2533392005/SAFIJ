package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PaisEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int paisId;
	private int paisEstado;
	private Date paisFechaCrea;
	private Date paisFechaModifica;
	private String paisNacionalidad;
	private String paisNombre;
	private int paisUsuarioCrea;
	private int paisUsuarioModifica;
	private List<CatalogoAgenciasEjb> catalogoAgencias;
	private List<DepartamentoEjb> departamentos;

	public PaisEjb() {
	}

	public int getPaisId() {
		return this.paisId;
	}

	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}

	public int getPaisEstado() {
		return this.paisEstado;
	}

	public void setPaisEstado(int paisEstado) {
		this.paisEstado = paisEstado;
	}

	public Date getPaisFechaCrea() {
		return this.paisFechaCrea;
	}

	public void setPaisFechaCrea(Date paisFechaCrea) {
		this.paisFechaCrea = paisFechaCrea;
	}

	public Date getPaisFechaModifica() {
		return this.paisFechaModifica;
	}

	public void setPaisFechaModifica(Date paisFechaModifica) {
		this.paisFechaModifica = paisFechaModifica;
	}

	public String getPaisNacionalidad() {
		return this.paisNacionalidad;
	}

	public void setPaisNacionalidad(String paisNacionalidad) {
		this.paisNacionalidad = paisNacionalidad;
	}

	public String getPaisNombre() {
		return this.paisNombre;
	}

	public void setPaisNombre(String paisNombre) {
		this.paisNombre = paisNombre;
	}

	public int getPaisUsuarioCrea() {
		return this.paisUsuarioCrea;
	}

	public void setPaisUsuarioCrea(int paisUsuarioCrea) {
		this.paisUsuarioCrea = paisUsuarioCrea;
	}

	public int getPaisUsuarioModifica() {
		return this.paisUsuarioModifica;
	}

	public void setPaisUsuarioModifica(int paisUsuarioModifica) {
		this.paisUsuarioModifica = paisUsuarioModifica;
	}

	public List<CatalogoAgenciasEjb> getCatalogoAgencias() {
		return this.catalogoAgencias;
	}

	public void setCatalogoAgencias(List<CatalogoAgenciasEjb> catalogoAgencias) {
		this.catalogoAgencias = catalogoAgencias;
	}

	public CatalogoAgenciasEjb addCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().add(catalogoAgencia);
		catalogoAgencia.setPai(this);

		return catalogoAgencia;
	}

	public CatalogoAgenciasEjb removeCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().remove(catalogoAgencia);
		catalogoAgencia.setPai(null);

		return catalogoAgencia;
	}

	public List<DepartamentoEjb> getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(List<DepartamentoEjb> departamentos) {
		this.departamentos = departamentos;
	}

	public DepartamentoEjb addDepartamento(DepartamentoEjb departamento) {
		getDepartamentos().add(departamento);
		departamento.setPai(this);

		return departamento;
	}

	public DepartamentoEjb removeDepartamento(DepartamentoEjb departamento) {
		getDepartamentos().remove(departamento);
		departamento.setPai(null);

		return departamento;
	}

}