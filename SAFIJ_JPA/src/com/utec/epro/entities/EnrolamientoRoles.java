package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the enrolamiento_roles database table.
 * 
 */
@Entity
@Table(name="enrolamiento_roles")
@NamedQueries({
	@NamedQuery(name="EnrolamientoRoles.findAll", query="SELECT e FROM EnrolamientoRoles e"),
	@NamedQuery(name="EnrolamientoRoles.findByRolesId", query="SELECT e FROM EnrolamientoRoles e where e.rolesId = :rolesId")
})
public class EnrolamientoRoles implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="roles_id")
	private String rolesId;

	@Column(name="roles_descripcion")
	private String rolesDescripcion;

	@Column(name="roles_estado")
	private int rolesEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="roles_fecha_crea")
	private Date rolesFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="roles_fecha_modi")
	private Date rolesFechaModi;

	@Column(name="roles_id_usuario_crea")
	private String rolesIdUsuarioCrea;

	@Column(name="roles_id_usuario_modi")
	private String rolesIdUsuarioModi;

	@Column(name="roles_llave0")
	private String rolesLlave0;

	@Column(name="roles_llave1")
	private String rolesLlave1;

	@Column(name="roles_nivel0")
	private int rolesNivel0;

	@Column(name="roles_nivel1")
	private int rolesNivel1;

	@Column(name="roles_nivel2")
	private int rolesNivel2;

	@Column(name="roles_nivel3")
	private int rolesNivel3;

	@Column(name="roles_nivel4")
	private int rolesNivel4;

	@Column(name="roles_nombre")
	private String rolesNombre;

	//bi-directional many-to-one association to EnrolamientoAccesos
	@ManyToOne
	@JoinColumn(name="accesos_id")
	private EnrolamientoAccesos enrolamientoAcceso;

	//bi-directional many-to-one association to EnrolamientoUsuarios
	@OneToMany(mappedBy="enrolamientoRole")
	private List<EnrolamientoUsuarios> enrolamientoUsuarios;

	public EnrolamientoRoles() {
	}

	public String getRolesId() {
		return this.rolesId;
	}

	public void setRolesId(String rolesId) {
		this.rolesId = rolesId;
	}

	public String getRolesDescripcion() {
		return this.rolesDescripcion;
	}

	public void setRolesDescripcion(String rolesDescripcion) {
		this.rolesDescripcion = rolesDescripcion;
	}

	public int getRolesEstado() {
		return this.rolesEstado;
	}

	public void setRolesEstado(int rolesEstado) {
		this.rolesEstado = rolesEstado;
	}

	public Date getRolesFechaCrea() {
		return this.rolesFechaCrea;
	}

	public void setRolesFechaCrea(Date rolesFechaCrea) {
		this.rolesFechaCrea = rolesFechaCrea;
	}

	public Date getRolesFechaModi() {
		return this.rolesFechaModi;
	}

	public void setRolesFechaModi(Date rolesFechaModi) {
		this.rolesFechaModi = rolesFechaModi;
	}

	public String getRolesIdUsuarioCrea() {
		return this.rolesIdUsuarioCrea;
	}

	public void setRolesIdUsuarioCrea(String rolesIdUsuarioCrea) {
		this.rolesIdUsuarioCrea = rolesIdUsuarioCrea;
	}

	public String getRolesIdUsuarioModi() {
		return this.rolesIdUsuarioModi;
	}

	public void setRolesIdUsuarioModi(String rolesIdUsuarioModi) {
		this.rolesIdUsuarioModi = rolesIdUsuarioModi;
	}

	public String getRolesLlave0() {
		return this.rolesLlave0;
	}

	public void setRolesLlave0(String rolesLlave0) {
		this.rolesLlave0 = rolesLlave0;
	}

	public String getRolesLlave1() {
		return this.rolesLlave1;
	}

	public void setRolesLlave1(String rolesLlave1) {
		this.rolesLlave1 = rolesLlave1;
	}

	public int getRolesNivel0() {
		return this.rolesNivel0;
	}

	public void setRolesNivel0(int rolesNivel0) {
		this.rolesNivel0 = rolesNivel0;
	}

	public int getRolesNivel1() {
		return this.rolesNivel1;
	}

	public void setRolesNivel1(int rolesNivel1) {
		this.rolesNivel1 = rolesNivel1;
	}

	public int getRolesNivel2() {
		return this.rolesNivel2;
	}

	public void setRolesNivel2(int rolesNivel2) {
		this.rolesNivel2 = rolesNivel2;
	}

	public int getRolesNivel3() {
		return this.rolesNivel3;
	}

	public void setRolesNivel3(int rolesNivel3) {
		this.rolesNivel3 = rolesNivel3;
	}

	public int getRolesNivel4() {
		return this.rolesNivel4;
	}

	public void setRolesNivel4(int rolesNivel4) {
		this.rolesNivel4 = rolesNivel4;
	}

	public String getRolesNombre() {
		return this.rolesNombre;
	}

	public void setRolesNombre(String rolesNombre) {
		this.rolesNombre = rolesNombre;
	}

	public EnrolamientoAccesos getEnrolamientoAcceso() {
		return this.enrolamientoAcceso;
	}

	public void setEnrolamientoAcceso(EnrolamientoAccesos enrolamientoAcceso) {
		this.enrolamientoAcceso = enrolamientoAcceso;
	}

	public List<EnrolamientoUsuarios> getEnrolamientoUsuarios() {
		return this.enrolamientoUsuarios;
	}

	public void setEnrolamientoUsuarios(List<EnrolamientoUsuarios> enrolamientoUsuarios) {
		this.enrolamientoUsuarios = enrolamientoUsuarios;
	}

	public EnrolamientoUsuarios addEnrolamientoUsuario(EnrolamientoUsuarios enrolamientoUsuario) {
		getEnrolamientoUsuarios().add(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoRole(this);

		return enrolamientoUsuario;
	}

	public EnrolamientoUsuarios removeEnrolamientoUsuario(EnrolamientoUsuarios enrolamientoUsuario) {
		getEnrolamientoUsuarios().remove(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoRole(null);

		return enrolamientoUsuario;
	}

}