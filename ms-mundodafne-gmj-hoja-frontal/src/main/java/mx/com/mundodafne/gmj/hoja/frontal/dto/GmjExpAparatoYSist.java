package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjExpAparatoYSist implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String concepto;
	private String semioloia;
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
	 * @return the semioloia
	 */
	public String getSemioloia() {
		return semioloia;
	}
	/**
	 * @param semioloia the semioloia to set
	 */
	public void setSemioloia(String semioloia) {
		this.semioloia = semioloia;
	}
	
	
}
