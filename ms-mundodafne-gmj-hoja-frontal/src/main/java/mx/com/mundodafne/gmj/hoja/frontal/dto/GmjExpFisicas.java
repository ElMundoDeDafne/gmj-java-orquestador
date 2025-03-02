package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjExpFisicas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7542807239089475675L;
	private String zonaInspeccion;
	private String observacionesInspeccion;
	/**
	 * @return the zonaInspeccion
	 */
	public String getZonaInspeccion() {
		return zonaInspeccion;
	}
	/**
	 * @param zonaInspeccion the zonaInspeccion to set
	 */
	public void setZonaInspeccion(String zonaInspeccion) {
		this.zonaInspeccion = zonaInspeccion;
	}
	/**
	 * @return the observacionesInspeccion
	 */
	public String getObservacionesInspeccion() {
		return observacionesInspeccion;
	}
	/**
	 * @param observacionesInspeccion the observacionesInspeccion to set
	 */
	public void setObservacionesInspeccion(String observacionesInspeccion) {
		this.observacionesInspeccion = observacionesInspeccion;
	}
	
	
}
