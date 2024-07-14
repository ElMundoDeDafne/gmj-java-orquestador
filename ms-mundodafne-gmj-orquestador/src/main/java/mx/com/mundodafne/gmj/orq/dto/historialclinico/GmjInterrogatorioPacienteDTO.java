package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;
import java.util.List;

public class GmjInterrogatorioPacienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4158270743953331070L;
	private List<ExploracionesFisicas> exploracionesFisicas;
	private List<AparatoYSistemas> aparatoYSistemas;
	public List<ExploracionesFisicas> getExploracionesFisicas() {
		return exploracionesFisicas;
	}
	public void setExploracionesFisicas(List<ExploracionesFisicas> exploracionesFisicas) {
		this.exploracionesFisicas = exploracionesFisicas;
	}
	public List<AparatoYSistemas> getAparatoYSistemas() {
		return aparatoYSistemas;
	}
	public void setAparatoYSistemas(List<AparatoYSistemas> aparatoYSistemas) {
		this.aparatoYSistemas = aparatoYSistemas;
	}
	
	
}

class ExploracionesFisicas{
	private String zonaInspeccion;
	private String observacionesInspeccion;
	public String getZonaInspeccion() {
		return zonaInspeccion;
	}
	public void setZonaInspeccion(String zonaInspeccion) {
		this.zonaInspeccion = zonaInspeccion;
	}
	public String getObservacionesInspeccion() {
		return observacionesInspeccion;
	}
	public void setObservacionesInspeccion(String observacionesInspeccion) {
		this.observacionesInspeccion = observacionesInspeccion;
	}
	
	
}

class AparatoYSistemas {
	private String concepto;
	private String semiologia;
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public String getSemiologia() {
		return semiologia;
	}
	public void setSemiologia(String semiologia) {
		this.semiologia = semiologia;
	}
	
	
}