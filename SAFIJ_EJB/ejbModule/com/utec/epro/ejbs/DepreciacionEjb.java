package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class DepreciacionEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int depreciacionId;
	private int depreciacionControl;
	private int depreciacionCorrelativo;
	private int depreciacionEstado;
	private Date depreciacionFechaCrea;
	private Date depreciacionFechaFin;
	private Date depreciacionFechaInicio;
	private Date depreciacionFechaModi;
	private String depreciacionIdUsuarioCrea;
	private String depreciacionIdUsuarioModi;
	private int depreciacionMontoDepreciado;
	private int depreciacionMontoInicial;
	private int depreciacionMontoRestante;
	private InventarioEjb inventario;
	private PeriodosEjb periodo;
	private CatalogoTipoActivoEjb catalogoTipoActivo;

	public DepreciacionEjb() {
	}

	public int getDepreciacionId() {
		return this.depreciacionId;
	}

	public void setDepreciacionId(int depreciacionId) {
		this.depreciacionId = depreciacionId;
	}

	public int getDepreciacionControl() {
		return this.depreciacionControl;
	}

	public void setDepreciacionControl(int depreciacionControl) {
		this.depreciacionControl = depreciacionControl;
	}

	public int getDepreciacionCorrelativo() {
		return this.depreciacionCorrelativo;
	}

	public void setDepreciacionCorrelativo(int depreciacionCorrelativo) {
		this.depreciacionCorrelativo = depreciacionCorrelativo;
	}

	public int getDepreciacionEstado() {
		return this.depreciacionEstado;
	}

	public void setDepreciacionEstado(int depreciacionEstado) {
		this.depreciacionEstado = depreciacionEstado;
	}

	public Date getDepreciacionFechaCrea() {
		return this.depreciacionFechaCrea;
	}

	public void setDepreciacionFechaCrea(Date depreciacionFechaCrea) {
		this.depreciacionFechaCrea = depreciacionFechaCrea;
	}

	public Date getDepreciacionFechaFin() {
		return this.depreciacionFechaFin;
	}

	public void setDepreciacionFechaFin(Date depreciacionFechaFin) {
		this.depreciacionFechaFin = depreciacionFechaFin;
	}

	public Date getDepreciacionFechaInicio() {
		return this.depreciacionFechaInicio;
	}

	public void setDepreciacionFechaInicio(Date depreciacionFechaInicio) {
		this.depreciacionFechaInicio = depreciacionFechaInicio;
	}

	public Date getDepreciacionFechaModi() {
		return this.depreciacionFechaModi;
	}

	public void setDepreciacionFechaModi(Date depreciacionFechaModi) {
		this.depreciacionFechaModi = depreciacionFechaModi;
	}

	public String getDepreciacionIdUsuarioCrea() {
		return this.depreciacionIdUsuarioCrea;
	}

	public void setDepreciacionIdUsuarioCrea(String depreciacionIdUsuarioCrea) {
		this.depreciacionIdUsuarioCrea = depreciacionIdUsuarioCrea;
	}

	public String getDepreciacionIdUsuarioModi() {
		return this.depreciacionIdUsuarioModi;
	}

	public void setDepreciacionIdUsuarioModi(String depreciacionIdUsuarioModi) {
		this.depreciacionIdUsuarioModi = depreciacionIdUsuarioModi;
	}

	public int getDepreciacionMontoDepreciado() {
		return this.depreciacionMontoDepreciado;
	}

	public void setDepreciacionMontoDepreciado(int depreciacionMontoDepreciado) {
		this.depreciacionMontoDepreciado = depreciacionMontoDepreciado;
	}

	public int getDepreciacionMontoInicial() {
		return this.depreciacionMontoInicial;
	}

	public void setDepreciacionMontoInicial(int depreciacionMontoInicial) {
		this.depreciacionMontoInicial = depreciacionMontoInicial;
	}

	public int getDepreciacionMontoRestante() {
		return this.depreciacionMontoRestante;
	}

	public void setDepreciacionMontoRestante(int depreciacionMontoRestante) {
		this.depreciacionMontoRestante = depreciacionMontoRestante;
	}

	public InventarioEjb getInventario() {
		return this.inventario;
	}

	public void setInventario(InventarioEjb inventario) {
		this.inventario = inventario;
	}

	public PeriodosEjb getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(PeriodosEjb periodo) {
		this.periodo = periodo;
	}

	public CatalogoTipoActivoEjb getCatalogoTipoActivo() {
		return this.catalogoTipoActivo;
	}

	public void setCatalogoTipoActivo(CatalogoTipoActivoEjb catalogoTipoActivo) {
		this.catalogoTipoActivo = catalogoTipoActivo;
	}

}