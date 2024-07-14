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
	
	private GmjHojaFrontalDTO hojaFrontalDTO;
	private GmjHistorialClinicoDTO historialClinicoDTO;
	private GmjNotaMedicaPacienteDTO notasMedicasDTO;
	private GmjNotaEnfermeriaPacienteDTO notasEnfermeriaDTO;
	public GmjHojaFrontalDTO getHojaFrontalDTO() {
		return hojaFrontalDTO;
	}
	public void setHojaFrontalDTO(GmjHojaFrontalDTO hojaFrontalDTO) {
		this.hojaFrontalDTO = hojaFrontalDTO;
	}
	public GmjHistorialClinicoDTO getHistorialClinicoDTO() {
		return historialClinicoDTO;
	}
	public void setHistorialClinicoDTO(GmjHistorialClinicoDTO historialClinicoDTO) {
		this.historialClinicoDTO = historialClinicoDTO;
	}
	public GmjNotaMedicaPacienteDTO getNotasMedicasDTO() {
		return notasMedicasDTO;
	}
	public void setNotasMedicasDTO(GmjNotaMedicaPacienteDTO notasMedicasDTO) {
		this.notasMedicasDTO = notasMedicasDTO;
	}
	public GmjNotaEnfermeriaPacienteDTO getNotasEnfermeriaDTO() {
		return notasEnfermeriaDTO;
	}
	public void setNotasEnfermeriaDTO(GmjNotaEnfermeriaPacienteDTO notasEnfermeriaDTO) {
		this.notasEnfermeriaDTO = notasEnfermeriaDTO;
	}
	
	
}
