package com.utec.epro.ejbs;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CatalogoTipoActivoEjb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tipoActivoId;
	private int tipoActivoCantidadTiempo;
	private int tipoActivoCategoria;
	private int tipoActivoCategoriaOrigen;
	private String tipoActivoDescripcion;
	private int tipoActivoEstado;
	private Date tipoActivoFechaCrea;
	private Date tipoActivoFechaModi;
	private String tipoActivoIdUsuarioCrea;
	private String tipoActivoIdUsuarioModi;
	private String tipoActivoNombre;
	private int tipoActivoPorcentaje;
	private int tipoActivoTiempoId;
	private List<BienesEjb> bienes;
	private List<DepreciacionEjb> depreciacions;

	public CatalogoTipoActivoEjb() {
	}

	public int getTipoActivoId() {
		return this.tipoActivoId;
	}

	public void setTipoActivoId(int tipoActivoId) {
		this.tipoActivoId = tipoActivoId;
	}

	public int getTipoActivoCantidadTiempo() {
		return this.tipoActivoCantidadTiempo;
	}

	public void setTipoActivoCantidadTiempo(int tipoActivoCantidadTiempo) {
		this.tipoActivoCantidadTiempo = tipoActivoCantidadTiempo;
	}

	public int getTipoActivoCategoria() {
		return this.tipoActivoCategoria;
	}

	public void setTipoActivoCategoria(int tipoActivoCategoria) {
		this.tipoActivoCategoria = tipoActivoCategoria;
	}

	public int getTipoActivoCategoriaOrigen() {
		return this.tipoActivoCategoriaOrigen;
	}

	public void setTipoActivoCategoriaOrigen(int tipoActivoCategoriaOrigen) {
		this.tipoActivoCategoriaOrigen = tipoActivoCategoriaOrigen;
	}

	public String getTipoActivoDescripcion() {
		return this.tipoActivoDescripcion;
	}

	public void setTipoActivoDescripcion(String tipoActivoDescripcion) {
		this.tipoActivoDescripcion = tipoActivoDescripcion;
	}

	public int getTipoActivoEstado() {
		return this.tipoActivoEstado;
	}

	public void setTipoActivoEstado(int tipoActivoEstado) {
		this.tipoActivoEstado = tipoActivoEstado;
	}

	public Date getTipoActivoFechaCrea() {
		return this.tipoActivoFechaCrea;
	}

	public void setTipoActivoFechaCrea(Date tipoActivoFechaCrea) {
		this.tipoActivoFechaCrea = tipoActivoFechaCrea;
	}

	public Date getTipoActivoFechaModi() {
		return this.tipoActivoFechaModi;
	}

	public void setTipoActivoFechaModi(Date tipoActivoFechaModi) {
		this.tipoActivoFechaModi = tipoActivoFechaModi;
	}

	public String getTipoActivoIdUsuarioCrea() {
		return this.tipoActivoIdUsuarioCrea;
	}

	public void setTipoActivoIdUsuarioCrea(String tipoActivoIdUsuarioCrea) {
		this.tipoActivoIdUsuarioCrea = tipoActivoIdUsuarioCrea;
	}

	public String getTipoActivoIdUsuarioModi() {
		return this.tipoActivoIdUsuarioModi;
	}

	public void setTipoActivoIdUsuarioModi(String tipoActivoIdUsuarioModi) {
		this.tipoActivoIdUsuarioModi = tipoActivoIdUsuarioModi;
	}

	public String getTipoActivoNombre() {
		return this.tipoActivoNombre;
	}

	public void setTipoActivoNombre(String tipoActivoNombre) {
		this.tipoActivoNombre = tipoActivoNombre;
	}

	public int getTipoActivoPorcentaje() {
		return this.tipoActivoPorcentaje;
	}

	public void setTipoActivoPorcentaje(int tipoActivoPorcentaje) {
		this.tipoActivoPorcentaje = tipoActivoPorcentaje;
	}

	public int getTipoActivoTiempoId() {
		return this.tipoActivoTiempoId;
	}

	public void setTipoActivoTiempoId(int tipoActivoTiempoId) {
		this.tipoActivoTiempoId = tipoActivoTiempoId;
	}

	public List<BienesEjb> getBienes() {
		return this.bienes;
	}

	public void setBienes(List<BienesEjb> bienes) {
		this.bienes = bienes;
	}

	public BienesEjb addBiene(BienesEjb biene) {
		getBienes().add(biene);
		biene.setCatalogoTipoActivo(this);

		return biene;
	}

	public BienesEjb removeBiene(BienesEjb biene) {
		getBienes().remove(biene);
		biene.setCatalogoTipoActivo(null);

		return biene;
	}

	public List<DepreciacionEjb> getDepreciacions() {
		return this.depreciacions;
	}

	public void setDepreciacions(List<DepreciacionEjb> depreciacions) {
		this.depreciacions = depreciacions;
	}

	public DepreciacionEjb addDepreciacion(DepreciacionEjb depreciacion) {
		getDepreciacions().add(depreciacion);
		depreciacion.setCatalogoTipoActivo(this);

		return depreciacion;
	}

	public DepreciacionEjb removeDepreciacion(DepreciacionEjb depreciacion) {
		getDepreciacions().remove(depreciacion);
		depreciacion.setCatalogoTipoActivo(null);

		return depreciacion;
	}

}