package com.utec.epro.crud;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.math.BigDecimal;

import javax.ejb.EJB;

import com.utec.epro.clients.BienesFacadeLocal;
import com.utec.epro.clients.CatalogoAgenciasFacadeLocal;
import com.utec.epro.clients.CatalogoTiempoFacadeLocal;
import com.utec.epro.clients.CatalogoTipoActivoFacadeLocal;
import com.utec.epro.clients.CiudadFacadeLocal;
import com.utec.epro.clients.CivilFacadeLocal;
import com.utec.epro.clients.DepartamentoFacadeLocal;
import com.utec.epro.clients.DepreciacionFacadeLocal;
import com.utec.epro.clients.EnrolamientoAccesoFacadeLocal;
import com.utec.epro.clients.EnrolamientoRolesFacadeLocal;
import com.utec.epro.clients.EnrolamientoUsuariosFacadeLocal;
import com.utec.epro.clients.EstadosFacadeLocal;
import com.utec.epro.clients.GeneroFacadeLocal;
import com.utec.epro.clients.IdiomaFacadeLocal;
import com.utec.epro.clients.InventarioFacadeLocal;
import com.utec.epro.clients.MantenimientosFacadeLocal;
import com.utec.epro.clients.MunicipioFacadeLocal;
import com.utec.epro.clients.PaisFacadeLocal;
import com.utec.epro.clients.ParentescoFacadeLocal;
import com.utec.epro.clients.PeriodosFacadeLocal;
import com.utec.epro.clients.PersonalContactosFacadeLocal;
import com.utec.epro.clients.PersonalExperienciaLaboralFacadeLocal;
import com.utec.epro.clients.PersonalHabilidadesFacadeLocal;
import com.utec.epro.clients.PersonalPersonaFacadeLocal;
import com.utec.epro.clients.PersonalProfesionFacadeLocal;
import com.utec.epro.clients.TransaccionFacadeLocal;
import com.utec.epro.entities.Bienes;
import com.utec.epro.entities.CatalogoAgencias;
import com.utec.epro.entities.CatalogoTiempo;
import com.utec.epro.entities.CatalogoTipoActivo;
import com.utec.epro.entities.Ciudad;
import com.utec.epro.entities.Civil;
import com.utec.epro.entities.Departamento;
import com.utec.epro.entities.Depreciacion;
import com.utec.epro.entities.EnrolamientoAcceso;
import com.utec.epro.entities.EnrolamientoRoles;
import com.utec.epro.entities.EnrolamientoUsuarios;
import com.utec.epro.entities.Estados;
import com.utec.epro.entities.Genero;
import com.utec.epro.entities.Idioma;
import com.utec.epro.entities.Inventario;
import com.utec.epro.entities.Mantenimientos;
import com.utec.epro.entities.Municipio;
import com.utec.epro.entities.Pais;
import com.utec.epro.entities.Parentesco;
import com.utec.epro.entities.Periodos;
import com.utec.epro.entities.PersonalContactos;
import com.utec.epro.entities.PersonalExperienciaLaboral;
import com.utec.epro.entities.PersonalHabilidades;
import com.utec.epro.entities.PersonalPersona;
import com.utec.epro.entities.PersonalProfesion;
import com.utec.epro.entities.Transaccion;
import com.utec.epro.utils.Utils;

public class GateKeeper {
	Utils utils = new Utils();
	
