package mx.com.mundodafne.ms.catalogos.gmj.entity;

public class CatMunicipio {
	private Long idMunicipio;
	private CatEntidadFederativa entidadFederativa;
	private String codigo;
	private String municipio;
	/**
	 * @return the idMunicipio
	 */
	public Long getIdMunicipio() {
		return idMunicipio;
	}
	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(Long idMunicipio) {
		this.idMunicipio = idMunicipio;
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
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
}
