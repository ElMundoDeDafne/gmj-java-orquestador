package mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente;

public class GmjInformacionPacienteDTO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2692725900770445544L;
	private GmjPersonaDTO personaDTO;
	private String tipoConsulta;
	public GmjPersonaDTO getPersonaDTO() {
		return personaDTO;
	}
	public void setPersonaDTO(GmjPersonaDTO personaDTO) {
		this.personaDTO = personaDTO;
	}
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	
	
}
