package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pais database table.
 * 
 */
@Entity
@Table(name="pais")
@NamedQueries({
	@NamedQuery(name="Pais.findAll", query="SELECT p FROM Pais p"),
	@NamedQuery(name="Pais.findByPaisId", query="SELECT p FROM Pais p where p.paisId = :paisId")
})
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pais_id")
	private String paisId;

	@Column(name="pais_estado")
	private int paisEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pais_fecha_crea")
	private Date paisFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pais_fecha_modifica")
	private Date paisFechaModifica;

	@Column(name="pais_nacionalidad")
	private String paisNacionalidad;

	@Column(name="pais_nombre")
	private String paisNombre;

	@Column(name="pais_usuario_crea")
	private String paisUsuarioCrea;

	@Column(name="pais_usuario_modifica")
	private String paisUsuarioModifica;

	//bi-directional many-to-one association to CatalogoAgencias
	@OneToMany(mappedBy="pai")
	private List<CatalogoAgencias> catalogoAgencias;

	//bi-directional many-to-one association to Departamento
	@OneToMany(mappedBy="pai")
	private List<Departamento> departamentos;

	public Pais() {
	}

	public String getPaisId() {
		return this.paisId;
	}

	public void setPaisId(String paisId) {
		this.paisId = paisId;
	}

	public int getPaisEstado() {
		return this.paisEstado;
	}

	public void setPaisEstado(int paisEstado) {
		this.paisEstado = paisEstado;
	}

	public Date getPaisFechaCrea() {
		return this.paisFechaCrea;
	}

	public void setPaisFechaCrea(Date paisFechaCrea) {
		this.paisFechaCrea = paisFechaCrea;
	}

	public Date getPaisFechaModifica() {
		return this.paisFechaModifica;
	}

	public void setPaisFechaModifica(Date paisFechaModifica) {
		this.paisFechaModifica = paisFechaModifica;
	}

	public String getPaisNacionalidad() {
		return this.paisNacionalidad;
	}

	public void setPaisNacionalidad(String paisNacionalidad) {
		this.paisNacionalidad = paisNacionalidad;
	}

	public String getPaisNombre() {
		return this.paisNombre;
	}

	public void setPaisNombre(String paisNombre) {
		this.paisNombre = paisNombre;
	}

	public String getPaisUsuarioCrea() {
		return this.paisUsuarioCrea;
	}

	public void setPaisUsuarioCrea(String paisUsuarioCrea) {
		this.paisUsuarioCrea = paisUsuarioCrea;
	}

	public String getPaisUsuarioModifica() {
		return this.paisUsuarioModifica;
	}

	public void setPaisUsuarioModifica(String paisUsuarioModifica) {
		this.paisUsuarioModifica = paisUsuarioModifica;
	}

	public List<CatalogoAgencias> getCatalogoAgencias() {
		return this.catalogoAgencias;
	}

	public void setCatalogoAgencias(List<CatalogoAgencias> catalogoAgencias) {
		this.catalogoAgencias = catalogoAgencias;
	}

	public CatalogoAgencias addCatalogoAgencia(CatalogoAgencias catalogoAgencia) {
		getCatalogoAgencias().add(catalogoAgencia);
		catalogoAgencia.setPai(this);

		return catalogoAgencia;
	}

	public CatalogoAgencias removeCatalogoAgencia(CatalogoAgencias catalogoAgencia) {
		getCatalogoAgencias().remove(catalogoAgencia);
		catalogoAgencia.setPai(null);

		return catalogoAgencia;
	}

	public List<Departamento> getDepartamentos() {
		return this.departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public Departamento addDepartamento(Departamento departamento) {
		getDepartamentos().add(departamento);
		departamento.setPai(this);

		return departamento;
	}

	public Departamento removeDepartamento(Departamento departamento) {
		getDepartamentos().remove(departamento);
		departamento.setPai(null);

		return departamento;
	}

}