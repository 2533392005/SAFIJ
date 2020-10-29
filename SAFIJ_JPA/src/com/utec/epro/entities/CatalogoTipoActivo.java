package com.utec.epro.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the catalogo_tipo_activo database table.
 * 
 */
@Entity
@Table(name="catalogo_tipo_activo")
@NamedQueries({
	@NamedQuery(name="CatalogoTipoActivo.findAll", query="SELECT c FROM CatalogoTipoActivo c"),
	@NamedQuery(name="CatalogoTipoActivo.findByTipoActivoId", query="SELECT c FROM CatalogoTipoActivo c where c.tipoActivoId = :tipoActivoId")
})
public class CatalogoTipoActivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tipo_activo_id", unique=true, nullable=false)
	private int tipoActivoId;

	@Column(name="tipo_activo_cantidad_tiempo")
	private int tipoActivoCantidadTiempo;

	@Column(name="tipo_activo_categoria")
	private int tipoActivoCategoria;

	@Column(name="tipo_activo_categoria_origen")
	private int tipoActivoCategoriaOrigen;

	@Column(name="tipo_activo_descripcion", length=200)
	private String tipoActivoDescripcion;

	@Column(name="tipo_activo_estado", nullable=false)
	private int tipoActivoEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tipo_activo_fecha_crea")
	private Date tipoActivoFechaCrea;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tipo_activo_fecha_modi")
	private Date tipoActivoFechaModi;

	@Column(name="tipo_activo_id_usuario_crea", length=10)
	private String tipoActivoIdUsuarioCrea;

	@Column(name="tipo_activo_id_usuario_modi", length=10)
	private String tipoActivoIdUsuarioModi;

	@Column(name="tipo_activo_nombre", nullable=false, length=100)
	private String tipoActivoNombre;

	@Column(name="tipo_activo_porcentaje")
	private int tipoActivoPorcentaje;

	@Column(name="tipo_activo_tiempo_id")
	private int tipoActivoTiempoId;

	//bi-directional many-to-one association to Bienes
	@OneToMany(mappedBy="catalogoTipoActivo")
	private List<Bienes> bienes;

	//bi-directional many-to-one association to Depreciacion
	@OneToMany(mappedBy="catalogoTipoActivo")
	private List<Depreciacion> depreciacions;

	public CatalogoTipoActivo() {
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

	public List<Bienes> getBienes() {
		return this.bienes;
	}

	public void setBienes(List<Bienes> bienes) {
		this.bienes = bienes;
	}

	public Bienes addBiene(Bienes biene) {
		getBienes().add(biene);
		biene.setCatalogoTipoActivo(this);

		return biene;
	}

	public Bienes removeBiene(Bienes biene) {
		getBienes().remove(biene);
		biene.setCatalogoTipoActivo(null);

		return biene;
	}

	public List<Depreciacion> getDepreciacions() {
		return this.depreciacions;
	}

	public void setDepreciacions(List<Depreciacion> depreciacions) {
		this.depreciacions = depreciacions;
	}

	public Depreciacion addDepreciacion(Depreciacion depreciacion) {
		getDepreciacions().add(depreciacion);
		depreciacion.setCatalogoTipoActivo(this);

		return depreciacion;
	}

	public Depreciacion removeDepreciacion(Depreciacion depreciacion) {
		getDepreciacions().remove(depreciacion);
		depreciacion.setCatalogoTipoActivo(null);

		return depreciacion;
	}

}