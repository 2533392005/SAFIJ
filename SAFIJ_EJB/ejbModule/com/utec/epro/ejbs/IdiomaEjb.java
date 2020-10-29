package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class IdiomaEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idiomaId;
	private int idiomaEstado;
	private Date idiomaFechaCrea;
	private Date idiomaFechaModifica;
	private String idiomaNombre;
	private int idiomaUsuarioCrea;
	private int idiomaUsuarioModifica;

	public IdiomaEjb() {
	}

	public int getIdiomaId() {
		return this.idiomaId;
	}

	public void setIdiomaId(int idiomaId) {
		this.idiomaId = idiomaId;
	}

	public int getIdiomaEstado() {
		return this.idiomaEstado;
	}

	public void setIdiomaEstado(int idiomaEstado) {
		this.idiomaEstado = idiomaEstado;
	}

	public Date getIdiomaFechaCrea() {
		return this.idiomaFechaCrea;
	}

	public void setIdiomaFechaCrea(Date idiomaFechaCrea) {
		this.idiomaFechaCrea = idiomaFechaCrea;
	}

	public Date getIdiomaFechaModifica() {
		return this.idiomaFechaModifica;
	}

	public void setIdiomaFechaModifica(Date idiomaFechaModifica) {
		this.idiomaFechaModifica = idiomaFechaModifica;
	}

	public String getIdiomaNombre() {
		return this.idiomaNombre;
	}

	public void setIdiomaNombre(String idiomaNombre) {
		this.idiomaNombre = idiomaNombre;
	}

	public int getIdiomaUsuarioCrea() {
		return this.idiomaUsuarioCrea;
	}

	public void setIdiomaUsuarioCrea(int idiomaUsuarioCrea) {
		this.idiomaUsuarioCrea = idiomaUsuarioCrea;
	}

	public int getIdiomaUsuarioModifica() {
		return this.idiomaUsuarioModifica;
	}

	public void setIdiomaUsuarioModifica(int idiomaUsuarioModifica) {
		this.idiomaUsuarioModifica = idiomaUsuarioModifica;
	}

}