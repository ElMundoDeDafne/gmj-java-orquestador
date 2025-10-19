package mx.com.mundodafne.ms.catalogos.gmj.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAT_ENTIDAD_FEDERATIVA")
public class CatEntidadFederativa {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEntidadFederativa;
	@Column(name = "CODIGO")
	private String codigoEntidad;
	private String abreviatura;
	private String entidadFederativa;
    @OneToMany(mappedBy = "entidadFederativa")
	private List<CatMunicipio> catMunicipios; //una entidad federativa tiene muchos mpios
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
		return codigoEntidad;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigoEntidad = codigo;
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
	/**
	 * @return the catMunicipio
	 */
	public List<CatMunicipio> getCatMunicipios() {
		return catMunicipios;
	}
	/**
	 * @param catMunicipio the catMunicipio to set
	 */
	public void setCatMunicipios(List<CatMunicipio> catMunicipios) {
		this.catMunicipios = catMunicipios;
	}
	
	
}
