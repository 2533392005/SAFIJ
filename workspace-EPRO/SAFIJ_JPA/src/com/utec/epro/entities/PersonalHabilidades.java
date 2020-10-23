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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="habilidades_id", unique=true, nullable=false)
	private int habilidadesId;

	@Column(name="habilidades_descripcion", length=500)
	private String habilidadesDescripcion;

	@Column(name="habilidades_estado", nullable=false)
	private int habilidadesEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="habilidades_fecha_crea")
	private Date habilidadesFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="habilidades_fecha_modifica")
	private Date habilidadesFechaModifica;

	@Column(name="habilidades_porcentaje", precision=10, scale=2)
	private BigDecimal habilidadesPorcentaje;

	@Column(name="habilidades_usuario_crea")
	private int habilidadesUsuarioCrea;

	@Column(name="habilidades_usuario_modifica")
	private int habilidadesUsuarioModifica;

	//bi-directional many-to-one association to PersonalPersona
	@ManyToOne
	@JoinColumn(name="habilidades_persona_id")
	private PersonalPersona personalPersona;

	public PersonalHabilidades() {
	}

	public int getHabilidadesId() {
		return this.habilidadesId;
	}

	public void setHabilidadesId(int habilidadesId) {
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

	public int getHabilidadesUsuarioCrea() {
		return this.habilidadesUsuarioCrea;
	}

	public void setHabilidadesUsuarioCrea(int habilidadesUsuarioCrea) {
		this.habilidadesUsuarioCrea = habilidadesUsuarioCrea;
	}

	public int getHabilidadesUsuarioModifica() {
		return this.habilidadesUsuarioModifica;
	}

	public void setHabilidadesUsuarioModifica(int habilidadesUsuarioModifica) {
		this.habilidadesUsuarioModifica = habilidadesUsuarioModifica;
	}

	public PersonalPersona getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersona personalPersona) {
		this.personalPersona = personalPersona;
	}

}