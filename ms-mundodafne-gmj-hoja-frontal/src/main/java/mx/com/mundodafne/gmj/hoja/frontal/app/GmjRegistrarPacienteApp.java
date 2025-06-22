package mx.com.mundodafne.gmj.hoja.frontal.app;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;

public interface GmjRegistrarPacienteApp {
	
	boolean registroPaciente(GmjHojaFrontalDTO requestFrontalDTO) throws BusinessException;
}
