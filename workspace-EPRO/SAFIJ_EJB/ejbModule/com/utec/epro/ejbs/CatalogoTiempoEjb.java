package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class CatalogoTiempoEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tiempoId;
	private String tiempoDescripcion;
	private int tiempoEstado;
	private Date tiempoFechaCrea;
	private Date tiempoFechaModi;
	private String tiempoIdUsuarioCrea;
	private String tiempoIdUsuarioModi;
	private String tiempoMagnitud;
	private String tiempoNombre;

	public CatalogoTiempoEjb() {
	}

	public int getTiempoId() {
		return this.tiempoId;
	}

	public void setTiempoId(int tiempoId) {
		this.tiempoId = tiempoId;
	}

	public String getTiempoDescripcion() {
		return this.tiempoDescripcion;
	}

	public void setTiempoDescripcion(String tiempoDescripcion) {
		this.tiempoDescripcion = tiempoDescripcion;
	}

	public int getTiempoEstado() {
		return this.tiempoEstado;
	}

	public void setTiempoEstado(int tiempoEstado) {
		this.tiempoEstado = tiempoEstado;
	}

	public Date getTiempoFechaCrea() {
		return this.tiempoFechaCrea;
	}

	public void setTiempoFechaCrea(Date tiempoFechaCrea) {
		this.tiempoFechaCrea = tiempoFechaCrea;
	}

	public Date getTiempoFechaModi() {
		return this.tiempoFechaModi;
	}

	public void setTiempoFechaModi(Date tiempoFechaModi) {
		this.tiempoFechaModi = tiempoFechaModi;
	}

	public String getTiempoIdUsuarioCrea() {
		return this.tiempoIdUsuarioCrea;
	}

	public void setTiempoIdUsuarioCrea(String tiempoIdUsuarioCrea) {
		this.tiempoIdUsuarioCrea = tiempoIdUsuarioCrea;
	}

	public String getTiempoIdUsuarioModi() {
		return this.tiempoIdUsuarioModi;
	}

	public void setTiempoIdUsuarioModi(String tiempoIdUsuarioModi) {
		this.tiempoIdUsuarioModi = tiempoIdUsuarioModi;
	}

	public String getTiempoMagnitud() {
		return this.tiempoMagnitud;
	}

	public void setTiempoMagnitud(String tiempoMagnitud) {
		this.tiempoMagnitud = tiempoMagnitud;
	}

	public String getTiempoNombre() {
		return this.tiempoNombre;
	}

	public void setTiempoNombre(String tiempoNombre) {
		this.tiempoNombre = tiempoNombre;
	}

}