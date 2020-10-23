package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;

public class BienesEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bienesId;
	private int bienesCantidad;
	private int bienesCantidadLote;
	private int bienesCodigo;
	private int bienesCodigoAdicional;
	private String bienesDescripcion;
	private String bienesDetalle;
	private int bienesEstado;
	private int bienesEstadoActual;
	private String bienesEstadoAf;
	private int bienesEstadoOriginal;
	private int bienesEstadoProcedencia;
	private String bienesFamilia;
	private Date bienesFechaCompra;
	private Date bienesFechaCrea;
	private Date bienesFechaModi;
	private Date bienesFechaVenta;
	private String bienesIdUsuarioCrea;
	private String bienesIdUsuarioModi;
	private int bienesMontoCompra;
	private int bienesMontoVenta;
	private String bienesNoContrato;
	private String bienesNoFactura;
	private String bienesNoPoliza;
	private String bienesNoRucProveed;
	private String bienesNoSerie;
	private String bienesRazonSocial;
	private int bienesResponsable;
	private String bienesSubFamilia;
	private int bienesTipoAdquisicion;
	private String bienesUbicacionInicial;
	private CatalogoTipoActivoEjb catalogoTipoActivo;

	public BienesEjb() {
	}

	public int getBienesId() {
		return this.bienesId;
	}

	public void setBienesId(int bienesId) {
		this.bienesId = bienesId;
	}

	public int getBienesCantidad() {
		return this.bienesCantidad;
	}

	public void setBienesCantidad(int bienesCantidad) {
		this.bienesCantidad = bienesCantidad;
	}

	public int getBienesCantidadLote() {
		return this.bienesCantidadLote;
	}

	public void setBienesCantidadLote(int bienesCantidadLote) {
		this.bienesCantidadLote = bienesCantidadLote;
	}

	public int getBienesCodigo() {
		return this.bienesCodigo;
	}

	public void setBienesCodigo(int bienesCodigo) {
		this.bienesCodigo = bienesCodigo;
	}

	public int getBienesCodigoAdicional() {
		return this.bienesCodigoAdicional;
	}

	public void setBienesCodigoAdicional(int bienesCodigoAdicional) {
		this.bienesCodigoAdicional = bienesCodigoAdicional;
	}

	public String getBienesDescripcion() {
		return this.bienesDescripcion;
	}

	public void setBienesDescripcion(String bienesDescripcion) {
		this.bienesDescripcion = bienesDescripcion;
	}

	public String getBienesDetalle() {
		return this.bienesDetalle;
	}

	public void setBienesDetalle(String bienesDetalle) {
		this.bienesDetalle = bienesDetalle;
	}

	public int getBienesEstado() {
		return this.bienesEstado;
	}

	public void setBienesEstado(int bienesEstado) {
		this.bienesEstado = bienesEstado;
	}

	public int getBienesEstadoActual() {
		return this.bienesEstadoActual;
	}

	public void setBienesEstadoActual(int bienesEstadoActual) {
		this.bienesEstadoActual = bienesEstadoActual;
	}

	public String getBienesEstadoAf() {
		return this.bienesEstadoAf;
	}

	public void setBienesEstadoAf(String bienesEstadoAf) {
		this.bienesEstadoAf = bienesEstadoAf;
	}

	public int getBienesEstadoOriginal() {
		return this.bienesEstadoOriginal;
	}

	public void setBienesEstadoOriginal(int bienesEstadoOriginal) {
		this.bienesEstadoOriginal = bienesEstadoOriginal;
	}

	public int getBienesEstadoProcedencia() {
		return this.bienesEstadoProcedencia;
	}

	public void setBienesEstadoProcedencia(int bienesEstadoProcedencia) {
		this.bienesEstadoProcedencia = bienesEstadoProcedencia;
	}

	public String getBienesFamilia() {
		return this.bienesFamilia;
	}

	public void setBienesFamilia(String bienesFamilia) {
		this.bienesFamilia = bienesFamilia;
	}

	public Date getBienesFechaCompra() {
		return this.bienesFechaCompra;
	}

	public void setBienesFechaCompra(Date bienesFechaCompra) {
		this.bienesFechaCompra = bienesFechaCompra;
	}

	public Date getBienesFechaCrea() {
		return this.bienesFechaCrea;
	}

	public void setBienesFechaCrea(Date bienesFechaCrea) {
		this.bienesFechaCrea = bienesFechaCrea;
	}

	public Date getBienesFechaModi() {
		return this.bienesFechaModi;
	}

	public void setBienesFechaModi(Date bienesFechaModi) {
		this.bienesFechaModi = bienesFechaModi;
	}

	public Date getBienesFechaVenta() {
		return this.bienesFechaVenta;
	}

	public void setBienesFechaVenta(Date bienesFechaVenta) {
		this.bienesFechaVenta = bienesFechaVenta;
	}

	public String getBienesIdUsuarioCrea() {
		return this.bienesIdUsuarioCrea;
	}

	public void setBienesIdUsuarioCrea(String bienesIdUsuarioCrea) {
		this.bienesIdUsuarioCrea = bienesIdUsuarioCrea;
	}

	public String getBienesIdUsuarioModi() {
		return this.bienesIdUsuarioModi;
	}

	public void setBienesIdUsuarioModi(String bienesIdUsuarioModi) {
		this.bienesIdUsuarioModi = bienesIdUsuarioModi;
	}

	public int getBienesMontoCompra() {
		return this.bienesMontoCompra;
	}

	public void setBienesMontoCompra(int bienesMontoCompra) {
		this.bienesMontoCompra = bienesMontoCompra;
	}

	public int getBienesMontoVenta() {
		return this.bienesMontoVenta;
	}

	public void setBienesMontoVenta(int bienesMontoVenta) {
		this.bienesMontoVenta = bienesMontoVenta;
	}

	public String getBienesNoContrato() {
		return this.bienesNoContrato;
	}

	public void setBienesNoContrato(String bienesNoContrato) {
		this.bienesNoContrato = bienesNoContrato;
	}

	public String getBienesNoFactura() {
		return this.bienesNoFactura;
	}

	public void setBienesNoFactura(String bienesNoFactura) {
		this.bienesNoFactura = bienesNoFactura;
	}

	public String getBienesNoPoliza() {
		return this.bienesNoPoliza;
	}

	public void setBienesNoPoliza(String bienesNoPoliza) {
		this.bienesNoPoliza = bienesNoPoliza;
	}

	public String getBienesNoRucProveed() {
		return this.bienesNoRucProveed;
	}

	public void setBienesNoRucProveed(String bienesNoRucProveed) {
		this.bienesNoRucProveed = bienesNoRucProveed;
	}

	public String getBienesNoSerie() {
		return this.bienesNoSerie;
	}

	public void setBienesNoSerie(String bienesNoSerie) {
		this.bienesNoSerie = bienesNoSerie;
	}

	public String getBienesRazonSocial() {
		return this.bienesRazonSocial;
	}

	public void setBienesRazonSocial(String bienesRazonSocial) {
		this.bienesRazonSocial = bienesRazonSocial;
	}

	public int getBienesResponsable() {
		return this.bienesResponsable;
	}

	public void setBienesResponsable(int bienesResponsable) {
		this.bienesResponsable = bienesResponsable;
	}

	public String getBienesSubFamilia() {
		return this.bienesSubFamilia;
	}

	public void setBienesSubFamilia(String bienesSubFamilia) {
		this.bienesSubFamilia = bienesSubFamilia;
	}

	public int getBienesTipoAdquisicion() {
		return this.bienesTipoAdquisicion;
	}

	public void setBienesTipoAdquisicion(int bienesTipoAdquisicion) {
		this.bienesTipoAdquisicion = bienesTipoAdquisicion;
	}

	public String getBienesUbicacionInicial() {
		return this.bienesUbicacionInicial;
	}

	public void setBienesUbicacionInicial(String bienesUbicacionInicial) {
		this.bienesUbicacionInicial = bienesUbicacionInicial;
	}

	public CatalogoTipoActivoEjb getCatalogoTipoActivo() {
		return this.catalogoTipoActivo;
	}

	public void setCatalogoTipoActivo(CatalogoTipoActivoEjb catalogoTipoActivo) {
		this.catalogoTipoActivo = catalogoTipoActivo;
	}

}