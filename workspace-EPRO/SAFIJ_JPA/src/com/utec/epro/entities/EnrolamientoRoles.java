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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roles_id", unique=true, nullable=false)
	private int rolesId;

	@Column(name="roles_descripcion")
	private int rolesDescripcion;

	@Column(name="roles_estado", nullable=false)
	private int rolesEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="roles_fecha_crea")
	private Date rolesFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="roles_fecha_modi")
	private Date rolesFechaModi;

	@Column(name="roles_id_usuario_crea", length=10)
	private String rolesIdUsuarioCrea;

	@Column(name="roles_id_usuario_modi", length=10)
	private String rolesIdUsuarioModi;

	@Column(name="roles_llave0")
	private int rolesLlave0;

	@Column(name="roles_llave1", length=11)
	private String rolesLlave1;

	@Column(name="roles_nivel0", nullable=false)
	private int rolesNivel0;

	@Column(name="roles_nivel1", nullable=false)
	private int rolesNivel1;

	@Column(name="roles_nivel2", nullable=false)
	private int rolesNivel2;

	@Column(name="roles_nivel3", nullable=false)
	private int rolesNivel3;

	@Column(name="roles_nivel4", nullable=false)
	private int rolesNivel4;

	@Column(name="roles_nombre", nullable=false)
	private int rolesNombre;

	//bi-directional many-to-one association to EnrolamientoAcceso
	@ManyToOne
	@JoinColumn(name="accesos_id")
	private EnrolamientoAcceso enrolamientoAcceso;

	//bi-directional many-to-one association to EnrolamientoUsuarios
	@OneToMany(mappedBy="enrolamientoRole")
	private List<EnrolamientoUsuarios> enrolamientoUsuarios;

	public EnrolamientoRoles() {
	}

	public int getRolesId() {
		return this.rolesId;
	}

	public void setRolesId(int rolesId) {
		this.rolesId = rolesId;
	}

	public int getRolesDescripcion() {
		return this.rolesDescripcion;
	}

	public void setRolesDescripcion(int rolesDescripcion) {
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

	public int getRolesLlave0() {
		return this.rolesLlave0;
	}

	public void setRolesLlave0(int rolesLlave0) {
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

	public int getRolesNombre() {
		return this.rolesNombre;
	}

	public void setRolesNombre(int rolesNombre) {
		this.rolesNombre = rolesNombre;
	}

	public EnrolamientoAcceso getEnrolamientoAcceso() {
		return this.enrolamientoAcceso;
	}

	public void setEnrolamientoAcceso(EnrolamientoAcceso enrolamientoAcceso) {
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