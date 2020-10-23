package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ciudad database table.
 * 
 */
@Entity
@Table(name="ciudad")
@NamedQueries({
	@NamedQuery(name="Ciudad.findAll", query="SELECT c FROM Ciudad c"),
	@NamedQuery(name="Ciudad.findByCiudadId", query="SELECT c FROM Ciudad c where c.ciudadId = :ciudadId")
})
public class Ciudad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ciudad_id", unique=true, nullable=false)
	private int ciudadId;

	@Column(name="ciudad_estado", nullable=false)
	private int ciudadEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ciudad_fecha_crea")
	private Date ciudadFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ciudad_fecha_modifica")
	private Date ciudadFechaModifica;

	@Column(name="ciudad_nombre", length=100)
	private String ciudadNombre;

	@Column(name="ciudad_usuario_crea")
	private int ciudadUsuarioCrea;

	@Column(name="ciudad_usuario_modifica")
	private int ciudadUsuarioModifica;

	//bi-directional many-to-one association to CatalogoAgencias
	@OneToMany(mappedBy="ciudad")
	private List<CatalogoAgencias> catalogoAgencias;

	//bi-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="ciudad_municipio_id")
	private Municipio municipio;

	public Ciudad() {
	}

	public int getCiudadId() {
		return this.ciudadId;
	}

	public void setCiudadId(int ciudadId) {
		this.ciudadId = ciudadId;
	}

	public int getCiudadEstado() {
		return this.ciudadEstado;
	}

	public void setCiudadEstado(int ciudadEstado) {
		this.ciudadEstado = ciudadEstado;
	}

	public Date getCiudadFechaCrea() {
		return this.ciudadFechaCrea;
	}

	public void setCiudadFechaCrea(Date ciudadFechaCrea) {
		this.ciudadFechaCrea = ciudadFechaCrea;
	}

	public Date getCiudadFechaModifica() {
		return this.ciudadFechaModifica;
	}

	public void setCiudadFechaModifica(Date ciudadFechaModifica) {
		this.ciudadFechaModifica = ciudadFechaModifica;
	}

	public String getCiudadNombre() {
		return this.ciudadNombre;
	}

	public void setCiudadNombre(String ciudadNombre) {
		this.ciudadNombre = ciudadNombre;
	}

	public int getCiudadUsuarioCrea() {
		return this.ciudadUsuarioCrea;
	}

	public void setCiudadUsuarioCrea(int ciudadUsuarioCrea) {
		this.ciudadUsuarioCrea = ciudadUsuarioCrea;
	}

	public int getCiudadUsuarioModifica() {
		return this.ciudadUsuarioModifica;
	}

	public void setCiudadUsuarioModifica(int ciudadUsuarioModifica) {
		this.ciudadUsuarioModifica = ciudadUsuarioModifica;
	}

	public List<CatalogoAgencias> getCatalogoAgencias() {
		return this.catalogoAgencias;
	}

	public void setCatalogoAgencias(List<CatalogoAgencias> catalogoAgencias) {
		this.catalogoAgencias = catalogoAgencias;
	}

	public CatalogoAgencias addCatalogoAgencia(CatalogoAgencias catalogoAgencia) {
		getCatalogoAgencias().add(catalogoAgencia);
		catalogoAgencia.setCiudad(this);

		return catalogoAgencia;
	}

	public CatalogoAgencias removeCatalogoAgencia(CatalogoAgencias catalogoAgencia) {
		getCatalogoAgencias().remove(catalogoAgencia);
		catalogoAgencia.setCiudad(null);

		return catalogoAgencia;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}