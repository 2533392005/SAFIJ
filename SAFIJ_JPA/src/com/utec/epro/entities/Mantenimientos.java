package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the mantenimientos database table.
 * 
 */
@Entity
@Table(name="mantenimientos")
@NamedQueries({
	@NamedQuery(name="Mantenimientos.findAll", query="SELECT m FROM Mantenimientos m"),
	@NamedQuery(name="Mantenimientos.findByMantenimientosId", query="SELECT m FROM Mantenimientos m where m.mantenimientosId = :mantenimientosId")
})
public class Mantenimientos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mantenimientos_id")
	private String mantenimientosId;

	@Column(name="mantenimientos_avance")
	private int mantenimientosAvance;

	@Column(name="mantenimientos_condicion")
	private int mantenimientosCondicion;

	@Column(name="mantenimientos_detalle")
	private String mantenimientosDetalle;

	@Column(name="mantenimientos_estado")
	private int mantenimientosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mantenimientos_fecha_crea")
	private Date mantenimientosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mantenimientos_fecha_fin")
	private Date mantenimientosFechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mantenimientos_fecha_inicio")
	private Date mantenimientosFechaInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mantenimientos_fecha_modi")
	private Date mantenimientosFechaModi;

	@Column(name="mantenimientos_id_usuario_crea")
	private String mantenimientosIdUsuarioCrea;

	@Column(name="mantenimientos_id_usuario_modi")
	private String mantenimientosIdUsuarioModi;

	@Column(name="mantenimientos_monto_final")
	private BigDecimal mantenimientosMontoFinal;

	@Column(name="mantenimientos_tipo")
	private int mantenimientosTipo;

	//bi-directional many-to-one association to Inventario
	@ManyToOne
	@JoinColumn(name="inventario_id")
	private Inventario inventario;

	public Mantenimientos() {
	}

	public String getMantenimientosId() {
		return this.mantenimientosId;
	}

	public void setMantenimientosId(String mantenimientosId) {
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

	public BigDecimal getMantenimientosMontoFinal() {
		return this.mantenimientosMontoFinal;
	}

	public void setMantenimientosMontoFinal(BigDecimal mantenimientosMontoFinal) {
		this.mantenimientosMontoFinal = mantenimientosMontoFinal;
	}

	public int getMantenimientosTipo() {
		return this.mantenimientosTipo;
	}

	public void setMantenimientosTipo(int mantenimientosTipo) {
		this.mantenimientosTipo = mantenimientosTipo;
	}

	public Inventario getInventario() {
		return this.inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

}