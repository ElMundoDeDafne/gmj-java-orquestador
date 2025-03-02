package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjAntNPConcepVivienda implements Serializable {
	private String concepto;
	private boolean situacion;
	/**
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}
	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	/**
	 * @return the situacion
	 */
	public boolean isSituacion() {
		return situacion;
	}
	/**
	 * @param situacion the situacion to set
	 */
	public void setSituacion(boolean situacion) {
		this.situacion = situacion;
	}
	
	
}
