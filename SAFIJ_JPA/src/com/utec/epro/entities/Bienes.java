package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the bienes database table.
 * 
 */
@Entity
@Table(name="bienes")
@NamedQueries({
	@NamedQuery(name="Bienes.findAll", query="SELECT b FROM Bienes b"),
	@NamedQuery(name="Bienes.findByBienesId", query = "SELECT b FROM Bienes b WHERE b.bienesId = :bienesId")
})	
public class Bienes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bienes_id")
	private String bienesId;

	@Column(name="bienes_cantidad")
	private int bienesCantidad;

	@Column(name="bienes_cantidad_lote")
	private String bienesCantidadLote;

	@Column(name="bienes_codigo")
	private String bienesCodigo;

	@Column(name="bienes_codigo_adicional")
	private String bienesCodigoAdicional;

	@Column(name="bienes_descripcion")
	private String bienesDescripcion;

	@Column(name="bienes_detalle")
	private String bienesDetalle;

	@Column(name="bienes_estado")
	private int bienesEstado;

	@Column(name="bienes_estado_actual")
	private int bienesEstadoActual;

	@Column(name="bienes_estado_af")
	private String bienesEstadoAf;

	@Column(name="bienes_estado_original")
	private int bienesEstadoOriginal;

	@Column(name="bienes_estado_procedencia")
	private int bienesEstadoProcedencia;

	@Column(name="bienes_familia")
	private String bienesFamilia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="bienes_fecha_compra")
	private Date bienesFechaCompra;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="bienes_fecha_crea")
	private Date bienesFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="bienes_fecha_modi")
	private Date bienesFechaModi;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="bienes_fecha_venta")
	private Date bienesFechaVenta;

	@Column(name="bienes_id_usuario_crea")
	private String bienesIdUsuarioCrea;

	@Column(name="bienes_id_usuario_modi")
	private String bienesIdUsuarioModi;

	@Column(name="bienes_monto_compra")
	private BigDecimal bienesMontoCompra;

	@Column(name="bienes_monto_venta")
	private BigDecimal bienesMontoVenta;

	@Column(name="bienes_no_contrato")
	private String bienesNoContrato;

	@Column(name="bienes_no_factura")
	private String bienesNoFactura;

	@Column(name="bienes_no_poliza")
	private String bienesNoPoliza;

	@Column(name="bienes_no_ruc_proveed")
	private String bienesNoRucProveed;

	@Column(name="bienes_no_serie")
	private String bienesNoSerie;

	@Column(name="bienes_razon_social")
	private String bienesRazonSocial;

	@Column(name="bienes_responsable")
	private String bienesResponsable;

	@Column(name="bienes_sub_familia")
	private String bienesSubFamilia;

	@Column(name="bienes_tipo_adquisicion")
	private int bienesTipoAdquisicion;

	@Column(name="bienes_ubicacion_inicial")
	private String bienesUbicacionInicial;

	//bi-directional many-to-one association to CatalogoTipoActivo
	@ManyToOne
	@JoinColumn(name="tipo_activo_id")
	private CatalogoTipoActivo catalogoTipoActivo;

	public Bienes() {
	}

	public String getBienesId() {
		return this.bienesId;
	}

	public void setBienesId(String bienesId) {
		this.bienesId = bienesId;
	}

	public int getBienesCantidad() {
		return this.bienesCantidad;
	}

	public void setBienesCantidad(int bienesCantidad) {
		this.bienesCantidad = bienesCantidad;
	}

	public String getBienesCantidadLote() {
		return this.bienesCantidadLote;
	}

	public void setBienesCantidadLote(String bienesCantidadLote) {
		this.bienesCantidadLote = bienesCantidadLote;
	}

	public String getBienesCodigo() {
		return this.bienesCodigo;
	}

	public void setBienesCodigo(String bienesCodigo) {
		this.bienesCodigo = bienesCodigo;
	}

	public String getBienesCodigoAdicional() {
		return this.bienesCodigoAdicional;
	}

	public void setBienesCodigoAdicional(String bienesCodigoAdicional) {
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

	public BigDecimal getBienesMontoCompra() {
		return this.bienesMontoCompra;
	}

	public void setBienesMontoCompra(BigDecimal bienesMontoCompra) {
		this.bienesMontoCompra = bienesMontoCompra;
	}

	public BigDecimal getBienesMontoVenta() {
		return this.bienesMontoVenta;
	}

	public void setBienesMontoVenta(BigDecimal bienesMontoVenta) {
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

	public String getBienesResponsable() {
		return this.bienesResponsable;
	}

	public void setBienesResponsable(String bienesResponsable) {
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

	public CatalogoTipoActivo getCatalogoTipoActivo() {
		return this.catalogoTipoActivo;
	}

	public void setCatalogoTipoActivo(CatalogoTipoActivo catalogoTipoActivo) {
		this.catalogoTipoActivo = catalogoTipoActivo;
	}

}