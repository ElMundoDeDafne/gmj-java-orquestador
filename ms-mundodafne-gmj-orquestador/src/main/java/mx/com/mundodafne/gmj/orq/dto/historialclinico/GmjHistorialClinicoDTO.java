/**
 * 
 */
package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;
import java.util.List;

/**
 * 
 */
public class GmjHistorialClinicoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4951490349806731615L;
	private List<GmjAntecedentesHdoFamiliaresDTO> antecedentesHdoFamiliares;
	private GmjAntecedentesGinecObsDTO antecedentesGinecobstetricos;
	private GmjAntecPersNoPatologicosDTO antecNoPatologicos;
	private List<GmjAntecPersPatologicosDTO> antecPatologicos;
	private List<GmjInmunizacionesPacienteDTO> inmunizaciones;
	public List<GmjAntecedentesHdoFamiliaresDTO> getAntecedentesHdoFamiliares() {
		return antecedentesHdoFamiliares;
	}
	public void setAntecedentesHdoFamiliares(List<GmjAntecedentesHdoFamiliaresDTO> antecedentesHdoFamiliares) {
		this.antecedentesHdoFamiliares = antecedentesHdoFamiliares;
	}
	public GmjAntecedentesGinecObsDTO getAntecedentesGinecobstetricos() {
		return antecedentesGinecobstetricos;
	}
	public void setAntecedentesGinecobstetricos(GmjAntecedentesGinecObsDTO antecedentesGinecobstetricos) {
		this.antecedentesGinecobstetricos = antecedentesGinecobstetricos;
	}
	public GmjAntecPersNoPatologicosDTO getAntecNoPatologicos() {
		return antecNoPatologicos;
	}
	public void setAntecNoPatologicos(GmjAntecPersNoPatologicosDTO antecNoPatologicos) {
		this.antecNoPatologicos = antecNoPatologicos;
	}
	public List<GmjAntecPersPatologicosDTO> getAntecPatologicos() {
		return antecPatologicos;
	}
	public void setAntecPatologicos(List<GmjAntecPersPatologicosDTO> antecPatologicos) {
		this.antecPatologicos = antecPatologicos;
	}
	public List<GmjInmunizacionesPacienteDTO> getInmunizaciones() {
		return inmunizaciones;
	}
	public void setInmunizaciones(List<GmjInmunizacionesPacienteDTO> inmunizaciones) {
		this.inmunizaciones = inmunizaciones;
	}
	
}
