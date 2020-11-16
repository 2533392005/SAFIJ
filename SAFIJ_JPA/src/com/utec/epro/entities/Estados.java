package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the estados database table.
 * 
 */
@Entity
@Table(name="estados")
@NamedQueries({
	@NamedQuery(name="Estados.findAll", query="SELECT e FROM Estados e"),
	@NamedQuery(name="Estados.findByEstadoId", query="SELECT e FROM Estados e where e.estadoId = :estadoId")
})
public class Estados implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="estado_id")
	private int estadoId;

	@Column(name="descripcion_estado")
	private String descripcionEstado;

	@Column(name="estados_estado")
	private int estadosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estados_fecha_crea")
	private Date estadosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estados_fecha_modi")
	private Date estadosFechaModi;

	@Column(name="estados_id_usuario_crea")
	private String estadosIdUsuarioCrea;

	@Column(name="estados_id_usuario_modi")
	private String estadosIdUsuarioModi;

	@Column(name="nombre_estado")
	private String nombreEstado;

	public Estados() {
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