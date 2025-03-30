package mx.com.mundodafne.ms.catalogos.gmj.entity;

public class CatLocalidad {
	private Long idLocalidad;
	private CatMunicipio municipio;
	private CatEntidadFederativa entidadFederativa;
	private String localidad;
	/**
	 * @return the idLocalidad
	 */
	public Long getIdLocalidad() {
		return idLocalidad;
	}
	/**
	 * @param idLocalidad the idLocalidad to set
	 */
	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	/**
	 * @return the entidadFederativa
	 */
	public CatEntidadFederativa getEntidadFederativa() {
		return entidadFederativa;
	}
	/**
	 * @param entidadFederativa the entidadFederativa to set
	 */
	public void setEntidadFederativa(CatEntidadFederativa entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
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
	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
}
