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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idioma_id", unique=true, nullable=false)
	private int idiomaId;

	@Column(name="idioma_estado", nullable=false)
	private int idiomaEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="idioma_fecha_crea")
	private Date idiomaFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="idioma_fecha_modifica")
	private Date idiomaFechaModifica;

	@Column(name="idioma_nombre", length=100)
	private String idiomaNombre;

	@Column(name="idioma_usuario_crea")
	private int idiomaUsuarioCrea;

	@Column(name="idioma_usuario_modifica")
	private int idiomaUsuarioModifica;

	public Idioma() {
	}

	public int getIdiomaId() {
		return this.idiomaId;
	}

	public void setIdiomaId(int idiomaId) {
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

	public int getIdiomaUsuarioCrea() {
		return this.idiomaUsuarioCrea;
	}

	public void setIdiomaUsuarioCrea(int idiomaUsuarioCrea) {
		this.idiomaUsuarioCrea = idiomaUsuarioCrea;
	}

	public int getIdiomaUsuarioModifica() {
		return this.idiomaUsuarioModifica;
	}

	public void setIdiomaUsuarioModifica(int idiomaUsuarioModifica) {
		this.idiomaUsuarioModifica = idiomaUsuarioModifica;
	}

}