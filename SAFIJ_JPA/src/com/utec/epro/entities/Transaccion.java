package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the transaccion database table.
 * 
 */
@Entity
@Table(name="transaccion")
@NamedQueries({
	@NamedQuery(name="Transaccion.findAll", query="SELECT t FROM Transaccion t"),
	@NamedQuery(name="Transaccion.findByTransaccionId", query="SELECT t FROM Transaccion t where t.transaccionId = :transaccionId")
})
public class Transaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="transaccion_id")
	private String transaccionId;

	@Lob
	@Column(name="transaccion_detalle")
	private byte[] transaccionDetalle;

	@Column(name="transaccion_estado")
	private int transaccionEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="transaccion_fecha_crea")
	private Date transaccionFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="transaccion_fecha_fin")
	private Date transaccionFechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="transaccion_fecha_inicio")
	private Date transaccionFechaInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="transaccion_fecha_modi")
	private Date transaccionFechaModi;

	@Column(name="transaccion_id_usuario_crea")
	private String transaccionIdUsuarioCrea;

	@Column(name="transaccion_id_usuario_modi")
	private String transaccionIdUsuarioModi;

	@Column(name="transaccion_orientacion")
	private int transaccionOrientacion;

	@Column(name="transaccion_servicio")
	private int transaccionServicio;

	@Column(name="transaccion_tipo")
	private int transaccionTipo;

	//bi-directional many-to-one association to Periodos
	@ManyToOne
	@JoinColumn(name="transaccion_periodo_id")
	private Periodos periodo;

	public Transaccion() {
	}

	public String getTransaccionId() {
		return this.transaccionId;
	}

	public void setTransaccionId(String transaccionId) {
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

	public Periodos getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Periodos periodo) {
		this.periodo = periodo;
	}

}