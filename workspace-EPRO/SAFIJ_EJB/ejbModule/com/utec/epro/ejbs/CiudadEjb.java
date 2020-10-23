package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CiudadEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ciudadId;
	private int ciudadEstado;
	private Date ciudadFechaCrea;
	private Date ciudadFechaModifica;
	private String ciudadNombre;
	private int ciudadUsuarioCrea;
	private int ciudadUsuarioModifica;
	private List<CatalogoAgenciasEjb> catalogoAgencias;
	private MunicipioEjb municipio;

	public CiudadEjb() {
	}

	public int getCiudadId() {
		return this.ciudadId;
	}

	public void setCiudadId(int ciudadId) {
		this.ciudadId = ciudadId;
	}

	public int getCiudadEstado() {
		return this.ciudadEstado;
	}

	public void setCiudadEstado(int ciudadEstado) {
		this.ciudadEstado = ciudadEstado;
	}

	public Date getCiudadFechaCrea() {
		return this.ciudadFechaCrea;
	}

	public void setCiudadFechaCrea(Date ciudadFechaCrea) {
		this.ciudadFechaCrea = ciudadFechaCrea;
	}

	public Date getCiudadFechaModifica() {
		return this.ciudadFechaModifica;
	}

	public void setCiudadFechaModifica(Date ciudadFechaModifica) {
		this.ciudadFechaModifica = ciudadFechaModifica;
	}

	public String getCiudadNombre() {
		return this.ciudadNombre;
	}

	public void setCiudadNombre(String ciudadNombre) {
		this.ciudadNombre = ciudadNombre;
	}

	public int getCiudadUsuarioCrea() {
		return this.ciudadUsuarioCrea;
	}

	public void setCiudadUsuarioCrea(int ciudadUsuarioCrea) {
		this.ciudadUsuarioCrea = ciudadUsuarioCrea;
	}

	public int getCiudadUsuarioModifica() {
		return this.ciudadUsuarioModifica;
	}

	public void setCiudadUsuarioModifica(int ciudadUsuarioModifica) {
		this.ciudadUsuarioModifica = ciudadUsuarioModifica;
	}

	public List<CatalogoAgenciasEjb> getCatalogoAgencias() {
		return this.catalogoAgencias;
	}

	public void setCatalogoAgencias(List<CatalogoAgenciasEjb> catalogoAgencias) {
		this.catalogoAgencias = catalogoAgencias;
	}

	public CatalogoAgenciasEjb addCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().add(catalogoAgencia);
		catalogoAgencia.setCiudad(this);

		return catalogoAgencia;
	}

	public CatalogoAgenciasEjb removeCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		getCatalogoAgencias().remove(catalogoAgencia);
		catalogoAgencia.setCiudad(null);

		return catalogoAgencia;
	}

	public MunicipioEjb getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(MunicipioEjb municipio) {
		this.municipio = municipio;
	}

}