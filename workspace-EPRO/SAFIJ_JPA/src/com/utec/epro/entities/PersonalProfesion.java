package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the personal_profesion database table.
 * 
 */
@Entity
@Table(name="personal_profesion")
@NamedQueries({
	@NamedQuery(name="PersonalProfesion.findAll", query="SELECT p FROM PersonalProfesion p"),
	@NamedQuery(name="PersonalProfesion.findByProfesionId", query="SELECT p FROM PersonalProfesion p where p.profesionId = :profesionId")
})
public class PersonalProfesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="profesion_id", unique=true, nullable=false)
	private int profesionId;

	@Column(name="profesion_estado", nullable=false)
	private int profesionEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="profesion_fecha_crea")
	private Date profesionFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="profesion_fecha_modifica")
	private Date profesionFechaModifica;

	@Column(name="profesion_nombre", length=100)
	private String profesionNombre;

	@Column(name="profesion_usuario_crea")
	private int profesionUsuarioCrea;

	@Column(name="profesion_usuario_modifica")
	private int profesionUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@OneToMany(mappedBy="personalProfesion")
	private List<PersonalPersona> personalPersonas;

	public PersonalProfesion() {
	}

	public int getProfesionId() {
		return this.profesionId;
	}

	public void setProfesionId(int profesionId) {
		this.profesionId = profesionId;
	}

	public int getProfesionEstado() {
		return this.profesionEstado;
	}

	public void setProfesionEstado(int profesionEstado) {
		this.profesionEstado = profesionEstado;
	}

	public Date getProfesionFechaCrea() {
		return this.profesionFechaCrea;
	}

	public void setProfesionFechaCrea(Date profesionFechaCrea) {
		this.profesionFechaCrea = profesionFechaCrea;
	}

	public Date getProfesionFechaModifica() {
		return this.profesionFechaModifica;
	}

	public void setProfesionFechaModifica(Date profesionFechaModifica) {
		this.profesionFechaModifica = profesionFechaModifica;
	}

	public String getProfesionNombre() {
		return this.profesionNombre;
	}

	public void setProfesionNombre(String profesionNombre) {
		this.profesionNombre = profesionNombre;
	}

	public int getProfesionUsuarioCrea() {
		return this.profesionUsuarioCrea;
	}

	public void setProfesionUsuarioCrea(int profesionUsuarioCrea) {
		this.profesionUsuarioCrea = profesionUsuarioCrea;
	}

	public int getProfesionUsuarioModifica() {
		return this.profesionUsuarioModifica;
	}

	public void setProfesionUsuarioModifica(int profesionUsuarioModifica) {
		this.profesionUsuarioModifica = profesionUsuarioModifica;
	}

	public List<PersonalPersona> getPersonalPersonas() {
		return this.personalPersonas;
	}

	public void setPersonalPersonas(List<PersonalPersona> personalPersonas) {
		this.personalPersonas = personalPersonas;
	}

	public PersonalPersona addPersonalPersona(PersonalPersona personalPersona) {
		getPersonalPersonas().add(personalPersona);
		personalPersona.setPersonalProfesion(this);

		return personalPersona;
	}

	public PersonalPersona removePersonalPersona(PersonalPersona personalPersona) {
		getPersonalPersonas().remove(personalPersona);
		personalPersona.setPersonalProfesion(null);

		return personalPersona;
	}

}