	@EJB
	private BienesFacadeLocal bienesFacadeLocal;    
	private Bienes selectedBienes;    
	private Bienes actualBienes = new Bienes();
	private List<Bienes> bienesListAll = new ArrayList<Bienes>();
	public void createBienes(HashMap<String, Object> incomingData) {
		actualBienes.setBienesId(Integer.parseInt((String) incomingData.get("BienesId")));
		actualBienes.setBienesCantidad(Integer.parseInt((String) incomingData.get("BienesCantidad")));
		actualBienes.setBienesCantidadLote(Integer.parseInt((String) incomingData.get("BienesCantidadLote")));
		actualBienes.setBienesCodigo(Integer.parseInt((String) incomingData.get("BienesCodigo")));
		actualBienes.setBienesCodigoAdicional(Integer.parseInt((String) incomingData.get("BienesCodigoAdicional")));
		actualBienes.setBienesDescripcion(incomingData.get("BienesDescripcion").toString());
		actualBienes.setBienesDetalle(incomingData.get("BienesDetalle").toString());
		actualBienes.setBienesEstado(Integer.parseInt((String) incomingData.get("BienesEstado")));
		actualBienes.setBienesEstadoActual(Integer.parseInt((String) incomingData.get("BienesEstadoActual")));
		actualBienes.setBienesEstadoAf(incomingData.get("BienesEstadoAf").toString());
		actualBienes.setBienesEstadoOriginal(Integer.parseInt((String) incomingData.get("BienesEstadoOriginal")));
		actualBienes.setBienesEstadoProcedencia(Integer.parseInt((String) incomingData.get("BienesEstadoProcedencia")));
		actualBienes.setBienesFamilia(incomingData.get("BienesFamilia").toString());
		actualBienes.setBienesFechaCompra((Date) incomingData.get("BienesFechaCompra"));
		actualBienes.setBienesFechaCrea(utils.fechaActual());
		actualBienes.setBienesFechaModi(utils.fechaActual());
		actualBienes.setBienesFechaVenta((Date) incomingData.get("BienesFechaVenta"));
		actualBienes.setBienesIdUsuarioCrea(incomingData.get("BienesIdUsuarioCrea").toString());
		actualBienes.setBienesIdUsuarioModi(incomingData.get("BienesIdUsuarioModi").toString());
		actualBienes.setBienesMontoCompra(Integer.parseInt((String) incomingData.get("BienesMontoCompra")));
		actualBienes.setBienesMontoVenta(Integer.parseInt((String) incomingData.get("BienesMontoVenta")));
		actualBienes.setBienesNoContrato(incomingData.get("BienesNoContrato").toString());
		actualBienes.setBienesNoFactura(incomingData.get("BienesNoFactura").toString());
		actualBienes.setBienesNoPoliza(incomingData.get("BienesNoPoliza").toString());
		actualBienes.setBienesNoRucProveed(incomingData.get("BienesNoRucProveed").toString());
		actualBienes.setBienesNoSerie(incomingData.get("BienesNoSerie").toString());
		actualBienes.setBienesRazonSocial(incomingData.get("BienesRazonSocial").toString());
		actualBienes.setBienesResponsable(Integer.parseInt((String) incomingData.get("BienesResponsable")));
		actualBienes.setBienesSubFamilia(incomingData.get("BienesSubFamilia").toString());
		actualBienes.setBienesTipoAdquisicion(Integer.parseInt((String) incomingData.get("BienesTipoAdquisicion")));
		actualBienes.setBienesUbicacionInicial(incomingData.get("BienesUbicacionInicial").toString());
		try {
			bienesFacadeLocal.create(actualBienes);
			bienesListAll.add(actualBienes);
			actualBienes = new Bienes();

		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveBienes(String query, int id) {
		switch (query) {
		case "findAll":
			bienesListAll = bienesFacadeLocal.findAll();
			break;
		case "findByBienesId":
			bienesListAll = bienesFacadeLocal.findByBienesId(id);
			break;

		default:
			break;
		}
	}
	public void updateBienes(int id, HashMap<String, Object> incomingData) {
		retrieveBienes("findByBienesId", id);
		selectedBienes = (Bienes) bienesListAll;
		selectedBienes.setBienesId(Integer.parseInt((String) incomingData.get("BienesId")));
		selectedBienes.setBienesCantidad(Integer.parseInt((String) incomingData.get("BienesCantidad")));
		selectedBienes.setBienesCantidadLote(Integer.parseInt((String) incomingData.get("BienesCantidadLote")));
		selectedBienes.setBienesCodigo(Integer.parseInt((String) incomingData.get("BienesCodigo")));
		selectedBienes.setBienesCodigoAdicional(Integer.parseInt((String) incomingData.get("BienesCodigoAdicional")));
		selectedBienes.setBienesDescripcion(incomingData.get("BienesDescripcion").toString());
		selectedBienes.setBienesDetalle(incomingData.get("BienesDetalle").toString());
		selectedBienes.setBienesEstado(Integer.parseInt((String) incomingData.get("BienesEstado")));
		selectedBienes.setBienesEstadoActual(Integer.parseInt((String) incomingData.get("BienesEstadoActual")));
		selectedBienes.setBienesEstadoAf(incomingData.get("BienesEstadoAf").toString());
		selectedBienes.setBienesEstadoOriginal(Integer.parseInt((String) incomingData.get("BienesEstadoOriginal")));
		selectedBienes.setBienesEstadoProcedencia(Integer.parseInt((String) incomingData.get("BienesEstadoProcedencia")));
		selectedBienes.setBienesFamilia(incomingData.get("BienesFamilia").toString());
		selectedBienes.setBienesFechaCompra((Date) incomingData.get("BienesFechaCompra"));
		selectedBienes.setBienesFechaCrea((Date) incomingData.get("BienesFechaCrea"));
		selectedBienes.setBienesFechaModi(utils.fechaActual());
		selectedBienes.setBienesFechaVenta((Date) incomingData.get("BienesFechaVenta"));
		selectedBienes.setBienesIdUsuarioCrea(incomingData.get("BienesIdUsuarioCrea").toString());
		selectedBienes.setBienesIdUsuarioModi(incomingData.get("BienesIdUsuarioModi").toString());
		selectedBienes.setBienesMontoCompra(Integer.parseInt((String) incomingData.get("BienesMontoCompra")));
		selectedBienes.setBienesMontoVenta(Integer.parseInt((String) incomingData.get("BienesMontoVenta")));
		selectedBienes.setBienesNoContrato(incomingData.get("BienesNoContrato").toString());
		selectedBienes.setBienesNoFactura(incomingData.get("BienesNoFactura").toString());
		selectedBienes.setBienesNoPoliza(incomingData.get("BienesNoPoliza").toString());
		selectedBienes.setBienesNoRucProveed(incomingData.get("BienesNoRucProveed").toString());
		selectedBienes.setBienesNoSerie(incomingData.get("BienesNoSerie").toString());
		selectedBienes.setBienesRazonSocial(incomingData.get("BienesRazonSocial").toString());
		selectedBienes.setBienesResponsable(Integer.parseInt((String) incomingData.get("BienesResponsable")));
		selectedBienes.setBienesSubFamilia(incomingData.get("BienesSubFamilia").toString());
		selectedBienes.setBienesTipoAdquisicion(Integer.parseInt((String) incomingData.get("BienesTipoAdquisicion")));
		selectedBienes.setBienesUbicacionInicial(incomingData.get("BienesUbicacionInicial").toString());
		bienesFacadeLocal.modify(selectedBienes);
		selectedBienes = new Bienes();
		bienesListAll = bienesFacadeLocal.findAll();
	}

	@EJB
	private CatalogoAgenciasFacadeLocal catalogoAgenciasFacadeLocal;
	private CatalogoAgencias selectedCatalogoAgencias;
	private CatalogoAgencias actualCatalogoAgencias = new CatalogoAgencias();
	private List<CatalogoAgencias> catalogoAgenciasListAll = new ArrayList<CatalogoAgencias>();
	public void createCatalogoAgencias(HashMap<String, Object> incomingData) {
		actualCatalogoAgencias.setAgenciasId(Integer.parseInt((String) incomingData.get("AgenciasId")));
		actualCatalogoAgencias.setAgenciaEstado(Integer.parseInt((String) incomingData.get("AgenciaEstado")));
		actualCatalogoAgencias.setAgenciaFechaCrea(utils.fechaActual());
		actualCatalogoAgencias.setAgenciaFechaModi(utils.fechaActual());
		actualCatalogoAgencias.setAgenciaIdUsuarioCrea(incomingData.get("AgenciaIdUsuarioCrea").toString());
		actualCatalogoAgencias.setAgenciaIdUsuarioModi(incomingData.get("AgenciaIdUsuarioModi").toString());
		actualCatalogoAgencias.setAgenciaUsuarioId(Integer.parseInt((String) incomingData.get("AgenciaUsuarioId")));
		actualCatalogoAgencias.setAgenciasDescripcion(incomingData.get("AgenciasDescripcion").toString());
		actualCatalogoAgencias.setAgenciasDireccion(incomingData.get("AgenciasDireccion").toString());
		actualCatalogoAgencias.setAgenciasNombre(incomingData.get("AgenciasNombre").toString());
		try {
			catalogoAgenciasFacadeLocal.create(actualCatalogoAgencias);
			catalogoAgenciasListAll.add(actualCatalogoAgencias);
			actualCatalogoAgencias = new CatalogoAgencias();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveCatalogoAgencias(String query) {
		switch (query) {
		case "findAll":
			catalogoAgenciasListAll = catalogoAgenciasFacadeLocal.findAll();
			break;
		case "findByAgenciasId":
			catalogoAgenciasListAll = catalogoAgenciasFacadeLocal.findByAgenciasId(actualCatalogoAgencias.getAgenciasId());
			break;

		default:
			break;
		}
	}
	public void updateCatalogoAgencias(HashMap<String, Object> incomingData) {
		selectedCatalogoAgencias.setAgenciasId(Integer.parseInt((String) incomingData.get("AgenciasId")));
		selectedCatalogoAgencias.setAgenciaEstado(Integer.parseInt((String) incomingData.get("AgenciaEstado")));
		selectedCatalogoAgencias.setAgenciaFechaCrea((Date) incomingData.get("AgenciaFechaCrea"));
		selectedCatalogoAgencias.setAgenciaFechaModi(utils.fechaActual());
		selectedCatalogoAgencias.setAgenciaIdUsuarioCrea(incomingData.get("AgenciaIdUsuarioCrea").toString());
		selectedCatalogoAgencias.setAgenciaIdUsuarioModi(incomingData.get("AgenciaIdUsuarioModi").toString());
		selectedCatalogoAgencias.setAgenciaUsuarioId(Integer.parseInt((String) incomingData.get("AgenciaUsuarioId")));
		selectedCatalogoAgencias.setAgenciasDescripcion(incomingData.get("AgenciasDescripcion").toString());
		selectedCatalogoAgencias.setAgenciasDireccion(incomingData.get("AgenciasDireccion").toString());
		selectedCatalogoAgencias.setAgenciasNombre(incomingData.get("AgenciasNombre").toString());
		catalogoAgenciasFacadeLocal.modify(selectedCatalogoAgencias);
		selectedCatalogoAgencias = new CatalogoAgencias();
		catalogoAgenciasListAll = catalogoAgenciasFacadeLocal.findAll();
	}

	@EJB
	private CatalogoTiempoFacadeLocal catalogoTiempoFacadeLocal;
	private CatalogoTiempo selectedCatalogoTiempo;
	private CatalogoTiempo actualCatalogoTiempo = new CatalogoTiempo();
	private List<CatalogoTiempo> catalogoTiempoListAll = new ArrayList<CatalogoTiempo>();
	public void createCatalogoTiempo(HashMap<String, Object> incomingData) {
		actualCatalogoTiempo.setTiempoId(Integer.parseInt((String) incomingData.get("TiempoId")));
		actualCatalogoTiempo.setTiempoDescripcion(incomingData.get("TiempoDescripcion").toString());
		actualCatalogoTiempo.setTiempoEstado(Integer.parseInt((String) incomingData.get("TiempoEstado")));
		actualCatalogoTiempo.setTiempoFechaCrea(utils.fechaActual());
		actualCatalogoTiempo.setTiempoFechaModi(utils.fechaActual());
		actualCatalogoTiempo.setTiempoIdUsuarioCrea(incomingData.get("TiempoIdUsuarioCrea").toString());
		actualCatalogoTiempo.setTiempoIdUsuarioModi(incomingData.get("TiempoIdUsuarioModi").toString());
		actualCatalogoTiempo.setTiempoMagnitud(incomingData.get("TiempoMagnitud").toString());
		actualCatalogoTiempo.setTiempoNombre(incomingData.get("TiempoNombre").toString());
		try {
			catalogoTiempoFacadeLocal.create(actualCatalogoTiempo);
			catalogoTiempoListAll.add(actualCatalogoTiempo);
			actualCatalogoTiempo = new CatalogoTiempo();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveCatalogoTiempo(String query) {
		switch (query) {
		case "findAll":
			catalogoTiempoListAll = catalogoTiempoFacadeLocal.findAll();
			break;
		case "findByTiempoId":
			catalogoTiempoListAll = catalogoTiempoFacadeLocal.findByTiempoId(actualCatalogoTiempo.getTiempoId());
			break;

		default:
			break;
		}
	}
	public void updateCatalogoTiempo(HashMap<String, Object> incomingData) {
		selectedCatalogoTiempo.setTiempoId(Integer.parseInt((String) incomingData.get("TiempoId")));
		selectedCatalogoTiempo.setTiempoDescripcion(incomingData.get("TiempoDescripcion").toString());
		selectedCatalogoTiempo.setTiempoEstado(Integer.parseInt((String) incomingData.get("TiempoEstado")));
		selectedCatalogoTiempo.setTiempoFechaCrea((Date) incomingData.get("TiempoFechaCrea"));
		selectedCatalogoTiempo.setTiempoFechaModi(utils.fechaActual());
		selectedCatalogoTiempo.setTiempoIdUsuarioCrea(incomingData.get("TiempoIdUsuarioCrea").toString());
		selectedCatalogoTiempo.setTiempoIdUsuarioModi(incomingData.get("TiempoIdUsuarioModi").toString());
		selectedCatalogoTiempo.setTiempoMagnitud(incomingData.get("TiempoMagnitud").toString());
		selectedCatalogoTiempo.setTiempoNombre(incomingData.get("TiempoNombre").toString());
		catalogoTiempoFacadeLocal.modify(selectedCatalogoTiempo);
		selectedCatalogoTiempo = new CatalogoTiempo();
		catalogoTiempoListAll = catalogoTiempoFacadeLocal.findAll();
	}
	
	@EJB
	private CatalogoTipoActivoFacadeLocal catalogoTipoActivoFacadeLocal;
	private CatalogoTipoActivo selectedCatalogoTipoActivo;
	private CatalogoTipoActivo actualCatalogoTipoActivo = new CatalogoTipoActivo();
	private List<CatalogoTipoActivo> catalogoTipoActivoListAll = new ArrayList<CatalogoTipoActivo>();
	public void createCatalogoTipoActivo(HashMap<String, Object> incomingData) {
		actualCatalogoTipoActivo.setTipoActivoId(Integer.parseInt((String) incomingData.get("TipoActivoId")));
		actualCatalogoTipoActivo.setTipoActivoCantidadTiempo(Integer.parseInt((String) incomingData.get("TipoActivoCantidadTiempo")));
		actualCatalogoTipoActivo.setTipoActivoCategoria(Integer.parseInt((String) incomingData.get("TipoActivoCategoria")));
		actualCatalogoTipoActivo.setTipoActivoCategoriaOrigen(Integer.parseInt((String) incomingData.get("TipoActivoCategoriaOrigen")));
		actualCatalogoTipoActivo.setTipoActivoDescripcion(incomingData.get("TipoActivoDescripcion").toString());
		actualCatalogoTipoActivo.setTipoActivoEstado(Integer.parseInt((String) incomingData.get("TipoActivoEstado")));
		actualCatalogoTipoActivo.setTipoActivoFechaCrea(utils.fechaActual());
		actualCatalogoTipoActivo.setTipoActivoFechaModi(utils.fechaActual());
		actualCatalogoTipoActivo.setTipoActivoIdUsuarioCrea(incomingData.get("TipoActivoIdUsuarioCrea").toString());
		actualCatalogoTipoActivo.setTipoActivoIdUsuarioModi(incomingData.get("TipoActivoIdUsuarioModi").toString());
		actualCatalogoTipoActivo.setTipoActivoNombre(incomingData.get("TipoActivoNombre").toString());
		actualCatalogoTipoActivo.setTipoActivoPorcentaje(Integer.parseInt((String) incomingData.get("TipoActivoPorcentaje")));
		actualCatalogoTipoActivo.setTipoActivoTiempoId(Integer.parseInt((String) incomingData.get("TipoActivoTiempoId")));
		try {
			catalogoTipoActivoFacadeLocal.create(actualCatalogoTipoActivo);
			catalogoTipoActivoListAll.add(actualCatalogoTipoActivo);
			actualCatalogoTipoActivo = new CatalogoTipoActivo();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveCatalogoTipoActivo(String query) {
		switch (query) {
		case "findAll":
			catalogoTipoActivoListAll = catalogoTipoActivoFacadeLocal.findAll();
			break;
		case "findByTipoActivoId":
			catalogoTipoActivoListAll = catalogoTipoActivoFacadeLocal.findByTipoActivoId(actualCatalogoTipoActivo.getTipoActivoId());
			break;

		default:
			break;
		}
	}
	public void updateCatalogoTipoActivo(HashMap<String, Object> incomingData) {
		selectedCatalogoTipoActivo.setTipoActivoId(Integer.parseInt((String) incomingData.get("TipoActivoId")));
		selectedCatalogoTipoActivo.setTipoActivoCantidadTiempo(Integer.parseInt((String) incomingData.get("TipoActivoCantidadTiempo")));
		selectedCatalogoTipoActivo.setTipoActivoCategoria(Integer.parseInt((String) incomingData.get("TipoActivoCategoria")));
		selectedCatalogoTipoActivo.setTipoActivoCategoriaOrigen(Integer.parseInt((String) incomingData.get("TipoActivoCategoriaOrigen")));
		selectedCatalogoTipoActivo.setTipoActivoDescripcion(incomingData.get("TipoActivoDescripcion").toString());
		selectedCatalogoTipoActivo.setTipoActivoEstado(Integer.parseInt((String) incomingData.get("TipoActivoEstado")));
		selectedCatalogoTipoActivo.setTipoActivoFechaCrea((Date) incomingData.get("TipoActivoFechaCrea"));
		selectedCatalogoTipoActivo.setTipoActivoFechaModi(utils.fechaActual());
		selectedCatalogoTipoActivo.setTipoActivoIdUsuarioCrea(incomingData.get("TipoActivoIdUsuarioCrea").toString());
		selectedCatalogoTipoActivo.setTipoActivoIdUsuarioModi(incomingData.get("TipoActivoIdUsuarioModi").toString());
		selectedCatalogoTipoActivo.setTipoActivoNombre(incomingData.get("TipoActivoNombre").toString());
		selectedCatalogoTipoActivo.setTipoActivoPorcentaje(Integer.parseInt((String) incomingData.get("TipoActivoPorcentaje")));
		selectedCatalogoTipoActivo.setTipoActivoTiempoId(Integer.parseInt((String) incomingData.get("TipoActivoTiempoId")));
		catalogoTipoActivoFacadeLocal.modify(selectedCatalogoTipoActivo);
		selectedCatalogoTipoActivo = new CatalogoTipoActivo();
		catalogoTipoActivoListAll = catalogoTipoActivoFacadeLocal.findAll();
	}

	@EJB
	private CiudadFacadeLocal ciudadFacadeLocal;
	private Ciudad selectedCiudad;
	private Ciudad actualCiudad = new Ciudad();
	private List<Ciudad> ciudadListAll = new ArrayList<Ciudad>();
	public void createCiudad(HashMap<String, Object> incomingData) {
		actualCiudad.setCiudadId(Integer.parseInt((String) incomingData.get("CiudadId")));
		actualCiudad.setCiudadEstado(Integer.parseInt((String) incomingData.get("CiudadEstado")));
		actualCiudad.setCiudadFechaCrea(utils.fechaActual());
		actualCiudad.setCiudadFechaModifica(utils.fechaActual());
		actualCiudad.setCiudadNombre(incomingData.get("CiudadNombre").toString());
		actualCiudad.setCiudadUsuarioCrea(Integer.parseInt((String) incomingData.get("CiudadUsuarioCrea")));
		actualCiudad.setCiudadUsuarioModifica(Integer.parseInt((String) incomingData.get("UsuarioModifica")));
		try {
			ciudadFacadeLocal.create(actualCiudad);
			ciudadListAll.add(actualCiudad);
			actualCiudad = new Ciudad();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveCiudad(String query) {
		switch (query) {
		case "findAll":
			ciudadListAll = ciudadFacadeLocal.findAll();
			break;
		case "findByCiudadId":
			ciudadListAll = ciudadFacadeLocal.findByCiudadId(actualCiudad.getCiudadId());
			break;

		default:
			break;
		}
	}
	public void updateCiudad(HashMap<String, Object> incomingData) {
		selectedCiudad.setCiudadId(Integer.parseInt((String) incomingData.get("CiudadId")));
		selectedCiudad.setCiudadEstado(Integer.parseInt((String) incomingData.get("CiudadEstado")));
		selectedCiudad.setCiudadFechaCrea((Date) incomingData.get("CiudadFechaCrea"));
		selectedCiudad.setCiudadFechaModifica(utils.fechaActual());
		selectedCiudad.setCiudadNombre(incomingData.get("CiudadNombre").toString());
		selectedCiudad.setCiudadUsuarioCrea(Integer.parseInt((String) incomingData.get("CiudadUsuarioCrea")));
		selectedCiudad.setCiudadUsuarioModifica(Integer.parseInt((String) incomingData.get("UsuarioModifica")));
		ciudadFacadeLocal.modify(selectedCiudad);
		selectedCiudad = new Ciudad();
		ciudadListAll = ciudadFacadeLocal.findAll();
	}

	@EJB
	private CivilFacadeLocal civilFacadeLocal;
	private Civil selectedCivil;
	private Civil actualCivil = new Civil();
	private List<Civil> civilListAll = new ArrayList<Civil>();
	public void createCivil(HashMap<String, Object> incomingData) {
		actualCivil.setEstadoCivilId(Integer.parseInt((String) incomingData.get("EstadoCivilId")));
		actualCivil.setEstadoCivilEstado(Integer.parseInt((String) incomingData.get("EstadoCivilEstado")));
		actualCivil.setEstadoCivilFechaCrea(utils.fechaActual());
		actualCivil.setEstadoCivilFechaModifica(utils.fechaActual());
		actualCivil.setEstadoCivilNombre(incomingData.get("EstadoCivilNombre").toString());
		actualCivil.setEstadoCivilUsuarioCrea(Integer.parseInt((String) incomingData.get("EstadoCivilUsuarioCrea")));
		actualCivil.setEstadoCivilUsuarioModifica(Integer.parseInt((String) incomingData.get("EstadoCivilUsuarioModifica")));
		try {
			civilFacadeLocal.create(actualCivil);
			civilListAll.add(actualCivil);
			actualCivil = new Civil();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveCivil(String query) {
		switch (query) {
		case "findAll":
			civilListAll = civilFacadeLocal.findAll();
			break;
		case "findByEstadoCivilId":
			civilListAll = civilFacadeLocal.findByEstadoCivilId(actualCivil.getEstadoCivilId());
			break;

		default:
			break;
		}
	}
	public void updateCivil(HashMap<String, Object> incomingData) {
		selectedCivil.setEstadoCivilId(Integer.parseInt((String) incomingData.get("EstadoCivilId")));
		selectedCivil.setEstadoCivilEstado(Integer.parseInt((String) incomingData.get("EstadoCivilEstado")));
		selectedCivil.setEstadoCivilFechaCrea((Date) incomingData.get("EstadoCivilFechaCrea"));
		selectedCivil.setEstadoCivilFechaModifica(utils.fechaActual());
		selectedCivil.setEstadoCivilNombre(incomingData.get("EstadoCivilNombre").toString());
		selectedCivil.setEstadoCivilUsuarioCrea(Integer.parseInt((String) incomingData.get("EstadoCivilUsuarioCrea")));
		selectedCivil.setEstadoCivilUsuarioModifica(Integer.parseInt((String) incomingData.get("EstadoCivilUsuarioModifica")));
		civilFacadeLocal.modify(selectedCivil);
		selectedCivil = new Civil();
		civilListAll = civilFacadeLocal.findAll();
	}

	@EJB
	private DepartamentoFacadeLocal departamentoFacadeLocal;
	private Departamento selectedDepartamento;
	private Departamento actualDepartamento = new Departamento();
	private List<Departamento> departamentoListAll = new ArrayList<Departamento>();
	public void createDepartamento(HashMap<String, Object> incomingData) {
		actualDepartamento.setDepartamentoId(Integer.parseInt((String) incomingData.get("DepartamentoId")));
		actualDepartamento.setDepartamentoEstado(Integer.parseInt((String) incomingData.get("DepartamentoEstado")));
		actualDepartamento.setDepartamentoFechaCrea(utils.fechaActual());
		actualDepartamento.setDepartamentoFechaModifica(utils.fechaActual());
		actualDepartamento.setDepartamentoNombre(incomingData.get("DepartamentoNombre").toString());
		actualDepartamento.setDepartamentoUsuarioCrea(Integer.parseInt((String) incomingData.get("DepartamentoUsuarioCrea")));
		actualDepartamento.setDepartamentoUsuarioModifica(Integer.parseInt((String) incomingData.get("DepartamentoUsuarioModifica")));
		try {
			departamentoFacadeLocal.create(actualDepartamento);
			departamentoListAll.add(actualDepartamento);
			actualDepartamento = new Departamento();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveDepartamento(String query) {
		switch (query) {
		case "findAll":
			departamentoListAll = departamentoFacadeLocal.findAll();
			break;
		case "findByDepartamentoId":
			departamentoListAll = departamentoFacadeLocal.findByDepartamentoId(actualDepartamento.getDepartamentoId());
			break;
	
		default:
			break;
		}
	}
	public void updateDepartamento(HashMap<String, Object> incomingData) {
		selectedDepartamento.setDepartamentoId(Integer.parseInt((String) incomingData.get("DepartamentoId")));
		selectedDepartamento.setDepartamentoEstado(Integer.parseInt((String) incomingData.get("DepartamentoEstado")));
		selectedDepartamento.setDepartamentoFechaCrea((Date) incomingData.get("DepartamentoFechaCrea"));
		selectedDepartamento.setDepartamentoFechaModifica(utils.fechaActual());
		selectedDepartamento.setDepartamentoNombre(incomingData.get("DepartamentoNombre").toString());
		selectedDepartamento.setDepartamentoUsuarioCrea(Integer.parseInt((String) incomingData.get("DepartamentoUsuarioCrea")));
		selectedDepartamento.setDepartamentoUsuarioModifica(Integer.parseInt((String) incomingData.get("DepartamentoUsuarioModifica")));
		departamentoFacadeLocal.modify(selectedDepartamento);
		selectedDepartamento = new Departamento();
		departamentoListAll = departamentoFacadeLocal.findAll();
	}

	@EJB
	private DepreciacionFacadeLocal depreciacionFacadeLocal;
	private Depreciacion selectedDepreciacion;
	private Depreciacion actualDepreciacion = new Depreciacion();
	private List<Depreciacion> depreciacionListAll = new ArrayList<Depreciacion>();
	public void createDepreciacion(HashMap<String, Object> incomingData) {
		actualDepreciacion.setDepreciacionId(Integer.parseInt((String) incomingData.get("DepreciacionId")));
		actualDepreciacion.setDepreciacionControl(Integer.parseInt((String) incomingData.get("DepreciacionControl")));
		actualDepreciacion.setDepreciacionCorrelativo(Integer.parseInt((String) incomingData.get("DepreciacionCorrelativo")));
		actualDepreciacion.setDepreciacionEstado(Integer.parseInt((String) incomingData.get("DepreciacionEstado")));
		actualDepreciacion.setDepreciacionFechaCrea(utils.fechaActual());
		actualDepreciacion.setDepreciacionFechaFin((Date) incomingData.get("DepreciacionFechaFin"));
		actualDepreciacion.setDepreciacionFechaInicio((Date) incomingData.get("DepreciacionFechaInicio"));
		actualDepreciacion.setDepreciacionFechaModi(utils.fechaActual());
		actualDepreciacion.setDepreciacionIdUsuarioCrea(incomingData.get("DepreciacionIdUsuarioCrea").toString());
		actualDepreciacion.setDepreciacionIdUsuarioModi(incomingData.get("DepreciacionIdUsuarioModi").toString());
		actualDepreciacion.setDepreciacionMontoDepreciado(Integer.parseInt((String) incomingData.get("DepreciacionMontoDepreciado")));
		actualDepreciacion.setDepreciacionMontoInicial(Integer.parseInt((String) incomingData.get("DepreciacionMontoInicial")));
		actualDepreciacion.setDepreciacionMontoRestante(Integer.parseInt((String) incomingData.get("DepreciacionMontoRestante")));
		try {
			depreciacionFacadeLocal.create(actualDepreciacion);
			depreciacionListAll.add(actualDepreciacion);
			actualDepreciacion = new Depreciacion();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveDepreciacion(String query) {
		switch (query) {
		case "findAll":
			depreciacionListAll = depreciacionFacadeLocal.findAll();
			break;
		case "findByDepreciacionId":
			depreciacionListAll = depreciacionFacadeLocal.findByDepreciacionId(actualDepreciacion.getDepreciacionId());
			break;
	
		default:
			break;
		}
	}
	public void updateDepreciacion(HashMap<String, Object> incomingData) {
		selectedDepreciacion.setDepreciacionId(Integer.parseInt((String) incomingData.get("DepreciacionId")));
		selectedDepreciacion.setDepreciacionControl(Integer.parseInt((String) incomingData.get("DepreciacionControl")));
		selectedDepreciacion.setDepreciacionCorrelativo(Integer.parseInt((String) incomingData.get("DepreciacionCorrelativo")));
		selectedDepreciacion.setDepreciacionEstado(Integer.parseInt((String) incomingData.get("DepreciacionEstado")));
		selectedDepreciacion.setDepreciacionFechaCrea((Date) incomingData.get("DepreciacionFechaCrea"));
		selectedDepreciacion.setDepreciacionFechaFin((Date) incomingData.get("DepreciacionFechaFin"));
		selectedDepreciacion.setDepreciacionFechaInicio((Date) incomingData.get("DepreciacionFechaInicio"));
		selectedDepreciacion.setDepreciacionFechaModi(utils.fechaActual());
		selectedDepreciacion.setDepreciacionIdUsuarioCrea(incomingData.get("DepreciacionIdUsuarioCrea").toString());
		selectedDepreciacion.setDepreciacionIdUsuarioModi(incomingData.get("DepreciacionIdUsuarioModi").toString());
		selectedDepreciacion.setDepreciacionMontoDepreciado(Integer.parseInt((String) incomingData.get("DepreciacionMontoDepreciado")));
		selectedDepreciacion.setDepreciacionMontoInicial(Integer.parseInt((String) incomingData.get("DepreciacionMontoInicial")));
		selectedDepreciacion.setDepreciacionMontoRestante(Integer.parseInt((String) incomingData.get("DepreciacionMontoRestante")));
		depreciacionFacadeLocal.modify(selectedDepreciacion);
		selectedDepreciacion = new Depreciacion();
		depreciacionListAll = depreciacionFacadeLocal.findAll();
	}

	@EJB
	private EnrolamientoAccesoFacadeLocal enrolamientoAccesoFacadeLocal;
	private EnrolamientoAcceso selectedEnrolamientoAcceso;
	private EnrolamientoAcceso actualEnrolamientoAcceso = new EnrolamientoAcceso();
	private List<EnrolamientoAcceso> enrolamientoAccesoListAll = new ArrayList<EnrolamientoAcceso>();
	public void createEnrolamientoAcceso(HashMap<String, Object> incomingData) {
		actualEnrolamientoAcceso.setAccesosId(Integer.parseInt((String) incomingData.get("AccesosId")));
		actualEnrolamientoAcceso.setAccesosDescripcion(Integer.parseInt((String) incomingData.get("AccesosDescripcion")));
		actualEnrolamientoAcceso.setAccesosEstado(Integer.parseInt((String) incomingData.get("AccesosEstado")));
		actualEnrolamientoAcceso.setAccesosFechaCrea(utils.fechaActual());
		actualEnrolamientoAcceso.setAccesosFechaModi(utils.fechaActual());
		actualEnrolamientoAcceso.setAccesosIdUsuarioCrea(incomingData.get("AccesosIdUsuarioCrea").toString());
		actualEnrolamientoAcceso.setAccesosIdUsuarioModi(incomingData.get("AccesosIdUsuarioModi").toString());
		actualEnrolamientoAcceso.setAccesosNivel0(Integer.parseInt((String) incomingData.get("AccesosNivel0")));
		actualEnrolamientoAcceso.setAccesosNivel1(Integer.parseInt((String) incomingData.get("AccesosNivel1")));
		actualEnrolamientoAcceso.setAccesosNivel2(Integer.parseInt((String) incomingData.get("AccesosNivel2")));
		actualEnrolamientoAcceso.setAccesosNivel3(Integer.parseInt((String) incomingData.get("AccesosNivel3")));
		actualEnrolamientoAcceso.setAccesosNivel4(Integer.parseInt((String) incomingData.get("AccesosNivel4")));
		actualEnrolamientoAcceso.setAccesosNombre(Integer.parseInt((String) incomingData.get("AccesosNombre")));
		try {
			enrolamientoAccesoFacadeLocal.create(actualEnrolamientoAcceso);
			enrolamientoAccesoListAll.add(actualEnrolamientoAcceso);
			actualEnrolamientoAcceso = new EnrolamientoAcceso();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveEnrolamientoAcceso(String query) {
		switch (query) {
		case "findAll":
			enrolamientoAccesoListAll = enrolamientoAccesoFacadeLocal.findAll();
			break;
		case "findByAccesosId":
			enrolamientoAccesoListAll = enrolamientoAccesoFacadeLocal.findByAccesosId(actualEnrolamientoAcceso.getAccesosId());
			break;
	
		default:
			break;
		}
	}
	public void updateEnrolamientoAcceso(HashMap<String, Object> incomingData) {
		selectedEnrolamientoAcceso.setAccesosId(Integer.parseInt((String) incomingData.get("AccesosId")));
		selectedEnrolamientoAcceso.setAccesosDescripcion(Integer.parseInt((String) incomingData.get("AccesosDescripcion")));
		selectedEnrolamientoAcceso.setAccesosEstado(Integer.parseInt((String) incomingData.get("AccesosEstado")));
		selectedEnrolamientoAcceso.setAccesosFechaCrea((Date) incomingData.get("AccesosFechaCrea"));
		selectedEnrolamientoAcceso.setAccesosFechaModi(utils.fechaActual());
		selectedEnrolamientoAcceso.setAccesosIdUsuarioCrea(incomingData.get("AccesosIdUsuarioCrea").toString());
		selectedEnrolamientoAcceso.setAccesosIdUsuarioModi(incomingData.get("AccesosIdUsuarioModi").toString());
		selectedEnrolamientoAcceso.setAccesosNivel0(Integer.parseInt((String) incomingData.get("AccesosNivel0")));
		selectedEnrolamientoAcceso.setAccesosNivel1(Integer.parseInt((String) incomingData.get("AccesosNivel1")));
		selectedEnrolamientoAcceso.setAccesosNivel2(Integer.parseInt((String) incomingData.get("AccesosNivel2")));
		selectedEnrolamientoAcceso.setAccesosNivel3(Integer.parseInt((String) incomingData.get("AccesosNivel3")));
		selectedEnrolamientoAcceso.setAccesosNivel4(Integer.parseInt((String) incomingData.get("AccesosNivel4")));
		selectedEnrolamientoAcceso.setAccesosNombre(Integer.parseInt((String) incomingData.get("AccesosNombre")));
		enrolamientoAccesoFacadeLocal.modify(selectedEnrolamientoAcceso);
		selectedEnrolamientoAcceso = new EnrolamientoAcceso();
		enrolamientoAccesoListAll = enrolamientoAccesoFacadeLocal.findAll();
	}

	@EJB
	private EnrolamientoRolesFacadeLocal enrolamientoRolesFacadeLocal;
	private EnrolamientoRoles selectedEnrolamientoRoles;
	private EnrolamientoRoles actualEnrolamientoRoles = new EnrolamientoRoles();
	private List<EnrolamientoRoles> enrolamientoRolesListAll = new ArrayList<EnrolamientoRoles>();
	public void createEnrolamientoRoles(HashMap<String, Object> incomingData) {
		actualEnrolamientoRoles.setRolesId(Integer.parseInt((String) incomingData.get("RolesId")));
		actualEnrolamientoRoles.setRolesDescripcion(Integer.parseInt((String) incomingData.get("RolesDescripcion")));
		actualEnrolamientoRoles.setRolesEstado(Integer.parseInt((String) incomingData.get("RolesEstado")));
		actualEnrolamientoRoles.setRolesFechaCrea(utils.fechaActual());
		actualEnrolamientoRoles.setRolesFechaModi(utils.fechaActual());
		actualEnrolamientoRoles.setRolesIdUsuarioCrea(incomingData.get("RolesIdUsuarioCrea").toString());
		actualEnrolamientoRoles.setRolesIdUsuarioModi(incomingData.get("RolesIdUsuarioModi").toString());
		actualEnrolamientoRoles.setRolesLlave0(Integer.parseInt((String) incomingData.get("RolesLlave0")));
		actualEnrolamientoRoles.setRolesLlave1(incomingData.get("RolesLlave1").toString());
		actualEnrolamientoRoles.setRolesNivel0(Integer.parseInt((String) incomingData.get("RolesNivel0")));
		actualEnrolamientoRoles.setRolesNivel1(Integer.parseInt((String) incomingData.get("RolesNivel1")));
		actualEnrolamientoRoles.setRolesNivel2(Integer.parseInt((String) incomingData.get("RolesNivel2")));
		actualEnrolamientoRoles.setRolesNivel3(Integer.parseInt((String) incomingData.get("RolesNivel3")));
		actualEnrolamientoRoles.setRolesNivel4(Integer.parseInt((String) incomingData.get("RolesNivel4")));
		actualEnrolamientoRoles.setRolesNombre(Integer.parseInt((String) incomingData.get("RolesNombre")));
		try {
			enrolamientoRolesFacadeLocal.create(actualEnrolamientoRoles);
			enrolamientoRolesListAll.add(actualEnrolamientoRoles);
			actualEnrolamientoRoles = new EnrolamientoRoles();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveEnrolamientoRoles(String query) {
		switch (query) {
		case "findAll":
			enrolamientoRolesListAll = enrolamientoRolesFacadeLocal.findAll();
			break;
		case "findByRolesId":
			enrolamientoRolesListAll = enrolamientoRolesFacadeLocal.findByRolesId(actualEnrolamientoRoles.getRolesId());
			break;
	
		default:
			break;
		}
	}
	public void updateEnrolamientoRoles(HashMap<String, Object> incomingData) {
		selectedEnrolamientoRoles.setRolesId(Integer.parseInt((String) incomingData.get("RolesId")));
		selectedEnrolamientoRoles.setRolesDescripcion(Integer.parseInt((String) incomingData.get("RolesDescripcion")));
		selectedEnrolamientoRoles.setRolesEstado(Integer.parseInt((String) incomingData.get("RolesEstado")));
		selectedEnrolamientoRoles.setRolesFechaCrea((Date) incomingData.get("RolesFechaCrea"));
		selectedEnrolamientoRoles.setRolesFechaModi(utils.fechaActual());
		selectedEnrolamientoRoles.setRolesIdUsuarioCrea(incomingData.get("RolesIdUsuarioCrea").toString());
		selectedEnrolamientoRoles.setRolesIdUsuarioModi(incomingData.get("RolesIdUsuarioModi").toString());
		selectedEnrolamientoRoles.setRolesLlave0(Integer.parseInt((String) incomingData.get("RolesLlave0")));
		selectedEnrolamientoRoles.setRolesLlave1(incomingData.get("RolesLlave1").toString());
		selectedEnrolamientoRoles.setRolesNivel0(Integer.parseInt((String) incomingData.get("RolesNivel0")));
		selectedEnrolamientoRoles.setRolesNivel1(Integer.parseInt((String) incomingData.get("RolesNivel1")));
		selectedEnrolamientoRoles.setRolesNivel2(Integer.parseInt((String) incomingData.get("RolesNivel2")));
		selectedEnrolamientoRoles.setRolesNivel3(Integer.parseInt((String) incomingData.get("RolesNivel3")));
		selectedEnrolamientoRoles.setRolesNivel4(Integer.parseInt((String) incomingData.get("RolesNivel4")));
		selectedEnrolamientoRoles.setRolesNombre(Integer.parseInt((String) incomingData.get("RolesNombre")));
		enrolamientoRolesFacadeLocal.modify(selectedEnrolamientoRoles);
		selectedEnrolamientoRoles = new EnrolamientoRoles();
		enrolamientoRolesListAll = enrolamientoRolesFacadeLocal.findAll();
	}

	@EJB
	private EnrolamientoUsuariosFacadeLocal enrolamientoUsuariosFacadeLocal;
	private EnrolamientoUsuarios selectedEnrolamientoUsuarios;
	private EnrolamientoUsuarios actualEnrolamientoUsuarios = new EnrolamientoUsuarios();
	private List<EnrolamientoUsuarios> enrolamientoUsuariosListAll = new ArrayList<EnrolamientoUsuarios>();
	public void createEnrolamientoUsuarios(HashMap<String, Object> incomingData) {
		actualEnrolamientoUsuarios.setUsuarioId(Integer.parseInt((String) incomingData.get("UsuarioId")));
		actualEnrolamientoUsuarios.setUsuariosDescripcion(incomingData.get("UsuariosDescripcion").toString());
		actualEnrolamientoUsuarios.setUsuariosEstado(Integer.parseInt((String) incomingData.get("UsuariosEstado")));
		actualEnrolamientoUsuarios.setUsuariosFechaCrea(utils.fechaActual());
		actualEnrolamientoUsuarios.setUsuariosFechaModi(utils.fechaActual());
		actualEnrolamientoUsuarios.setUsuariosIdUsuarioCrea(incomingData.get("UsuariosIdUsuarioCrea").toString());
		actualEnrolamientoUsuarios.setUsuariosIdUsuarioModi(incomingData.get("UsuariosIdUsuarioModi").toString());
		actualEnrolamientoUsuarios.setUsuariosTipo(Integer.parseInt((String) incomingData.get("UsuariosTipo")));
		try {
			enrolamientoUsuariosFacadeLocal.create(actualEnrolamientoUsuarios);
			enrolamientoUsuariosListAll.add(actualEnrolamientoUsuarios);
			actualEnrolamientoUsuarios = new EnrolamientoUsuarios();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveEnrolamientoUsuarios(String query) {
		switch (query) {
		case "findAll":
			enrolamientoUsuariosListAll = enrolamientoUsuariosFacadeLocal.findAll();
			break;
		case "findByUsuarioId":
			enrolamientoUsuariosListAll = enrolamientoUsuariosFacadeLocal.findByUsuarioId(actualEnrolamientoUsuarios.getUsuarioId());
			break;
	
		default:
			break;
		}
	}
	public void updateEnrolamientoUsuarios(HashMap<String, Object> incomingData) {
		selectedEnrolamientoUsuarios.setUsuarioId(Integer.parseInt((String) incomingData.get("UsuarioId")));
		selectedEnrolamientoUsuarios.setUsuariosDescripcion(incomingData.get("UsuariosDescripcion").toString());
		selectedEnrolamientoUsuarios.setUsuariosEstado(Integer.parseInt((String) incomingData.get("UsuariosEstado")));
		selectedEnrolamientoUsuarios.setUsuariosFechaCrea((Date) incomingData.get("UsuariosFechaCrea"));
		selectedEnrolamientoUsuarios.setUsuariosFechaModi(utils.fechaActual());
		selectedEnrolamientoUsuarios.setUsuariosIdUsuarioCrea(incomingData.get("UsuariosIdUsuarioCrea").toString());
		selectedEnrolamientoUsuarios.setUsuariosIdUsuarioModi(incomingData.get("UsuariosIdUsuarioModi").toString());
		selectedEnrolamientoUsuarios.setUsuariosTipo(Integer.parseInt((String) incomingData.get("UsuariosTipo")));
		enrolamientoUsuariosFacadeLocal.modify(selectedEnrolamientoUsuarios);
		selectedEnrolamientoUsuarios = new EnrolamientoUsuarios();
		enrolamientoUsuariosListAll = enrolamientoUsuariosFacadeLocal.findAll();
	}

	@EJB
	private EstadosFacadeLocal estadosFacadeLocal;
	private Estados selectedEstados;
	private Estados actualEstados = new Estados();
	private List<Estados> estadosListAll = new ArrayList<Estados>();
	public void createEstados(HashMap<String, Object> incomingData) {
		actualEstados.setEstadoId(Integer.parseInt((String) incomingData.get("EstadoId")));
		actualEstados.setDescripcionEstado(incomingData.get("DescripcionEstado").toString());
		actualEstados.setEstadosEstado(Integer.parseInt((String) incomingData.get("EstadosEstado")));
		actualEstados.setEstadosFechaCrea(utils.fechaActual());
		actualEstados.setEstadosFechaModi(utils.fechaActual());
		actualEstados.setEstadosIdUsuarioCrea(incomingData.get("EstadosIdUsuarioCrea").toString());
		actualEstados.setEstadosIdUsuarioModi(incomingData.get("EstadosIdUsuarioModi").toString());
		actualEstados.setNombreEstado(incomingData.get("NombreEstado").toString());
		try {
			estadosFacadeLocal.create(actualEstados);
			estadosListAll.add(actualEstados);
			actualEstados = new Estados();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveEstados(String query) {
		switch (query) {
		case "findAll":
			estadosListAll = estadosFacadeLocal.findAll();
			break;
		case "findByEstadoId":
			estadosListAll = estadosFacadeLocal.findByEstadoId(actualEstados.getEstadoId());
			break;
	
		default:
			break;
		}
	}
	public void updateEstados(HashMap<String, Object> incomingData) {
		selectedEstados.setEstadoId(Integer.parseInt((String) incomingData.get("EstadoId")));
		selectedEstados.setDescripcionEstado(incomingData.get("DescripcionEstado").toString());
		selectedEstados.setEstadosEstado(Integer.parseInt((String) incomingData.get("EstadosEstado")));
		selectedEstados.setEstadosFechaCrea((Date) incomingData.get("EstadosFechaModi"));
		selectedEstados.setEstadosFechaModi(utils.fechaActual());
		selectedEstados.setEstadosIdUsuarioCrea(incomingData.get("EstadosIdUsuarioCrea").toString());
		selectedEstados.setEstadosIdUsuarioModi(incomingData.get("EstadosIdUsuarioModi").toString());
		selectedEstados.setNombreEstado(incomingData.get("NombreEstado").toString());
		estadosFacadeLocal.modify(selectedEstados);
		selectedEstados = new Estados();
		estadosListAll = estadosFacadeLocal.findAll();
	}

	@EJB
	private GeneroFacadeLocal generoFacadeLocal;
	private Genero selectedGenero;
	private Genero actualGenero = new Genero();
	private List<Genero> generoListAll = new ArrayList<Genero>();
	public void createGenero(HashMap<String, Object> incomingData) {
		actualGenero.setGeneroId(Integer.parseInt((String) incomingData.get("GeneroId")));
		actualGenero.setGeneroEstado(Integer.parseInt((String) incomingData.get("GeneroEstado")));
		actualGenero.setGeneroFechaCrea(utils.fechaActual());
		actualGenero.setGeneroFechaModifica(utils.fechaActual());
		actualGenero.setGeneroNombre(incomingData.get("GeneroNombre").toString());
		actualGenero.setGeneroUsuarioCrea(Integer.parseInt((String) incomingData.get("GeneroUsuarioCrea")));
		actualGenero.setGeneroUsuarioModifica(Integer.parseInt((String) incomingData.get("GeneroUsuarioModifica")));
		try {
			generoFacadeLocal.create(actualGenero);
			generoListAll.add(actualGenero);
			actualGenero = new Genero();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveGener(String query) {
		switch (query) {
		case "findAll":
			generoListAll = generoFacadeLocal.findAll();
			break;
		case "findByGeneroId":
			generoListAll = generoFacadeLocal.findByGeneroId(actualGenero.getGeneroId());
			break;
	
		default:
			break;
		}
	}
	public void updateGenero(HashMap<String, Object> incomingData) {
		selectedGenero.setGeneroId(Integer.parseInt((String) incomingData.get("GeneroId")));
		selectedGenero.setGeneroEstado(Integer.parseInt((String) incomingData.get("GeneroEstado")));
		selectedGenero.setGeneroFechaCrea((Date) incomingData.get("GeneroFechaCrea"));
		selectedGenero.setGeneroFechaModifica(utils.fechaActual());
		selectedGenero.setGeneroNombre(incomingData.get("GeneroNombre").toString());
		selectedGenero.setGeneroUsuarioCrea(Integer.parseInt((String) incomingData.get("GeneroUsuarioCrea")));
		selectedGenero.setGeneroUsuarioModifica(Integer.parseInt((String) incomingData.get("GeneroUsuarioModifica")));
		generoFacadeLocal.modify(selectedGenero);
		selectedGenero = new Genero();
		generoListAll = generoFacadeLocal.findAll();
	}

	@EJB
	private IdiomaFacadeLocal idiomaFacadeLocal;
	private Idioma selectedIdioma;
	private Idioma actualIdioma = new Idioma();
	private List<Idioma> idiomaListAll = new ArrayList<Idioma>();
	public void createIdioma(HashMap<String, Object> incomingData) {
		actualIdioma.setIdiomaId(Integer.parseInt((String) incomingData.get("IdiomaId")));
		actualIdioma.setIdiomaEstado(Integer.parseInt((String) incomingData.get("IdiomaEstado")));
		actualIdioma.setIdiomaFechaCrea(utils.fechaActual());
		actualIdioma.setIdiomaFechaModifica(utils.fechaActual());
		actualIdioma.setIdiomaNombre(incomingData.get("IdiomaNombre").toString());
		actualIdioma.setIdiomaUsuarioCrea(Integer.parseInt((String) incomingData.get("IdiomaUsuarioCrea")));
		actualIdioma.setIdiomaUsuarioModifica(Integer.parseInt((String) incomingData.get("IdiomaUsuarioModifica")));
		try {
			idiomaFacadeLocal.create(actualIdioma);
			idiomaListAll.add(actualIdioma);
			actualIdioma = new Idioma();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveIdioma(String query) {
		switch (query) {
		case "findAll":
			idiomaListAll = idiomaFacadeLocal.findAll();
			break;
		case "findByIdiomaId":
			idiomaListAll = idiomaFacadeLocal.findByIdiomaId(actualIdioma.getIdiomaId());
			break;
	
		default:
			break;
		}
	}
	public void updateIdioma(HashMap<String, Object> incomingData) {
		selectedIdioma.setIdiomaId(Integer.parseInt((String) incomingData.get("IdiomaId")));
		selectedIdioma.setIdiomaEstado(Integer.parseInt((String) incomingData.get("IdiomaEstado")));
		selectedIdioma.setIdiomaFechaCrea((Date) incomingData.get("IdiomaFechaCrea"));
		selectedIdioma.setIdiomaFechaModifica(utils.fechaActual());
		selectedIdioma.setIdiomaNombre(incomingData.get("IdiomaNombre").toString());
		selectedIdioma.setIdiomaUsuarioCrea(Integer.parseInt((String) incomingData.get("IdiomaUsuarioCrea")));
		selectedIdioma.setIdiomaUsuarioModifica(Integer.parseInt((String) incomingData.get("IdiomaUsuarioModifica")));
		idiomaFacadeLocal.modify(selectedIdioma);
		selectedIdioma = new Idioma();
		idiomaListAll = idiomaFacadeLocal.findAll();
	}

	@EJB
	private InventarioFacadeLocal inventarioFacadeLocal;
	private Inventario selectedInventario;
	private Inventario actualInventario = new Inventario();
	private List<Inventario> inventarioListAll = new ArrayList<Inventario>();
	public void createInventario(HashMap<String, Object> incomingData) {
		actualInventario.setInventarioId(Integer.parseInt((String) incomingData.get("InventarioId")));
		actualInventario.setBienesId(Integer.parseInt((String) incomingData.get("BienesId")));
		actualInventario.setInventarioEstado(Integer.parseInt((String) incomingData.get("InventarioEstado")));
		actualInventario.setInventarioEstadoInventario(Integer.parseInt((String) incomingData.get("InventarioEstadoInventario")));
		actualInventario.setInventarioFechaCrea(utils.fechaActual());
		actualInventario.setInventarioFechaModi(utils.fechaActual());
		actualInventario.setInventarioIdUsuarioCrea(incomingData.get("InventarioIdUsuarioCrea").toString());
		actualInventario.setInventarioIdUsuarioModi(incomingData.get("InventarioIdUsuarioModi").toString());
		try {
			inventarioFacadeLocal.create(actualInventario);
			inventarioListAll.add(actualInventario);
			actualInventario = new Inventario();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveInventario(String query) {
		switch (query) {
		case "findAll":
			inventarioListAll = inventarioFacadeLocal.findAll();
			break;
		case "findByInventarioId":
			inventarioListAll = inventarioFacadeLocal.findByInventarioId(actualInventario.getInventarioId());
			break;
	
		default:
			break;
		}
	}
	public void updateInventario(HashMap<String, Object> incomingData) {
		selectedInventario.setInventarioId(Integer.parseInt((String) incomingData.get("InventarioId")));
		selectedInventario.setBienesId(Integer.parseInt((String) incomingData.get("BienesId")));
		selectedInventario.setInventarioEstado(Integer.parseInt((String) incomingData.get("InventarioEstado")));
		selectedInventario.setInventarioEstadoInventario(Integer.parseInt((String) incomingData.get("InventarioEstadoInventario")));
		selectedInventario.setInventarioFechaCrea((Date) incomingData.get("InventarioFechaCrea"));
		selectedInventario.setInventarioFechaModi(utils.fechaActual());
		selectedInventario.setInventarioIdUsuarioCrea(incomingData.get("InventarioIdUsuarioCrea").toString());
		selectedInventario.setInventarioIdUsuarioModi(incomingData.get("InventarioIdUsuarioModi").toString());
		inventarioFacadeLocal.modify(selectedInventario);
		selectedInventario = new Inventario();
		inventarioListAll = inventarioFacadeLocal.findAll();
	}

	@EJB
	private MantenimientosFacadeLocal mantenimientosFacadeLocal;
	private Mantenimientos selectedMantenimientos;
	private Mantenimientos actualMantenimientos = new Mantenimientos();
	private List<Mantenimientos> mantenimientosListAll = new ArrayList<Mantenimientos>();
	public void createMantenimientos(HashMap<String, Object> incomingData) {
		actualMantenimientos.setMantenimientosId(Integer.parseInt((String) incomingData.get("MantenimientosId")));
		actualMantenimientos.setMantenimientosAvance(Integer.parseInt((String) incomingData.get("MantenimientosAvance")));
		actualMantenimientos.setMantenimientosCondicion(Integer.parseInt((String) incomingData.get("MantenimientosCondicion")));
		actualMantenimientos.setMantenimientosDetalle(incomingData.get("MantenimientosDetalle").toString());
		actualMantenimientos.setMantenimientosEstado(Integer.parseInt((String) incomingData.get("MantenimientosEstado")));
		actualMantenimientos.setMantenimientosFechaCrea(utils.fechaActual());
		actualMantenimientos.setMantenimientosFechaFin((Date) incomingData.get("MantenimientosFechaFin"));
		actualMantenimientos.setMantenimientosFechaInicio((Date) incomingData.get("MantenimientosFechaInicio"));
		actualMantenimientos.setMantenimientosFechaModi(utils.fechaActual());
		actualMantenimientos.setMantenimientosIdUsuarioCrea(incomingData.get("MantenimientosIdUsuarioCrea").toString());
		actualMantenimientos.setMantenimientosIdUsuarioModi(incomingData.get("MantenimientosIdUsuarioModi").toString());
		actualMantenimientos.setMantenimientosMontoFinal(Integer.parseInt((String) incomingData.get("MantenimientosMontoFinal")));
		actualMantenimientos.setMantenimientosTipo(Integer.parseInt((String) incomingData.get("MantenimientosTipo")));
		try {
			mantenimientosFacadeLocal.create(actualMantenimientos);
			mantenimientosListAll.add(actualMantenimientos);
			actualMantenimientos = new Mantenimientos();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveMantenimientos(String query) {
		switch (query) {
		case "findAll":
			mantenimientosListAll = mantenimientosFacadeLocal.findAll();
			break;
		case "findByMantenimientosId":
			mantenimientosListAll = mantenimientosFacadeLocal.findByMantenimientosId(actualMantenimientos.getMantenimientosId());
			break;
	
		default:
			break;
		}
	}
	public void updateMantenimientos(HashMap<String, Object> incomingData) {
		selectedMantenimientos.setMantenimientosId(Integer.parseInt((String) incomingData.get("MantenimientosId")));
		selectedMantenimientos.setMantenimientosAvance(Integer.parseInt((String) incomingData.get("MantenimientosAvance")));
		selectedMantenimientos.setMantenimientosCondicion(Integer.parseInt((String) incomingData.get("MantenimientosCondicion")));
		selectedMantenimientos.setMantenimientosDetalle(incomingData.get("MantenimientosDetalle").toString());
		selectedMantenimientos.setMantenimientosEstado(Integer.parseInt((String) incomingData.get("MantenimientosEstado")));
		selectedMantenimientos.setMantenimientosFechaCrea((Date) incomingData.get("MantenimientosFechaCrea"));
		selectedMantenimientos.setMantenimientosFechaFin((Date) incomingData.get("MantenimientosFechaFin"));
		selectedMantenimientos.setMantenimientosFechaInicio((Date) incomingData.get("MantenimientosFechaInicio"));
		selectedMantenimientos.setMantenimientosFechaModi(utils.fechaActual());
		selectedMantenimientos.setMantenimientosIdUsuarioCrea(incomingData.get("MantenimientosIdUsuarioCrea").toString());
		selectedMantenimientos.setMantenimientosIdUsuarioModi(incomingData.get("MantenimientosIdUsuarioModi").toString());
		selectedMantenimientos.setMantenimientosMontoFinal(Integer.parseInt((String) incomingData.get("MantenimientosMontoFinal")));
		selectedMantenimientos.setMantenimientosTipo(Integer.parseInt((String) incomingData.get("MantenimientosTipo")));
		mantenimientosFacadeLocal.modify(selectedMantenimientos);
		selectedMantenimientos = new Mantenimientos();
		mantenimientosListAll = mantenimientosFacadeLocal.findAll();
	}

	@EJB
	private MunicipioFacadeLocal municipioFacadeLocal;
	private Municipio selectedMunicipio;
	private Municipio actualMunicipio = new Municipio();
	private List<Municipio> municipioListAll = new ArrayList<Municipio>();
	public void createMunicipio(HashMap<String, Object> incomingData) {
		actualMunicipio.setMunicipioId(Integer.parseInt((String) incomingData.get("MunicipioId")));
		actualMunicipio.setMunicipioEstado(Integer.parseInt((String) incomingData.get("MunicipioEstado")));
		actualMunicipio.setMunicipioFechaCrea(utils.fechaActual());
		actualMunicipio.setMunicipioFechaModifica(utils.fechaActual());
		actualMunicipio.setMunicipioNombre(incomingData.get("MunicipioNombre").toString());
		actualMunicipio.setMunicipioUsuarioCrea(Integer.parseInt((String) incomingData.get("MunicipioUsuarioCrea")));
		actualMunicipio.setMunicipioUsuarioModifica(Integer.parseInt((String) incomingData.get("MunicipioUsuarioModifica")));
		try {
			municipioFacadeLocal.create(actualMunicipio);
			municipioListAll.add(actualMunicipio);
			actualMunicipio = new Municipio();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveMunicipio(String query) {
		switch (query) {
		case "findAll":
			municipioListAll = municipioFacadeLocal.findAll();
			break;
		case "findByMunicipioId":
			municipioListAll = municipioFacadeLocal.findByMunicipioId(actualMunicipio.getMunicipioId());
			break;
	
		default:
			break;
		}
	}
	public void updateMunicipio(HashMap<String, Object> incomingData) {
		selectedMunicipio.setMunicipioId(Integer.parseInt((String) incomingData.get("MunicipioId")));
		selectedMunicipio.setMunicipioEstado(Integer.parseInt((String) incomingData.get("MunicipioEstado")));
		selectedMunicipio.setMunicipioFechaCrea((Date) incomingData.get("MunicipioFechaCrea"));
		selectedMunicipio.setMunicipioFechaModifica(utils.fechaActual());
		selectedMunicipio.setMunicipioNombre(incomingData.get("MunicipioNombre").toString());
		selectedMunicipio.setMunicipioUsuarioCrea(Integer.parseInt((String) incomingData.get("MunicipioUsuarioCrea")));
		selectedMunicipio.setMunicipioUsuarioModifica(Integer.parseInt((String) incomingData.get("MunicipioUsuarioModifica")));
		municipioFacadeLocal.modify(selectedMunicipio);
		selectedMunicipio = new Municipio();
		municipioListAll = municipioFacadeLocal.findAll();
	}

	@EJB
	private PaisFacadeLocal paisFacadeLocal;
	private Pais selectedPais;
	private Pais actualPais = new Pais();
	private List<Pais> paisListAll = new ArrayList<Pais>();
	public void createPais(HashMap<String, Object> incomingData) {
		actualPais.setPaisId(Integer.parseInt((String) incomingData.get("PaisId")));
		actualPais.setPaisEstado(Integer.parseInt((String) incomingData.get("PaisEstado")));
		actualPais.setPaisFechaCrea(utils.fechaActual());
		actualPais.setPaisFechaModifica(utils.fechaActual());
		actualPais.setPaisNacionalidad(incomingData.get("PaisNacionalidad").toString());
		actualPais.setPaisNombre(incomingData.get("PaisNombre").toString());
		actualPais.setPaisUsuarioCrea(Integer.parseInt((String) incomingData.get("PaisUsuarioCrea")));
		actualPais.setPaisUsuarioModifica(Integer.parseInt((String) incomingData.get("PaisUsuarioModifica")));
		try {
			paisFacadeLocal.create(actualPais);
			paisListAll.add(actualPais);
			actualPais = new Pais();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrievePais(String query) {
		switch (query) {
		case "findAll":
			paisListAll = paisFacadeLocal.findAll();
			break;
		case "findByPaisId":
			paisListAll = paisFacadeLocal.findByPaisId(actualPais.getPaisId());
			break;
	
		default:
			break;
		}
	}
	public void updatePais(HashMap<String, Object> incomingData) {
		selectedPais.setPaisId(Integer.parseInt((String) incomingData.get("PaisId")));
		selectedPais.setPaisEstado(Integer.parseInt((String) incomingData.get("PaisEstado")));
		selectedPais.setPaisFechaCrea((Date) incomingData.get("PaisFechaCrea"));
		selectedPais.setPaisFechaModifica(utils.fechaActual());
		selectedPais.setPaisNacionalidad(incomingData.get("PaisNacionalidad").toString());
		selectedPais.setPaisNombre(incomingData.get("PaisNombre").toString());
		selectedPais.setPaisUsuarioCrea(Integer.parseInt((String) incomingData.get("PaisUsuarioCrea")));
		selectedPais.setPaisUsuarioModifica(Integer.parseInt((String) incomingData.get("PaisUsuarioModifica")));
		paisFacadeLocal.modify(selectedPais);
		selectedPais = new Pais();
		paisListAll = paisFacadeLocal.findAll();
	}

	@EJB
	private ParentescoFacadeLocal parentescoFacadeLocal;
	private Parentesco selectedParentesco;
	private Parentesco actualParentesco = new Parentesco();
	private List<Parentesco> parentescoListAll = new ArrayList<Parentesco>();
	public void createParentesco(HashMap<String, Object> incomingData) {
		actualParentesco.setParentescoId(Integer.parseInt((String) incomingData.get("ParentescoId")));
		actualParentesco.setParentescoEstado(Integer.parseInt((String) incomingData.get("ParentescoEstado")));
		actualParentesco.setParentescoFechaCrea(utils.fechaActual());
		actualParentesco.setParentescoFechaModifica(utils.fechaActual());
		actualParentesco.setParentescoNombre(incomingData.get("ParentescoNombre").toString());
		actualParentesco.setParentescoUsuarioCrea(Integer.parseInt((String) incomingData.get("ParentescoUsuarioCrea")));
		actualParentesco.setParentescoUsuarioModifica(Integer.parseInt((String) incomingData.get("ParentescoUsuarioModifica")));
		try {
			parentescoFacadeLocal.create(actualParentesco);
			parentescoListAll.add(actualParentesco);
			actualParentesco = new Parentesco();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveParentesco(String query) {
		switch (query) {
		case "findAll":
			parentescoListAll = parentescoFacadeLocal.findAll();
			break;
		case "findByParentescoId":
			parentescoListAll = parentescoFacadeLocal.findByParentescoId(actualParentesco.getParentescoId());
			break;
	
		default:
			break;
		}
	}
	public void updateParentesco(HashMap<String, Object> incomingData) {
		selectedParentesco.setParentescoId(Integer.parseInt((String) incomingData.get("ParentescoId")));
		selectedParentesco.setParentescoEstado(Integer.parseInt((String) incomingData.get("ParentescoEstado")));
		selectedParentesco.setParentescoFechaCrea((Date) incomingData.get("ParentescoFechaCrea"));
		selectedParentesco.setParentescoFechaModifica(utils.fechaActual());
		selectedParentesco.setParentescoNombre(incomingData.get("ParentescoNombre").toString());
		selectedParentesco.setParentescoUsuarioCrea(Integer.parseInt((String) incomingData.get("ParentescoUsuarioCrea")));
		selectedParentesco.setParentescoUsuarioModifica(Integer.parseInt((String) incomingData.get("ParentescoUsuarioModifica")));
		parentescoFacadeLocal.modify(selectedParentesco);
		selectedParentesco = new Parentesco();
		parentescoListAll = parentescoFacadeLocal.findAll();
	}

	@EJB
	private PeriodosFacadeLocal periodosFacadeLocal;
	private Periodos selectedPeriodos;
	private Periodos actualPeriodos = new Periodos();
	private List<Periodos> periodosListAll = new ArrayList<Periodos>();
	public void createPeriodos(HashMap<String, Object> incomingData) {
		actualPeriodos.setPeriodosId(Integer.parseInt((String) incomingData.get("PeriodosId")));
		actualPeriodos.setPeriodosDescripcion(incomingData.get("PeriodosDescripcion").toString());
		actualPeriodos.setPeriodosEstado(Integer.parseInt((String) incomingData.get("PeriodosEstado")));
		actualPeriodos.setPeriodosFechaCrea(utils.fechaActual());
		actualPeriodos.setPeriodosFechaFin((Date) incomingData.get("PeriodosFechaFin"));
		actualPeriodos.setPeriodosFechaInicio((Date) incomingData.get("PeriodosFechaInicio"));
		actualPeriodos.setPeriodosFechaModi(utils.fechaActual());
		actualPeriodos.setPeriodosIdUsuarioCrea(incomingData.get("PeriodosIdUsuarioCrea").toString());
		actualPeriodos.setPeriodosIdUsuarioModi(incomingData.get("PeriodosIdUsuarioModi").toString());
		actualPeriodos.setPeriodosNombre(actualPeriodos.getPeriodosNombre());
		try {
			periodosFacadeLocal.create(actualPeriodos);
			periodosListAll.add(actualPeriodos);
			actualPeriodos = new Periodos();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrievePeriodos(String query) {
		switch (query) {
		case "findAll":
			periodosListAll = periodosFacadeLocal.findAll();
			break;
		case "findByPeriodosId":
			periodosListAll = periodosFacadeLocal.findByPeriodosId(actualPeriodos.getPeriodosId());
			break;
	
		default:
			break;
		}
	}
	public void updatePeriodos(HashMap<String, Object> incomingData) {
		selectedPeriodos.setPeriodosId(Integer.parseInt((String) incomingData.get("PeriodosId")));
		selectedPeriodos.setPeriodosDescripcion(incomingData.get("PeriodosDescripcion").toString());
		selectedPeriodos.setPeriodosEstado(Integer.parseInt((String) incomingData.get("PeriodosEstado")));
		selectedPeriodos.setPeriodosFechaCrea((Date) incomingData.get("PeriodosFechaCrea"));
		selectedPeriodos.setPeriodosFechaFin((Date) incomingData.get("PeriodosFechaFin"));
		selectedPeriodos.setPeriodosFechaInicio((Date) incomingData.get("PeriodosFechaInicio"));
		selectedPeriodos.setPeriodosFechaModi(utils.fechaActual());
		selectedPeriodos.setPeriodosIdUsuarioCrea(incomingData.get("PeriodosIdUsuarioCrea").toString());
		selectedPeriodos.setPeriodosIdUsuarioModi(incomingData.get("PeriodosIdUsuarioModi").toString());
		selectedPeriodos.setPeriodosNombre(selectedPeriodos.getPeriodosNombre());
		periodosFacadeLocal.modify(selectedPeriodos);
		selectedPeriodos = new Periodos();
		periodosListAll = periodosFacadeLocal.findAll();
	}

	@EJB
	private PersonalContactosFacadeLocal personalContactosFacadeLocal;
	private PersonalContactos selectedPersonalContactos;
	private PersonalContactos actualPersonalContactos = new PersonalContactos();
	private List<PersonalContactos> personalContactosListAll = new ArrayList<PersonalContactos>();
	public void createPersonalContactos(HashMap<String, Object> incomingData) {
		actualPersonalContactos.setContactosId(Integer.parseInt((String) incomingData.get("ContactosId")));
		actualPersonalContactos.setContactoTelefonoFijo(incomingData.get("ContactoTelefonoFijo").toString());
		actualPersonalContactos.setContactoTelefonoMovil(incomingData.get("ContactoTelefonoMovil").toString());
		actualPersonalContactos.setContactosDireccion(incomingData.get("ContactosDireccion").toString());
		actualPersonalContactos.setContactosEstado(Integer.parseInt((String) incomingData.get("ContactosEstado")));
		actualPersonalContactos.setContactosFechaCrea(utils.fechaActual());
		actualPersonalContactos.setContactosFechaModifica(utils.fechaActual());
		actualPersonalContactos.setContactosNombre(incomingData.get("ContactosNombre").toString());
		actualPersonalContactos.setContactosUsuarioCrea(Integer.parseInt((String) incomingData.get("ContactosUsuarioCrea")));
		actualPersonalContactos.setContactosUsuarioModifica(Integer.parseInt((String) incomingData.get("ContactosUsuarioModifica")));
		try {
			personalContactosFacadeLocal.create(actualPersonalContactos);
			personalContactosListAll.add(actualPersonalContactos);
			actualPersonalContactos = new PersonalContactos();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrievePersonalContactos(String query) {
		switch (query) {
		case "findAll":
			personalContactosListAll = personalContactosFacadeLocal.findAll();
			break;
		case "findByContactosId":
			personalContactosListAll = personalContactosFacadeLocal.findByContactosId(actualPersonalContactos.getContactosId());
			break;
	
		default:
			break;
		}
	}
	public void updatePersonalContactos(HashMap<String, Object> incomingData) {
		selectedPersonalContactos.setContactosId(Integer.parseInt((String) incomingData.get("ContactosId")));
		selectedPersonalContactos.setContactoTelefonoFijo(incomingData.get("ContactoTelefonoFijo").toString());
		selectedPersonalContactos.setContactoTelefonoMovil(incomingData.get("ContactoTelefonoMovil").toString());
		selectedPersonalContactos.setContactosDireccion(incomingData.get("ContactosDireccion").toString());
		selectedPersonalContactos.setContactosEstado(Integer.parseInt((String) incomingData.get("ContactosEstado")));
		selectedPersonalContactos.setContactosFechaCrea((Date) incomingData.get("ContactosFechaCrea"));
		selectedPersonalContactos.setContactosFechaModifica(utils.fechaActual());
		selectedPersonalContactos.setContactosNombre(incomingData.get("ContactosNombre").toString());
		selectedPersonalContactos.setContactosUsuarioCrea(Integer.parseInt((String) incomingData.get("ContactosUsuarioCrea")));
		selectedPersonalContactos.setContactosUsuarioModifica(Integer.parseInt((String) incomingData.get("ContactosUsuarioModifica")));
		personalContactosFacadeLocal.modify(selectedPersonalContactos);
		selectedPersonalContactos = new PersonalContactos();
		personalContactosListAll = personalContactosFacadeLocal.findAll();
	}

	@EJB
	private PersonalExperienciaLaboralFacadeLocal personalExperienciaLaboralFacadeLocal;
	private PersonalExperienciaLaboral selectedPersonalExperienciaLaboral;
	private PersonalExperienciaLaboral actualPersonalExperienciaLaboral = new PersonalExperienciaLaboral();
	private List<PersonalExperienciaLaboral> personalExperienciaLaboralListAll = new ArrayList<PersonalExperienciaLaboral>();
	public void createPersonalExperienciaLaboral(HashMap<String, Object> incomingData) {
		actualPersonalExperienciaLaboral.setExperienciaLaboralId(Integer.parseInt((String) incomingData.get("ExperienciaLaboralId")));
		actualPersonalExperienciaLaboral.setExperienciaLaboralAnio(Integer.parseInt((String) incomingData.get("ExperienciaLaboralAnio")));
		actualPersonalExperienciaLaboral.setExperienciaLaboralCargo(incomingData.get("ExperienciaLaboralCargo").toString());
		actualPersonalExperienciaLaboral.setExperienciaLaboralComentarios(incomingData.get("ExperienciaLaboralComentarios").toString());
		actualPersonalExperienciaLaboral.setExperienciaLaboralContacto(incomingData.get("ExperienciaLaboralContacto").toString());
		actualPersonalExperienciaLaboral.setExperienciaLaboralEmpresa(incomingData.get("ExperienciaLaboralEmpresa").toString());
		actualPersonalExperienciaLaboral.setExperienciaLaboralEstado(Integer.parseInt((String) incomingData.get("ExperienciaLaboralEstado")));
		actualPersonalExperienciaLaboral.setExperienciaLaboralFechaCrea(utils.fechaActual());
		actualPersonalExperienciaLaboral.setExperienciaLaboralFechaDesde((Date) incomingData.get("ExperienciaLaboralFechaDesde"));
		actualPersonalExperienciaLaboral.setExperienciaLaboralFechaModifica(utils.fechaActual());
		actualPersonalExperienciaLaboral.setExperienciaLaboralTelefono(incomingData.get("ExperienciaLaboralTelefono").toString());
		actualPersonalExperienciaLaboral.setExperienciaLaboralUsuarioCrea(Integer.parseInt((String) incomingData.get("ExperienciaLaboralUsuarioCrea")));
		actualPersonalExperienciaLaboral.setExperienciaLaboralUsuarioModifica(Integer.parseInt((String) incomingData.get("ExperienciaLaboralUsuarioModifica")));
		try {
			personalExperienciaLaboralFacadeLocal.create(actualPersonalExperienciaLaboral);
			personalExperienciaLaboralListAll.add(actualPersonalExperienciaLaboral);
			actualPersonalExperienciaLaboral= new PersonalExperienciaLaboral();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrievePersonalExperienciaLaboral(String query) {
		switch (query) {
		case "findAll":
			personalExperienciaLaboralListAll = personalExperienciaLaboralFacadeLocal.findAll();
			break;
		case "findByExperienciaLaboralId":
			personalExperienciaLaboralListAll = personalExperienciaLaboralFacadeLocal.findByExperienciaLaboralId(actualPersonalExperienciaLaboral.getExperienciaLaboralId());
			break;
	
		default:
			break;
		}
	}
	public void updatePersonalExperienciaLaboral(HashMap<String, Object> incomingData) {
		selectedPersonalExperienciaLaboral.setExperienciaLaboralId(Integer.parseInt((String) incomingData.get("ExperienciaLaboralId")));
		selectedPersonalExperienciaLaboral.setExperienciaLaboralAnio(Integer.parseInt((String) incomingData.get("ExperienciaLaboralAnio")));
		selectedPersonalExperienciaLaboral.setExperienciaLaboralCargo(incomingData.get("ExperienciaLaboralCargo").toString());
		selectedPersonalExperienciaLaboral.setExperienciaLaboralComentarios(incomingData.get("ExperienciaLaboralComentarios").toString());
		selectedPersonalExperienciaLaboral.setExperienciaLaboralContacto(incomingData.get("ExperienciaLaboralContacto").toString());
		selectedPersonalExperienciaLaboral.setExperienciaLaboralEmpresa(incomingData.get("ExperienciaLaboralEmpresa").toString());
		selectedPersonalExperienciaLaboral.setExperienciaLaboralEstado(Integer.parseInt((String) incomingData.get("ExperienciaLaboralEstado")));
		selectedPersonalExperienciaLaboral.setExperienciaLaboralFechaCrea((Date) incomingData.get("ExperienciaLaboralFechaCrea"));
		selectedPersonalExperienciaLaboral.setExperienciaLaboralFechaDesde((Date) incomingData.get("ExperienciaLaboralFechaDesde"));
		selectedPersonalExperienciaLaboral.setExperienciaLaboralFechaModifica(utils.fechaActual());
		selectedPersonalExperienciaLaboral.setExperienciaLaboralTelefono(incomingData.get("ExperienciaLaboralTelefono").toString());
		selectedPersonalExperienciaLaboral.setExperienciaLaboralUsuarioCrea(Integer.parseInt((String) incomingData.get("ExperienciaLaboralUsuarioCrea")));
		selectedPersonalExperienciaLaboral.setExperienciaLaboralUsuarioModifica(Integer.parseInt((String) incomingData.get("ExperienciaLaboralUsuarioModifica")));
		personalExperienciaLaboralFacadeLocal.modify(selectedPersonalExperienciaLaboral);
		selectedPersonalExperienciaLaboral = new PersonalExperienciaLaboral();
		personalExperienciaLaboralListAll = personalExperienciaLaboralFacadeLocal.findAll();
	}

	@EJB
	private PersonalHabilidadesFacadeLocal personalHabilidadesFacadeLocal;
	private PersonalHabilidades selectedPersonalHabilidades;
	private PersonalHabilidades actualPersonalHabilidades = new PersonalHabilidades();
	private List<PersonalHabilidades> personalHabilidadesListAll = new ArrayList<PersonalHabilidades>();
	public void createPersonalHabilidades(HashMap<String, Object> incomingData) {
		actualPersonalHabilidades.setHabilidadesId(Integer.parseInt((String) incomingData.get("HabilidadesId")));
		actualPersonalHabilidades.setHabilidadesDescripcion(incomingData.get("HabilidadesDescripcion").toString());
		actualPersonalHabilidades.setHabilidadesEstado(Integer.parseInt((String) incomingData.get("HabilidadesEstado")));
		actualPersonalHabilidades.setHabilidadesFechaCrea(utils.fechaActual());
		actualPersonalHabilidades.setHabilidadesFechaModifica(utils.fechaActual());
		actualPersonalHabilidades.setHabilidadesPorcentaje((BigDecimal) incomingData.get("HabilidadesPorcentaje"));
		actualPersonalHabilidades.setHabilidadesUsuarioCrea(Integer.parseInt((String) incomingData.get("HabilidadesUsuarioCrea")));
		actualPersonalHabilidades.setHabilidadesUsuarioModifica(Integer.parseInt((String) incomingData.get("HabilidadesUsuarioModifica")));
		try {
			personalHabilidadesFacadeLocal.create(actualPersonalHabilidades);
			personalHabilidadesListAll.add(actualPersonalHabilidades);
			actualPersonalHabilidades = new PersonalHabilidades();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrievePersonalHabilidades(String query) {
		switch (query) {
		case "findAll":
			personalHabilidadesListAll = personalHabilidadesFacadeLocal.findAll();
			break;
		case "findByHabilidadesId":
			personalHabilidadesListAll = personalHabilidadesFacadeLocal.findByHabilidadesId(actualPersonalHabilidades.getHabilidadesId());
			break;
	
		default:
			break;
		}
	}
	public void updatePersonalHabilidades(HashMap<String, Object> incomingData) {
		selectedPersonalHabilidades.setHabilidadesId(Integer.parseInt((String) incomingData.get("HabilidadesId")));
		selectedPersonalHabilidades.setHabilidadesDescripcion(incomingData.get("HabilidadesDescripcion").toString());
		selectedPersonalHabilidades.setHabilidadesEstado(Integer.parseInt((String) incomingData.get("HabilidadesEstado")));
		selectedPersonalHabilidades.setHabilidadesFechaCrea((Date) incomingData.get("HabilidadesFechaCrea"));
		selectedPersonalHabilidades.setHabilidadesFechaModifica(utils.fechaActual());
		selectedPersonalHabilidades.setHabilidadesPorcentaje((BigDecimal) incomingData.get("HabilidadesPorcentaje"));
		selectedPersonalHabilidades.setHabilidadesUsuarioCrea(Integer.parseInt((String) incomingData.get("HabilidadesUsuarioCrea")));
		selectedPersonalHabilidades.setHabilidadesUsuarioModifica(Integer.parseInt((String) incomingData.get("HabilidadesUsuarioModifica")));
		personalHabilidadesFacadeLocal.modify(selectedPersonalHabilidades);
		selectedPersonalHabilidades = new PersonalHabilidades();
		personalHabilidadesListAll = personalHabilidadesFacadeLocal.findAll();
	}

	@EJB
	private PersonalPersonaFacadeLocal personalPersonaFacadeLocal;
	private PersonalPersona selectedPersonalPersona;
	private PersonalPersona actualPersonalPersona = new PersonalPersona();
	private List<PersonalPersona> personalPersonaListAll = new ArrayList<PersonalPersona>();
	public void createPersonalPersona(HashMap<String, Object> incomingData) {
		actualPersonalPersona.setPersonaId(Integer.parseInt((String) incomingData.get("PersonaId")));
		actualPersonalPersona.setPersonaApellido1(incomingData.get("PersonaApellido1").toString());
		actualPersonalPersona.setPersonaApellido2(incomingData.get("PersonaApellido2").toString());
		actualPersonalPersona.setPersonaApellido3(incomingData.get("PersonaApellido3").toString());
		actualPersonalPersona.setPersonaDireccion(incomingData.get("PersonaDireccion").toString());
		actualPersonalPersona.setPersonaDui(incomingData.get("PersonaDui").toString());
		actualPersonalPersona.setPersonaEstado(Integer.parseInt((String) incomingData.get("PersonaEstado")));
		actualPersonalPersona.setPersonaFechaCrea(utils.fechaActual());
		actualPersonalPersona.setPersonaFechaModifica(utils.fechaActual());
		actualPersonalPersona.setPersonaFechaNac(utils.fechaActual());
		actualPersonalPersona.setPersonaNit(incomingData.get("PersonaNit").toString());
		actualPersonalPersona.setPersonaNombre1(incomingData.get("PersonaNombre1").toString());
		actualPersonalPersona.setPersonaNombre2(incomingData.get("PersonaNombre2").toString());
		actualPersonalPersona.setPersonaObservaciones(incomingData.get("PersonaObservaciones").toString());
		actualPersonalPersona.setPersonaTelefonoFijo(incomingData.get("PersonaTelefonoFijo").toString());
		actualPersonalPersona.setPersonaTelefonoMovil(incomingData.get("PersonaTelefonoMovil").toString());
		actualPersonalPersona.setPersonaTipo(Integer.parseInt((String) incomingData.get("PersonaTipo")));
		actualPersonalPersona.setPersonaUsuarioCrea(Integer.parseInt((String) incomingData.get("PersonaUsuarioCrea")));
		actualPersonalPersona.setPersonaUsuarioModifica(Integer.parseInt((String) incomingData.get("PersonaUsuarioModifica")));
		try {
			personalPersonaFacadeLocal.create(actualPersonalPersona);
			personalPersonaListAll.add(actualPersonalPersona);
			actualPersonalPersona = new PersonalPersona();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrievePersonalPersona(String query) {
		switch (query) {
		case "findAll":
			personalPersonaListAll = personalPersonaFacadeLocal.findAll();
			break;
		case "findByPersonaId":
			personalPersonaListAll = personalPersonaFacadeLocal.findByPersonaId(actualPersonalPersona.getPersonaId());
			break;
	
		default:
			break;
		}
	}
	public void updatePersonalPersona(HashMap<String, Object> incomingData) {
		selectedPersonalPersona.setPersonaId(Integer.parseInt((String) incomingData.get("PersonaId")));
		selectedPersonalPersona.setPersonaApellido1(incomingData.get("PersonaApellido1").toString());
		selectedPersonalPersona.setPersonaApellido2(incomingData.get("PersonaApellido2").toString());
		selectedPersonalPersona.setPersonaApellido3(incomingData.get("PersonaApellido3").toString());
		selectedPersonalPersona.setPersonaDireccion(incomingData.get("PersonaDireccion").toString());
		selectedPersonalPersona.setPersonaDui(incomingData.get("PersonaDui").toString());
		selectedPersonalPersona.setPersonaEstado(Integer.parseInt((String) incomingData.get("PersonaEstado")));
		selectedPersonalPersona.setPersonaFechaCrea((Date) incomingData.get("PersonaFechaCrea"));
		selectedPersonalPersona.setPersonaFechaModifica(utils.fechaActual());
		selectedPersonalPersona.setPersonaFechaNac(utils.fechaActual());
		selectedPersonalPersona.setPersonaNit(incomingData.get("PersonaNit").toString());
		selectedPersonalPersona.setPersonaNombre1(incomingData.get("PersonaNombre1").toString());
		selectedPersonalPersona.setPersonaNombre2(incomingData.get("PersonaNombre2").toString());
		selectedPersonalPersona.setPersonaObservaciones(incomingData.get("PersonaObservaciones").toString());
		selectedPersonalPersona.setPersonaTelefonoFijo(incomingData.get("PersonaTelefonoFijo").toString());
		selectedPersonalPersona.setPersonaTelefonoMovil(incomingData.get("PersonaTelefonoMovil").toString());
		selectedPersonalPersona.setPersonaTipo(Integer.parseInt((String) incomingData.get("PersonaTipo")));
		selectedPersonalPersona.setPersonaUsuarioCrea(Integer.parseInt((String) incomingData.get("PersonaUsuarioCrea")));
		selectedPersonalPersona.setPersonaUsuarioModifica(Integer.parseInt((String) incomingData.get("PersonaUsuarioModifica")));
		personalPersonaFacadeLocal.modify(selectedPersonalPersona);
		selectedPersonalPersona = new PersonalPersona();
		personalPersonaListAll = personalPersonaFacadeLocal.findAll();
	}

	@EJB
	private PersonalProfesionFacadeLocal personalProfesionFacadeLocal;
	private PersonalProfesion selectedPersonalProfesion;
	private PersonalProfesion actualPersonalProfesion = new PersonalProfesion();
	private List<PersonalProfesion> personalProfesionListAll = new ArrayList<PersonalProfesion>();
	public void createPersonalProfesion(HashMap<String, Object> incomingData) {
		actualPersonalProfesion.setProfesionId(Integer.parseInt((String) incomingData.get("ProfesionId")));
		actualPersonalProfesion.setProfesionEstado(Integer.parseInt((String) incomingData.get("ProfesionEstado")));
		actualPersonalProfesion.setProfesionFechaCrea(utils.fechaActual());
		actualPersonalProfesion.setProfesionFechaModifica(utils.fechaActual());
		actualPersonalProfesion.setProfesionNombre(incomingData.get("ProfesionNombre").toString());
		actualPersonalProfesion.setProfesionUsuarioCrea(Integer.parseInt((String) incomingData.get("ProfesionUsuarioCrea")));
		actualPersonalProfesion.setProfesionUsuarioModifica(Integer.parseInt((String) incomingData.get("ProfesionUsuarioModifica")));
		try {
			personalProfesionFacadeLocal.create(actualPersonalProfesion);
			personalProfesionListAll.add(actualPersonalProfesion);
			actualPersonalProfesion = new PersonalProfesion();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrievePersonalProfesion(String query) {
		switch (query) {
		case "findAll":
			personalProfesionListAll = personalProfesionFacadeLocal.findAll();
			break;
		case "findByProfesionId":
			personalProfesionListAll = personalProfesionFacadeLocal.findByProfesionId(actualPersonalProfesion.getProfesionId());
			break;
	
		default:
			break;
		}
	}
	public void updatePersonalProfesion(HashMap<String, Object> incomingData) {
		actualPersonalProfesion.setProfesionId(Integer.parseInt((String) incomingData.get("ProfesionId")));
		actualPersonalProfesion.setProfesionEstado(Integer.parseInt((String) incomingData.get("ProfesionEstado")));
		actualPersonalProfesion.setProfesionFechaCrea((Date) incomingData.get("ProfesionFechaCrea"));
		actualPersonalProfesion.setProfesionFechaModifica(utils.fechaActual());
		actualPersonalProfesion.setProfesionNombre(incomingData.get("ProfesionNombre").toString());
		actualPersonalProfesion.setProfesionUsuarioCrea(Integer.parseInt((String) incomingData.get("ProfesionUsuarioCrea")));
		actualPersonalProfesion.setProfesionUsuarioModifica(Integer.parseInt((String) incomingData.get("ProfesionUsuarioModifica")));
		personalProfesionFacadeLocal.modify(selectedPersonalProfesion);
		selectedPersonalProfesion = new PersonalProfesion();
		personalProfesionListAll = personalProfesionFacadeLocal.findAll();
	}

	@EJB
	private TransaccionFacadeLocal transaccionFacadeLocal;
	private Transaccion selectedTransaccion;
	private Transaccion actualTransaccion = new Transaccion();
	private List<Transaccion> transaccionListAll = new ArrayList<Transaccion>();
	public void createTransaccion(HashMap<String, Object> incomingData) {
		actualTransaccion.setTransaccionId(Integer.parseInt((String) incomingData.get("TransaccionId")));
		actualTransaccion.setTransaccionDetalle((byte[]) incomingData.get("TransaccionDetalle"));
		actualTransaccion.setTransaccionEstado(Integer.parseInt((String) incomingData.get("TransaccionEstado")));
		actualTransaccion.setTransaccionFechaCrea(utils.fechaActual());
		actualTransaccion.setTransaccionFechaFin((Date) incomingData.get("TransaccionFechaFin"));
		actualTransaccion.setTransaccionFechaInicio((Date) incomingData.get("TransaccionFechaInicio"));
		actualTransaccion.setTransaccionFechaModi(utils.fechaActual());
		actualTransaccion.setTransaccionIdUsuarioCrea(incomingData.get("TransaccionIdUsuarioCrea").toString());
		actualTransaccion.setTransaccionIdUsuarioModi(incomingData.get("actualTransaccion.getTransaccionIdUsuarioModi").toString());
		actualTransaccion.setTransaccionOrientacion(Integer.parseInt((String) incomingData.get("TransaccionOrientacion")));
		actualTransaccion.setTransaccionServicio(Integer.parseInt((String) incomingData.get("TransaccionServicio")));
		actualTransaccion.setTransaccionTipo(Integer.parseInt((String) incomingData.get("TransaccionTipo")));
		try {
			transaccionFacadeLocal.create(actualTransaccion);
			transaccionListAll.add(actualTransaccion);
			actualTransaccion = new Transaccion();
		} catch (javax.ejb.EJBAccessException eae) {
			eae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void retrieveTransaccion(String query) {
		switch (query) {
		case "findAll":
			transaccionListAll = transaccionFacadeLocal.findAll();
			break;
		case "findByTransaccionId":
			transaccionListAll = transaccionFacadeLocal.findByTransaccionId(actualTransaccion.getTransaccionId());
			break;
		
		default:
			break;
		}
	}
	public void updateTransaccion(HashMap<String, Object> incomingData) {
		selectedTransaccion.setTransaccionId(Integer.parseInt((String) incomingData.get("TransaccionId")));
		selectedTransaccion.setTransaccionDetalle((byte[]) incomingData.get("TransaccionDetalle"));
		selectedTransaccion.setTransaccionEstado(Integer.parseInt((String) incomingData.get("TransaccionEstado")));
		selectedTransaccion.setTransaccionFechaCrea((Date) incomingData.get("TransaccionFechaCrea"));
		selectedTransaccion.setTransaccionFechaFin((Date) incomingData.get("TransaccionFechaFin"));
		selectedTransaccion.setTransaccionFechaInicio((Date) incomingData.get("TransaccionFechaInicio"));
		selectedTransaccion.setTransaccionFechaModi(utils.fechaActual());
		selectedTransaccion.setTransaccionIdUsuarioCrea(incomingData.get("TransaccionIdUsuarioCrea").toString());
		selectedTransaccion.setTransaccionIdUsuarioModi(incomingData.get("selectedTransaccion.getTransaccionIdUsuarioModi").toString());
		selectedTransaccion.setTransaccionOrientacion(Integer.parseInt((String) incomingData.get("TransaccionOrientacion")));
		selectedTransaccion.setTransaccionServicio(Integer.parseInt((String) incomingData.get("TransaccionServicio")));
		selectedTransaccion.setTransaccionTipo(Integer.parseInt((String) incomingData.get("TransaccionTipo")));
		transaccionFacadeLocal.modify(selectedTransaccion);
		selectedTransaccion = new Transaccion();
		transaccionListAll = transaccionFacadeLocal.findAll();
	}

}
