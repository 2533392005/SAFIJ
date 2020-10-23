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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pais_id", unique=true, nullable=false)
	private int paisId;

	@Column(name="pais_estado", nullable=false)
	private int paisEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pais_fecha_crea")
	private Date paisFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pais_fecha_modifica")
	private Date paisFechaModifica;

	@Column(name="pais_nacionalidad", length=100)
	private String paisNacionalidad;

	@Column(name="pais_nombre", length=100)
	private String paisNombre;

	@Column(name="pais_usuario_crea")
	private int paisUsuarioCrea;

	@Column(name="pais_usuario_modifica")
	private int paisUsuarioModifica;

	//bi-directional many-to-one association to CatalogoAgencias
	@OneToMany(mappedBy="pai")
	private List<CatalogoAgencias> catalogoAgencias;

	//bi-directional many-to-one association to Departamento
	@OneToMany(mappedBy="pai")
	private List<Departamento> departamentos;

	public Pais() {
	}

	public int getPaisId() {
		return this.paisId;
	}

	public void setPaisId(int paisId) {
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

	public int getPaisUsuarioCrea() {
		return this.paisUsuarioCrea;
	}

	public void setPaisUsuarioCrea(int paisUsuarioCrea) {
		this.paisUsuarioCrea = paisUsuarioCrea;
	}

	public int getPaisUsuarioModifica() {
		return this.paisUsuarioModifica;
	}

	public void setPaisUsuarioModifica(int paisUsuarioModifica) {
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