package mx.com.mundodafne.gmj.orq.dto.hojafrontal;

import java.io.Serializable;

import mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente.GmjInformacionPacienteDTO;

public class GmjHojaFrontalDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7592321088360662387L;
	private GmjInformacionPacienteDTO informacionPx;
	private GmjDomicilioPacienteDTO domicilioPaciente;
	private GmjDatosContactoPacienteDTO datosContacto;
	public GmjInformacionPacienteDTO getInformacionPx() {
		return informacionPx;
	}
	public void setInformacionPx(GmjInformacionPacienteDTO informacionPx) {
		this.informacionPx = informacionPx;
	}
	public GmjDomicilioPacienteDTO getDomicilioPaciente() {
		return domicilioPaciente;
	}
	public void setDomicilioPaciente(GmjDomicilioPacienteDTO domicilioPaciente) {
		this.domicilioPaciente = domicilioPaciente;
	}
	public GmjDatosContactoPacienteDTO getDatosContacto() {
		return datosContacto;
	}
	public void setDatosContacto(GmjDatosContactoPacienteDTO datosContacto) {
		this.datosContacto = datosContacto;
	}
	
}
