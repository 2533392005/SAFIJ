package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the genero database table.
 * 
 */
@Entity
@Table(name="genero")
@NamedQueries({
	@NamedQuery(name="Genero.findAll", query="SELECT g FROM Genero g"),
	@NamedQuery(name="Genero.findByGeneroId", query="SELECT g FROM Genero g where g.generoId = :generoId")
})	
public class Genero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="genero_id")
	private String generoId;

	@Column(name="genero_estado")
	private int generoEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="genero_fecha_crea")
	private Date generoFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="genero_fecha_modifica")
	private Date generoFechaModifica;

	@Column(name="genero_nombre")
	private String generoNombre;

	@Column(name="genero_usuario_crea")
	private String generoUsuarioCrea;

	@Column(name="genero_usuario_modifica")
	private String generoUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@OneToMany(mappedBy="genero")
	private List<PersonalPersona> personalPersonas;

	public Genero() {
	}

	public String getGeneroId() {
		return this.generoId;
	}

	public void setGeneroId(String generoId) {
		this.generoId = generoId;
	}

	public int getGeneroEstado() {
		return this.generoEstado;
	}

	public void setGeneroEstado(int generoEstado) {
		this.generoEstado = generoEstado;
	}

	public Date getGeneroFechaCrea() {
		return this.generoFechaCrea;
	}

	public void setGeneroFechaCrea(Date generoFechaCrea) {
		this.generoFechaCrea = generoFechaCrea;
	}

	public Date getGeneroFechaModifica() {
		return this.generoFechaModifica;
	}

	public void setGeneroFechaModifica(Date generoFechaModifica) {
		this.generoFechaModifica = generoFechaModifica;
	}

	public String getGeneroNombre() {
		return this.generoNombre;
	}

	public void setGeneroNombre(String generoNombre) {
		this.generoNombre = generoNombre;
	}

	public String getGeneroUsuarioCrea() {
		return this.generoUsuarioCrea;
	}

	public void setGeneroUsuarioCrea(String generoUsuarioCrea) {
		this.generoUsuarioCrea = generoUsuarioCrea;
	}

	public String getGeneroUsuarioModifica() {
		return this.generoUsuarioModifica;
	}

	public void setGeneroUsuarioModifica(String generoUsuarioModifica) {
		this.generoUsuarioModifica = generoUsuarioModifica;
	}

	public List<PersonalPersona> getPersonalPersonas() {
		return this.personalPersonas;
	}

	public void setPersonalPersonas(List<PersonalPersona> personalPersonas) {
		this.personalPersonas = personalPersonas;
	}

	public PersonalPersona addPersonalPersona(PersonalPersona personalPersona) {
		getPersonalPersonas().add(personalPersona);
		personalPersona.setGenero(this);

		return personalPersona;
	}

	public PersonalPersona removePersonalPersona(PersonalPersona personalPersona) {
		getPersonalPersonas().remove(personalPersona);
		personalPersona.setGenero(null);

		return personalPersona;
	}

}