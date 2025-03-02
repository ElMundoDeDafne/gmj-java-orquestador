/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

/**
 * 
 */
public class GmjAntNoPatDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GmjAntNPConcepFauna[] conceptoFauna;
	private GmjAntNPConcepVivienda[] conceptoVivienda;
	private GmjAntNPConcepto[] concepto;
	private GmjAntNPInmunizaciones[] inmunizaciones;
	
	/**
	 * @return the conceptoFauna
	 */
	public GmjAntNPConcepFauna[] getConceptoFauna() {
		return conceptoFauna;
	}
	/**
	 * @param conceptoFauna the conceptoFauna to set
	 */
	public void setConceptoFauna(GmjAntNPConcepFauna[] conceptoFauna) {
		this.conceptoFauna = conceptoFauna;
	}
	/**
	 * @return the conceptoVivienda
	 */
	public GmjAntNPConcepVivienda[] getConceptoVivienda() {
		return conceptoVivienda;
	}
	/**
	 * @param conceptoVivienda the conceptoVivienda to set
	 */
	public void setConceptoVivienda(GmjAntNPConcepVivienda[] conceptoVivienda) {
		this.conceptoVivienda = conceptoVivienda;
	}
	/**
	 * @return the concepto
	 */
	public GmjAntNPConcepto[] getConcepto() {
		return concepto;
	}
	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(GmjAntNPConcepto[] concepto) {
		this.concepto = concepto;
	}
	/**
	 * @return the inmunizaciones
	 */
	public GmjAntNPInmunizaciones[] getInmunizaciones() {
		return inmunizaciones;
	}
	/**
	 * @param inmunizaciones the inmunizaciones to set
	 */
	public void setInmunizaciones(GmjAntNPInmunizaciones[] inmunizaciones) {
		this.inmunizaciones = inmunizaciones;
	}
	
	
}
