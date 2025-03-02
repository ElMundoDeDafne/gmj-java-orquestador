package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjAntNPInmunizaciones implements Serializable {
	private String biologicoNombre;
	private String fechaAplicacion;
	/**
	 * @return the biologicoNombre
	 */
	public String getBiologicoNombre() {
		return biologicoNombre;
	}
	/**
	 * @param biologicoNombre the biologicoNombre to set
	 */
	public void setBiologicoNombre(String biologicoNombre) {
		this.biologicoNombre = biologicoNombre;
	}
	/**
	 * @return the fechaAplicacion
	 */
	public String getFechaAplicacion() {
		return fechaAplicacion;
	}
	/**
	 * @param fechaAplicacion the fechaAplicacion to set
	 */
	public void setFechaAplicacion(String fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
	
	
}
