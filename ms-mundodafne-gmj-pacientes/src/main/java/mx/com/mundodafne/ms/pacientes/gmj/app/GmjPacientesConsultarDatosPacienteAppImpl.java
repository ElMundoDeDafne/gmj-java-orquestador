package mx.com.mundodafne.ms.pacientes.gmj.app;

import java.util.List;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesInDTO;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;

public class GmjPacientesConsultarDatosPacienteAppImpl implements GmjPacientesConsultarDatosPacienteApp {

	@Override
	public void obtenerDatosPaciente(Long idPaciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtenerDomicilioPaciente(Long idPaciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GmjBusquedaPacientesOutDTO busquedaPacientes(GmjBusquedaPacientesInDTO entradaVO) {
		/**validaciones iniciales*/
		if(entradaVO.getCurp()==null || (entradaVO.getCurp().isBlank() || entradaVO.getCurp().isEmpty()) || entradaVO.getCurp().length() > 20) {
			
		}
		return null;
	}
}