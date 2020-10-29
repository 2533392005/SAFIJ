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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="genero_id", unique=true, nullable=false)
	private int generoId;

	@Column(name="genero_estado", nullable=false)
	private int generoEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="genero_fecha_crea")
	private Date generoFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="genero_fecha_modifica")
	private Date generoFechaModifica;

	@Column(name="genero_nombre", length=100)
	private String generoNombre;

	@Column(name="genero_usuario_crea")
	private int generoUsuarioCrea;

	@Column(name="genero_usuario_modifica")
	private int generoUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@OneToMany(mappedBy="genero")
	private List<PersonalPersona> personalPersonas;

	public Genero() {
	}

	public int getGeneroId() {
		return this.generoId;
	}

	public void setGeneroId(int generoId) {
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

	public int getGeneroUsuarioCrea() {
		return this.generoUsuarioCrea;
	}

	public void setGeneroUsuarioCrea(int generoUsuarioCrea) {
		this.generoUsuarioCrea = generoUsuarioCrea;
	}

	public int getGeneroUsuarioModifica() {
		return this.generoUsuarioModifica;
	}

	public void setGeneroUsuarioModifica(int generoUsuarioModifica) {
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