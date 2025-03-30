package mx.com.mundodafne.ms.catalogos.gmj.entity;

public class CatCodigoPostal {
	private Long idCodigoPostal;
	private String codigo;
	private CatEntidadFederativa entidad;
	private CatLocalidad localidad;
	private CatMunicipio municipio;
	/**
	 * @return the idCodigoPostal
	 */
	public Long getIdCodigoPostal() {
		return idCodigoPostal;
	}
	/**
	 * @param idCodigoPostal the idCodigoPostal to set
	 */
	public void setIdCodigoPostal(Long idCodigoPostal) {
		this.idCodigoPostal = idCodigoPostal;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the entidad
	 */
	public CatEntidadFederativa getEntidad() {
		return entidad;
	}
	/**
	 * @param entidad the entidad to set
	 */
	public void setEntidad(CatEntidadFederativa entidad) {
		this.entidad = entidad;
	}
	/**
	 * @return the localidad
	 */
	public CatLocalidad getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(CatLocalidad localidad) {
		this.localidad = localidad;
	}
	/**
	 * @return the municipio
	 */
	public CatMunicipio getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(CatMunicipio municipio) {
		this.municipio = municipio;
	}
	
	
}
