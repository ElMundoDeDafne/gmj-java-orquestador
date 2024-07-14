/**
 * 
 */
package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * 
 */
public class GmjInmunizacionesPacienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6370656323311375184L;
	private String biologicoNombre;
	private LocalDate fechaAplicacion;
	public String getBiologicoNombre() {
		return biologicoNombre;
	}
	public void setBiologicoNombre(String biologicoNombre) {
		this.biologicoNombre = biologicoNombre;
	}
	public LocalDate getFechaAplicacion() {
		return fechaAplicacion;
	}
	public void setFechaAplicacion(LocalDate fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
	
	
}
