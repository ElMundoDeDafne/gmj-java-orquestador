/**
 * 
 */
package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;

/**
 * 
 */
public class GmjAntecPersPatologicosDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -39220933481017854L;
	private String nombreEnfermedad;
	private String tipoEnfermedad;
	private String tiempoEvolucion;
	private String tratamientoLlevado;
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
	/**
	 * @return the tratamientoLlevado
	 */
	public String getTratamientoLlevado() {
		return tratamientoLlevado;
	}
	/**
	 * @param tratamientoLlevado the tratamientoLlevado to set
	 */
	public void setTratamientoLlevado(String tratamientoLlevado) {
		this.tratamientoLlevado = tratamientoLlevado;
	}
	
}
