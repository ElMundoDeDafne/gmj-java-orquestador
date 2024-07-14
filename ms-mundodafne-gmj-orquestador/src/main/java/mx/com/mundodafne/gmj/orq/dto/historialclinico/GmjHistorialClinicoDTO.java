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
	private List<GmjAntecedentesHdoFamiliaresDTO> antecedentesHdoFam;
	private GmjAntecedentesGinecObsDTO antecedentesGinecObstetricos;
	private GmjAntecPersNoPatologicosDTO antecedentesPersNoPatologicos;
	private List<GmjInmunizacionesPacienteDTO> inmunizacionesPaciente;
	
	
	
	public GmjAntecPersNoPatologicosDTO getAntecedentesPersNoPatologicos() {
		return antecedentesPersNoPatologicos;
	}
	public void setAntecedentesPersNoPatologicos(GmjAntecPersNoPatologicosDTO antecedentesPersNoPatologicos) {
		this.antecedentesPersNoPatologicos = antecedentesPersNoPatologicos;
	}
	public List<GmjInmunizacionesPacienteDTO> getInmunizacionesPaciente() {
		return inmunizacionesPaciente;
	}
	public void setInmunizacionesPaciente(List<GmjInmunizacionesPacienteDTO> inmunizacionesPaciente) {
		this.inmunizacionesPaciente = inmunizacionesPaciente;
	}
	public List<GmjAntecedentesHdoFamiliaresDTO> getAntecedentesHdoFam() {
		return antecedentesHdoFam;
	}
	public void setAntecedentesHdoFam(List<GmjAntecedentesHdoFamiliaresDTO> antecedentesHdoFam) {
		this.antecedentesHdoFam = antecedentesHdoFam;
	}
	public GmjAntecedentesGinecObsDTO getAntecedentesGinecObstetricos() {
		return antecedentesGinecObstetricos;
	}
	public void setAntecedentesGinecObstetricos(GmjAntecedentesGinecObsDTO antecedentesGinecObstetricos) {
		this.antecedentesGinecObstetricos = antecedentesGinecObstetricos;
	}
	
	
}
