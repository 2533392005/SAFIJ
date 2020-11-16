package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the enrolamiento_usuarios database table.
 * 
 */
@Entity
@Table(name="enrolamiento_usuarios")
@NamedQueries({
	@NamedQuery(name="EnrolamientoUsuarios.findAll", query="SELECT e FROM EnrolamientoUsuarios e"),
	@NamedQuery(name="EnrolamientoUsuarios.findByUsuarioId", query="SELECT e FROM EnrolamientoUsuarios e where e.usuarioId = :usuarioId")
})
public class EnrolamientoUsuarios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usuario_id")
	private String usuarioId;

	@Column(name="usuarios_descripcion")
	private String usuariosDescripcion;

	@Column(name="usuarios_estado")
	private int usuariosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="usuarios_fecha_crea")
	private Date usuariosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="usuarios_fecha_modi")
	private Date usuariosFechaModi;

	@Column(name="usuarios_id_usuario_crea")
	private String usuariosIdUsuarioCrea;

	@Column(name="usuarios_id_usuario_modi")
	private String usuariosIdUsuarioModi;

	@Column(name="usuarios_tipo")
	private int usuariosTipo;

	//bi-directional many-to-one association to EnrolamientoAccesos
	@ManyToOne
	@JoinColumn(name="accesos_id")
	private EnrolamientoAccesos enrolamientoAcceso;

	//bi-directional many-to-one association to PersonalPersona
	@ManyToOne
	@JoinColumn(name="persona_id")
	private PersonalPersona personalPersona;

	//bi-directional many-to-one association to EnrolamientoRoles
	@ManyToOne
	@JoinColumn(name="roles_id")
	private EnrolamientoRoles enrolamientoRole;

	public EnrolamientoUsuarios() {
	}

	public String getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuariosDescripcion() {
		return this.usuariosDescripcion;
	}

	public void setUsuariosDescripcion(String usuariosDescripcion) {
		this.usuariosDescripcion = usuariosDescripcion;
	}

	public int getUsuariosEstado() {
		return this.usuariosEstado;
	}

	public void setUsuariosEstado(int usuariosEstado) {
		this.usuariosEstado = usuariosEstado;
	}

	public Date getUsuariosFechaCrea() {
		return this.usuariosFechaCrea;
	}

	public void setUsuariosFechaCrea(Date usuariosFechaCrea) {
		this.usuariosFechaCrea = usuariosFechaCrea;
	}

	public Date getUsuariosFechaModi() {
		return this.usuariosFechaModi;
	}

	public void setUsuariosFechaModi(Date usuariosFechaModi) {
		this.usuariosFechaModi = usuariosFechaModi;
	}

	public String getUsuariosIdUsuarioCrea() {
		return this.usuariosIdUsuarioCrea;
	}

	public void setUsuariosIdUsuarioCrea(String usuariosIdUsuarioCrea) {
		this.usuariosIdUsuarioCrea = usuariosIdUsuarioCrea;
	}

	public String getUsuariosIdUsuarioModi() {
		return this.usuariosIdUsuarioModi;
	}

	public void setUsuariosIdUsuarioModi(String usuariosIdUsuarioModi) {
		this.usuariosIdUsuarioModi = usuariosIdUsuarioModi;
	}

	public int getUsuariosTipo() {
		return this.usuariosTipo;
	}

	public void setUsuariosTipo(int usuariosTipo) {
		this.usuariosTipo = usuariosTipo;
	}

	public EnrolamientoAccesos getEnrolamientoAcceso() {
		return this.enrolamientoAcceso;
	}

	public void setEnrolamientoAcceso(EnrolamientoAccesos enrolamientoAcceso) {
		this.enrolamientoAcceso = enrolamientoAcceso;
	}

	public PersonalPersona getPersonalPersona() {
		return this.personalPersona;
	}

	public void setPersonalPersona(PersonalPersona personalPersona) {
		this.personalPersona = personalPersona;
	}

	public EnrolamientoRoles getEnrolamientoRole() {
		return this.enrolamientoRole;
	}

	public void setEnrolamientoRole(EnrolamientoRoles enrolamientoRole) {
		this.enrolamientoRole = enrolamientoRole;
	}

}