package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PersonalPersonaEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int personaId;
	private String personaApellido1;
	private String personaApellido2;
	private String personaApellido3;
	private String personaDireccion;
	private String personaDui;
	private int personaEstado;
	private Date personaFechaCrea;
	private Date personaFechaModifica;
	private Date personaFechaNac;
	private String personaNit;
	private String personaNombre1;
	private String personaNombre2;
	private String personaObservaciones;
	private String personaTelefonoFijo;
	private String personaTelefonoMovil;
	private int personaTipo;
	private int personaUsuarioCrea;
	private int personaUsuarioModifica;
	private List<EnrolamientoUsuariosEjb> enrolamientoUsuarios;
	private List<PersonalContactosEjb> personalContactos;
	private List<PersonalExperienciaLaboralEjb> personalExperienciaLaborals;
	private List<PersonalHabilidadesEjb> personalHabilidades;
	private CivilEjb civil;
	private GeneroEjb genero;
	private MunicipioEjb municipio;
	private PersonalProfesionEjb personalProfesion;

	public PersonalPersonaEjb() {
	}

	public int getPersonaId() {
		return this.personaId;
	}

	public void setPersonaId(int personaId) {
		this.personaId = personaId;
	}

	public String getPersonaApellido1() {
		return this.personaApellido1;
	}

	public void setPersonaApellido1(String personaApellido1) {
		this.personaApellido1 = personaApellido1;
	}

	public String getPersonaApellido2() {
		return this.personaApellido2;
	}

	public void setPersonaApellido2(String personaApellido2) {
		this.personaApellido2 = personaApellido2;
	}

	public String getPersonaApellido3() {
		return this.personaApellido3;
	}

	public void setPersonaApellido3(String personaApellido3) {
		this.personaApellido3 = personaApellido3;
	}

	public String getPersonaDireccion() {
		return this.personaDireccion;
	}

	public void setPersonaDireccion(String personaDireccion) {
		this.personaDireccion = personaDireccion;
	}

	public String getPersonaDui() {
		return this.personaDui;
	}

	public void setPersonaDui(String personaDui) {
		this.personaDui = personaDui;
	}

	public int getPersonaEstado() {
		return this.personaEstado;
	}

	public void setPersonaEstado(int personaEstado) {
		this.personaEstado = personaEstado;
	}

	public Date getPersonaFechaCrea() {
		return this.personaFechaCrea;
	}

	public void setPersonaFechaCrea(Date personaFechaCrea) {
		this.personaFechaCrea = personaFechaCrea;
	}

	public Date getPersonaFechaModifica() {
		return this.personaFechaModifica;
	}

	public void setPersonaFechaModifica(Date personaFechaModifica) {
		this.personaFechaModifica = personaFechaModifica;
	}

	public Date getPersonaFechaNac() {
		return this.personaFechaNac;
	}

	public void setPersonaFechaNac(Date personaFechaNac) {
		this.personaFechaNac = personaFechaNac;
	}

	public String getPersonaNit() {
		return this.personaNit;
	}

	public void setPersonaNit(String personaNit) {
		this.personaNit = personaNit;
	}

	public String getPersonaNombre1() {
		return this.personaNombre1;
	}

	public void setPersonaNombre1(String personaNombre1) {
		this.personaNombre1 = personaNombre1;
	}

	public String getPersonaNombre2() {
		return this.personaNombre2;
	}

	public void setPersonaNombre2(String personaNombre2) {
		this.personaNombre2 = personaNombre2;
	}

	public String getPersonaObservaciones() {
		return this.personaObservaciones;
	}

	public void setPersonaObservaciones(String personaObservaciones) {
		this.personaObservaciones = personaObservaciones;
	}

	public String getPersonaTelefonoFijo() {
		return this.personaTelefonoFijo;
	}

	public void setPersonaTelefonoFijo(String personaTelefonoFijo) {
		this.personaTelefonoFijo = personaTelefonoFijo;
	}

	public String getPersonaTelefonoMovil() {
		return this.personaTelefonoMovil;
	}

	public void setPersonaTelefonoMovil(String personaTelefonoMovil) {
		this.personaTelefonoMovil = personaTelefonoMovil;
	}

	public int getPersonaTipo() {
		return this.personaTipo;
	}

	public void setPersonaTipo(int personaTipo) {
		this.personaTipo = personaTipo;
	}

	public int getPersonaUsuarioCrea() {
		return this.personaUsuarioCrea;
	}

	public void setPersonaUsuarioCrea(int personaUsuarioCrea) {
		this.personaUsuarioCrea = personaUsuarioCrea;
	}

	public int getPersonaUsuarioModifica() {
		return this.personaUsuarioModifica;
	}

	public void setPersonaUsuarioModifica(int personaUsuarioModifica) {
		this.personaUsuarioModifica = personaUsuarioModifica;
	}

	public List<EnrolamientoUsuariosEjb> getEnrolamientoUsuarios() {
		return this.enrolamientoUsuarios;
	}

	public void setEnrolamientoUsuarios(List<EnrolamientoUsuariosEjb> enrolamientoUsuarios) {
		this.enrolamientoUsuarios = enrolamientoUsuarios;
	}

	public EnrolamientoUsuariosEjb addEnrolamientoUsuario(EnrolamientoUsuariosEjb enrolamientoUsuario) {
		getEnrolamientoUsuarios().add(enrolamientoUsuario);
		enrolamientoUsuario.setPersonalPersona(this);

		return enrolamientoUsuario;
	}

	public EnrolamientoUsuariosEjb removeEnrolamientoUsuario(EnrolamientoUsuariosEjb enrolamientoUsuario) {
		getEnrolamientoUsuarios().remove(enrolamientoUsuario);
		enrolamientoUsuario.setPersonalPersona(null);

		return enrolamientoUsuario;
	}

	public List<PersonalContactosEjb> getPersonalContactos() {
		return this.personalContactos;
	}

	public void setPersonalContactos(List<PersonalContactosEjb> personalContactos) {
		this.personalContactos = personalContactos;
	}

	public PersonalContactosEjb addPersonalContacto(PersonalContactosEjb personalContacto) {
		getPersonalContactos().add(personalContacto);
		personalContacto.setPersonalPersona(this);

		return personalContacto;
	}

	public PersonalContactosEjb removePersonalContacto(PersonalContactosEjb personalContacto) {
		getPersonalContactos().remove(personalContacto);
		personalContacto.setPersonalPersona(null);

		return personalContacto;
	}

	public List<PersonalExperienciaLaboralEjb> getPersonalExperienciaLaborals() {
		return this.personalExperienciaLaborals;
	}

	public void setPersonalExperienciaLaborals(List<PersonalExperienciaLaboralEjb> personalExperienciaLaborals) {
		this.personalExperienciaLaborals = personalExperienciaLaborals;
	}

	public PersonalExperienciaLaboralEjb addPersonalExperienciaLaboral(PersonalExperienciaLaboralEjb personalExperienciaLaboral) {
		getPersonalExperienciaLaborals().add(personalExperienciaLaboral);
		personalExperienciaLaboral.setPersonalPersona(this);

		return personalExperienciaLaboral;
	}

	public PersonalExperienciaLaboralEjb removePersonalExperienciaLaboral(PersonalExperienciaLaboralEjb personalExperienciaLaboral) {
		getPersonalExperienciaLaborals().remove(personalExperienciaLaboral);
		personalExperienciaLaboral.setPersonalPersona(null);

		return personalExperienciaLaboral;
	}

	public List<PersonalHabilidadesEjb> getPersonalHabilidades() {
		return this.personalHabilidades;
	}

	public void setPersonalHabilidades(List<PersonalHabilidadesEjb> personalHabilidades) {
		this.personalHabilidades = personalHabilidades;
	}

	public PersonalHabilidadesEjb addPersonalHabilidade(PersonalHabilidadesEjb personalHabilidade) {
		getPersonalHabilidades().add(personalHabilidade);
		personalHabilidade.setPersonalPersona(this);

		return personalHabilidade;
	}

	public PersonalHabilidadesEjb removePersonalHabilidade(PersonalHabilidadesEjb personalHabilidade) {
		getPersonalHabilidades().remove(personalHabilidade);
		personalHabilidade.setPersonalPersona(null);

		return personalHabilidade;
	}

	public CivilEjb getCivil() {
		return this.civil;
	}

	public void setCivil(CivilEjb civil) {
		this.civil = civil;
	}

	public GeneroEjb getGenero() {
		return this.genero;
	}

	public void setGenero(GeneroEjb genero) {
		this.genero = genero;
	}

	public MunicipioEjb getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(MunicipioEjb municipio) {
		this.municipio = municipio;
	}

	public PersonalProfesionEjb getPersonalProfesion() {
		return this.personalProfesion;
	}

	public void setPersonalProfesion(PersonalProfesionEjb personalProfesion) {
		this.personalProfesion = personalProfesion;
	}

}