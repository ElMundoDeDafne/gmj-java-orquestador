package mx.com.mundodafne.ms.catalogos.gmj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAT_ENTIDAD_FEDERATIVA")
public class CatEntidadFederativa {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEntidadFederativa;
	private String codigo;
	private String abreviatura;
	private String entidadFederativa;
	/**
	 * @return the idEntidadFederativa
	 */
	public Long getIdEntidadFederativa() {
		return idEntidadFederativa;
	}
	/**
	 * @param idEntidadFederativa the idEntidadFederativa to set
	 */
	public void setIdEntidadFederativa(Long idEntidadFederativa) {
		this.idEntidadFederativa = idEntidadFederativa;
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
	 * @return the abreviatura
	 */
	public String getAbreviatura() {
		return abreviatura;
	}
	/**
	 * @param abreviatura the abreviatura to set
	 */
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	/**
	 * @return the entidadFederativa
	 */
	public String getEntidadFederativa() {
		return entidadFederativa;
	}
	/**
	 * @param entidadFederativa the entidadFederativa to set
	 */
	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}
	
	
}
