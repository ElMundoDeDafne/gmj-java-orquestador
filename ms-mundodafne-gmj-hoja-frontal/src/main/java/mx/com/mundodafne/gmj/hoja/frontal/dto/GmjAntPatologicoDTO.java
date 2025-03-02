/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

/**
 * 
 */
public class GmjAntPatologicoDTO implements Serializable {
	private String nombreEnfermedad;
	private String otraEnfermedad;
	private String tipoEnfermedad;
	private String tiempoEvolucion;
	/**
	 * @return the nombreEnfermedad
	 */
	public String getNombreEnfermedad() {
		return nombreEnfermedad;
	}
	/**
	 * @param nombreEnfermedad the nombreEnfermedad to set
	 */
	public void setNombreEnfermedad(String nombreEnfermedad) {
		this.nombreEnfermedad = nombreEnfermedad;
	}
	/**
	 * @return the otraEnfermedad
	 */
	public String getOtraEnfermedad() {
		return otraEnfermedad;
	}
	/**
	 * @param otraEnfermedad the otraEnfermedad to set
	 */
	public void setOtraEnfermedad(String otraEnfermedad) {
		this.otraEnfermedad = otraEnfermedad;
	}
	/**
	 * @return the tipoEnfermedad
	 */
	public String getTipoEnfermedad() {
		return tipoEnfermedad;
	}
	/**
	 * @param tipoEnfermedad the tipoEnfermedad to set
	 */
	public void setTipoEnfermedad(String tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}
	/**
	 * @return the tiempoEvolucion
	 */
	public String getTiempoEvolucion() {
		return tiempoEvolucion;
	}
	/**
	 * @param tiempoEvolucion the tiempoEvolucion to set
	 */
	public void setTiempoEvolucion(String tiempoEvolucion) {
		this.tiempoEvolucion = tiempoEvolucion;
	}
	
	
}
