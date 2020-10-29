package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class InventarioEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int inventarioId;
	private int bienesId;
	private int inventarioEstado;
	private int inventarioEstadoInventario;
	private Date inventarioFechaCrea;
	private Date inventarioFechaModi;
	private String inventarioIdUsuarioCrea;
	private String inventarioIdUsuarioModi;
	private List<DepreciacionEjb> depreciacions;
	private CatalogoAgenciasEjb catalogoAgencia;
	private List<MantenimientosEjb> mantenimientos;

	public InventarioEjb() {
	}

	public int getInventarioId() {
		return this.inventarioId;
	}

	public void setInventarioId(int inventarioId) {
		this.inventarioId = inventarioId;
	}

	public int getBienesId() {
		return this.bienesId;
	}

	public void setBienesId(int bienesId) {
		this.bienesId = bienesId;
	}

	public int getInventarioEstado() {
		return this.inventarioEstado;
	}

	public void setInventarioEstado(int inventarioEstado) {
		this.inventarioEstado = inventarioEstado;
	}

	public int getInventarioEstadoInventario() {
		return this.inventarioEstadoInventario;
	}

	public void setInventarioEstadoInventario(int inventarioEstadoInventario) {
		this.inventarioEstadoInventario = inventarioEstadoInventario;
	}

	public Date getInventarioFechaCrea() {
		return this.inventarioFechaCrea;
	}

	public void setInventarioFechaCrea(Date inventarioFechaCrea) {
		this.inventarioFechaCrea = inventarioFechaCrea;
	}

	public Date getInventarioFechaModi() {
		return this.inventarioFechaModi;
	}

	public void setInventarioFechaModi(Date inventarioFechaModi) {
		this.inventarioFechaModi = inventarioFechaModi;
	}

	public String getInventarioIdUsuarioCrea() {
		return this.inventarioIdUsuarioCrea;
	}

	public void setInventarioIdUsuarioCrea(String inventarioIdUsuarioCrea) {
		this.inventarioIdUsuarioCrea = inventarioIdUsuarioCrea;
	}

	public String getInventarioIdUsuarioModi() {
		return this.inventarioIdUsuarioModi;
	}

	public void setInventarioIdUsuarioModi(String inventarioIdUsuarioModi) {
		this.inventarioIdUsuarioModi = inventarioIdUsuarioModi;
	}

	public List<DepreciacionEjb> getDepreciacions() {
		return this.depreciacions;
	}

	public void setDepreciacions(List<DepreciacionEjb> depreciacions) {
		this.depreciacions = depreciacions;
	}

	public DepreciacionEjb addDepreciacion(DepreciacionEjb depreciacion) {
		getDepreciacions().add(depreciacion);
		depreciacion.setInventario(this);

		return depreciacion;
	}

	public DepreciacionEjb removeDepreciacion(DepreciacionEjb depreciacion) {
		getDepreciacions().remove(depreciacion);
		depreciacion.setInventario(null);

		return depreciacion;
	}

	public CatalogoAgenciasEjb getCatalogoAgencia() {
		return this.catalogoAgencia;
	}

	public void setCatalogoAgencia(CatalogoAgenciasEjb catalogoAgencia) {
		this.catalogoAgencia = catalogoAgencia;
	}

	public List<MantenimientosEjb> getMantenimientos() {
		return this.mantenimientos;
	}

	public void setMantenimientos(List<MantenimientosEjb> mantenimientos) {
		this.mantenimientos = mantenimientos;
	}

	public MantenimientosEjb addMantenimiento(MantenimientosEjb mantenimiento) {
		getMantenimientos().add(mantenimiento);
		mantenimiento.setInventario(this);

		return mantenimiento;
	}

	public MantenimientosEjb removeMantenimiento(MantenimientosEjb mantenimiento) {
		getMantenimientos().remove(mantenimiento);
		mantenimiento.setInventario(null);

		return mantenimiento;
	}

}