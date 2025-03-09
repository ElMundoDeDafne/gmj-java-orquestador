package mx.com.mundodafne.gmj.hoja.frontal.app;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHistoriaClinicaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;

public interface GmjValidadoresApp {
	
	void validarInfoPaciente(GmjInformacionPacienteDTO dto) throws BusinessException;
	void validarDatosContactoPx(GmjDatosContactoPacienteDTO dto) throws BusinessException;
	void validarDomicilioPx(GmjDomicilioPacienteDTO dto) throws BusinessException;
	void validarHistoriaClinicaPx(GmjHistoriaClinicaDTO dto) throws BusinessException;
	
}
