package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class MantenimientosEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int mantenimientosId;
	private int mantenimientosAvance;
	private int mantenimientosCondicion;
	private String mantenimientosDetalle;
	private int mantenimientosEstado;
	private Date mantenimientosFechaCrea;
	private Date mantenimientosFechaFin;
	private Date mantenimientosFechaInicio;
	private Date mantenimientosFechaModi;
	private String mantenimientosIdUsuarioCrea;
	private String mantenimientosIdUsuarioModi;
	private int mantenimientosMontoFinal;
	private int mantenimientosTipo;
	private InventarioEjb inventario;

	public MantenimientosEjb() {
	}

	public int getMantenimientosId() {
		return this.mantenimientosId;
	}

	public void setMantenimientosId(int mantenimientosId) {
		this.mantenimientosId = mantenimientosId;
	}

	public int getMantenimientosAvance() {
		return this.mantenimientosAvance;
	}

	public void setMantenimientosAvance(int mantenimientosAvance) {
		this.mantenimientosAvance = mantenimientosAvance;
	}

	public int getMantenimientosCondicion() {
		return this.mantenimientosCondicion;
	}

	public void setMantenimientosCondicion(int mantenimientosCondicion) {
		this.mantenimientosCondicion = mantenimientosCondicion;
	}

	public String getMantenimientosDetalle() {
		return this.mantenimientosDetalle;
	}

	public void setMantenimientosDetalle(String mantenimientosDetalle) {
		this.mantenimientosDetalle = mantenimientosDetalle;
	}

	public int getMantenimientosEstado() {
		return this.mantenimientosEstado;
	}

	public void setMantenimientosEstado(int mantenimientosEstado) {
		this.mantenimientosEstado = mantenimientosEstado;
	}

	public Date getMantenimientosFechaCrea() {
		return this.mantenimientosFechaCrea;
	}

	public void setMantenimientosFechaCrea(Date mantenimientosFechaCrea) {
		this.mantenimientosFechaCrea = mantenimientosFechaCrea;
	}

	public Date getMantenimientosFechaFin() {
		return this.mantenimientosFechaFin;
	}

	public void setMantenimientosFechaFin(Date mantenimientosFechaFin) {
		this.mantenimientosFechaFin = mantenimientosFechaFin;
	}

	public Date getMantenimientosFechaInicio() {
		return this.mantenimientosFechaInicio;
	}

	public void setMantenimientosFechaInicio(Date mantenimientosFechaInicio) {
		this.mantenimientosFechaInicio = mantenimientosFechaInicio;
	}

	public Date getMantenimientosFechaModi() {
		return this.mantenimientosFechaModi;
	}

	public void setMantenimientosFechaModi(Date mantenimientosFechaModi) {
		this.mantenimientosFechaModi = mantenimientosFechaModi;
	}

	public String getMantenimientosIdUsuarioCrea() {
		return this.mantenimientosIdUsuarioCrea;
	}

	public void setMantenimientosIdUsuarioCrea(String mantenimientosIdUsuarioCrea) {
		this.mantenimientosIdUsuarioCrea = mantenimientosIdUsuarioCrea;
	}

	public String getMantenimientosIdUsuarioModi() {
		return this.mantenimientosIdUsuarioModi;
	}

	public void setMantenimientosIdUsuarioModi(String mantenimientosIdUsuarioModi) {
		this.mantenimientosIdUsuarioModi = mantenimientosIdUsuarioModi;
	}

	public int getMantenimientosMontoFinal() {
		return this.mantenimientosMontoFinal;
	}

	public void setMantenimientosMontoFinal(int mantenimientosMontoFinal) {
		this.mantenimientosMontoFinal = mantenimientosMontoFinal;
	}

	public int getMantenimientosTipo() {
		return this.mantenimientosTipo;
	}

	public void setMantenimientosTipo(int mantenimientosTipo) {
		this.mantenimientosTipo = mantenimientosTipo;
	}

	public InventarioEjb getInventario() {
		return this.inventario;
	}

	public void setInventario(InventarioEjb inventario) {
		this.inventario = inventario;
	}

}