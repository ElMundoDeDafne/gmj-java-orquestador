package mx.com.mundodafne.ms.catalogos.gmj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAT_MUNICIPIO")
public class CatMunicipio {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMunicipio;
//	private CatEntidadFederativa entidadFederativa;
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
//	/**
//	 * @return the entidadFederativa
//	 */
//	public CatEntidadFederativa getEntidadFederativa() {
//		return entidadFederativa;
//	}
//	/**
//	 * @param entidadFederativa the entidadFederativa to set
//	 */
//	public void setEntidadFederativa(CatEntidadFederativa entidadFederativa) {
//		this.entidadFederativa = entidadFederativa;
//	}
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
