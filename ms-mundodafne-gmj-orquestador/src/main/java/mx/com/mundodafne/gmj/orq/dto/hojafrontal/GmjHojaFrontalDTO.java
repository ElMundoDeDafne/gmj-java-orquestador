package mx.com.mundodafne.gmj.orq.dto.hojafrontal;

import java.io.Serializable;

import mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente.GmjInformacionPacienteDTO;

public class GmjHojaFrontalDTO implements Serializable{
	
	private GmjInformacionPacienteDTO informacionPacienteDTO;
	private GmjDomicilioPacienteDTO domicilioPacienteDTO;
	private GmjDatosContactoPacienteDTO datosContactoPacienteDTO;
	
	public GmjInformacionPacienteDTO getInformacionPacienteDTO() {
		return informacionPacienteDTO;
	}
	public void setInformacionPacienteDTO(GmjInformacionPacienteDTO informacionPacienteDTO) {
		this.informacionPacienteDTO = informacionPacienteDTO;
	}
	public GmjDomicilioPacienteDTO getDomicilioPacienteDTO() {
		return domicilioPacienteDTO;
	}
	public void setDomicilioPacienteDTO(GmjDomicilioPacienteDTO domicilioPacienteDTO) {
		this.domicilioPacienteDTO = domicilioPacienteDTO;
	}
	public GmjDatosContactoPacienteDTO getDatosContactoPacienteDTO() {
		return datosContactoPacienteDTO;
	}
	public void setDatosContactoPacienteDTO(GmjDatosContactoPacienteDTO datosContactoPacienteDTO) {
		this.datosContactoPacienteDTO = datosContactoPacienteDTO;
	}
	
}
