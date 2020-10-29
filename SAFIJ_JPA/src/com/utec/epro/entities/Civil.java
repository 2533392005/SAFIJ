package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the civil database table.
 * 
 */
@Entity
@Table(name="civil")
@NamedQueries({
	@NamedQuery(name="Civil.findAll", query="SELECT c FROM Civil c"),
	@NamedQuery(name="Civil.findByEstadoCivilId", query="SELECT c FROM Civil c where c.estadoCivilId = :estadoCivilId")
})
public class Civil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="estado_civil_id", unique=true, nullable=false)
	private int estadoCivilId;

	@Column(name="estado_civil_estado", nullable=false)
	private int estadoCivilEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estado_civil_fecha_crea")
	private Date estadoCivilFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estado_civil_fecha_modifica")
	private Date estadoCivilFechaModifica;

	@Column(name="estado_civil_nombre", length=100)
	private String estadoCivilNombre;

	@Column(name="estado_civil_usuario_crea")
	private int estadoCivilUsuarioCrea;

	@Column(name="estado_civil_usuario_modifica")
	private int estadoCivilUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@OneToMany(mappedBy="civil")
	private List<PersonalPersona> personalPersonas;

	public Civil() {
	}

	public int getEstadoCivilId() {
		return this.estadoCivilId;
	}

	public void setEstadoCivilId(int estadoCivilId) {
		this.estadoCivilId = estadoCivilId;
	}

	public int getEstadoCivilEstado() {
		return this.estadoCivilEstado;
	}

	public void setEstadoCivilEstado(int estadoCivilEstado) {
		this.estadoCivilEstado = estadoCivilEstado;
	}

	public Date getEstadoCivilFechaCrea() {
		return this.estadoCivilFechaCrea;
	}

	public void setEstadoCivilFechaCrea(Date estadoCivilFechaCrea) {
		this.estadoCivilFechaCrea = estadoCivilFechaCrea;
	}

	public Date getEstadoCivilFechaModifica() {
		return this.estadoCivilFechaModifica;
	}

	public void setEstadoCivilFechaModifica(Date estadoCivilFechaModifica) {
		this.estadoCivilFechaModifica = estadoCivilFechaModifica;
	}

	public String getEstadoCivilNombre() {
		return this.estadoCivilNombre;
	}

	public void setEstadoCivilNombre(String estadoCivilNombre) {
		this.estadoCivilNombre = estadoCivilNombre;
	}

	public int getEstadoCivilUsuarioCrea() {
		return this.estadoCivilUsuarioCrea;
	}

	public void setEstadoCivilUsuarioCrea(int estadoCivilUsuarioCrea) {
		this.estadoCivilUsuarioCrea = estadoCivilUsuarioCrea;
	}

	public int getEstadoCivilUsuarioModifica() {
		return this.estadoCivilUsuarioModifica;
	}

	public void setEstadoCivilUsuarioModifica(int estadoCivilUsuarioModifica) {
		this.estadoCivilUsuarioModifica = estadoCivilUsuarioModifica;
	}

	public List<PersonalPersona> getPersonalPersonas() {
		return this.personalPersonas;
	}

	public void setPersonalPersonas(List<PersonalPersona> personalPersonas) {
		this.personalPersonas = personalPersonas;
	}

	public PersonalPersona addPersonalPersona(PersonalPersona personalPersona) {
		getPersonalPersonas().add(personalPersona);
		personalPersona.setCivil(this);

		return personalPersona;
	}

	public PersonalPersona removePersonalPersona(PersonalPersona personalPersona) {
		getPersonalPersonas().remove(personalPersona);
		personalPersona.setCivil(null);

		return personalPersona;
	}

}