package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CatalogoAgenciasEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agenciasId;
	private int agenciaEstado;
	private Date agenciaFechaCrea;
	private Date agenciaFechaModi;
	private String agenciaIdUsuarioCrea;
	private String agenciaIdUsuarioModi;
	private int agenciaUsuarioId;
	private String agenciasDescripcion;
	private String agenciasDireccion;
	private String agenciasNombre;
	private CiudadEjb ciudad;
	private DepartamentoEjb departamento;
	private MunicipioEjb municipio;
	private PaisEjb pai;
	private List<InventarioEjb> inventarios;

	public CatalogoAgenciasEjb() {
	}

	public int getAgenciasId() {
		return this.agenciasId;
	}

	public void setAgenciasId(int agenciasId) {
		this.agenciasId = agenciasId;
	}

	public int getAgenciaEstado() {
		return this.agenciaEstado;
	}

	public void setAgenciaEstado(int agenciaEstado) {
		this.agenciaEstado = agenciaEstado;
	}

	public Date getAgenciaFechaCrea() {
		return this.agenciaFechaCrea;
	}

	public void setAgenciaFechaCrea(Date agenciaFechaCrea) {
		this.agenciaFechaCrea = agenciaFechaCrea;
	}

	public Date getAgenciaFechaModi() {
		return this.agenciaFechaModi;
	}

	public void setAgenciaFechaModi(Date agenciaFechaModi) {
		this.agenciaFechaModi = agenciaFechaModi;
	}

	public String getAgenciaIdUsuarioCrea() {
		return this.agenciaIdUsuarioCrea;
	}

	public void setAgenciaIdUsuarioCrea(String agenciaIdUsuarioCrea) {
		this.agenciaIdUsuarioCrea = agenciaIdUsuarioCrea;
	}

	public String getAgenciaIdUsuarioModi() {
		return this.agenciaIdUsuarioModi;
	}

	public void setAgenciaIdUsuarioModi(String agenciaIdUsuarioModi) {
		this.agenciaIdUsuarioModi = agenciaIdUsuarioModi;
	}

	public int getAgenciaUsuarioId() {
		return this.agenciaUsuarioId;
	}

	public void setAgenciaUsuarioId(int agenciaUsuarioId) {
		this.agenciaUsuarioId = agenciaUsuarioId;
	}

	public String getAgenciasDescripcion() {
		return this.agenciasDescripcion;
	}

	public void setAgenciasDescripcion(String agenciasDescripcion) {
		this.agenciasDescripcion = agenciasDescripcion;
	}

	public String getAgenciasDireccion() {
		return this.agenciasDireccion;
	}

	public void setAgenciasDireccion(String agenciasDireccion) {
		this.agenciasDireccion = agenciasDireccion;
	}

	public String getAgenciasNombre() {
		return this.agenciasNombre;
	}

	public void setAgenciasNombre(String agenciasNombre) {
		this.agenciasNombre = agenciasNombre;
	}

	public CiudadEjb getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(CiudadEjb ciudad) {
		this.ciudad = ciudad;
	}

	public DepartamentoEjb getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(DepartamentoEjb departamento) {
		this.departamento = departamento;
	}

	public MunicipioEjb getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(MunicipioEjb municipio) {
		this.municipio = municipio;
	}

	public PaisEjb getPai() {
		return this.pai;
	}

	public void setPai(PaisEjb pai) {
		this.pai = pai;
	}

	public List<InventarioEjb> getInventarios() {
		return this.inventarios;
	}

	public void setInventarios(List<InventarioEjb> inventarios) {
		this.inventarios = inventarios;
	}

	public InventarioEjb addInventario(InventarioEjb inventario) {
		getInventarios().add(inventario);
		inventario.setCatalogoAgencia(this);

		return inventario;
	}

	public InventarioEjb removeInventario(InventarioEjb inventario) {
		getInventarios().remove(inventario);
		inventario.setCatalogoAgencia(null);

		return inventario;
	}

}