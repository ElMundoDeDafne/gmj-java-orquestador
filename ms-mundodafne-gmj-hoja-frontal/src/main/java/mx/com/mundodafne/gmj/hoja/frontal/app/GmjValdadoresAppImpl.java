/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.app;

import org.springframework.stereotype.Service;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjAntHdoFamDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjAntPatologicoDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHistoriaClinicaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;

/**
 * 
 */
@Service
public class GmjValdadoresAppImpl implements GmjValidadoresApp {

	@Override
	public void validarInfoPaciente(GmjInformacionPacienteDTO dto) throws BusinessException {
		if(dto!=null) {
			if(dto.getEdad()==null||dto.getNombrePropio1()==null) {
				throw new BusinessException("Faltan datos en hoja frontal, revise.");
			}
			
			if(dto.getTipoConsulta()==null) {
				throw new BusinessException("Falta definir tipo de consulta.");
			}
			
			if(dto.getOcupacion()==null || dto.getOcupacion().isBlank()) {
				throw new BusinessException("Seleccione ocupacion del paciente.");
			}
			
			if((dto.getDerechoHabiencia() != null && 
				!dto.getDerechoHabiencia().isBlank()) &&
				(dto.getNss() != null && 
				dto.getNss().isEmpty())
				) {
				throw new BusinessException("Falta especificar NSS");
			}
		}
	}

	@Override
	public void validarDatosContactoPx(GmjDatosContactoPacienteDTO dto) throws BusinessException {
		
	}

	@Override
	public void validarDomicilioPx(GmjDomicilioPacienteDTO dto) throws BusinessException {
		
	}

	@Override
	public void validarHistoriaClinicaPx(GmjHistoriaClinicaDTO dto) throws BusinessException {
		int total;
		int i = 0;
		StringBuilder mensajes = new StringBuilder();
		GmjAntPatologicoDTO antPat;
		GmjAntHdoFamDTO antHdoFam;
		if(dto!=null) {
			/*validando los antecedentes patologicos del paciente*/
			total = dto.getAntecPatologicos().length;
			while(i < total) {
				antPat = dto.getAntecPatologicos()[i];
				if("otro".equalsIgnoreCase(antPat.getNombreEnfermedad()) && antPat.getOtraEnfermedad().isBlank() || antPat.getOtraEnfermedad().isEmpty()) {
					mensajes.append("Falta definir nombre de enfermedad|");
				}
				
				if(antPat!=null && antPat.getTiempoEvolucion().isBlank() || antPat.getTiempoEvolucion().isEmpty()) {
					mensajes.append("Falta definir tiempo de evolucion ["+antPat.getNombreEnfermedad()+"]|");
				}
				i++;
			}
			
			i=0;
			total = dto.getAntecedentesHdoFamiliares().length;
			//hdo familiares
			while(i<total) {
				antHdoFam = dto.getAntecedentesHdoFamiliares()[i];
				if(antHdoFam.getMorbilidadFamiliar() != null && antHdoFam.getMorbilidadFamiliar().isBlank() || antHdoFam.getMorbilidadFamiliar().isEmpty()) {
					mensajes.append("Falta definir morbilidad familiar ["+antHdoFam.getFamiliar()+"-"+antHdoFam.getParentesco()+"]|");
				}
				i++;
			}
			
			if(!mensajes.toString().isEmpty()) {
				throw new BusinessException(mensajes.toString());
			}
		}
	}

}
