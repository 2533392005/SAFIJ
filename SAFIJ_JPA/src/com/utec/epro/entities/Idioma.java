package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the idioma database table.
 * 
 */
@Entity
@Table(name="idioma")
@NamedQueries({
	@NamedQuery(name="Idioma.findAll", query="SELECT i FROM Idioma i"),
	@NamedQuery(name="Idioma.findByIdiomaId", query="SELECT i FROM Idioma i where i.idiomaId = :idiomaId")
})
public class Idioma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idioma_id")
	private String idiomaId;

	@Column(name="idioma_estado")
	private int idiomaEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="idioma_fecha_crea")
	private Date idiomaFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="idioma_fecha_modifica")
	private Date idiomaFechaModifica;

	@Column(name="idioma_nombre")
	private String idiomaNombre;

	@Column(name="idioma_usuario_crea")
	private String idiomaUsuarioCrea;

	@Column(name="idioma_usuario_modifica")
	private String idiomaUsuarioModifica;

	public Idioma() {
	}

	public String getIdiomaId() {
		return this.idiomaId;
	}

	public void setIdiomaId(String idiomaId) {
		this.idiomaId = idiomaId;
	}

	public int getIdiomaEstado() {
		return this.idiomaEstado;
	}

	public void setIdiomaEstado(int idiomaEstado) {
		this.idiomaEstado = idiomaEstado;
	}

	public Date getIdiomaFechaCrea() {
		return this.idiomaFechaCrea;
	}

	public void setIdiomaFechaCrea(Date idiomaFechaCrea) {
		this.idiomaFechaCrea = idiomaFechaCrea;
	}

	public Date getIdiomaFechaModifica() {
		return this.idiomaFechaModifica;
	}

	public void setIdiomaFechaModifica(Date idiomaFechaModifica) {
		this.idiomaFechaModifica = idiomaFechaModifica;
	}

	public String getIdiomaNombre() {
		return this.idiomaNombre;
	}

	public void setIdiomaNombre(String idiomaNombre) {
		this.idiomaNombre = idiomaNombre;
	}

	public String getIdiomaUsuarioCrea() {
		return this.idiomaUsuarioCrea;
	}

	public void setIdiomaUsuarioCrea(String idiomaUsuarioCrea) {
		this.idiomaUsuarioCrea = idiomaUsuarioCrea;
	}

	public String getIdiomaUsuarioModifica() {
		return this.idiomaUsuarioModifica;
	}

	public void setIdiomaUsuarioModifica(String idiomaUsuarioModifica) {
		this.idiomaUsuarioModifica = idiomaUsuarioModifica;
	}

}