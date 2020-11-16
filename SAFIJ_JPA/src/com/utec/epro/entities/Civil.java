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
	@Column(name="estado_civil_id")
	private String estadoCivilId;

	@Column(name="estado_civil_estado")
	private int estadoCivilEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estado_civil_fecha_crea")
	private Date estadoCivilFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="estado_civil_fecha_modifica")
	private Date estadoCivilFechaModifica;

	@Column(name="estado_civil_nombre")
	private String estadoCivilNombre;

	@Column(name="estado_civil_usuario_crea")
	private String estadoCivilUsuarioCrea;

	@Column(name="estado_civil_usuario_modifica")
	private String estadoCivilUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@OneToMany(mappedBy="civil")
	private List<PersonalPersona> personalPersonas;

	public Civil() {
	}

	public String getEstadoCivilId() {
		return this.estadoCivilId;
	}

	public void setEstadoCivilId(String estadoCivilId) {
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

	public String getEstadoCivilUsuarioCrea() {
		return this.estadoCivilUsuarioCrea;
	}

	public void setEstadoCivilUsuarioCrea(String estadoCivilUsuarioCrea) {
		this.estadoCivilUsuarioCrea = estadoCivilUsuarioCrea;
	}

	public String getEstadoCivilUsuarioModifica() {
		return this.estadoCivilUsuarioModifica;
	}

	public void setEstadoCivilUsuarioModifica(String estadoCivilUsuarioModifica) {
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