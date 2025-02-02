/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

/**
 * 
 */
public class GmjRequestFrontalDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GmjHojaFrontalDTO hojaFrontal;
	private GmjHistoriaClinicaDTO historiaClinica;
	private GmjNotaPacienteDTO notaMedicaPaciente;
	private GmjNotaEnfermeriaDTO notaEnfermeriaPx;
	private GmjConsultaOdontoDTO consultaOdontologia;
	/**
	 * @return the hojaFrontal
	 */
	public GmjHojaFrontalDTO getHojaFrontal() {
		return hojaFrontal;
	}
	/**
	 * @param hojaFrontal the hojaFrontal to set
	 */
	public void setHojaFrontal(GmjHojaFrontalDTO hojaFrontal) {
		this.hojaFrontal = hojaFrontal;
	}
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
	/**
	 * @return the notaMedicaPaciente
	 */
	public GmjNotaPacienteDTO getNotaMedicaPaciente() {
		return notaMedicaPaciente;
	}
	/**
	 * @param notaMedicaPaciente the notaMedicaPaciente to set
	 */
	public void setNotaMedicaPaciente(GmjNotaPacienteDTO notaMedicaPaciente) {
		this.notaMedicaPaciente = notaMedicaPaciente;
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
