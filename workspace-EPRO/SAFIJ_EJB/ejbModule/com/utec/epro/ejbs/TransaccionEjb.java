package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class TransaccionEjb implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int transaccionId;
	private byte[] transaccionDetalle;
	private int transaccionEstado;
	private Date transaccionFechaCrea;
	private Date transaccionFechaFin;
	private Date transaccionFechaInicio;
	private Date transaccionFechaModi;
	private String transaccionIdUsuarioCrea;
	private String transaccionIdUsuarioModi;
	private int transaccionOrientacion;
	private int transaccionServicio;
	private int transaccionTipo;
	private PeriodosEjb periodo;

	public TransaccionEjb() {
	}

	public int getTransaccionId() {
		return this.transaccionId;
	}

	public void setTransaccionId(int transaccionId) {
		this.transaccionId = transaccionId;
	}

	public byte[] getTransaccionDetalle() {
		return this.transaccionDetalle;
	}

	public void setTransaccionDetalle(byte[] transaccionDetalle) {
		this.transaccionDetalle = transaccionDetalle;
	}

	public int getTransaccionEstado() {
		return this.transaccionEstado;
	}

	public void setTransaccionEstado(int transaccionEstado) {
		this.transaccionEstado = transaccionEstado;
	}

	public Date getTransaccionFechaCrea() {
		return this.transaccionFechaCrea;
	}

	public void setTransaccionFechaCrea(Date transaccionFechaCrea) {
		this.transaccionFechaCrea = transaccionFechaCrea;
	}

	public Date getTransaccionFechaFin() {
		return this.transaccionFechaFin;
	}

	public void setTransaccionFechaFin(Date transaccionFechaFin) {
		this.transaccionFechaFin = transaccionFechaFin;
	}

	public Date getTransaccionFechaInicio() {
		return this.transaccionFechaInicio;
	}

	public void setTransaccionFechaInicio(Date transaccionFechaInicio) {
		this.transaccionFechaInicio = transaccionFechaInicio;
	}

	public Date getTransaccionFechaModi() {
		return this.transaccionFechaModi;
	}

	public void setTransaccionFechaModi(Date transaccionFechaModi) {
		this.transaccionFechaModi = transaccionFechaModi;
	}

	public String getTransaccionIdUsuarioCrea() {
		return this.transaccionIdUsuarioCrea;
	}

	public void setTransaccionIdUsuarioCrea(String transaccionIdUsuarioCrea) {
		this.transaccionIdUsuarioCrea = transaccionIdUsuarioCrea;
	}

	public String getTransaccionIdUsuarioModi() {
		return this.transaccionIdUsuarioModi;
	}

	public void setTransaccionIdUsuarioModi(String transaccionIdUsuarioModi) {
		this.transaccionIdUsuarioModi = transaccionIdUsuarioModi;
	}

	public int getTransaccionOrientacion() {
		return this.transaccionOrientacion;
	}

	public void setTransaccionOrientacion(int transaccionOrientacion) {
		this.transaccionOrientacion = transaccionOrientacion;
	}

	public int getTransaccionServicio() {
		return this.transaccionServicio;
	}

	public void setTransaccionServicio(int transaccionServicio) {
		this.transaccionServicio = transaccionServicio;
	}

	public int getTransaccionTipo() {
		return this.transaccionTipo;
	}

	public void setTransaccionTipo(int transaccionTipo) {
		this.transaccionTipo = transaccionTipo;
	}

	public PeriodosEjb getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(PeriodosEjb periodo) {
		this.periodo = periodo;
	}

}