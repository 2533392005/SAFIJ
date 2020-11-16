package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the catalogo_agencias database table.
 * 
 */
@Entity
@Table(name="catalogo_agencias")
@NamedQueries({
	@NamedQuery(name="CatalogoAgencias.findAll", query="SELECT c FROM CatalogoAgencias c"),
	@NamedQuery(name="CatalogoAgencias.findByAgenciasId", query="SELECT c FROM CatalogoAgencias c where c.agenciasId = :agenciasId")
})
public class CatalogoAgencias implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="agencias_id")
	private String agenciasId;

	@Column(name="agencia_estado")
	private int agenciaEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="agencia_fecha_crea")
	private Date agenciaFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="agencia_fecha_modi")
	private Date agenciaFechaModi;

	@Column(name="agencia_id_usuario_crea")
	private String agenciaIdUsuarioCrea;

	@Column(name="agencia_id_usuario_modi")
	private String agenciaIdUsuarioModi;

	@Column(name="agencia_usuario_id")
	private String agenciaUsuarioId;

	@Column(name="agencias_descripcion")
	private String agenciasDescripcion;

	@Column(name="agencias_direccion")
	private String agenciasDireccion;

	@Column(name="agencias_nombre")
	private String agenciasNombre;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="ciudad_id")
	private Ciudad ciudad;

	//bi-directional many-to-one association to Departamento
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamento departamento;

	//bi-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="municipio_id")
	private Municipio municipio;

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="pais_id")
	private Pais pai;

	//bi-directional many-to-one association to Inventario
	@OneToMany(mappedBy="catalogoAgencia")
	private List<Inventario> inventarios;

	public CatalogoAgencias() {
	}

	public String getAgenciasId() {
		return this.agenciasId;
	}

	public void setAgenciasId(String agenciasId) {
		this.agenciasId = agenciasId;
	}

	public int getAgenciaEstado() {
		return this.agenciaEstado;
	}

	public void setAgenciaEstado(int agenciaEstado) {
		this.agenciaEstado = agenciaEstado;
	}

	public Date getAgenciaFechaCrea() {
		return this.agenciaFechaCrea;
	}

	public void setAgenciaFechaCrea(Date agenciaFechaCrea) {
		this.agenciaFechaCrea = agenciaFechaCrea;
	}

	public Date getAgenciaFechaModi() {
		return this.agenciaFechaModi;
	}

	public void setAgenciaFechaModi(Date agenciaFechaModi) {
		this.agenciaFechaModi = agenciaFechaModi;
	}

	public String getAgenciaIdUsuarioCrea() {
		return this.agenciaIdUsuarioCrea;
	}

	public void setAgenciaIdUsuarioCrea(String agenciaIdUsuarioCrea) {
		this.agenciaIdUsuarioCrea = agenciaIdUsuarioCrea;
	}

	public String getAgenciaIdUsuarioModi() {
		return this.agenciaIdUsuarioModi;
	}

	public void setAgenciaIdUsuarioModi(String agenciaIdUsuarioModi) {
		this.agenciaIdUsuarioModi = agenciaIdUsuarioModi;
	}

	public String getAgenciaUsuarioId() {
		return this.agenciaUsuarioId;
	}

	public void setAgenciaUsuarioId(String agenciaUsuarioId) {
		this.agenciaUsuarioId = agenciaUsuarioId;
	}

	public String getAgenciasDescripcion() {
		return this.agenciasDescripcion;
	}

	public void setAgenciasDescripcion(String agenciasDescripcion) {
		this.agenciasDescripcion = agenciasDescripcion;
	}

	public String getAgenciasDireccion() {
		return this.agenciasDireccion;
	}

	public void setAgenciasDireccion(String agenciasDireccion) {
		this.agenciasDireccion = agenciasDireccion;
	}

	public String getAgenciasNombre() {
		return this.agenciasNombre;
	}

	public void setAgenciasNombre(String agenciasNombre) {
		this.agenciasNombre = agenciasNombre;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Departamento getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Pais getPai() {
		return this.pai;
	}

	public void setPai(Pais pai) {
		this.pai = pai;
	}

	public List<Inventario> getInventarios() {
		return this.inventarios;
	}

	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	public Inventario addInventario(Inventario inventario) {
		getInventarios().add(inventario);
		inventario.setCatalogoAgencia(this);

		return inventario;
	}

	public Inventario removeInventario(Inventario inventario) {
		getInventarios().remove(inventario);
		inventario.setCatalogoAgencia(null);

		return inventario;
	}

}