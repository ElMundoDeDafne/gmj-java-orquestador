package mx.com.mundodafne.gmj.hoja.frontal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "CAT_MORBILIDAD")
public class CatMorbilidad {
	
	//org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' 
	//defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: 
	//Table [cat_morbilidad] contains physical column name [id_morbilidad] referred to by multiple logical column names: [ID_MORBILIDAD], [idMorbilidad]
	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMorbilidad;
	private String descMorbilidad;
	private String claveMorbilidad;
	
//	@ManyToOne
//	@JoinColumn(name="ID_MORBILIDAD")
	private PerAntecHedFam antecHedFam;
	/**
	 * @return the idMorbilidad
	 */
	public Long getIdMorbilidad() {
		return idMorbilidad;
	}
	/**
	 * @param idMorbilidad the idMorbilidad to set
	 */
	public void setIdMorbilidad(Long idMorbilidad) {
		this.idMorbilidad = idMorbilidad;
	}
	/**
	 * @return the descMorbilidad
	 */
	public String getDescMorbilidad() {
		return descMorbilidad;
	}
	/**
	 * @param descMorbilidad the descMorbilidad to set
	 */
	public void setDescMorbilidad(String descMorbilidad) {
		this.descMorbilidad = descMorbilidad;
	}
	/**
	 * @return the claveMorbilidad
	 */
	public String getClaveMorbilidad() {
		return claveMorbilidad;
	}
	/**
	 * @param claveMorbilidad the claveMorbilidad to set
	 */
	public void setClaveMorbilidad(String claveMorbilidad) {
		this.claveMorbilidad = claveMorbilidad;
	}
	
	
}
