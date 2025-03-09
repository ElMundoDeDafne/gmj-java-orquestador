package mx.com.mundodafne.gmj.hoja.frontal.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="PER_SIGNOS_VITALES")
public class PerSignosVitales {
	private Long idSignosVitales;
	private Integer presionSist;
	private Integer presionDiast;
	private Integer oxigenacion;
	private Double temperatura;
	private LocalDateTime fechaToma;
	/**
	 * @return the idSignosVitales
	 */
	public Long getIdSignosVitales() {
		return idSignosVitales;
	}
	/**
	 * @param idSignosVitales the idSignosVitales to set
	 */
	public void setIdSignosVitales(Long idSignosVitales) {
		this.idSignosVitales = idSignosVitales;
	}
	/**
	 * @return the presionSist
	 */
	public Integer getPresionSist() {
		return presionSist;
	}
	/**
	 * @param presionSist the presionSist to set
	 */
	public void setPresionSist(Integer presionSist) {
		this.presionSist = presionSist;
	}
	/**
	 * @return the presionDiast
	 */
	public Integer getPresionDiast() {
		return presionDiast;
	}
	/**
	 * @param presionDiast the presionDiast to set
	 */
	public void setPresionDiast(Integer presionDiast) {
		this.presionDiast = presionDiast;
	}
	/**
	 * @return the oxigenacion
	 */
	public Integer getOxigenacion() {
		return oxigenacion;
	}
	/**
	 * @param oxigenacion the oxigenacion to set
	 */
	public void setOxigenacion(Integer oxigenacion) {
		this.oxigenacion = oxigenacion;
	}
	/**
	 * @return the temperatura
	 */
	public Double getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * @return the fechaToma
	 */
	public LocalDateTime getFechaToma() {
		return fechaToma;
	}
	/**
	 * @param fechaToma the fechaToma to set
	 */
	public void setFechaToma(LocalDateTime fechaToma) {
		this.fechaToma = fechaToma;
	}
	
	
	
}
