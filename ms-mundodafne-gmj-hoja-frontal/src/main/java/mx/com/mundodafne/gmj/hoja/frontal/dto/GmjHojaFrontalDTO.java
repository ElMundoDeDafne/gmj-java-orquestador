package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjHojaFrontalDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7592321088360662387L;
	private GmjInformacionPacienteDTO informacionPx;
	private GmjDomicilioPacienteDTO domicilioPaciente;
	private GmjDatosContactoPacienteDTO datosContacto;
	private GmjHistoriaClinicaDTO historiaClinica;
	private GmjNotaEnfermeriaDTO notaEnfermeriaPx;
	private GmjNotaMedicaDTO notaMedicaPaciente;
	private GmjConsultaOdontoDTO consultaOdontologia;
	
	
	/**
	 * @return the historiaClinica
	 */
	public GmjHistoriaClinicaDTO getHistoriaClinica() {
		return historiaClinica;
	}
	/**
	 * @param historiaClinica the historiaClinica to set
	 */
	public void setHistoriaClinica(GmjHistoriaClinicaDTO historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
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
	/**
	 * @return the notaEnfermeriaPx
	 */
	public GmjNotaEnfermeriaDTO getNotaEnfermeriaPx() {
		return notaEnfermeriaPx;
	}
	/**
	 * @param notaEnfermeriaPx the notaEnfermeriaPx to set
	 */
	public void setNotaEnfermeriaPx(GmjNotaEnfermeriaDTO notaEnfermeriaPx) {
		this.notaEnfermeriaPx = notaEnfermeriaPx;
	}
	/**
	 * @return the notaMedicaPaciente
	 */
	public GmjNotaMedicaDTO getNotaMedicaPaciente() {
		return notaMedicaPaciente;
	}
	/**
	 * @param notaMedicaPaciente the notaMedicaPaciente to set
	 */
	public void setNotaMedicaPaciente(GmjNotaMedicaDTO notaMedicaPaciente) {
		this.notaMedicaPaciente = notaMedicaPaciente;
	}
	/**
	 * @return the consultaOdontologia
	 */
	public GmjConsultaOdontoDTO getConsultaOdontologia() {
		return consultaOdontologia;
	}
	/**
	 * @param consultaOdontologia the consultaOdontologia to set
	 */
	public void setConsultaOdontologia(GmjConsultaOdontoDTO consultaOdontologia) {
		this.consultaOdontologia = consultaOdontologia;
	}
	
}
