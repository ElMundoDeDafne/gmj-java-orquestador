/**
 * 
 */
package mx.com.mundodafne.gmj.orq.dto.global;

import mx.com.mundodafne.gmj.orq.dto.historialclinico.GmjHistorialClinicoDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.orq.dto.notaenfermeria.GmjNotaEnfermeriaPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.notamedica.GmjNotaMedicaPacienteDTO;

/**
 * Objeto que contiene toda la info
 */
public class GmjObjetoPacienteDTO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2133048018464449952L;
	private GmjHojaFrontalDTO hojaFrontal;
	private GmjHistorialClinicoDTO historiaClinica;
	private GmjNotaMedicaPacienteDTO notaMedicaPaciente;
	private GmjNotaEnfermeriaPacienteDTO notaEnfermeriaPx;
	public GmjHojaFrontalDTO getHojaFrontal() {
		return hojaFrontal;
	}
	public void setHojaFrontal(GmjHojaFrontalDTO hojaFrontal) {
		this.hojaFrontal = hojaFrontal;
	}
	public GmjHistorialClinicoDTO getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(GmjHistorialClinicoDTO historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	public GmjNotaMedicaPacienteDTO getNotaMedicaPaciente() {
		return notaMedicaPaciente;
	}
	public void setNotaMedicaPaciente(GmjNotaMedicaPacienteDTO notaMedicaPaciente) {
		this.notaMedicaPaciente = notaMedicaPaciente;
	}
	public GmjNotaEnfermeriaPacienteDTO getNotaEnfermeriaPx() {
		return notaEnfermeriaPx;
	}
	public void setNotaEnfermeriaPx(GmjNotaEnfermeriaPacienteDTO notaEnfermeriaPx) {
		this.notaEnfermeriaPx = notaEnfermeriaPx;
	}	


	
}
