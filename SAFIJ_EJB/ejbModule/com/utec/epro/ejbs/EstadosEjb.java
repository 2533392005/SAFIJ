package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class EstadosEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int estadoId;
	private String descripcionEstado;
	private int estadosEstado;
	private Date estadosFechaCrea;
	private Date estadosFechaModi;
	private String estadosIdUsuarioCrea;
	private String estadosIdUsuarioModi;
	private String nombreEstado;

	public EstadosEjb() {
	}

	public int getEstadoId() {
		return this.estadoId;
	}

	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}

	public String getDescripcionEstado() {
		return this.descripcionEstado;
	}

	public void setDescripcionEstado(String descripcionEstado) {
		this.descripcionEstado = descripcionEstado;
	}

	public int getEstadosEstado() {
		return this.estadosEstado;
	}

	public void setEstadosEstado(int estadosEstado) {
		this.estadosEstado = estadosEstado;
	}

	public Date getEstadosFechaCrea() {
		return this.estadosFechaCrea;
	}

	public void setEstadosFechaCrea(Date estadosFechaCrea) {
		this.estadosFechaCrea = estadosFechaCrea;
	}

	public Date getEstadosFechaModi() {
		return this.estadosFechaModi;
	}

	public void setEstadosFechaModi(Date estadosFechaModi) {
		this.estadosFechaModi = estadosFechaModi;
	}

	public String getEstadosIdUsuarioCrea() {
		return this.estadosIdUsuarioCrea;
	}

	public void setEstadosIdUsuarioCrea(String estadosIdUsuarioCrea) {
		this.estadosIdUsuarioCrea = estadosIdUsuarioCrea;
	}

	public String getEstadosIdUsuarioModi() {
		return this.estadosIdUsuarioModi;
	}

	public void setEstadosIdUsuarioModi(String estadosIdUsuarioModi) {
		this.estadosIdUsuarioModi = estadosIdUsuarioModi;
	}

	public String getNombreEstado() {
		return this.nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}

}