package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the enrolamiento_accesos database table.
 * 
 */
@Entity
@Table(name="enrolamiento_accesos")
@NamedQueries({
	@NamedQuery(name="EnrolamientoAccesos.findAll", query="SELECT e FROM EnrolamientoAccesos e"),
	@NamedQuery(name="EnrolamientoAccesos.findByAccesosId", query="SELECT e FROM EnrolamientoAccesos e where e.accesosId = :accesosId")
})
public class EnrolamientoAccesos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="accesos_id")
	private String accesosId;

	@Column(name="accesos_descripcion")
	private String accesosDescripcion;

	@Column(name="accesos_estado")
	private int accesosEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="accesos_fecha_crea")
	private Date accesosFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="accesos_fecha_modi")
	private Date accesosFechaModi;

	@Column(name="accesos_id_usuario_crea")
	private String accesosIdUsuarioCrea;

	@Column(name="accesos_id_usuario_modi")
	private String accesosIdUsuarioModi;

	@Column(name="accesos_nivel0")
	private int accesosNivel0;

	@Column(name="accesos_nivel1")
	private int accesosNivel1;

	@Column(name="accesos_nivel2")
	private int accesosNivel2;

	@Column(name="accesos_nivel3")
	private int accesosNivel3;

	@Column(name="accesos_nivel4")
	private int accesosNivel4;

	@Column(name="accesos_nombre")
	private String accesosNombre;

	//bi-directional many-to-one association to EnrolamientoRoles
	@OneToMany(mappedBy="enrolamientoAcceso")
	private List<EnrolamientoRoles> enrolamientoRoles;

	//bi-directional many-to-one association to EnrolamientoUsuarios
	@OneToMany(mappedBy="enrolamientoAcceso")
	private List<EnrolamientoUsuarios> enrolamientoUsuarios;

	public EnrolamientoAccesos() {
	}

	public String getAccesosId() {
		return this.accesosId;
	}

	public void setAccesosId(String accesosId) {
		this.accesosId = accesosId;
	}

	public String getAccesosDescripcion() {
		return this.accesosDescripcion;
	}

	public void setAccesosDescripcion(String accesosDescripcion) {
		this.accesosDescripcion = accesosDescripcion;
	}

	public int getAccesosEstado() {
		return this.accesosEstado;
	}

	public void setAccesosEstado(int accesosEstado) {
		this.accesosEstado = accesosEstado;
	}

	public Date getAccesosFechaCrea() {
		return this.accesosFechaCrea;
	}

	public void setAccesosFechaCrea(Date accesosFechaCrea) {
		this.accesosFechaCrea = accesosFechaCrea;
	}

	public Date getAccesosFechaModi() {
		return this.accesosFechaModi;
	}

	public void setAccesosFechaModi(Date accesosFechaModi) {
		this.accesosFechaModi = accesosFechaModi;
	}

	public String getAccesosIdUsuarioCrea() {
		return this.accesosIdUsuarioCrea;
	}

	public void setAccesosIdUsuarioCrea(String accesosIdUsuarioCrea) {
		this.accesosIdUsuarioCrea = accesosIdUsuarioCrea;
	}

	public String getAccesosIdUsuarioModi() {
		return this.accesosIdUsuarioModi;
	}

	public void setAccesosIdUsuarioModi(String accesosIdUsuarioModi) {
		this.accesosIdUsuarioModi = accesosIdUsuarioModi;
	}

	public int getAccesosNivel0() {
		return this.accesosNivel0;
	}

	public void setAccesosNivel0(int accesosNivel0) {
		this.accesosNivel0 = accesosNivel0;
	}

	public int getAccesosNivel1() {
		return this.accesosNivel1;
	}

	public void setAccesosNivel1(int accesosNivel1) {
		this.accesosNivel1 = accesosNivel1;
	}

	public int getAccesosNivel2() {
		return this.accesosNivel2;
	}

	public void setAccesosNivel2(int accesosNivel2) {
		this.accesosNivel2 = accesosNivel2;
	}

	public int getAccesosNivel3() {
		return this.accesosNivel3;
	}

	public void setAccesosNivel3(int accesosNivel3) {
		this.accesosNivel3 = accesosNivel3;
	}

	public int getAccesosNivel4() {
		return this.accesosNivel4;
	}

	public void setAccesosNivel4(int accesosNivel4) {
		this.accesosNivel4 = accesosNivel4;
	}

	public String getAccesosNombre() {
		return this.accesosNombre;
	}

	public void setAccesosNombre(String accesosNombre) {
		this.accesosNombre = accesosNombre;
	}

	public List<EnrolamientoRoles> getEnrolamientoRoles() {
		return this.enrolamientoRoles;
	}

	public void setEnrolamientoRoles(List<EnrolamientoRoles> enrolamientoRoles) {
		this.enrolamientoRoles = enrolamientoRoles;
	}

	public EnrolamientoRoles addEnrolamientoRole(EnrolamientoRoles enrolamientoRole) {
		getEnrolamientoRoles().add(enrolamientoRole);
		enrolamientoRole.setEnrolamientoAcceso(this);

		return enrolamientoRole;
	}

	public EnrolamientoRoles removeEnrolamientoRole(EnrolamientoRoles enrolamientoRole) {
		getEnrolamientoRoles().remove(enrolamientoRole);
		enrolamientoRole.setEnrolamientoAcceso(null);

		return enrolamientoRole;
	}

	public List<EnrolamientoUsuarios> getEnrolamientoUsuarios() {
		return this.enrolamientoUsuarios;
	}

	public void setEnrolamientoUsuarios(List<EnrolamientoUsuarios> enrolamientoUsuarios) {
		this.enrolamientoUsuarios = enrolamientoUsuarios;
	}

	public EnrolamientoUsuarios addEnrolamientoUsuario(EnrolamientoUsuarios enrolamientoUsuario) {
		getEnrolamientoUsuarios().add(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoAcceso(this);

		return enrolamientoUsuario;
	}

	public EnrolamientoUsuarios removeEnrolamientoUsuario(EnrolamientoUsuarios enrolamientoUsuario) {
		getEnrolamientoUsuarios().remove(enrolamientoUsuario);
		enrolamientoUsuario.setEnrolamientoAcceso(null);

		return enrolamientoUsuario;
	}

}