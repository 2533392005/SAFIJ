package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PeriodosEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int periodosId;
	private String periodosDescripcion;
	private int periodosEstado;
	private Date periodosFechaCrea;
	private Date periodosFechaFin;
	private Date periodosFechaInicio;
	private Date periodosFechaModi;
	private String periodosIdUsuarioCrea;
	private String periodosIdUsuarioModi;
	private String periodosNombre;
	private List<DepreciacionEjb> depreciacions;
	private List<TransaccionEjb> transaccions;

	public PeriodosEjb() {
	}

	public int getPeriodosId() {
		return this.periodosId;
	}

	public void setPeriodosId(int periodosId) {
		this.periodosId = periodosId;
	}

	public String getPeriodosDescripcion() {
		return this.periodosDescripcion;
	}

	public void setPeriodosDescripcion(String periodosDescripcion) {
		this.periodosDescripcion = periodosDescripcion;
	}

	public int getPeriodosEstado() {
		return this.periodosEstado;
	}

	public void setPeriodosEstado(int periodosEstado) {
		this.periodosEstado = periodosEstado;
	}

	public Date getPeriodosFechaCrea() {
		return this.periodosFechaCrea;
	}

	public void setPeriodosFechaCrea(Date periodosFechaCrea) {
		this.periodosFechaCrea = periodosFechaCrea;
	}

	public Date getPeriodosFechaFin() {
		return this.periodosFechaFin;
	}

	public void setPeriodosFechaFin(Date periodosFechaFin) {
		this.periodosFechaFin = periodosFechaFin;
	}

	public Date getPeriodosFechaInicio() {
		return this.periodosFechaInicio;
	}

	public void setPeriodosFechaInicio(Date periodosFechaInicio) {
		this.periodosFechaInicio = periodosFechaInicio;
	}

	public Date getPeriodosFechaModi() {
		return this.periodosFechaModi;
	}

	public void setPeriodosFechaModi(Date periodosFechaModi) {
		this.periodosFechaModi = periodosFechaModi;
	}

	public String getPeriodosIdUsuarioCrea() {
		return this.periodosIdUsuarioCrea;
	}

	public void setPeriodosIdUsuarioCrea(String periodosIdUsuarioCrea) {
		this.periodosIdUsuarioCrea = periodosIdUsuarioCrea;
	}

	public String getPeriodosIdUsuarioModi() {
		return this.periodosIdUsuarioModi;
	}

	public void setPeriodosIdUsuarioModi(String periodosIdUsuarioModi) {
		this.periodosIdUsuarioModi = periodosIdUsuarioModi;
	}

	public String getPeriodosNombre() {
		return this.periodosNombre;
	}

	public void setPeriodosNombre(String periodosNombre) {
		this.periodosNombre = periodosNombre;
	}

	public List<DepreciacionEjb> getDepreciacions() {
		return this.depreciacions;
	}

	public void setDepreciacions(List<DepreciacionEjb> depreciacions) {
		this.depreciacions = depreciacions;
	}

	public DepreciacionEjb addDepreciacion(DepreciacionEjb depreciacion) {
		getDepreciacions().add(depreciacion);
		depreciacion.setPeriodo(this);

		return depreciacion;
	}

	public DepreciacionEjb removeDepreciacion(DepreciacionEjb depreciacion) {
		getDepreciacions().remove(depreciacion);
		depreciacion.setPeriodo(null);

		return depreciacion;
	}

	public List<TransaccionEjb> getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(List<TransaccionEjb> transaccions) {
		this.transaccions = transaccions;
	}

	public TransaccionEjb addTransaccion(TransaccionEjb transaccion) {
		getTransaccions().add(transaccion);
		transaccion.setPeriodo(this);

		return transaccion;
	}

	public TransaccionEjb removeTransaccion(TransaccionEjb transaccion) {
		getTransaccions().remove(transaccion);
		transaccion.setPeriodo(null);

		return transaccion;
	}

}