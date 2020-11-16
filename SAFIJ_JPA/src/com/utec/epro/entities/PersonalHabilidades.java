package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the personal_habilidades database table.
 * 
 */
@Entity
@Table(name="personal_habilidades")
@NamedQueries({
	@NamedQuery(name="PersonalHabilidades.findAll", query="SELECT p FROM PersonalHabilidades p"),
	@NamedQuery(name="PersonalHabilidades.findByHabilidadesId", query="SELECT p FROM PersonalHabilidades p where p.habilidadesId = :habilidadesId")
})	
public class PersonalHabilidades implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="habilidades_id")
	private String habilidadesId;

	@Column(name="habilidades_descripcion")
	private String habilidadesDescripcion;

	@Column(name="habilidades_estado")
	private int habilidadesEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="habilidades_fecha_crea")
	private Date habilidadesFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="habilidades_fecha_modifica")
	private Date habilidadesFechaModifica;

	@Column(name="habilidades_porcentaje")
	private BigDecimal habilidadesPorcentaje;

	@Column(name="habilidades_usuario_crea")
	private String habilidadesUsuarioCrea;

	@Column(name="habilidades_usuario_modifica")
	private String habilidadesUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@ManyToOne
	@JoinColumn(name="habilidades_persona_id")
	private PersonalPersona personalPersona;

	public PersonalHabilidades() {
	}

	public String getHabilidadesId() {
		return this.habilidadesId;
	}

	public void setHabilidadesId(String habilidadesId) {
		this.habilidadesId = habilidadesId;
	}

	public String getHabilidadesDescripcion() {
		return this.habilidadesDescripcion;
	}

	public void setHabilidadesDescripcion(String habilidadesDescripcion) {
		this.habilidadesDescripcion = habilidadesDescripcion;
	}

	public int getHabilidadesEstado() {
		return this.habilidadesEstado;
	}

	public void setHabilidadesEstado(int habilidadesEstado) {
		this.habilidadesEstado = habilidadesEstado;
	}

	public Date getHabilidadesFechaCrea() {
		return this.habilidadesFechaCrea;
	}

	public void setHabilidadesFechaCrea(Date habilidadesFechaCrea) {
		this.habilidadesFechaCrea = habilidadesFechaCrea;
	}

	public Date getHabilidadesFechaModifica() {
		return this.habilidadesFechaModifica;
	}

	public void setHabilidadesFechaModifica(Date habilidadesFechaModifica) {
		this.habilidadesFechaModifica = habilidadesFechaModifica;
	}

	public BigDecimal getHabilidadesPorcentaje() {
		return this.habilidadesPorcentaje;
	}

	public void setHabilidadesPorcentaje(BigDecimal habilidadesPorcentaje) {
		this.habilidadesPorcentaje = habilidadesPorcentaje;
	}

	public String getHabilidadesUsuarioCrea() {
		return this.habilidadesUsuarioCrea;
	}

	public void setHabilidadesUsuarioCrea(String habilidadesUsuarioCrea) {
		this.habilidadesUsuarioCrea = habilidadesUsuarioCrea;
	}

	public String getHabilidadesUsuarioModifica() {
		return this.habilidadesUsuarioModifica;
	}

	public void setHabilidadesUsuarioModifica(String habilidadesUsuarioModifica) {
		this.habilidadesUsuarioModifica = habilidadesUsuarioModifica;
	}

	public PersonalPersona getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersona personalPersona) {
		this.personalPersona = personalPersona;
	}

}