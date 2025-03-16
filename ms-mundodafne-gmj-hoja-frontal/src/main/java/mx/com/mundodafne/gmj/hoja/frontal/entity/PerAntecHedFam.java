package mx.com.mundodafne.gmj.hoja.frontal.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PER_ANTEC_HEDFAM")
public class PerAntecHedFam {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAntecHedFam;
	
//	@OneToMany(mappedBy = "ID_MORBILIDAD", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set catMorbilidad;

	/**
	 * @return the idAntecHedFam
	 */
	public Long getIdAntecHedFam() {
		return idAntecHedFam;
	}

	/**
	 * @param idAntecHedFam the idAntecHedFam to set
	 */
	public void setIdAntecHedFam(Long idAntecHedFam) {
		this.idAntecHedFam = idAntecHedFam;
	}

	/**
	 * @return the catMorbilidad
	 */
	public Set getCatMorbilidad() {
		return catMorbilidad;
	}

	/**
	 * @param catMorbilidad the catMorbilidad to set
	 */
	public void setCatMorbilidad(Set catMorbilidad) {
		this.catMorbilidad = catMorbilidad;
	}

	
	
}
