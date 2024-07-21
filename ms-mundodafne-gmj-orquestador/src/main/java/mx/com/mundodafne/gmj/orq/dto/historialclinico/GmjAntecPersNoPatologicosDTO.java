package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;
import java.util.List;

public class GmjAntecPersNoPatologicosDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5835527204473892196L;
	private List<ConceptoFauna> conceptoFauna;
	private List<ConceptoVivienda> conceptoVivienda;
	private List<Concepto> concepto;
	private List<GmjInmunizacionesPacienteDTO> inmunizaciones;

	/**
	 * @return the inmunizaciones
	 */
	public List<GmjInmunizacionesPacienteDTO> getInmunizaciones() {
		return inmunizaciones;
	}
	/**
	 * @param inmunizaciones the inmunizaciones to set
	 */
	public void setInmunizaciones(List<GmjInmunizacionesPacienteDTO> inmunizaciones) {
		this.inmunizaciones = inmunizaciones;
	}
	/**
	 * @return the conceptoFauna
	 */
	public List<ConceptoFauna> getConceptoFauna() {
		return conceptoFauna;
	}
	/**
	 * @param conceptoFauna the conceptoFauna to set
	 */
	public void setConceptoFauna(List<ConceptoFauna> conceptoFauna) {
		this.conceptoFauna = conceptoFauna;
	}
	/**
	 * @return the conceptoVivienda
	 */
	public List<ConceptoVivienda> getConceptoVivienda() {
		return conceptoVivienda;
	}
	/**
	 * @param conceptoVivienda the conceptoVivienda to set
	 */
	public void setConceptoVivienda(List<ConceptoVivienda> conceptoVivienda) {
		this.conceptoVivienda = conceptoVivienda;
	}
	/**
	 * @return the concepto
	 */
	public List<Concepto> getConcepto() {
		return concepto;
	}
	/**
	 * @param concepto the concepto to set
	 */
	public void setConcepto(List<Concepto> concepto) {
		this.concepto = concepto;
	}
	
}

class ConceptoVivienda {
	private String concepto;
	private String situacion;
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getSituacion() {
		return situacion;
	}
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}	
}

class ConceptoFauna {
	private String concepto;
	private String situacion;
	private String otros;
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getSituacion() {
		return situacion;
	}
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}
	public String getOtros() {
		return otros;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}	
}

class Concepto{
	private String concepto;
	private String situacion;
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getSituacion() {
		return situacion;
	}
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}
	
	
}