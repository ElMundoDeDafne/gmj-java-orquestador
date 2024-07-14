package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;
import java.util.List;

public class GmjAntecPersNoPatologicosDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5835527204473892196L;
	private List<ConceptoFauna> conceptosFauna;
	private List<ConceptoVivienda> conceptosVivienda;
	private List<Concepto> conceptos;
	
	public List<Concepto> getConceptos() {
		return conceptos;
	}
	public void setConceptos(List<Concepto> conceptos) {
		this.conceptos = conceptos;
	}
	public List<ConceptoFauna> getConceptosFauna() {
		return conceptosFauna;
	}
	public void setConceptosFauna(List<ConceptoFauna> conceptosFauna) {
		this.conceptosFauna = conceptosFauna;
	}
	public List<ConceptoVivienda> getConceptosVivienda() {
		return conceptosVivienda;
	}
	public void setConceptosVivienda(List<ConceptoVivienda> conceptosVivienda) {
		this.conceptosVivienda = conceptosVivienda;
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