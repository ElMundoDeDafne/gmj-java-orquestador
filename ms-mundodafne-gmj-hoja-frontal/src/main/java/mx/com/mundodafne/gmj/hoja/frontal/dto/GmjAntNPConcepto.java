package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjAntNPConcepto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7656606552843473158L;
	private String concepto;
	private String situacion;
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
	public String getSituacion() {
		return situacion;
	}
	/**
	 * @param situacion the situacion to set
	 */
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}
}
