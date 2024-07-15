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
	private String enfermedad;
	private String tipo;
	private String tiempoEvolucion;
	private String tratamiento;
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTiempoEvolucion() {
		return tiempoEvolucion;
	}
	public void setTiempoEvolucion(String tiempoEvolucion) {
		this.tiempoEvolucion = tiempoEvolucion;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
}
