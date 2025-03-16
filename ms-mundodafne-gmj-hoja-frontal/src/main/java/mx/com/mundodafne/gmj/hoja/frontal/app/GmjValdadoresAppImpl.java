/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.app;

import org.springframework.stereotype.Service;

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
			if(dto.getEdad()==null) {
				throw new BusinessException("Faltan datos en hoja frontal.");
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

	}

}
