package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the periodos database table.
 * 
 */
@Entity
@Table(name="periodos")
@NamedQueries({
	@NamedQuery(name="Periodos.findAll", query="SELECT p FROM Periodos p"),
	@NamedQuery(name="Periodos.findByPeriodosId", query="SELECT p FROM Periodos p where p.periodosId = :periodosId")
})
public class Periodos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="periodos_id")
	private String periodosId;

	@Column(name="periodos_descripcion")
	private String periodosDescripcion;

	@Column(name="periodos_estado")
	private int periodosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="periodos_fecha_crea")
	private Date periodosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="periodos_fecha_fin")
	private Date periodosFechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="periodos_fecha_inicio")
	private Date periodosFechaInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="periodos_fecha_modi")
	private Date periodosFechaModi;

	@Column(name="periodos_id_usuario_crea")
	private String periodosIdUsuarioCrea;

	@Column(name="periodos_id_usuario_modi")
	private String periodosIdUsuarioModi;

	@Column(name="periodos_nombre")
	private String periodosNombre;

	//bi-directional many-to-one association to Depreciacion
	@OneToMany(mappedBy="periodo")
	private List<Depreciacion> depreciacions;

	//bi-directional many-to-one association to Transaccion
	@OneToMany(mappedBy="periodo")
	private List<Transaccion> transaccions;

	public Periodos() {
	}

	public String getPeriodosId() {
		return this.periodosId;
	}

	public void setPeriodosId(String periodosId) {
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

	public List<Depreciacion> getDepreciacions() {
		return this.depreciacions;
	}

	public void setDepreciacions(List<Depreciacion> depreciacions) {
		this.depreciacions = depreciacions;
	}

	public Depreciacion addDepreciacion(Depreciacion depreciacion) {
		getDepreciacions().add(depreciacion);
		depreciacion.setPeriodo(this);

		return depreciacion;
	}

	public Depreciacion removeDepreciacion(Depreciacion depreciacion) {
		getDepreciacions().remove(depreciacion);
		depreciacion.setPeriodo(null);

		return depreciacion;
	}

	public List<Transaccion> getTransaccions() {
		return this.transaccions;
	}

	public void setTransaccions(List<Transaccion> transaccions) {
		this.transaccions = transaccions;
	}

	public Transaccion addTransaccion(Transaccion transaccion) {
		getTransaccions().add(transaccion);
		transaccion.setPeriodo(this);

		return transaccion;
	}

	public Transaccion removeTransaccion(Transaccion transaccion) {
		getTransaccions().remove(transaccion);
		transaccion.setPeriodo(null);

		return transaccion;
	}

}